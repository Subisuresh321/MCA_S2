CREATE DEFINER=`root`@`localhost` TRIGGER `customer_AFTER_DELETE` AFTER DELETE ON `customer` FOR EACH ROW BEGIN
delete from sales where cid=old.cid;
END