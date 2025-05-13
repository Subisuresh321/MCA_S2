CREATE DEFINER=`root`@`localhost` PROCEDURE `even_odd`(in num int)
BEGIN
	if num%2=0
    then
    select concat(num," is an even number") as RESULT;
    else
    select concat(num," is an odd number") as RESULT;
    END IF;
END