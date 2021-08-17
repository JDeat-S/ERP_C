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
-- Table structure for table `nomina`
--

DROP TABLE IF EXISTS `nomina`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `nomina` (
  `idNomina` int NOT NULL AUTO_INCREMENT,
  `#_Folio` varchar(45) NOT NULL,
  `Nombre Completo` varchar(45) NOT NULL,
  `Cuenta_Nom` varchar(45) NOT NULL,
  `Banco_Nom` varchar(45) NOT NULL,
  `Zona_Nom` varchar(45) NOT NULL,
  `Servicio_Nom` varchar(45) NOT NULL,
  `Sueldo_Nom` varchar(45) NOT NULL,
  `Pd` varchar(45) NOT NULL,
  `Quincena` varchar(45) NOT NULL,
  `Año` varchar(45) NOT NULL,
  `Dia 1 o 16` varchar(45) NOT NULL,
  `Dia 2 o 17` varchar(45) NOT NULL,
  `Dia 3 o 18` varchar(45) NOT NULL,
  `Dia 4 o 19` varchar(45) NOT NULL,
  `Dia 5 o 20` varchar(45) NOT NULL,
  `Dia 6 o 21` varchar(45) NOT NULL,
  `Dia 7 o 22` varchar(45) NOT NULL,
  `Dia 8 o 23` varchar(45) NOT NULL,
  `Dia 9 o 24` varchar(45) NOT NULL,
  `Dia 10 o 25` varchar(45) NOT NULL,
  `Dia 11 o 26` varchar(45) NOT NULL,
  `Dia 12 o 27` varchar(45) NOT NULL,
  `Dia 13 o 28` varchar(45) NOT NULL,
  `Dia 14 o 29` varchar(45) NOT NULL,
  `Dia 15 o 30` varchar(45) NOT NULL,
  `Dia 31` varchar(45) NOT NULL,
  `Desc_v` varchar(45) DEFAULT NULL,
  `Desc_IMSS` varchar(45) DEFAULT NULL,
  `Apoyo` varchar(45) DEFAULT NULL,
  `Lugar` varchar(45) DEFAULT NULL,
  `Caja` varchar(45) DEFAULT NULL,
  `add` varchar(45) DEFAULT NULL,
  `Bono` varchar(45) DEFAULT NULL,
  `Faltantes de boleto` varchar(45) DEFAULT NULL,
  `Faltante de efectivo` varchar(45) DEFAULT NULL,
  `Boleto perdido` varchar(45) DEFAULT NULL,
  `Sancion` varchar(45) DEFAULT NULL,
  `Grua` varchar(45) DEFAULT NULL,
  `Playera` varchar(45) DEFAULT NULL,
  `Chamarra` varchar(45) DEFAULT NULL,
  `Pantalon` varchar(45) DEFAULT NULL,
  `Corbata` varchar(45) DEFAULT NULL,
  `Chaleco` varchar(45) DEFAULT NULL,
  `Credencial` varchar(45) DEFAULT NULL,
  `Orden de taller` varchar(45) DEFAULT NULL,
  `Prestamos` varchar(45) DEFAULT NULL,
  `Rembolso` varchar(45) DEFAULT NULL,
  `Deposito` varchar(45) DEFAULT NULL,
  `Observaciones` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idNomina`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nomina`
--

LOCK TABLES `nomina` WRITE;
/*!40000 ALTER TABLE `nomina` DISABLE KEYS */;
INSERT INTO `nomina` VALUES (26,'','','','','','','0','0.0','1ra Quincena de Agosto','2021','A','A','A','A','A','A','A','A','A','A','A','A','A','A','A','.','0','0','0','','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0',''),(27,'','PEDROZA ARGAEZ JULIO CESAR','.','.','SUR 2','KOWLAAN','1500','100.0','1ra Quincena de Agosto','2021','A','A','A','F','A','A','D','D','A','A','A','D','D','A','A','.','500','0','0','0','0','0','500','0','0','0','0','0','0','0','0','0','0','0','0','0','00','1050.0',''),(28,'','PEDROZA ARGAEZ JULIO CESAR','.','.','SUR 2','KOWLAAN','1500','100.0','1ra Quincena de Agosto','2021','A','A','A','A','A','A','D','F','A','A','A','A','A','D','D','.','95.0','26.98','0','','100','0','500','0','95.00','0','0','0','0','0','0','0','0','0','0','50','0','878.02',''),(29,'','PEDROZA ARGAEZ JULIO CESAR','.','.','SUR 2','KOWLAAN','1500','103.33333333333333','1ra Quincena de Agosto','2021','A','V','V','A','A','A','A','A','A','A','A','D','D','V','V','.','0','26.98','120','CAFE','.','0','500','0','0','0','0','0','0','0','0','0','0','0','0','0','200','1739.6866666666665',''),(30,'','','','','','','0','0','Selecciona una Quincena','2021','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','0','26.98','0','','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','');
/*!40000 ALTER TABLE `nomina` ENABLE KEYS */;
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
