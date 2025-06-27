BEGIN
    -- Apply monthly interest
    ProcessMonthlyInterest;

    -- Give 10% bonus to Sales department
    UpdateEmployeeBonus('Sales', 10);

    -- Transfer ₹300 from Account 101 to 102
    TransferFunds(101, 102, 300);
END;
/

-- Check updated data
SELECT * FROM Accounts;
SELECT * FROM Employees;
