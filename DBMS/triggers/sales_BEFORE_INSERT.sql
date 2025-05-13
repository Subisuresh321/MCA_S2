CREATE DEFINER=`root`@`localhost` TRIGGER `sales_BEFORE_INSERT` BEFORE INSERT ON `sales` FOR EACH ROW BEGIN
declare s int;
select stock into s from product where pid=new.pid;
if new.quantity>s
then
 set new.quantity=s;
end if;
END