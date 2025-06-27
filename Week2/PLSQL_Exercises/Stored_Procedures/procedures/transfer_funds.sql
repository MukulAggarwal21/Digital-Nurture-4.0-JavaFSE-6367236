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
