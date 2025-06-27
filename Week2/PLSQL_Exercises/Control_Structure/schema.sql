-- Create tables
CREATE TABLE Customers (
    CustomerID    NUMBER PRIMARY KEY,
    Name          VARCHAR2(100),
    Age           NUMBER,
    Balance       NUMBER(10,2),
    IsVIP         VARCHAR2(5)
);

CREATE TABLE Loans (
    LoanID        NUMBER PRIMARY KEY,
    CustomerID    NUMBER,
    InterestRate  NUMBER(5,2),
    DueDate       DATE,
    FOREIGN KEY (CustomerID) REFERENCES Customers(CustomerID)
);

-- Insert sample data
INSERT INTO Customers VALUES (1, 'Alice', 65, 12000, 'FALSE');
INSERT INTO Customers VALUES (2, 'Bob', 45, 8000, 'FALSE');
INSERT INTO Customers VALUES (3, 'Charlie', 70, 15000, 'FALSE');
INSERT INTO Customers VALUES (4, 'David', 30, 5000, 'FALSE');

INSERT INTO Loans VALUES (101, 1, 7.5, SYSDATE + 10);
INSERT INTO Loans VALUES (102, 2, 8.0, SYSDATE + 45);
INSERT INTO Loans VALUES (103, 3, 6.5, SYSDATE + 5);
INSERT INTO Loans VALUES (104, 4, 9.0, SYSDATE + 25);

COMMIT;
