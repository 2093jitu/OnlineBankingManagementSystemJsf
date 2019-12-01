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
-- Table structure for table `statement`
--

DROP TABLE IF EXISTS `statement`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `statement` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `acc` varchar(45) DEFAULT NULL,
  `date` varchar(45) DEFAULT NULL,
  `depo` varchar(45) DEFAULT NULL,
  `transfer` varchar(45) DEFAULT NULL,
  `transfar_acc` varchar(45) DEFAULT NULL,
  `withdraw` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `statement`
--

LOCK TABLES `statement` WRITE;
/*!40000 ALTER TABLE `statement` DISABLE KEYS */;
INSERT INTO `statement` VALUES (8,'jitu','9926','27/5/2019','5000','-','-','-'),(9,'jitu','9926','27/5/2019','-','5000','1503','-'),(10,'jitu','9926','27/5/2019','-','-','-','5000'),(11,'munna','1503','27/5/2019','5000','-','-','-'),(12,'ruba','7244','27/5/2019','-','5000','9926','-'),(13,'ruba','7244','27/5/2019','-','-','-','5000'),(14,'jitu','9926','27/5/2019','-','-','-','5000'),(15,'munna','1503','3/7/2019','5000','-','-','-'),(16,'munna','1503','3/7/2019','-','7000','7244','-'),(17,'munna','1503','3/7/2019','-','-','-','5000');
/*!40000 ALTER TABLE `statement` ENABLE KEYS */;
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
