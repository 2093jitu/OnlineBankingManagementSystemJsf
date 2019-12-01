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
-- Table structure for table `new_balance`
--

DROP TABLE IF EXISTS `new_balance`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `new_balance` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `acc` int(11) DEFAULT NULL,
  `micr_no` int(11) DEFAULT NULL,
  `balance` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `new_balance`
--

LOCK TABLES `new_balance` WRITE;
/*!40000 ALTER TABLE `new_balance` DISABLE KEYS */;
INSERT INTO `new_balance` VALUES (2,'shadin',888,800,'1400'),(3,'rabbi',777,900,'0'),(4,'',7777777,0,'0'),(5,'',7777777,0,'0'),(6,'',7777777,0,'0'),(7,'',7777777,0,'0'),(8,'',7777777,0,'0'),(9,'',7777777,0,'0'),(10,'mmjitu',0,0,'0'),(11,'mmjitu',0,0,'0'),(12,'mmjitu',123456,147,'5000'),(13,'new',0,0,'0'),(14,'new',0,0,'0'),(15,'new',0,0,'0'),(16,'',123456,0,'0'),(17,'',123456,0,'0'),(18,'',0,0,'0'),(19,'',0,0,'0'),(20,'',0,0,'0'),(21,'md nuruzzaman',123456,369,'7000'),(22,'test',0,0,'0'),(23,'alim',0,0,'0');
/*!40000 ALTER TABLE `new_balance` ENABLE KEYS */;
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
