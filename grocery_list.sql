create table shops
(
shop_id int not null,
shop_title varchar(50) not null,
primary key (shop_id)
);

create table products
(
product_id int not null,
product_title varchar(50) not null,
product_price double(5,2) not null,
shop_id int not null,
primary key (product_id)
);

insert into shops(shop_id, shop_title) values (1, 'EDEKA');
insert into shops(shop_id, shop_title) values (2, 'Lidl');

insert into products(product_id, product_title, product_price, shop_id)values(1, 'Bananas', 4.99, 1);
insert into products(product_id, product_title, product_price, shop_id)values (2, 'Apple', 3.99, 1);
insert into products(product_id, product_title, product_price, shop_id)values(3, 'Soap', 2.99,2 );

select product_title, product_price, shop_title 
from products, shops
where products.shop_id = shops.shop_id;






