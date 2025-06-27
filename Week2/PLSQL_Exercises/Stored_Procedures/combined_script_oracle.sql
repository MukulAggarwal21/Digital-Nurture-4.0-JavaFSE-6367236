-- Everything from table creation to final calls in one file

-- Drop & Create Tables
BEGIN
    EXECUTE IMMEDIATE 'DROP TABLE Accounts CASCADE CONSTRAINTS';
    EXECUTE IMMEDIATE 'DROP TABLE Customers CASCADE CONSTRAINTS';
    EXECUTE IMMEDIATE 'DROP TABLE Employees CASCADE CONSTRAINTS';
EXCEPTION
    WHEN OTHERS THEN NULL;
END;
/

CREATE TABLE Customers (
    CustomerID INT PRIMARY KEY,
    Name VARCHAR2(100),
    Age INT
);

CREATE TABLE Accounts (
    AccountID INT PRIMARY KEY,
    CustomerID INT,
    AccountType VARCHAR2(20),
    Balance NUMBER(10,2),
    FOREIGN KEY (CustomerID) REFERENCES Customers(CustomerID)
);

CREATE TABLE Employees (
    EmployeeID INT PRIMARY KEY,
    Name VARCHAR2(100),
    Department VARCHAR2(50),
    Salary NUMBER(10,2)
);

-- Insert Data
INSERT INTO Customers VALUES (1, 'Alice', 30);
INSERT INTO Customers VALUES (2, 'Bob', 40);

INSERT INTO Accounts VALUES (101, 1, 'Savings', 1000.00);
INSERT INTO Accounts VALUES (102, 1, 'Checking', 500.00);
INSERT INTO Accounts VALUES (103, 2, 'Savings', 2000.00);

INSERT INTO Employees VALUES (201, 'John Doe', 'Sales', 50000);
INSERT INTO Employees VALUES (202, 'Jane Smith', 'IT', 60000);

COMMIT;

-- Procedures
CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest AS
BEGIN
    UPDATE Accounts
    SET Balance = Balance * 1.01
    WHERE AccountType = 'Savings';
END;
/

CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus (
    dept_name IN VARCHAR2,
    bonus_percent IN NUMBER
) AS
BEGIN
    UPDATE Employees
    SET Salary = Salary + (Salary * bonus_percent / 100)
    WHERE Department = dept_name;
END;
/

CREATE OR REPLACE PROCEDURE TransferFunds (
    fromAccount IN INT,
    toAccount IN INT,
    amount IN NUMBER
) AS
    fromBalance NUMBER(10,2);
BEGIN
    SELECT Balance INTO fromBalance FROM Accounts WHERE AccountID = fromAccount;

    IF fromBalance >= amount THEN
        UPDATE Accounts
        SET Balance = Balance - amount
        WHERE AccountID = fromAccount;

        UPDATE Accounts
        SET Balance = Balance + amount
        WHERE AccountID = toAccount;
    ELSE
        RAISE_APPLICATION_ERROR(-20001, 'Insufficient funds in source account');
    END IF;
END;
/

-- Procedure Calls
BEGIN
    ProcessMonthlyInterest;
    UpdateEmployeeBonus('Sales', 10);
    TransferFunds(101, 102, 300);
END;
/

-- View Result
SELECT * FROM Accounts;
SELECT * FROM Employees;
