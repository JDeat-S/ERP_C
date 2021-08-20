-- MySQL dump 10.13  Distrib 8.0.22, for Win64 (x86_64)
--
-- Host: 192.168.3.10    Database: confort
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
-- Table structure for table `estadia`
--

DROP TABLE IF EXISTS `estadia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `estadia` (
  `idEstadias` int NOT NULL AUTO_INCREMENT,
  `# Exp` varchar(45) NOT NULL,
  `Apellido P` varchar(45) NOT NULL,
  `Apellido M` varchar(45) NOT NULL,
  `Nombre(s)` varchar(45) NOT NULL,
  `# Celular` varchar(45) NOT NULL,
  `Carrera` varchar(45) NOT NULL,
  `Tipo de carrera` varchar(45) NOT NULL,
  `CURP` varchar(45) NOT NULL,
  `Status` varchar(45) NOT NULL,
  `Fecha de ingreso` varchar(45) NOT NULL,
  `Fecha de termino` varchar(45) NOT NULL,
  `Carta de precentacion` varchar(45) NOT NULL,
  `Carta de aceptacion` varchar(45) NOT NULL,
  `Programa de actividades` varchar(45) NOT NULL,
  `1er avance` varchar(45) NOT NULL,
  `2do avance` varchar(45) NOT NULL,
  `3er avance` varchar(45) NOT NULL,
  `Carta termino` varchar(45) NOT NULL,
  `Autorizacion empastado` varchar(45) NOT NULL,
  `Evaluacion` varchar(45) NOT NULL,
  `Observaciones` varchar(1000) NOT NULL,
  PRIMARY KEY (`idEstadias`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `estadia`
--

LOCK TABLES `estadia` WRITE;
/*!40000 ALTER TABLE `estadia` DISABLE KEYS */;
INSERT INTO `estadia` VALUES (1,'789','Perez','Tore','Dom','55123','ADM','TSU','PRDASD456','Pendiente','20/256/45','+65*65/45','x','x','x','x','x','x','x','x','x','');
/*!40000 ALTER TABLE `estadia` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-08-20 17:22:43
