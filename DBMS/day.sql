CREATE DEFINER=`root`@`localhost` PROCEDURE `day`(in num int)
BEGIN
	if num=1
    then
    SELECT "SUNDAY" as DAY;
    elseif num=2
    then
    SELECT "MONDAY" as DAY;
    elseif num=3
    then
    SELECT "TUESDAY" as DAY;
    elseif num=4
    then
    SELECT "WEDNESDAY" as DAY;
    elseif num=5
    then
    SELECT "THURSDAY" as DAY;
    elseif num=6
    then
    SELECT "FRIDAY" as DAY;
    elseif num=7
    then
    SELECT "SATURDAY" as DAY;
    else
    SELECT "INVALID" as DAY;
    END IF;
END