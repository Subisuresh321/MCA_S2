CREATE DEFINER=`root`@`localhost` PROCEDURE `factorial`(in num int)
BEGIN
	declare s int;
    set s=1;
	while num!=0
    do
    set s=s*num;
    set num=num-1;
    end while;
    select s as factorial;
END