BEGIN
  FOR cust IN (SELECT c.CustomerID, l.LoanID, l.InterestRate
               FROM Customers c
               JOIN Loans l ON c.CustomerID = l.CustomerID
               WHERE c.Age > 60) LOOP
    UPDATE Loans
    SET InterestRate = InterestRate - 1
    WHERE LoanID = cust.LoanID;
  END LOOP;

  COMMIT;
  DBMS_OUTPUT.PUT_LINE('Interest rate discount applied to customers above 60.');
END;
