CREATE TABLE `posts` (
	`PostId` INT AUTO_INCREMENT NOT NULL,
	`PostName` VARCHAR(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
	`hourly_wage` INT NOT NULL,
	`night_hourly_wage` INT NOT NULL DEFAULT 0,
	`authority` TEXT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
	PRIMARY KEY (`PostId`)
) ENGINE=InnoDB;