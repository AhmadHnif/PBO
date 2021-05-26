/*
SQLyog Ultimate v13.1.1 (64 bit)
MySQL - 10.4.18-MariaDB : Database - pbo_karyawan
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`pbo_karyawan` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `pbo_karyawan`;

/*Table structure for table `karyawan` */

DROP TABLE IF EXISTS `karyawan`;

CREATE TABLE `karyawan` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `nama` varchar(128) DEFAULT NULL,
  `kota` varchar(64) DEFAULT NULL,
  `tanggal_lahir` date DEFAULT NULL,
  `pendidikan` varchar(64) DEFAULT NULL,
  `status` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4;

/*Data for the table `karyawan` */

insert  into `karyawan`(`id`,`nama`,`kota`,`tanggal_lahir`,`pendidikan`,`status`) values 
(1,'Budi Sulaiman','Sleman','2000-04-05','Sarjana','Tetap'),
(2,'Cica Marlina','Yogyakarta','1999-01-01','SMA/SMK','Magang'),
(3,'Farhan Adi','Bantul','2000-01-12','SMA/SMK','Tetap'),
(5,'Alex M. Kurniawan','Bantul','2000-02-29','Sarjana','Kontrak'),
(6,'Thomas Andre','Sleman','1998-12-31','D3','Tetap');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
