/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  grtna
 * Created: 6 Jul, 2021
 */

CREATE TABLE `attendence` (
  `id` int(10) DEFAULT NULL,
  `date_tm` varchar(30) DEFAULT NULL,
  `f_half` varchar(20) DEFAULT NULL,
  `s_half` varchar(30) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;



CREATE TABLE `employee` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) DEFAULT NULL,
  `gender` varchar(30) DEFAULT NULL,
  `address` varchar(30) DEFAULT NULL,
  `state` varchar(30) DEFAULT NULL,
  `city` varchar(30) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `phone` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;




CREATE TABLE `login` (
  `username` varchar(30) DEFAULT NULL,
  `password` varchar(30) DEFAULT NULL,
) ENGINE=MyISAM DEFAULT CHARSET=latin1;



CREATE TABLE `salary` (
  `id` int(10) DEFAULT NULL,
  `hra` decimal(12,2) DEFAULT NULL,
  `da` decimal(12,2) DEFAULT NULL,
  `med` decimal(12,2) DEFAULT NULL,
  `pf` decimal(12,2) DEFAULT NULL,
  `basic_salary` decimal(12,2) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
