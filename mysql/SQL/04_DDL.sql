
# 데이터 정의 언어(DDL: Data Definition Language)

/*
 * 1. Table 생성
 * 
 *		ERMaster 활용
 */
# 주소록 테이블 생성
CREATE TABLE if NOT EXISTS addrBook (
	id int NOT NULL AUTO_INCREMENT,
	name varchar(10) NOT NULL,
	tel varchar(14) NOT NULL,
	nickname varchar(20) DEFAULT '별명',
	PRIMARY KEY (id)
);

# 사용자 테이블 생성
CREATE TABLE if NOT EXISTS users (
	uid varchar(12) NOT NULL,
	pwd char(44) NOT NULL,
	uname varchar(8) NOT NULL,
	email varchar(30),
	regDate date DEFAULT (CURRENT_DATE),
	isDeleted int DEFAULT 0,
	PRIMARY KEY (uid)
);

/*
 * 2. 테이블 조회
 */
# 데이터베이스 내의 테이블 목록
SHOW TABLES;

# 테이블 구조
DESC addrBook;		# describe

/*
 * 3. 테이블 삭제
 */
# koreancity 테이블 삭제
DROP TABLE koreancity;

# datetable의 모든 데이터를 제거
TRUNCATE datetable;

/*
 * 4. 테이블명 변경
 */
RENAME TABLE koreancity TO korCity;

/*
 * 5. 테이블 구조 변경
 */
# users 테이블에서 email 뒤에 tel 추가
ALTER TABLE users
	ADD tel VARCHAR(14) NOT NULL AFTER email;

# users 테이블에서 email을 not null로 변경
ALTER TABLE user
	CHANGE email email VARCHAR(30) NOT NULL;
	
/*
 * 6. View 생성
 */
# 인구가 600만 초과 도시의 뷰 생성
CREATE VIEW largecity AS SELECT * FROM city
	WHERE population >= 6000000;

# 뷰를 조회용도로만 사용하는 경우
CREATE VIEW largecity AS SELECT * FROM city
	WHERE population >= 6000000
	WITH CHECK OPTION;
	










