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
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `student` (
  `Student_ID` int NOT NULL AUTO_INCREMENT,
  `Stu_FName` varchar(45) DEFAULT NULL,
  `Stu_LName` varchar(45) DEFAULT NULL,
  `DOB` date DEFAULT NULL,
  `TuitionFees` decimal(7,2) DEFAULT NULL,
  PRIMARY KEY (`Student_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=987586141 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student`
--

LOCK TABLES `student` WRITE;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` VALUES (114547833,'Artemis','Ganelli','1996-03-23',4463.00),(150899102,'Efstathios','Perratos','1987-04-27',3849.00),(153963402,'Savvas','Demiades','1994-04-06',9446.00),(194976682,'Vasso','Siskeli','1987-10-08',1672.00),(214603651,'Periklis','Totoulis','1994-12-16',1849.00),(228776907,'Vasileia','Kairalli','1994-10-23',5421.00),(234100368,'Yannis','Nanatos','1993-07-01',6481.00),(299845276,'Chirstoforos','Ganas','1988-02-12',5636.00),(306175367,'Marina','Marka','1986-02-28',9480.00),(341290008,'Nana','Pauloti','1993-10-09',2781.00),(372569941,'Eftichios','Agnas','1992-12-01',8131.00),(373713334,'Theofylaktos','Stavrellis','1991-07-12',3911.00),(385861381,'Veniamin','Agnoulis','1987-01-08',2784.00),(410664054,'Efthimia','Hadjitzi','1998-08-06',8269.00),(420137074,'Sophia','Valouli','1988-06-28',2941.00),(439635856,'Eftichios','Gariades','1994-12-10',5225.00),(466983758,'Ekaterini','Zanidi','1998-10-11',9936.00),(536644253,'Callirhoe','Zervou','1994-03-27',4298.00),(543410428,'Thanos','Papides','1995-12-21',6415.00),(550269989,'Zaharias','Makrotis','1986-02-19',6452.00),(551258458,'Areti','Kanelli','1997-07-09',3662.00),(594279981,'Evengelia','Naneli','1987-04-29',1558.00),(599678653,'Florentia','Rondalli','1989-03-01',9854.00),(614965744,'Lisa','Balatou','1991-08-30',5746.00),(652655526,'Theofania','Scafideli','1996-07-01',3872.00),(661531492,'Panagiotis','Chaconallis','1986-04-10',4452.00),(729161168,'Dimitris','Chondrotsis','1986-02-08',7058.00),(729619641,'Aikaterini','Kontidi','1989-03-19',5782.00),(741962137,'Andromahi','Markopoulou','1996-09-17',5746.00),(763316691,'Manoussos','Zografas','1987-06-16',1213.00),(764695934,'Foteini','Chronili','1992-11-08',5848.00),(810722503,'Filia','Demaki','1990-10-17',7912.00),(848249576,'Aristidis','Burelis','1986-03-06',4943.00),(857079655,'Tolis','Roussidis','1995-09-14',8796.00),(926939063,'Iossif','Lazopoulos','1988-04-10',6460.00),(946600321,'Epameinondas','Remas','1985-04-10',9783.00),(946897306,'Lavrentios','Agnopoulos','1995-07-14',4835.00),(965757835,'Efthimia','Kanelalli','1997-05-31',3133.00),(980010963,'Agni','Maragide','1989-04-09',7948.00),(987586138,'Orestis','Cosmakos','1993-03-07',4465.00),(987586139,'Mike','cool','1995-05-25',12.50);
/*!40000 ALTER TABLE `student` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-06-07 23:28:54
