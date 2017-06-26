DROP TABLE IF EXISTS `sprachen`.`idsprachen`;
CREATE TABLE  `sprachen`.`idsprachen` (
  `IDSprachen` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `SprachenNiveau` varchar(45) NOT NULL DEFAULT '',
  PRIMARY KEY (`IDSprachen`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;



DROP TABLE IF EXISTS `sprachen`.`sprachkompetenz`;
CREATE TABLE  `sprachen`.`sprachkompetenz` (
  `IDSprachkompetenz` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `IDSprache` varchar(45) NOT NULL DEFAULT '',
  `IDSchüler` varchar(45) NOT NULL DEFAULT '',
  `SprachenNiveau` varchar(45) NOT NULL DEFAULT '',
  PRIMARY KEY (`IDSprachkompetenz`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


INSERT INTO idsprachen VALUES (1, 'deutsch');
INSERT INTO idsprachen VALUES (2, 'englisch');
INSERT INTO idsprachen VALUES (3, 'tuerkisch');
INSERT INTO idsprachen VALUES (4, 'arabisch');
