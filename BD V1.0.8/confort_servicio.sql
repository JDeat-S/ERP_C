-- MySQL dump 10.13  Distrib 8.0.22, for Win64 (x86_64)
--
-- Host: 192.168.1.2    Database: confort
-- ------------------------------------------------------
-- Server version	8.0.22

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
-- Table structure for table `servicio`
--

DROP TABLE IF EXISTS `servicio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `servicio` (
  `idServ` int NOT NULL AUTO_INCREMENT,
  `idZona` varchar(45) NOT NULL,
  `Nombre Zona` varchar(45) NOT NULL,
  `Supervisor` varchar(100) NOT NULL,
  `Servicio` varchar(80) NOT NULL,
  `Horario` varchar(45) NOT NULL,
  `Abre` varchar(45) NOT NULL,
  `Cierra` varchar(45) NOT NULL,
  `Sabado` varchar(45) NOT NULL,
  `Domingo` varchar(45) NOT NULL,
  `Otro` varchar(100) NOT NULL,
  PRIMARY KEY (`idServ`)
) ENGINE=InnoDB AUTO_INCREMENT=87 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `servicio`
--

LOCK TABLES `servicio` WRITE;
/*!40000 ALTER TABLE `servicio` DISABLE KEYS */;
INSERT INTO `servicio` VALUES (1,'1','Sur 1','','SANTANDER GUADALUPE','','','','','',''),(2,'1','Sur 1','','SANTANDER INSURGENTES','','','','','',''),(3,'1','Sur 1','','SANTANDER SAN JERONIMO','','','','','',''),(4,'1','Sur 1','','SANTANDER XOLA','','','','','',''),(5,'1','Sur 1','','SANTANDER TLALPAN','','','','','',''),(6,'1','Sur 1','','SANTANDER FELIX CUEVAS','','','','','',''),(7,'1','Sur 1','','SANTANDER COPILCO','','','','','',''),(8,'1','Sur 1','','SANT. DESIERTO DE LOS LEONES','','','','','',''),(9,'1','Sur 1','','EST. ITURBIDE $15 X HRA','','','','','',''),(10,'1','Sur 1','','EST. PTE TITLA $18 X HRA','','','','','',''),(11,'1','Sur 1','','CLUB KIDS $50 BOLETAJE','','','','','',''),(12,'1','Sur 1','','PARTY SURPRISE $45 BOLETAJE','','','','','',''),(13,'1','Sur 1','','CITY EXPRESS PERIFERICO','','','','','',''),(14,'1','Sur 1','','XOTEPINGO','','','','','',''),(15,'1','Sur 1','','EDIFICIO AGATHA','','','','','',''),(16,'2','Sur 2','','SANTANDER MASARIK','','','','','',''),(17,'2','Sur 2','','SANTANDER MISISIPI','','','','','',''),(18,'2','Sur 2','','SANTANDER NEWTON','','','','','',''),(19,'2','Sur 2','','SANTANDER PALMAS','','','','','',''),(20,'2','Sur 2','','SANTANDER PLAZA REFORMA','','','','','',''),(21,'2','Sur 2','','SANTANDER POLANCO','','','','','',''),(22,'2','Sur 2','','SANTANDER L. DE CHAPULTEPEC','','','','','',''),(23,'2','Sur 2','','SANTANDER NIZA','','','','','',''),(24,'2','Sur 2','','NOTARIA EDIF. ROSSEAU','','','','','',''),(25,'2','Sur 2','','GRUPO EXPANSION','','','','','',''),(26,'2','Sur 2','','HONDA SAN ANTONIO','','','','','',''),(27,'2','Sur 2','','BELMAR  $50 BOLETAJE','','','','','',''),(28,'2','Sur 2','','EST. TEHUANTEPEC $22 X HRA','','','','','',''),(29,'3','Zona Norte','','SANTANDER LOMAS VERDES','','','','','',''),(30,'3','Zona Norte','','SANTANDER INTERLOMAS','','','','','',''),(31,'3','Zona Norte','','ENTRE GAUCHOS S/BOLETAJE','','','','','',''),(33,'3','Zona Norte','','LA ERA/LA ERA EST.','','','','','',''),(34,'3','Zona Norte','','LA ERA SANTA CRUZ','','','','','',''),(35,'4','Foraneos Acapulco','','SANTANDER RENACIMIENTO','','','','','',''),(36,'4','Foraneos Acapulco','','SANTANDER PRINCIPAPL','','','','','',''),(37,'4','Foraneos Acapulco','','SANTANDER COSTA AZUL','','','','','',''),(38,'5','Zona Poniente','','SANTANDER MONTEVIDEO','','','','','',''),(39,'5','Zona Poniente','','SANTANDER CANAL DEL NORTE','','','','','',''),(40,'5','Zona Poniente','','SANTANDER AZCAPOTZALCO','','','','','',''),(41,'5','Zona Poniente','','SANTANDER MARINA NACIONAL','','','','','',''),(42,'5','Zona Poniente','','SANTANDER EL CABALLITO','','','','','',''),(43,'6','Foraneos Puebla','','SANTANDER TEHUACAN','','','','','',''),(44,'7','Foraneos Toluca','','SANTANDER MORELOS','','','','','',''),(45,'7','Foraneos Toluca','','SANTANDER METEPEC','','','','','',''),(46,'7','Foraneos Toluca','','EST. MORELOS','','','','','',''),(47,'7','Foraneos Toluca','','EST. VITRALES','','','','','',''),(48,'7','Foraneos Toluca','','EST. PROCURADORIA','','','','','',''),(49,'7','Foraneos Toluca','','EST. SAN MATEO','','','','','',''),(50,'7','Foraneos Toluca','','SALON DIAMANTE','','','','','',''),(51,'7','Foraneos Toluca','','SALON HACIENDA LA BONITA','','','','','',''),(52,'7','Foraneos Toluca','','SALON FINCA LAS JOYAS','','','','','',''),(53,'7','Foraneos Toluca','','SALON ALCATRACES','','','','','',''),(54,'7','Foraneos Toluca','','JARDIN ESMERALDA','','','','','',''),(55,'7','Foraneos Toluca','','SALON MALLORCA','','','','','',''),(56,'7','Foraneos Toluca','','SALON TARASCO','','','','','',''),(57,'7','Foraneos Toluca','','SALON MAGYCAL PARTY','','','','','',''),(63,'1','Sur 1','','SUPERVISOR','','','','','',''),(64,'2','Sur 2','','SUPERVISOR','','','','','',''),(65,'3','Zona Norte','','SUPERVISOR','','','','','',''),(66,'5','Zona Poniente','','SUPERVISOR','','','','','',''),(86,'2','Sur 2','ARTURO LADRILLERO','KOWLAAN $30 BOLETAJE SS. $50','','','','','','08:00 AM HASTA EL CIERRE');
/*!40000 ALTER TABLE `servicio` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-08-19 21:22:43
