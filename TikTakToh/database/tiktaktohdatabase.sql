-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Aug 05, 2015 at 09:41 PM
-- Server version: 5.6.17
-- PHP Version: 5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `tiktaktohdatabase`
--

-- --------------------------------------------------------

--
-- Table structure for table `sessionresults`
--

CREATE TABLE IF NOT EXISTS `sessionresults` (
  `Timestamp` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `SinglePlayerMode` tinyint(1) NOT NULL,
  `Player1` int(11) NOT NULL,
  `Player2` int(11) NOT NULL,
  `Tied` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `sessionresults`
--

INSERT INTO `sessionresults` (`Timestamp`, `SinglePlayerMode`, `Player1`, `Player2`, `Tied`) VALUES
('2015-08-02 18:59:13', 1, 1, 0, 0),
('2015-08-02 19:04:35', 1, 2, 1, 0),
('2015-08-05 15:50:03', 1, 1, 0, 0),
('2015-08-05 15:57:43', 1, 0, 1, 0);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
