CREATE DEFINER=`root`@`localhost` PROCEDURE `is_palindrome`(in s varchar(10))
BEGIN
	DECLARE rev VARCHAR(10);
    SET rev=reverse(s);
    IF rev=s
    THEN
    SELECT concat(s," is palindrome") as RESULT;
    ELSE
	SELECT concat(s," is not palindrome") as RESULT;
    END IF;
END