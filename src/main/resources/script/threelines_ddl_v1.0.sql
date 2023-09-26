CREATE TABLE `MEMBER` (
                          `MEMBER_NO` BIGINT AUTO_INCREMENT PRIMARY KEY,
                          `MEMBER_EMAIL` VARCHAR(255) NULL,
                          `MEMBER_NM` VARCHAR(255) NULL,
                          `MEMBER_PW` VARCHAR(255) NULL,
                          `REG_ID` INT NULL,
                          `REG_TIME` DATETIME NULL,
                          `ALTER_ID` INT NULL,
                          `ALTER_TIME` DATETIME NULL
);

CREATE TABLE `SUBSCRIPTION` (
                                `SUB_NO` BIGINT AUTO_INCREMENT PRIMARY KEY,
                                `SUB_TITLE` VARCHAR(255) NULL,
                                `SUB_TYPE` VARCHAR(255) NULL,
                                `MEMBER_NO` INT NOT NULL,
                                `REG_ID` INT NULL,
                                `REG_TIME` DATETIME NULL,
                                `ALTER_ID` INT NULL,
                                `ALTER_TIME` DATETIME NULL
);

CREATE TABLE `CONTENT` (
                           `CONTENT_NO` BIGINT AUTO_INCREMENT PRIMARY KEY,
                           `CONTENT_TITLE` VARCHAR(255) NULL,
                           `CONTENT_ADDR` VARCHAR(255) NULL,
                           `CONTENT_SUMMARY` TEXT NULL,
                           `CONTENT_TYPE` VARCHAR(255) NULL,
                           `SUB_NO` INT NOT NULL,
                           `REG_ID` INT NULL,
                           `REG_TIME` DATETIME NULL,
                           `ALTER_ID` INT NULL,
                           `ALTER_TIME` DATETIME NULL
);
