set names utf8;
set foreign_key_checks=0;

drop database if exists ecsite;

create database if not exists ecsite;
use ecsite;

drop table if exists login_user_transaction;

create table login_user_transaction(
id int not null primary key auto_increment,
login_id varchar(16) unique,
login_pass varchar(16),
user_name varchar(50),
insert_date datetime,
updated_date datetime
);

drop table if exists item_info_transaction;

create table item_info_transaction(
id int not null primary key auto_increment,
item_name varchar(30),
item_price int,
item_stock int,
insert_date datetime,
update_date datetime
);

drop table if exists user_buy_item_transaction;

create table user_buy_item_transaction(
id int not null primary key auto_increment,
item_transaction_id int,
total_price int,
total_count int,
user_master_id varchar(16),
pay varchar(30),
insert_date datetime,
delete_date datetime
);
create table categories(
    category_id int not null auto_increment primary key,/*カテゴリー番号*/
    category_name varchar(20) not null,/*カテゴリ名*/
    created_at datetime not null default current_timestamp,/*登録日*/
    updated_at datetime not null default current_timestamp/*更新日*/
);
create table items (
    item_id int not null auto_increment primary key,/*商品番号*/
    item_name varchar(100) not null,/*商品名*/
    category_id int not null,/*カテゴリー番号*/
    price decimal(9,2) not null,/*単価*/
    category varchar(20) not null,/*カテゴリ名*/
    img_path2 varchar(255) not null,/*イメージパス*/
    stocks int not null,/*在庫数*/
    sales int default 0,/*売り上げ数*/
    item_detail text not null,/*商品詳細*/
    is_deleted boolean default false,/*商品削除*/
    created_at datetime not null default current_timestamp,/*登録日*/
    updated_at datetime not null default current_timestamp,/*更新日*/

    foreign key(category_id)references categories(category_id)
);
create table items_images (
  item_id int not null,/*商品ID*/
  category varchar(20) not null,/*カテゴリ名*/
  img_path1 varchar(255) not null,/*イメージパス(1)*/
  img_path2 varchar(255),/*イメージパス(2)*/
  img_path3 varchar(255),/*イメージパス(3)*/
  img_path4 varchar(255),/*イメージパス(4)*/
  img_path5 varchar(255),/*イメージパス(5)*/
  created_at datetime not null default current_timestamp,/*登録日*/
  updated_at datetime not null default current_timestamp,/*更新日*/

  foreign key(item_id) references items(item_id)
);
create table carts(
  cart_id int primary key auto_increment,/*カートID*/
  user_id int not null,/*ユーザーID*/
  item_id int not null,/*商品ID*/
  quantities int not null default 1,/*数量*/
  total_price decimal(9,2) ,/*価格*/
  is_deleted boolean default false,/*商品選択削除*/
  created_at datetime not null default current_timestamp,/*登録日*/
  updated_at datetime not null default current_timestamp,/*更新日*/

  foreign key(user_id) references openconnect.users(user_id),
  foreign key(item_id) references items(item_id)
);

insert into items(item_id,item_name,category_id,price,stocks,category,img_path2,item_detail) values
(1,'練習３',1,500,1000,"コスチューム","./images/image03.jpg",
"説明文"),
(2,'練習３',1,2000,1000,"コスチューム","./images/image03.jpg",
"説明文"),
(3,'練習３',1,3000,1000,"コスチューム","./images/image03.jpg",
"説明文"),
(4,'練習３',1,500,1000,"コスチューム","./images/image03.jpg",
"説明文"),
(5,'練習３',1,4200,1000,"コスチューム","./images/image03.jpg",
"説明文"),
(6,'練習３',1,800,1000,"コスチューム","./images/image03.jpg",
"説明文"),
(7,'練習２',2,500,1000,"フード","./images/image02.jpg",
"説明文"),
(8,'練習２',2,1000,1000,"フード","./images/image02.jpg",
"説明文"),
(9,'練習２',2,700,1000,"フード","./images/image02.jpg",
"説明文"),
(10,'練習２',2,4300,1000,"フード","./images/image02.jpg",
"説明文"),
(11,'練習２',2,1000,1000,"フード","./images/image02.jpg",
"説明文"),
(12,'練習２',2,900,1000,"フード","./images/image02.jpg",
"説明文"),
(13,'練習１',3,2500,1000,"インテリア","./images/image01.jpg",
"説明文"),
(14,'練習１',3,4000,1000,"インテリア","./images/image01.jpg",
"説明文
"),
(15,'練習１',3,1000,1000,"インテリア","./images/image01.jpg",
"説明文"),
(16,'練習１',3,3000,1000,"インテリア","./images/image01.jpg",
"説明文
"),
(17,'練習１',3,4200,1000,"インテリア","./images/image01.jpg",
"説明文"),
(18,'練習１',3,3000,1000,"インテリア","./images/image01.jpg",
"説明文");



INSERT INTO item_info_transaction(item_name, item_price, item_stock) VALUES("ノートBook", 100, 50);
INSERT INTO login_user_transaction(login_id, login_pass, user_name) VALUES("internous", "internous01", "test");