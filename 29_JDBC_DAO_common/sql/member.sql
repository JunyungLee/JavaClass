CREATE TABLE MEMBER ( 
    ID VARCHAR2(20) PRIMARY KEY, 
    NAME VARCHAR2 (30) NOT NULL,
    PASSWORD VARCHAR2(20) NOT NULL,
    PHONE VARCHAR2 (20),
    ADDRESS VARCHAR2(300)
);
INSERT INTO MEMBER VALUES ('hong','홍길동','1234','010-1111-1111','서울');
COMMIT;
INSERT INTO MEMBER VALUES ('KIM','김유신','1234','010-2222-2222','부산');
COMMIT;
SELECT * FROM MEMBER;