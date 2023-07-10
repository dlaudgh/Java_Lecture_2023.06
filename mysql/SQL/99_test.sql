
# 2009년도에 데뷔한 걸그룹 정보를 조회
# (where debut between '2009-01-01' and '2009-12-31' 이용)
SELECT * FROM girl_group
	WHERE debut BETWEEN '2009-01-01' AND '2009-12-31';
	
# 2009년도에 데뷔한 걸그룹의 히트송은?
# (걸그룹 이름, 데뷔일, 히트송)
SELECT r.name, r.debut, l.title FROM song AS l
	INNER JOIN girl_group AS r
	ON l.sid = r.hit_song_id
	WHERE r.debut BETWEEN '2009-01-01' AND '2009-12-31';
	
# 대륙별로 국가숫자, GNP의 합, 평균 국가별 GNP는
SELECT continent, COUNT(*), round(sum(GNP)), round(avg(GNP))
	FROM country GROUP BY continent;
	
# 아시아 대륙에서 인구가 가장 많은 도시 10개를 내림차순으로 보여줄 것
# (대륙명, 국가명, 도시명, 인구수)
SELECT l.Continent, l.Name, r.Name, r.Population FROM country AS l
	JOIN city AS r ON l.code=r.CountryCode
	WHERE l.Continent='Asia'
	ORDER BY r.Population DESC LIMIT 10;
	
# 전 세계에서 인구가 가장 많은 10개 도시에서 사용하는 공식언어는?
# (도시명, 인구수, 언어명)
SELECT l.name, l.Population, r.Language	FROM city AS l
	JOIN countrylanguage AS r ON l.CountryCode=r.CountryCode
	WHERE r.isofficial='t'
	ORDER BY l.Population DESC LIMIT 10;
