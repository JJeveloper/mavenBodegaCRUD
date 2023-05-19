-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema bodega
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema bodega
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `bodega` DEFAULT CHARACTER SET utf8 ;
USE `bodega` ;

-- -----------------------------------------------------
-- Table `bodega`.`tipodocumento`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bodega`.`tipodocumento` (
  `idtipodocumento` INT NOT NULL AUTO_INCREMENT,
  `tipodocumento` VARCHAR(45) NULL,
  PRIMARY KEY (`idtipodocumento`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bodega`.`proveedor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bodega`.`proveedor` (
  `idproveedor` INT NOT NULL AUTO_INCREMENT,
  `documento` VARCHAR(45) NOT NULL,
  `nombreproveedor` VARCHAR(45) NOT NULL,
  `telefono` VARCHAR(45) NOT NULL,
  `correo` VARCHAR(45) NOT NULL,
  `tipodocumento_idtipodocumento` INT NOT NULL,
  PRIMARY KEY (`idproveedor`),
  INDEX `fk_proveedor_tipodocumento_idx` (`tipodocumento_idtipodocumento` ASC) VISIBLE,
  CONSTRAINT `fk_proveedor_tipodocumento`
    FOREIGN KEY (`tipodocumento_idtipodocumento`)
    REFERENCES `bodega`.`tipodocumento` (`idtipodocumento`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bodega`.`rol`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bodega`.`rol` (
  `idrol` INT NOT NULL AUTO_INCREMENT,
  `rol` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idrol`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bodega`.`empleado`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bodega`.`empleado` (
  `idempleado` INT NOT NULL AUTO_INCREMENT,
  `cedula` VARCHAR(45) NOT NULL,
  `nombres` VARCHAR(45) NOT NULL,
  `apellidos` VARCHAR(45) NOT NULL,
  `pass` VARCHAR(45) NOT NULL,
  `rol_idrol` INT NOT NULL,
  PRIMARY KEY (`idempleado`),
  INDEX `fk_empleado_rol1_idx` (`rol_idrol` ASC) VISIBLE,
  CONSTRAINT `fk_empleado_rol1`
    FOREIGN KEY (`rol_idrol`)
    REFERENCES `bodega`.`rol` (`idrol`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bodega`.`tipoproducto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bodega`.`tipoproducto` (
  `idtipoproducto` INT NOT NULL AUTO_INCREMENT,
  `tipoproducto` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idtipoproducto`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bodega`.`producto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bodega`.`producto` (
  `idproducto` INT NOT NULL AUTO_INCREMENT,
  `codigo` VARCHAR(45) NOT NULL,
  `nombre` VARCHAR(45) NOT NULL,
  `cantidad` INT NOT NULL,
  `fechaelaboracion` DATE NULL,
  `fechacaducidad` DATE NULL,
  `preciocompra` DECIMAL(5,2) NOT NULL,
  `tipoproducto_idtipoproducto` INT NOT NULL,
  PRIMARY KEY (`idproducto`),
  INDEX `fk_producto_tipoproducto1_idx` (`tipoproducto_idtipoproducto` ASC) VISIBLE,
  CONSTRAINT `fk_producto_tipoproducto1`
    FOREIGN KEY (`tipoproducto_idtipoproducto`)
    REFERENCES `bodega`.`tipoproducto` (`idtipoproducto`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bodega`.`recibo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bodega`.`recibo` (
  `idrecibo` INT NOT NULL AUTO_INCREMENT,
  `fecharecido` DATE NOT NULL,
  `proveedor_idproveedor` INT NOT NULL,
  `empleado_idempleado` INT NOT NULL,
  PRIMARY KEY (`idrecibo`),
  INDEX `fk_recibo_proveedor1_idx` (`proveedor_idproveedor` ASC) VISIBLE,
  INDEX `fk_recibo_empleado1_idx` (`empleado_idempleado` ASC) VISIBLE,
  CONSTRAINT `fk_recibo_proveedor1`
    FOREIGN KEY (`proveedor_idproveedor`)
    REFERENCES `bodega`.`proveedor` (`idproveedor`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_recibo_empleado1`
    FOREIGN KEY (`empleado_idempleado`)
    REFERENCES `bodega`.`empleado` (`idempleado`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bodega`.`detallerecibo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bodega`.`detallerecibo` (
  `iddetallerecibo` INT NOT NULL AUTO_INCREMENT,
  `producto_idproducto` INT NOT NULL,
  `recibo_idrecibo` INT NOT NULL,
  PRIMARY KEY (`iddetallerecibo`),
  INDEX `fk_detallerecibo_producto1_idx` (`producto_idproducto` ASC) VISIBLE,
  INDEX `fk_detallerecibo_recibo1_idx` (`recibo_idrecibo` ASC) VISIBLE,
  CONSTRAINT `fk_detallerecibo_producto1`
    FOREIGN KEY (`producto_idproducto`)
    REFERENCES `bodega`.`producto` (`idproducto`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_detallerecibo_recibo1`
    FOREIGN KEY (`recibo_idrecibo`)
    REFERENCES `bodega`.`recibo` (`idrecibo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


use bodega;
-- rol
INSERT INTO `bodega`.`rol` (`rol`) VALUES ('admin'),('jefe bodega');
-- tipo documento
INSERT INTO `bodega`.`tipodocumento` (`tipodocumento`) VALUES ('cedula'),('ruc');
-- empleado
INSERT INTO `bodega`.`empleado` (`cedula`, `nombres`, `apellidos`, `pass`, `rol_idrol`) VALUES 
('0985412547', 'Juan Andres', 'Montes Valdez', sha1('juan'), '2'),
('0257894571', 'Dayanna Monica', 'Malta Veloz', sha1('daya'), '1');
-- jefe de bodega
INSERT INTO `bodega`.`proveedor` (`documento`, `nombreproveedor`, `telefono`, `correo`, `tipodocumento_idtipodocumento`) VALUES 
('0508745214', 'Sarita plus', '0985241201', 'faby@gmail.com', '1');


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
