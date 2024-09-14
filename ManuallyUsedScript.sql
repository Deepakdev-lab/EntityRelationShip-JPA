CREATE TABLE Address (
    id INT AUTO_INCREMENT PRIMARY KEY,
    address VARCHAR(255),
    state VARCHAR(100)
);

CREATE TABLE Department (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100)
);

CREATE TABLE Employee (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    addressId INT,
    FOREIGN KEY (addressId) REFERENCES Address(id)
);

CREATE TABLE Mission (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    period INT
);
