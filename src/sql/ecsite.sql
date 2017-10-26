set names utf8;
set foreign_key_checks=0;

drop database if exists ecsite;

create database if not exists ecsite;
use ecsite;

drop table if exists login_user_transaction;

create table login_user_transaction(
user_id int not null primary key auto_increment,
login_id varchar(16) unique,
password varchar(16),
user_name varchar(50),
insert_date datetime,
updated_date datetime
);


drop table if exists user_buy_item_transaction;

create table user_buy_item_transaction(
user_id int not null primary key auto_increment,
item_transaction_id int,
total_price int,
total_count int,
user_master_id varchar(16),
pay varchar(30),
insert_date datetime,
delete_date datetime
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

drop table if exists items;

create table items (
    item_id int not null auto_increment primary key,/*商品番号*/
    item_name varchar(100) not null,/*商品名*/
    category_id int not null,/*カテゴリー番号*/
    price int not null,/*単価*/
    img_path varchar(255) not null,/*イメージパス*/
    stocks int not null,/*在庫数*/
    sales int default 0,/*売り上げ数*/
    item_detail text not null,/*商品詳細*/
    is_deleted boolean default false,/*商品削除*/
    created_at datetime not null default current_timestamp,/*登録日*/
    updated_at datetime not null default current_timestamp/*更新日*/
);



insert into items(item_id,item_name,category_id,price,stocks,img_path,item_detail) values
(1,'アイテム１',1,500,1000,"./image/image01.jpg",
"説明文"),
(2,'アイテム２',1,200,1000,"./image/image02.jpg",
"説明文"),
(3,'アイテム３',1,100,1000,"./image/image03.jpg",
"説明文"),
(4,'アイテム４',1,500,1000,"./image/image04.jpg",
"説明文"),
(5,'アイテム５',1,200,1000,"./image/image05.jpg",
"説明文"),
(6,'アイテム６',1,800,1000,"./image/image06.jpg",
"説明文");



INSERT INTO login_user_transaction(login_id, password, user_name) VALUES("internous", "internous01", "test");