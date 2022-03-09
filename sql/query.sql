CREATE SCHEMA `iticket` ;

CREATE TABLE `artistas` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `nombre` varchar(255) DEFAULT NOT NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE `conciertos` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `capacidad_max` int NOT NULL,
  `costo` bigint NOT NULL,
  `fecha` varchar(255) DEFAULT NULL,
  `lugar` varchar(255) DEFAULT NULL,
  `artista_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  FOREIGN KEY (`artista_id`) REFERENCES `artistas` (`id`)
);

INSERT INTO `iticket`.`artistas`(`nombre`) VALUES ("Jorge Drexler");
INSERT INTO `iticket`.`artistas`(`nombre`) VALUES ("Coldplay");
INSERT INTO `iticket`.`artistas`(`nombre`) VALUES ("Maroon 5");
INSERT INTO `iticket`.`artistas`(`nombre`) VALUES ("Raphael");
INSERT INTO `iticket`.`artistas`(`nombre`) VALUES ("Alejandro Sanz");
INSERT INTO `iticket`.`artistas`(`nombre`) VALUES ("Joan Manuel Serrat");

INSERT INTO `iticket`.`conciertos` (`id`, `capacidad_max`, `costo`, `fecha`, `lugar`, `artista_id`) VALUES ('1', '1000', '20000', '18 y 19 de marzo', 'Estadio Nacional', '1');
INSERT INTO `iticket`.`conciertos` (`id`, `capacidad_max`, `costo`, `fecha`, `lugar`, `artista_id`) VALUES ('2', '1000', '30000', '13 de abril', 'Parque Viva', '2');
INSERT INTO `iticket`.`conciertos` (`id`, `capacidad_max`, `costo`, `fecha`, `lugar`, `artista_id`) VALUES ('3', '1000', '10000', '29 y 30 de abril a las 8 p.m', 'Teatro Popular Melico Salazar', '3');
INSERT INTO `iticket`.`conciertos` (`id`, `capacidad_max`, `costo`, `fecha`, `lugar`, `artista_id`) VALUES ('4', '1000', '10000', '1 de mayo', 'Parque Viva', '4');
INSERT INTO `iticket`.`conciertos` (`id`, `capacidad_max`, `costo`, `fecha`, `lugar`, `artista_id`) VALUES ('5', '1000', '2000', '28 de mayo a las 7 p.m', 'Parque Viva', '5');
