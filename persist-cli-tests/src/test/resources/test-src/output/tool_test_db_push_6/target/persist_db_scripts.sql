DROP TABLE IF EXISTS Profiles;

DROP TABLE IF EXISTS Users;
CREATE TABLE Users (
	id INT NOT NULL,
	name VARCHAR(191) NOT NULL,
	PRIMARY KEY(id)
);

CREATE TABLE Profiles (
	id INT NOT NULL,
	name VARCHAR(191) NOT NULL,
	userId INT UNIQUE,
	CONSTRAINT FK_PROFILES_USERS_0 FOREIGN KEY(userId) REFERENCES Users(id),
	PRIMARY KEY(id)
);