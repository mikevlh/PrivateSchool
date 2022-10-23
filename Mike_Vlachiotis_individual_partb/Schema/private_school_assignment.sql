-- MySQL dump 10.13  Distrib 8.0.29, for Win64 (x86_64)
--
-- Host: localhost    Database: private_school
-- ------------------------------------------------------
-- Server version	8.0.29

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
-- Table structure for table `assignment`
--

DROP TABLE IF EXISTS `assignment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `assignment` (
  `Ass_ID` int NOT NULL AUTO_INCREMENT,
  `Ass_Title` varchar(45) DEFAULT NULL,
  `Description` varchar(1000) DEFAULT NULL,
  `Sub_Date_Time` datetime DEFAULT NULL,
  `Oral_Mark` decimal(5,2) DEFAULT NULL,
  `Total_Mark` decimal(5,2) DEFAULT NULL,
  PRIMARY KEY (`Ass_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=892638946 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `assignment`
--

LOCK TABLES `assignment` WRITE;
/*!40000 ALTER TABLE `assignment` DISABLE KEYS */;
INSERT INTO `assignment` VALUES (101139669,'JAVASCRIPT ASSIGNMENT 4','“Assignment’s Description….”','2025-06-27 23:59:59',9.00,77.00),(186670194,'JAVA ASSIGNMENT 3','“Assignment’s Description….”','2022-05-23 23:59:59',4.00,20.00),(211693278,'PYTHON ASSIGNMENT 3','“Assignment’s Description….”','2023-05-23 23:59:59',20.00,33.00),(323791297,'JAVA ASSIGNMENT 5','“Assignment’s Description….”','2022-08-26 23:59:59',6.00,63.00),(330001890,'JAVASCRIPT ASSIGNMENT 3','“Assignment’s Description….”','2025-05-23 23:59:59',13.00,63.00),(354755530,'C# ASSIGNMENT 3','“Assignment’s Description….”','2024-05-23 23:59:59',12.00,23.00),(377776514,'PYTHON ASSIGNMENT 5','“Assignment’s Description….”','2023-08-26 23:59:59',11.00,73.00),(393361831,'PYTHON ASSIGNMENT 1','“Assignment’s Description….”','2023-03-28 23:59:59',15.00,75.00),(444867363,'JAVASCRIPT ASSIGNMENT 2','“Assignment’s Description….”','2025-04-25 23:59:59',14.00,28.00),(496859608,'C# ASSIGNMENT 1','“Assignment’s Description….”','2024-03-28 23:59:59',20.00,74.00),(569830557,'C# ASSIGNMENT 2','“Assignment’s Description….”','2024-04-25 23:59:59',18.00,57.00),(631032171,'JAVASCRIPT ASSIGNMENT 5','“Assignment’s Description….”','2025-08-26 23:59:59',13.00,49.00),(693068296,'C# ASSIGNMENT 4','“Assignment’s Description….”','2024-06-27 23:59:59',18.00,75.00),(706162268,'JAVA ASSIGNMENT 2','“Assignment’s Description….”','2022-04-25 23:59:59',13.00,70.00),(714445736,'PYTHON ASSIGNMENT 2','“Assignment’s Description….”','2023-04-25 23:59:59',10.00,83.00),(728444399,'C# ASSIGNMENT 5','“Assignment’s Description….”','2024-08-26 23:59:59',12.00,51.00),(749223362,'JAVA ASSIGNMENT 4','“Assignment’s Description….”','2022-06-27 23:59:59',8.00,52.00),(803008202,'JAVA ASSIGNMENT 1','“Assignment’s Description….”','2022-03-28 23:59:59',8.00,21.00),(872156833,'PYTHON ASSIGNMENT 4','“Assignment’s Description….”','2023-06-27 23:59:59',5.00,23.00),(892638944,'JAVASCRIPT ASSIGNMENT 1','“Assignment’s Description….”','2025-03-28 23:59:59',6.00,62.00),(892638945,'kappa','kepo','1212-12-12 00:00:00',12.00,31.00);
/*!40000 ALTER TABLE `assignment` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-06-07 23:28:53
