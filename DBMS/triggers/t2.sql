CREATE DEFINER=`root`@`localhost` TRIGGER `t2` AFTER INSERT ON `sales` FOR EACH ROW BEGIN
	declare s int;
    select stock into s from product where pid=new.pid;
	update product set stock=stock-new.quantity where pid=new.pid;
    insert into record values(new.pid,s,s-new.quantity);
END