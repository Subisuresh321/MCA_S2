CREATE DEFINER=`root`@`localhost` PROCEDURE `grade`(in mark int)
BEGIN
	if mark>90
    then
    select "A+ grade" as RESULT;
    elseif mark>80
    then
    select "A grade" as RESULT;
    elseif mark>60
    then
    select "B grade" as RESULT;
    elseif mark>50
    then
    select "C grade" as RESULT;
    else
	select "Failed" as RESULT;
    END IF;
END