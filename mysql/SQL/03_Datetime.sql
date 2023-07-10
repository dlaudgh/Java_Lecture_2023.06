
# 날짜/시간 조작

/*
 * 1. 테이블 생성 
 */
CREATE TABLE if NOT EXISTS dateTable (
	id INT PRIMARY KEY AUTO_INCREMENT,
	`date` DATE DEFAULT (CURRENT_DATE),
	`datetime` DATETIME DEFAULT CURRENT_TIMESTAMP);

/*
 * 2. 데이터 입력
 */
INSERT INTO dateTable VALUES(DEFAULT, DEFAULT, DEFAULT);
INSERT INTO dateTable(id) VALUES(DEFAULT);
INSERT INTO dateTable(`date`, `datetime`) VALUES
	('2023-03-08', '2023-03-08 11:25:00'),
	('2023-12-24', '2023-12-24 20:00:00');
	
/*
 * 3. 데이터 조회
 */
# 2023-07-04 형식
SELECT `date`, DATE_FORMAT(`datetime`, '%Y-%m-%d') FROM datetable;

# 11:25:00 AM 형식
SELECT DATE_FORMAT(`datetime`, '%h:%i:%s %p') FROM datetable;
SELECT DATE_FORMAT(`datetime`, '%r') FROM datetable;

# 23-07-04 11:25 형식
SELECT DATE_FORMAT(`datetime`, '%y-%m-%d %H:%i') AS modTime
	FROM datetable;

# 날짜 조회함수
SELECT NOW(), CURDATE(), CURTIME();

# 날짜 더하기/빼기
SELECT DATE_ADD(NOW(), INTERVAL 40 DAY);
SELECT DATE_SUB(NOW(), INTERVAL 3 MONTH);

# D-day 계산
SELECT TO_DAYS('2023-12-25') - TO_DAYS(NOW());

# 요일: 1 - 일요일
SELECT DAYOFWEEK(`datetime`) FROM datetable;














