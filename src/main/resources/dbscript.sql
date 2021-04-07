-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema LUX-OFFER-DB
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `LUX-OFFER-DB` ;

-- -----------------------------------------------------
-- Schema LUX-OFFER-DB
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `LUX-OFFER-DB` DEFAULT CHARACTER SET utf8 ;
USE `LUX-OFFER-DB` ;

-- -----------------------------------------------------
-- Table `LUX-OFFER-DB`.`Client`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `LUX-OFFER-DB`.`Client` ;

CREATE TABLE IF NOT EXISTS `LUX-OFFER-DB`.`Client` (
  `pk_client_id` INT NOT NULL,
  `client_names` VARCHAR(85) NULL,
  `client_first_last_name` VARCHAR(45) NULL,
  `client_second_last_name` VARCHAR(45) NULL,
  `client_email` VARCHAR(45) NULL,
  `client_cellphone` VARCHAR(45) NULL,
  `client_nick` VARCHAR(45) NULL,
  `client_user` VARCHAR(45) NULL,
  `client_date_register` TIMESTAMP NULL,
  PRIMARY KEY (`pk_client_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `LUX-OFFER-DB`.`Category`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `LUX-OFFER-DB`.`Category` ;

CREATE TABLE IF NOT EXISTS `LUX-OFFER-DB`.`Category` (
  `pk_cate_id` INT NOT NULL,
  `categ_name` VARCHAR(45) NOT NULL,
  `categ_description` VARCHAR(300) NULL,
  `categ_user` VARCHAR(45) NULL,
  `categ_date_register` TIMESTAMP NULL,
  PRIMARY KEY (`pk_cate_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `LUX-OFFER-DB`.`Subcategory`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `LUX-OFFER-DB`.`Subcategory` ;

CREATE TABLE IF NOT EXISTS `LUX-OFFER-DB`.`Subcategory` (
  `pk_subca_id` INT NOT NULL,
  `subca_name` VARCHAR(45) NULL,
  `subca_description` VARCHAR(150) NULL,
  `subca_user` VARCHAR(45) NULL,
  `subca_date_register` TIMESTAMP NULL,
  `fk_categ_id` INT NOT NULL,
  PRIMARY KEY (`pk_subca_id`),
  CONSTRAINT `fk_categ_id`
    FOREIGN KEY (`fk_categ_id`)
    REFERENCES `LUX-OFFER-DB`.`Category` (`pk_cate_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `LUX-OFFER-DB`.`Product`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `LUX-OFFER-DB`.`Product` ;

CREATE TABLE IF NOT EXISTS `LUX-OFFER-DB`.`Product` (
  `pk_product_id` INT NOT NULL,
  `product_name` VARCHAR(45) NOT NULL,
  `product_description` VARCHAR(45) NOT NULL,
  `product_value_offer` VARCHAR(45) NULL,
  `product_date_register` VARCHAR(45) NULL,
  `product_user` VARCHAR(45) NULL,
  `product_value` VARCHAR(45) NULL,
  `fk_subca_id` INT NULL,
  PRIMARY KEY (`pk_product_id`),
  CONSTRAINT `fk_subca_id`
    FOREIGN KEY (`fk_subca_id`)
    REFERENCES `LUX-OFFER-DB`.`Subcategory` (`pk_subca_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `LUX-OFFER-DB`.`Auction`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `LUX-OFFER-DB`.`Auction` ;

CREATE TABLE IF NOT EXISTS `LUX-OFFER-DB`.`Auction` (
  `pk_auct_id` INT NOT NULL,
  `auct_init` TIMESTAMP NOT NULL,
  `auct_end` TIMESTAMP NOT NULL,
  `auct_user` VARCHAR(45) NULL,
  `auct_date_register` TIMESTAMP NULL,
  `auct_value_init` VARCHAR(45) NULL,
  `suba_value_finish` VARCHAR(45) NULL,
  `fk_client_id` INT NULL,
  `fk_product_id` INT NULL,
  PRIMARY KEY (`pk_auct_id`),
  CONSTRAINT `fk_client_id`
    FOREIGN KEY (`fk_client_id`)
    REFERENCES `LUX-OFFER-DB`.`Client` (`pk_client_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_product_id`
    FOREIGN KEY (`fk_product_id`)
    REFERENCES `LUX-OFFER-DB`.`Product` (`pk_product_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
