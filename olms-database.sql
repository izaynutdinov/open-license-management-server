
CREATE DATABASE olms;
CREATE USER 'olms'@'localhost' IDENTIFIED BY 'qwerty';
GRANT ALL ON olms.* TO 'olms'@'localhost';
USE olms;

CREATE TABLE USERS (
	ID INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY,
	USERNAME VARCHAR(256),
	PASSWORD_MD5 VARCHAR(16),
	FIRST_NAME VARCHAR(256),
	SECOND_NAME VARCHAR(256),
	LAST_NAME VARCHAR(256)
);

CREATE TABLE NODES (
	ID INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY,
	CPU_TYPE VARCHAR(256),
	RAM_MB INTEGER
);

CREATE TABLE USER_NODES(
	ID INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY,
	USER_ID INTEGER NOT NULL,
	NODE_ID INTEGER NOT NULL,
	FOREIGN KEY(USER_ID) REFERENCES USERS(ID),
	FOREIGN KEY(NODE_ID) REFERENCES NODES(ID)
);

CREATE TABLE NODE_IP_ADDRESS (
	ID INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY,
	NODE_ID INTEGER NOT NULL,
	IP_ADDRESS VARCHAR(15),
	FOREIGN KEY(NODE_ID) REFERENCES NODES(ID)
);

CREATE TABLE LICENSES (
	ID INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY,
	LICENSE_NAME VARCHAR(1024)
);

CREATE TABLE LICENSE_LINKS (
	ID INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY,
	LICENSE_ID INTEGER NOT NULL,
	URL TEXT,
	URL_TITLE TEXT,
	URL_DESCRIPTION TEXT
);

CREATE TABLE VENDORS (
	ID INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY,
	VENDOR_NAME VARCHAR(512),
	WEB_SITE_URL VARCHAR(1024)
);

CREATE TABLE PRODUCTS (
	ID INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY,
	VENDOR_ID INTEGER NOT NULL,
	PROD_NAME VARCHAR(1024),
	FOREIGN KEY(VENDOR_ID) REFERENCES VENDORS(ID)
);

CREATE TABLE SOFTWARE (
	ID INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY,
	PRODUCT_ID INTEGER NOT NULL,
	LICENSE_ID INTEGER NOT NULL,
	VERSION VARCHAR(512),
	FOREIGN KEY(PRODUCT_ID) REFERENCES PRODUCTS(ID),
	FOREIGN KEY(LICENSE_ID) REFERENCES LICENSES(ID)
);

CREATE TABLE SOFTWARE_INSTALLATIONS (
	ID INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY,
	USER_NODE_ID INTEGER NOT NULL,
	SOFTWARE_ID INTEGER NOT NULL,
	FOREIGN KEY(USER_NODE_ID) REFERENCES USER_NODES(ID),
	FOREIGN KEY(SOFTWARE_ID) REFERENCES SOFTWARE(ID)
);