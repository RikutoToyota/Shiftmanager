CREATE TABLE `shifts` (
	`ShiftId` SERIAL NOT NULL,
	`ShiftStart` VARCHAR(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
	`ShiftEnd` VARCHAR(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
	`UserId` VARCHAR(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
	`Date` DATE NOT NULL,
	PRIMARY KEY (`ShiftId`)
);