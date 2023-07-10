SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Tables */

DROP TABLE IF EXISTS reply;
DROP TABLE IF EXISTS board;
DROP TABLE IF EXISTS users;




/* Create Tables */

CREATE TABLE board
(
	bid int NOT NULL AUTO_INCREMENT,
	title varchar(256) NOT NULL,
	content varchar(4096),
	uid varchar(12) NOT NULL,
	modTime datetime DEFAULT CURRENT_TIMESTAMP,
	viewCount int DEFAULT 0,
	replyCount int DEFAULT 0,
	PRIMARY KEY (bid)
);


CREATE TABLE reply
(
	rid int NOT NULL AUTO_INCREMENT,
	comment varchar(256) NOT NULL,
	regTime datetime DEFAULT CURRENT_TIMESTAMP,
	uid varchar(12) NOT NULL,
	bid int NOT NULL,
	PRIMARY KEY (rid)
);


CREATE TABLE users
(
	uid varchar(12) NOT NULL,
	password char(60) NOT NULL,
	uname varchar(12) NOT NULL,
	email varchar(32),
	regDate date DEFAULT (CURRENT_DATE),
	isDeleted int DEFAULT 0,
	PRIMARY KEY (uid)
);



/* Create Foreign Keys */

ALTER TABLE reply
	ADD FOREIGN KEY (bid)
	REFERENCES board (bid)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE board
	ADD FOREIGN KEY (uid)
	REFERENCES users (uid)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE reply
	ADD FOREIGN KEY (uid)
	REFERENCES users (uid)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


