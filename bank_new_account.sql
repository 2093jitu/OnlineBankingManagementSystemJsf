CREATE DATABASE  IF NOT EXISTS `bank` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `bank`;
-- MySQL dump 10.13  Distrib 8.0.17, for Win64 (x86_64)
--
-- Host: localhost    Database: bank
-- ------------------------------------------------------
-- Server version	8.0.17

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `new_account`
--

DROP TABLE IF EXISTS `new_account`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `new_account` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `acc` int(11) DEFAULT NULL,
  `name` varchar(45) DEFAULT NULL,
  `dob` date DEFAULT NULL,
  `pin` varchar(45) DEFAULT NULL,
  `acc_type` varchar(45) DEFAULT NULL,
  `nationality` varchar(45) DEFAULT NULL,
  `caste` varchar(45) DEFAULT NULL,
  `micr_no` int(11) DEFAULT NULL,
  `gender` varchar(45) DEFAULT NULL,
  `mob` varchar(45) DEFAULT NULL,
  `address` varchar(45) DEFAULT NULL,
  `sec_q` varchar(45) DEFAULT NULL,
  `sec_a` varchar(45) DEFAULT NULL,
  `balance` double DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `new_account`
--

LOCK TABLES `new_account` WRITE;
/*!40000 ALTER TABLE `new_account` DISABLE KEYS */;
INSERT INTO `new_account` VALUES (8,7777,'md jitu','2019-08-02','mridu','Saving','Napal','muslim',501,'Male','01765515354','dhaka','What is your mother maiden name?','ufgyugyh',5000),(9,7777,'md nuruzzaman','2019-08-02','mridu','Current','bangladesh','muslim',501,'Male','01765515354','faridpur','What is your mother maiden name?','uf',5000),(10,7777,'md nuruzzaman','2019-08-02','mridu','Current','bangladesh','muslim',501,'Male','01765515354','faridpur','What is your mother maiden name?','uf',5000),(11,7777,'md jity','2019-08-02','mridu','Current','bangladesh','muslim',501,'Male','01765515354','faridpur','What is your mother maiden name?','uf',5000),(12,888,'alim','2019-08-01','abul','Current','bangladesh','muslim',788,'Male','01714719154','dhaka','What is your mother maiden name?','alim',7000),(13,0,'dsfgsdrfg',NULL,'','Saving','bangladesh','',0,'','','','What is your name?','',0),(14,77,'maria rahman mridu','1995-01-07','123456','Current','bangladesh','muslim',597,'Female','01780319747','kadirdi','What is your name?','mridu',5000),(15,0,'',NULL,'','Saving','bangladesh','',0,'','','','What is your name?','',0),(16,0,'',NULL,'','Saving','bangladesh','',0,'','','','What is your name?','',0),(17,666,'',NULL,'','Saving','bangladesh','',0,'','','','What is your name?','',0),(18,77777,'',NULL,'','Saving','bangladesh','',0,'','','','What is your name?','',0),(19,9999,'',NULL,'','Saving','bangladesh','',0,'','','','What is your name?','',0),(20,9999,'',NULL,'','Saving','bangladesh','',0,'','','','What is your name?','',0),(21,1111,'',NULL,'','Saving','bangladesh','',0,'','','','What is your name?','',0),(22,123456,'mmjitu','2019-08-07','19933','Current','Napal','muslim',147,'Male','01765515354','faridpur','What is your mother maiden name?','jitu',7000),(23,0,'new',NULL,'','Saving','bangladesh','',0,'','','','What is your name?','',0),(24,0,'new',NULL,'','Saving','bangladesh','',0,'','','','What is your name?','',0),(25,0,'new',NULL,'','Saving','bangladesh','',0,'','','','What is your name?','',0),(26,123456,'',NULL,'','Saving','bangladesh','',0,'','','','What is your name?','',0),(27,0,'',NULL,'','Saving','bangladesh','',0,NULL,NULL,NULL,NULL,NULL,0),(28,123456,'md nuruzzaman','1993-10-03','248','Current','bangladesh','muslim',369,'Male','01765515354','faridpur','What is your name?','jitu',7000),(29,0,'test',NULL,'','Saving','bangladesh','',0,'','','','What is your name?','',0),(30,0,'alim',NULL,'','Saving','bangladesh','',0,'','','','What is your name?','',0);
/*!40000 ALTER TABLE `new_account` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-08-31  8:22:41
