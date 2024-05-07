
DELETE FROM test;
ALTER TABLE test AUTO_INCREMENT=1;
SET @COUNT = 0;
UPDATE test SET id = @COUNT:=@COUNT+1;

INSERT INTO testdb.test (question, answer, author) VALUES('퀴즈내용1', 1, '오윤석');
INSERT INTO testdb.test (question, answer, author) VALUES('퀴즈내용2', 0, '오윤석');
INSERT INTO testdb.test (question, answer, author) VALUES('퀴즈내용3', 1, '오윤석');
INSERT INTO testdb.test (question, answer, author) VALUES('퀴즈내용4', 0, '오윤석');
INSERT INTO testdb.test (question, answer, author) VALUES('퀴즈내용5', 1, '오윤석');
INSERT INTO testdb.test (question, answer, author) VALUES('퀴즈내용6', 0, '오윤석');
ALTER TABLE `test`
	ADD COLUMN `date` DATE NOT NULL AFTER `author`;
	
ALTER TABLE `test`
	ADD COLUMN `date` DATE NOT NULL AFTER `author`;	


CREATE DATABASE `testdb`

