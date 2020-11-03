CREATE DATABASE HSBC;
USE HSBC;
CREATE TABLE school(regno INT PRIMARY KEY, name CHAR(20),marks INT);
INSERT INTO school VALUES(1,'Alice',150);
INSERT INTO school VALUES(2,'Bob',34);
INSERT INTO school VALUES(3,'Charlie',98);
CREATE TABLE college(regno int primary key,name char(20),marks int);