
# 데이터 조작 언어(DML: Data Manipulation Language)

/*
 * 1. Select
 */
use world;		# 사용할 데이터베이스 선택
show tables;	# 현 데이터베이스에 있는 테이블 조회		
DESC city;		# city 테이블의 구조 보기

/*
SELECT 필드명
	FROM 테이블명
	JOIN 테이블명
	ON 조인 조건
	WHERE 조건
	GROUP BY 필드명
	HAVING 그룹 조건
	ORDER BY 필드명 순서
	LIMIT 숫자 OFFSET 숫자;
*/

SELECT * FROM city;
SELECT `name`, population FROM city;	# 필드명을 보존하고 싶을때 `(back quote)` 사용

/*
 * 1.1 조회 조건: WHERE 
 */
SELECT * FROM city WHERE countrycode='kor';
SELECT `name`, district, population FROM city WHERE countrycode='kor';
SELECT * FROM city WHERE countrycode='kor' AND population>1000000;

SELECT distinct district FROM city WHERE countrycode='kor';		# 고유한 값 - distinct 

# 수도권 도시(서울, 인천, 경기)
SELECT * FROM city
	WHERE district='Seoul' or district='Inchon' or district='Kyonggi';
SELECT * FROM city
	WHERE district IN ('Seoul', 'Inchon', 'Kyonggi');

# 국내 100만 이상 도시중 인구수가 홀수인 도시
SELECT * FROM city
	WHERE countrycode='kor' AND population>1000000 AND population%2=1;
	
# 국내 인구수가 50만 ~ 100만 도시
SELECT * FROM city
	WHERE countrycode='kor' AND population>=500000 AND population<=1000000;
SELECT * FROM city
	WHERE countrycode='kor' AND population between 500000 AND 1000000;
	
# 충청남북도의 도시
SELECT * FROM city
	WHERE district='Chungchongnam' OR district='Chungchongbuk';
SELECT * FROM city
	WHERE district LIKE 'Chungchong%';		# % - wild card, 이때는 like 연산자를 사용

/*
 * 1.2 순서(Order)
 */
# 전세계 인구수가 800만 이상인 도시를 내림차순으로 조회
SELECT * FROM city
	WHERE population>=8000000 ORDER BY population DESC;		# DESC - descending
	
# 국내 100만 이상인 도시를 오름차순으로 조회
SELECT * FROM city
	WHERE countrycode='kor' AND population>=1000000
	ORDER BY population;		# ASC - ascending 생략 가능
	
# 국내 50만 이상인 도시를 광역시도 오름차순, 인구수 내림차순
SELECT * FROM city
	WHERE countrycode='kor' AND population>=500000
	ORDER BY district ASC, population DESC;		# ASC 생략 가능

/*
 * 1.3 갯수
 */
# 전세계 인구수 Top 10 도시
SELECT * FROM city
	ORDER BY population DESC LIMIT 10;
	
# 국내 인구수 Top 5 도시
SELECT * FROM city
	WHERE countrycode='kor'
	ORDER BY population DESC LIMIT 5;

# 국내 인구수 Top 11~20 도시
SELECT * FROM city
	WHERE countrycode='kor'
	ORDER BY population DESC
	LIMIT 10 OFFSET 10;		# 앞에서 10개를 건너 뛰고, 10개를 보여줌
	
/*
 * 1.4 함수
 */
# 현재 날짜와 시각
SELECT NOW();		# 2023-07-03 14:54:19

# 국내 도시의 갯수 - 레코드의 갯수
SELECT COUNT(*) FROM city WHERE countrycode='kor';

# 국내 도시중 인구수 최대와 최소 도시
SELECT MAX(population), MIN(population)
	FROM city WHERE countrycode='kor';
	
# 국내 도시의 인구수 평균
SELECT AVG(population) FROM city WHERE countrycode='kor';
SELECT ROUND(AVG(population)) FROM city WHERE countrycode='kor';

# Aliasing
SELECT ROUND(AVG(population)) AS avgPopulation
	FROM city WHERE countrycode='kor';
	
/*
 * 1.5 그룹핑(Grouping)
 */
# 국내 광역시도별 도시의 갯수를 내림차순으로 조회
SELECT district, COUNT(*) FROM city
	WHERE countrycode='kor'
	GROUP BY district
	ORDER BY COUNT(*) DESC;

# 도시의 갯수가 많은 나라 Top 10
SELECT countrycode, COUNT(*) FROM city
	GROUP BY countrycode
	ORDER BY COUNT(*) DESC LIMIT 10;
	
# 도시의 평균 인구가 높은 나라 Top 10
SELECT countrycode, ROUND(AVG(population)) AS avgPopulation
	FROM city GROUP BY countrycode
	ORDER BY AVG(population) DESC LIMIT 10;
	
# 경기도의 도시 이름
SELECT GROUP_CONCAT(`name`) FROM city
	WHERE district='Kyonggi';		# Songnam,Puchon,Suwon ...
	
# 국내 광역시도 이름
SELECT GROUP_CONCAT(`district`) FROM city
	WHERE countrycode='kor';		# Seoul,Pusan,Inchon ...
	
/*
 * 1.6 그룹 조건
 */
# 국내 도시의 갯수가 5개 이상인 도의 평균 인구수
SELECT district, Round(AVG(population)) AS avgPopulation
	FROM city WHERE countrycode='kor'
	GROUP BY district HAVING COUNT(*)>=5;
	
# 국내 도시의 갯수가 5개 이상인 도의 평균 인구수 Top 5
SELECT district, Round(AVG(population)) AS avgPopulation
	FROM city WHERE countrycode='kor'
	GROUP BY district HAVING COUNT(*)>=5
	ORDER BY AVG(population) DESC LIMIT 5;
	
# 도시의 갯수가 100개 이상인 국가의 도시인구 평균을 내림차순으로 정렬
SELECT countrycode, Round(AVG(population)) avgPop, COUNT(*) numCity		# AS 생략 가능
	FROM city GROUP BY countrycode HAVING COUNT(*)>=100
	ORDER BY AVG(population) DESC;

/*
 * 1.7 Join
 */
# 인구수 800만보다 큰 도시의 국가명, 도시명, 인구수
SELECT country.Name, city.Name, city.Population FROM city
	INNER JOIN country ON city.CountryCode=country.Code
	WHERE city.Population > 8000000;

SELECT r.Name countryName, l.Name cityName, l.Population FROM city AS l
	JOIN country AS r			# INNER 생략 가능, table 이름 aliasing
	ON l.CountryCode=r.Code
	WHERE l.Population > 8000000;
	
# 아시아 대륙에서 인구수가 가장 많은 도시 Top 10
SELECT l.Name, r.Name, r.Population, l.Continent FROM country AS l
	JOIN city AS r ON l.code=r.CountryCode
	WHERE l.Continent='Asia'
	ORDER BY r.Population DESC LIMIT 10;
	
# 우리나라의 공식 언어
SELECT * FROM countrylanguage
	WHERE countrycode='kor' AND isofficial='t';
	
# 아시아 국가의 국가명과 공식언어
SELECT l.Continent, l.Name, r.Language FROM country AS l
	JOIN countrylanguage AS r ON l.code=r.CountryCode
	WHERE l.Continent='asia' AND r.isofficial='t';
	
# 아시아 대륙에서 인구수가 가장 많은 Top 10 도시에서 사용하는 공식 언어
# 3개의 테이블 --> 2회의 조인
SELECT l.Name, r.name, r.Population, l.Continent, o.Language
	FROM country AS l
	JOIN city AS r ON l.code=r.CountryCode
	JOIN countrylanguage AS o ON l.code=o.CountryCode
	WHERE l.Continent='asia' AND o.isofficial='t'
	ORDER BY r.Population DESC LIMIT 10;
	
	
	
	
	
	
	
	
	
	
	

