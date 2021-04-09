INSERT INTO `LUX-OFFER-DB`.`Category` (`pk_cate_id`, `categ_name`, `categ_description`, `categ_user`, `categ_date_register`) 
VALUES ('1', 'Tecnologia', 'Categoria de tecnologia', 'admin', 'DATE()');

INSERT INTO `LUX-OFFER-DB`.`Category` (`pk_cate_id`, `categ_name`, `categ_description`, `categ_user`, `categ_date_register`) 
VALUES ('2', 'Automoviles', 'Categoria de automoviles', 'admin', 'DATE()');

INSERT INTO `LUX-OFFER-DB`.`Category` (`pk_cate_id`, `categ_name`, `categ_description`, `categ_user`, `categ_date_register`) 
VALUES ('3', 'Viajes', 'Categoria de viajes', 'admin', 'DATE()');


/* YYYY-MM-DD HH:MI:SS  */
INSERT INTO `LUX-OFFER-DB`.`Subcategory` (`pk_subca_id`,`subca_name`,`subca_description`,`subca_user`,`subca_date_register`,`fk_categ_id`) 
VALUES(1,'Celulares','Subcategoria de calulares','admin', 'DATE()',1);

INSERT INTO `LUX-OFFER-DB`.`Subcategory` (`pk_subca_id`,`subca_name`,`subca_description`,`subca_user`,`subca_date_register`,`fk_categ_id`) 
VALUES(2,'Televisores','Subcategoria de televisores','admin', 'DATE()',1);

INSERT INTO `LUX-OFFER-DB`.`Subcategory` (`pk_subca_id`,`subca_name`,`subca_description`,`subca_user`,`subca_date_register`,`fk_categ_id`) 
VALUES(3,'Computadores','Subcategoria de computadores','admin', 'DATE()',1);

INSERT INTO `LUX-OFFER-DB`.`Subcategory` (`pk_subca_id`,`subca_name`,`subca_description`,`subca_user`,`subca_date_register`,`fk_categ_id`) 
VALUES(4,'Motos','Subcategoria de motos','admin', 'DATE()',2);

INSERT INTO `LUX-OFFER-DB`.`Subcategory` (`pk_subca_id`,`subca_name`,`subca_description`,`subca_user`,`subca_date_register`,`fk_categ_id`) 
VALUES(5,'Carros','Subcategoria de carros','admin', 'DATE()',2);


INSERT INTO `LUX-OFFER-DB`.`Subcategory` (`pk_subca_id`,`subca_name`,`subca_description`,`subca_user`,`subca_date_register`,`fk_categ_id`) 
VALUES(6,'Nacionales','Subcategoria de motos','admin', 'DATE()',3);

INSERT INTO `LUX-OFFER-DB`.`Subcategory` (`pk_subca_id`,`subca_name`,`subca_description`,`subca_user`,`subca_date_register`,`fk_categ_id`) 
VALUES(7,'Internacionales','Subcategoria de carros','admin', 'DATE()',3);


INSERT INTO `LUX-OFFER-DB`.`Product` (`pk_product_id`,`product_name`,`product_description`,`product_value_offer`,`product_date_register`,`product_user`,`product_value`,`fk_subca_id`) 
VALUES(1,'Iphone 11 Plus','64 gb Almacenamiento, Camara Duplex Focus, Bateria 6000ma, 5g','0','DATE()','admin','5000000',1);

INSERT INTO `LUX-OFFER-DB`.`Client` (`pk_client_id`,`client_names`,`client_first_last_name`,`client_second_last_name`,`client_email`,`client_cellphone`,`client_nick`,`client_user`,`client_date_register`) 
VALUES (1,'Andres','Real','Delgado','fabio.libre@gmail.com','3183186289','fardul','admin', 'DATE()');