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
-- Table structure for table `pago`
--

DROP TABLE IF EXISTS `pago`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pago` (
  `idPago` int NOT NULL AUTO_INCREMENT,
  `# Folio` varchar(45) NOT NULL,
  `Nombre Completo` varchar(45) NOT NULL,
  `Bono` varchar(45) NOT NULL,
  `Cuenta` varchar(45) NOT NULL,
  `Banco` varchar(45) NOT NULL,
  `Zona` varchar(45) NOT NULL,
  `Servicio` varchar(45) NOT NULL,
  `Quincena` varchar(45) NOT NULL,
  `Año` varchar(45) NOT NULL,
  `Sueldo Quincenal` varchar(45) NOT NULL,
  `Deposito` varchar(45) NOT NULL,
  PRIMARY KEY (`idPago`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pago`
--

LOCK TABLES `pago` WRITE;
/*!40000 ALTER TABLE `pago` DISABLE KEYS */;
INSERT INTO `pago` VALUES (15,'','','0','','','','','1ra Quincena de Agosto','2021','0','0'),(16,'','PEDROZA ARGAEZ JULIO CESAR','500','.','.','SUR 2','KOWLAAN','1ra Quincena de Agosto','2021','1500','1050.0'),(17,'','PEDROZA ARGAEZ JULIO CESAR','0','.','.','SUR 2','KOWLAAN','1ra Quincena de Agosto','2021','1500','878.02'),(18,'','PEDROZA ARGAEZ JULIO CESAR','500','.','.','SUR 2','KOWLAAN','1ra Quincena de Agosto','2021','1500','1739.6866666666665'),(19,'','','0','','','','','Selecciona una Quincena','2021','0','0');
/*!40000 ALTER TABLE `pago` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-08-17 17:42:28
