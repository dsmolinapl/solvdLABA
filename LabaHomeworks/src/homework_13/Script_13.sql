INSERT INTO `orderssql`.`users`
(`user_name`,`user_phone`,`user_age`)
VALUES
('Anna','543-67-43',18),('Max','456-78-98',33),('Stas','456-98-00',30),('Anna','333-77-21',23),
('Liza','937-99-92',77),('Bob','777-66-55',32),('Bob','700-66-55',80);
INSERT INTO `orderssql`.`products`
(`product_name`, `product_price`)
VALUES
('laptop HP', 5200),('laptop ASUS',4500),('laptop Lenovo',3300),('Laptop Dell',900);

INSERT INTO `orderssql`.`orders`
(`order_data`, `Users_user_id`)
VALUES
('04.10.2024', 1),('04.10.2024',2),('05.10.2024',3);

INSERT INTO `orderssql`.`orderdetails`
(`quantity`,`Product_product_id`,`Orders_order_id`)
VALUES
(1,1,1),(2,1,2),(3,2,3);


UPDATE `orderssql`.`users`
SET `user_name` = 'Alex'
WHERE `user_id` = 2;

UPDATE `orderssql`.`products`
SET `product_name` ='laptop LENOVO'
WHERE `product_name` = 'laptop Lenovo';

UPDATE `orderssql`.`orders`
SET `order_data` = '06.10.2024'
WHERE `order_data` = "05.10.2024" AND `Users_user_id` =3;

UPDATE `orderssql`.`orderdetails`
SET `quantity` = 2
WHERE `OrderDetails_id` = 3 ;

UPDATE `orderssql`.`users`
SET `user_phone` = '333-00-01'
WHERE `user_id` = 1;

UPDATE `orderssql`.`products`
SET `product_price` = 5700
WHERE `product_id` = 1;

UPDATE `orderssql`.`products`
SET `product_price` = 5600
WHERE `product_price` = 5700;

UPDATE `orderssql`.`users`
SET `user_age` = 66
WHERE `user_id` = 4;

DELETE FROM `orderssql`.`users`
WHERE 'user_phone'='937-99-92';
DELETE FROM `orderssql`.`users`
WHERE 'user_name'= 'Sveta';
DELETE FROM `orderssql`.`users`
WHERE `user_age` = 77;
DELETE FROM `orderssql`.`users`
WHERE `user_name` = 'Bob' AND `user_age`= 80;
DELETE FROM `orderssql`.`products`
WHERE `product_name` = 'Laptop Dell';


ALTER TABLE `orderssql`.`users` ADD  `Email` VARCHAR(255);
ALTER TABLE `orderssql`.`users` DROP COLUMN `user_phone` ;
ALTER TABLE `orderssql`.`users` ADD `DateOfBirth` date;
ALTER TABLE `orderssql`.`users` MODIFY COLUMN `DateOfBirth` year;
ALTER TABLE `orderssql`.`users` DROP COLUMN `DateOfBirth`;
SELECT * 

FROM `orderssql`.`users` 
LEFT JOIN `orderssql`.`orders` ON `orderssql`.`users`.`user_id` = `orderssql`.`orders`.`Users_user_id`
LIMIT 0, 1000;

SELECT * FROM `orderssql`.`Users`
LEFT JOIN `orderssql`.`Orders` ON `orderssql`.`Users`.`user_id` = `orderssql`.`Orders`.`Users_user_id`;
SELECT * FROM `orderssql`.`Orders`
RIGHT JOIN `orderssql`.`Users` ON `orderssql`.`Orders`.`Users_user_id` = `orderssql`.`Users`.`user_id`;
SELECT * FROM `orderssql`.`Orders`
INNER JOIN `orderssql`.`Users` ON `orderssql`.`Orders`.`Users_user_id` = `orderssql`.`Users`.`user_id`;
SELECT * FROM `orderssql`.`Users`
CROSS JOIN `orderssql`.`Orders`;


SELECT Users_user_id, COUNT(*) as num_orders
FROM `orderssql`.`Orders`
GROUP BY Users_user_id;

SELECT Users_user_id, SUM(order_data) as total_data
FROM `orderssql`.`Orders`
GROUP BY Users_user_id;

SELECT Users_user_id, AVG(order_data) as avg_data
FROM `orderssql`.`Orders`
GROUP BY Users_user_id;

SELECT Users_user_id, MAX(order_data) as max_data
FROM `orderssql`.`Orders`
GROUP BY Users_user_id;

SELECT Users_user_id, MIN(order_data) as min_data
FROM `orderssql`.`Orders`
GROUP BY Users_user_id;
-- witch Having
SELECT Users_user_id, COUNT(*) as num_orders
FROM `orderssql`.`Orders`
GROUP BY Users_user_id
HAVING COUNT(*) > 5;

SELECT Users_user_id, SUM(order_data) as total_data
FROM `orderssql`.`Orders`
GROUP BY Users_user_id
HAVING SUM(order_data) > 10;

SELECT Users_user_id, AVG(order_data) as avg_data
FROM `orderssql`.`Orders`
GROUP BY Users_user_id
HAVING AVG(order_data) > 50;

SELECT Users_user_id, MAX(order_data) as max_data
FROM `orderssql`.`Orders`
GROUP BY Users_user_id
HAVING MAX(order_data) > 5;

SELECT Users_user_id, MIN(order_data) as min_data
FROM `orderssql`.`Orders`
GROUP BY Users_user_id
HAVING MIN(order_data) < 10;








