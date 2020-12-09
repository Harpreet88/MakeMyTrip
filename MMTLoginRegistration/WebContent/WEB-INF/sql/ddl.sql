CREATE DATABASE IF NOT EXISTS spring_mvc;

USE spring_mvc;

DROP TABLE IF EXISTS `spring_mvc`.`users`;

CREATE TABLE `spring_mvc`.`users` (
  `username` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  `firstname` VARCHAR(45) NOT NULL,
  `lastname` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `address` VARCHAR(45) NOT NULL,
  `phone` VARCHAR(10) NOT NULL,
  PRIMARY KEY (`username`));