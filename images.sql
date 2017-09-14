-- phpMyAdmin SQL Dump
-- version 3.4.10.1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Jul 07, 2017 at 08:06 AM
-- Server version: 5.5.20
-- PHP Version: 5.3.10

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `images`
--

-- --------------------------------------------------------

--
-- Table structure for table `test`
--

CREATE TABLE IF NOT EXISTS `test` (
  `id` int(10) NOT NULL,
  `path` varchar(40) NOT NULL,
  `texturepath` varchar(40) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `test`
--

INSERT INTO `test` (`id`, `path`, `texturepath`) VALUES
(1, 'D:\\test\\tuku\\springflowers\\Image01.jpg', 'D:\\test\\tuku\\result\\Image1.txt'),
(2, 'D:\\test\\tuku\\springflowers\\Image02.jpg', 'D:\\test\\tuku\\result\\Image2.txt'),
(3, 'D:\\test\\tuku\\springflowers\\Image03.jpg', 'D:\\test\\tuku\\result\\Image3.txt'),
(4, 'D:\\test\\tuku\\springflowers\\Image04.jpg', 'D:\\test\\tuku\\result\\Image4.txt'),
(5, 'D:\\test\\tuku\\springflowers\\Image05.jpg', 'D:\\test\\tuku\\result\\Image5.txt'),
(6, 'D:\\test\\tuku\\springflowers\\Image06.jpg', 'D:\\test\\tuku\\result\\Image6.txt'),
(7, 'D:\\test\\tuku\\springflowers\\Image07.jpg', 'D:\\test\\tuku\\result\\Image7.txt'),
(8, 'D:\\test\\tuku\\springflowers\\Image08.jpg', 'D:\\test\\tuku\\result\\Image8.txt'),
(9, 'D:\\test\\tuku\\springflowers\\Image09.jpg', 'D:\\test\\tuku\\result\\Image9.txt'),
(10, 'D:\\test\\tuku\\springflowers\\Image10.jpg', 'D:\\test\\tuku\\result\\Image10.txt'),
(11, 'D:\\test\\tuku\\springflowers\\Image11.jpg', 'D:\\test\\tuku\\result\\Image11.txt'),
(12, 'D:\\test\\tuku\\springflowers\\Image12.jpg', 'D:\\test\\tuku\\result\\Image12.txt'),
(13, 'D:\\test\\tuku\\springflowers\\Image13.jpg', 'D:\\test\\tuku\\result\\Image13.txt'),
(14, 'D:\\test\\tuku\\springflowers\\Image14.jpg', 'D:\\test\\tuku\\result\\Image14.txt'),
(15, 'D:\\test\\tuku\\springflowers\\Image15.jpg', 'D:\\test\\tuku\\result\\Image15.txt'),
(16, 'D:\\test\\tuku\\springflowers\\Image16.jpg', 'D:\\test\\tuku\\result\\Image16.txt'),
(17, 'D:\\test\\tuku\\springflowers\\Image17.jpg', 'D:\\test\\tuku\\result\\Image17.txt'),
(18, 'D:\\test\\tuku\\springflowers\\Image18.jpg', 'D:\\test\\tuku\\result\\Image18.txt'),
(19, 'D:\\test\\tuku\\springflowers\\Image19.jpg', 'D:\\test\\tuku\\result\\Image19.txt'),
(20, 'D:\\test\\tuku\\springflowers\\Image20.jpg', 'D:\\test\\tuku\\result\\Image20.txt'),
(21, 'D:\\test\\tuku\\springflowers\\Image21.jpg', 'D:\\test\\tuku\\result\\Image21.txt'),
(22, 'D:\\test\\tuku\\springflowers\\Image22.jpg', 'D:\\test\\tuku\\result\\Image22.txt'),
(23, 'D:\\test\\tuku\\springflowers\\Image23.jpg', 'D:\\test\\tuku\\result\\Image23.txt'),
(24, 'D:\\test\\tuku\\springflowers\\Image24.jpg', 'D:\\test\\tuku\\result\\Image24.txt'),
(25, 'D:\\test\\tuku\\springflowers\\Image25.jpg', 'D:\\test\\tuku\\result\\Image25.txt'),
(26, 'D:\\test\\tuku\\springflowers\\Image26.jpg', 'D:\\test\\tuku\\result\\Image26.txt'),
(27, 'D:\\test\\tuku\\springflowers\\Image27.jpg', 'D:\\test\\tuku\\result\\Image27.txt'),
(28, 'D:\\test\\tuku\\springflowers\\Image28.jpg', 'D:\\test\\tuku\\result\\Image28.txt'),
(29, 'D:\\test\\tuku\\springflowers\\Image29.jpg', 'D:\\test\\tuku\\result\\Image29.txt'),
(30, 'D:\\test\\tuku\\springflowers\\Image30.jpg', 'D:\\test\\tuku\\result\\Image30.txt'),
(31, 'D:\\test\\tuku\\springflowers\\Image31.jpg', 'D:\\test\\tuku\\result\\Image31.txt'),
(32, 'D:\\test\\tuku\\springflowers\\Image32.jpg', 'D:\\test\\tuku\\result\\Image32.txt'),
(33, 'D:\\test\\tuku\\springflowers\\Image33.jpg', 'D:\\test\\tuku\\result\\Image33.txt'),
(34, 'D:\\test\\tuku\\springflowers\\Image34.jpg', 'D:\\test\\tuku\\result\\Image34.txt'),
(35, 'D:\\test\\tuku\\springflowers\\Image35.jpg', 'D:\\test\\tuku\\result\\Image35.txt'),
(36, 'D:\\test\\tuku\\springflowers\\Image36.jpg', 'D:\\test\\tuku\\result\\Image36.txt'),
(37, 'D:\\test\\tuku\\springflowers\\Image37.jpg', 'D:\\test\\tuku\\result\\Image37.txt'),
(38, 'D:\\test\\tuku\\springflowers\\Image38.jpg', 'D:\\test\\tuku\\result\\Image38.txt'),
(39, 'D:\\test\\tuku\\springflowers\\Image39.jpg', 'D:\\test\\tuku\\result\\Image39.txt'),
(40, 'D:\\test\\tuku\\springflowers\\Image40.jpg', 'D:\\test\\tuku\\result\\Image40.txt'),
(41, 'D:\\test\\tuku\\springflowers\\Image41.jpg', 'D:\\test\\tuku\\result\\Image41.txt'),
(42, 'D:\\test\\tuku\\springflowers\\Image42.jpg', 'D:\\test\\tuku\\result\\Image42.txt'),
(43, 'D:\\test\\tuku\\springflowers\\Image43.jpg', 'D:\\test\\tuku\\result\\Image43.txt'),
(44, 'D:\\test\\tuku\\springflowers\\Image44.jpg', 'D:\\test\\tuku\\result\\Image44.txt'),
(45, 'D:\\test\\tuku\\springflowers\\Image45.jpg', 'D:\\test\\tuku\\result\\Image45.txt'),
(46, 'D:\\test\\tuku\\springflowers\\Image46.jpg', 'D:\\test\\tuku\\result\\Image46.txt'),
(47, 'D:\\test\\tuku\\springflowers\\Image47.jpg', 'D:\\test\\tuku\\result\\Image47.txt'),
(48, 'D:\\test\\tuku\\springflowers\\Image48.jpg', 'D:\\test\\tuku\\result\\Image48.txt');

-- --------------------------------------------------------

--
-- Table structure for table `test1`
--

CREATE TABLE IF NOT EXISTS `test1` (
  `id` int(10) NOT NULL,
  `path` varchar(40) NOT NULL,
  `texturepath` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `test1`
--

INSERT INTO `test1` (`id`, `path`, `texturepath`) VALUES
(1, 'D:\\test\\tuku\\yellowstone\\Image01.jpg', 'D:\\test\\tuku\\result\\Image1.txt'),
(2, 'D:\\test\\tuku\\yellowstone\\Image02.jpg', 'D:\\test\\tuku\\result\\Image2.txt'),
(3, 'D:\\test\\tuku\\yellowstone\\Image03.jpg', 'D:\\test\\tuku\\result\\Image3.txt'),
(4, 'D:\\test\\tuku\\yellowstone\\Image04.jpg', 'D:\\test\\tuku\\result\\Image4.txt'),
(5, 'D:\\test\\tuku\\yellowstone\\Image05.jpg', 'D:\\test\\tuku\\result\\Image5.txt'),
(6, 'D:\\test\\tuku\\yellowstone\\Image06.jpg', 'D:\\test\\tuku\\result\\Image6.txt'),
(7, 'D:\\test\\tuku\\yellowstone\\Image07.jpg', 'D:\\test\\tuku\\result\\Image7.txt'),
(8, 'D:\\test\\tuku\\yellowstone\\Image08.jpg', 'D:\\test\\tuku\\result\\Image8.txt'),
(9, 'D:\\test\\tuku\\yellowstone\\Image09.jpg', 'D:\\test\\tuku\\result\\Image9.txt'),
(10, 'D:\\test\\tuku\\yellowstone\\Image10.jpg', 'D:\\test\\tuku\\result\\Image10.txt'),
(11, 'D:\\test\\tuku\\yellowstone\\Image11.jpg', 'D:\\test\\tuku\\result\\Image11.txt'),
(12, 'D:\\test\\tuku\\yellowstone\\Image12.jpg', 'D:\\test\\tuku\\result\\Image12.txt'),
(13, 'D:\\test\\tuku\\yellowstone\\Image13.jpg', 'D:\\test\\tuku\\result\\Image13.txt'),
(14, 'D:\\test\\tuku\\yellowstone\\Image14.jpg', 'D:\\test\\tuku\\result\\Image14.txt'),
(15, 'D:\\test\\tuku\\yellowstone\\Image15.jpg', 'D:\\test\\tuku\\result\\Image15.txt'),
(16, 'D:\\test\\tuku\\yellowstone\\Image16.jpg', 'D:\\test\\tuku\\result\\Image16.txt'),
(17, 'D:\\test\\tuku\\yellowstone\\Image17.jpg', 'D:\\test\\tuku\\result\\Image17.txt'),
(18, 'D:\\test\\tuku\\yellowstone\\Image18.jpg', 'D:\\test\\tuku\\result\\Image18.txt'),
(19, 'D:\\test\\tuku\\yellowstone\\Image19.jpg', 'D:\\test\\tuku\\result\\Image19.txt'),
(20, 'D:\\test\\tuku\\yellowstone\\Image20.jpg', 'D:\\test\\tuku\\result\\Image20.txt'),
(21, 'D:\\test\\tuku\\yellowstone\\Image21.jpg', 'D:\\test\\tuku\\result\\Image21.txt'),
(22, 'D:\\test\\tuku\\yellowstone\\Image22.jpg', 'D:\\test\\tuku\\result\\Image22.txt'),
(23, 'D:\\test\\tuku\\yellowstone\\Image23.jpg', 'D:\\test\\tuku\\result\\Image23.txt'),
(24, 'D:\\test\\tuku\\yellowstone\\Image24.jpg', 'D:\\test\\tuku\\result\\Image24.txt'),
(25, 'D:\\test\\tuku\\yellowstone\\Image25.jpg', 'D:\\test\\tuku\\result\\Image25.txt'),
(26, 'D:\\test\\tuku\\yellowstone\\Image26.jpg', 'D:\\test\\tuku\\result\\Image26.txt'),
(27, 'D:\\test\\tuku\\yellowstone\\Image27.jpg', 'D:\\test\\tuku\\result\\Image27.txt'),
(28, 'D:\\test\\tuku\\yellowstone\\Image28.jpg', 'D:\\test\\tuku\\result\\Image28.txt'),
(29, 'D:\\test\\tuku\\yellowstone\\Image29.jpg', 'D:\\test\\tuku\\result\\Image29.txt'),
(30, 'D:\\test\\tuku\\yellowstone\\Image30.jpg', 'D:\\test\\tuku\\result\\Image30.txt'),
(31, 'D:\\test\\tuku\\yellowstone\\Image31.jpg', 'D:\\test\\tuku\\result\\Image31.txt'),
(32, 'D:\\test\\tuku\\yellowstone\\Image32.jpg', 'D:\\test\\tuku\\result\\Image32.txt'),
(33, 'D:\\test\\tuku\\yellowstone\\Image33.jpg', 'D:\\test\\tuku\\result\\Image33.txt'),
(34, 'D:\\test\\tuku\\yellowstone\\Image34.jpg', 'D:\\test\\tuku\\result\\Image34.txt'),
(35, 'D:\\test\\tuku\\yellowstone\\Image35.jpg', 'D:\\test\\tuku\\result\\Image35.txt'),
(36, 'D:\\test\\tuku\\yellowstone\\Image36.jpg', 'D:\\test\\tuku\\result\\Image36.txt'),
(37, 'D:\\test\\tuku\\yellowstone\\Image37.jpg', 'D:\\test\\tuku\\result\\Image37.txt'),
(38, 'D:\\test\\tuku\\yellowstone\\Image38.jpg', 'D:\\test\\tuku\\result\\Image38.txt'),
(39, 'D:\\test\\tuku\\yellowstone\\Image39.jpg', 'D:\\test\\tuku\\result\\Image39.txt'),
(40, 'D:\\test\\tuku\\yellowstone\\Image40.jpg', 'D:\\test\\tuku\\result\\Image40.txt'),
(41, 'D:\\test\\tuku\\yellowstone\\Image41.jpg', 'D:\\test\\tuku\\result\\Image41.txt'),
(42, 'D:\\test\\tuku\\yellowstone\\Image42.jpg', 'D:\\test\\tuku\\result\\Image42.txt'),
(43, 'D:\\test\\tuku\\yellowstone\\Image43.jpg', 'D:\\test\\tuku\\result\\Image43.txt'),
(44, 'D:\\test\\tuku\\yellowstone\\Image44.jpg', 'D:\\test\\tuku\\result\\Image44.txt'),
(45, 'D:\\test\\tuku\\yellowstone\\Image45.jpg', 'D:\\test\\tuku\\result\\Image45.txt'),
(46, 'D:\\test\\tuku\\yellowstone\\Image46.jpg', 'D:\\test\\tuku\\result\\Image46.txt'),
(47, 'D:\\test\\tuku\\yellowstone\\Image47.jpg', 'D:\\test\\tuku\\result\\Image47.txt'),
(48, 'D:\\test\\tuku\\yellowstone\\Image48.jpg', 'D:\\test\\tuku\\result\\Image48.txt');

-- --------------------------------------------------------

--
-- Table structure for table `test2`
--

CREATE TABLE IF NOT EXISTS `test2` (
  `id` int(10) NOT NULL,
  `path` varchar(40) NOT NULL,
  `texturepath` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `test2`
--

INSERT INTO `test2` (`id`, `path`, `texturepath`) VALUES
(1, 'D:\\test\\tuku\\springflowers\\Image01.jpg', 'D:\\test\\tuku\\result\\Image1.txt'),
(2, 'D:\\test\\tuku\\springflowers\\Image02.jpg', 'D:\\test\\tuku\\result\\Image2.txt'),
(3, 'D:\\test\\tuku\\springflowers\\Image03.jpg', 'D:\\test\\tuku\\result\\Image3.txt'),
(4, 'D:\\test\\tuku\\springflowers\\Image04.jpg', 'D:\\test\\tuku\\result\\Image4.txt'),
(5, 'D:\\test\\tuku\\springflowers\\Image05.jpg', 'D:\\test\\tuku\\result\\Image5.txt'),
(6, 'D:\\test\\tuku\\springflowers\\Image06.jpg', 'D:\\test\\tuku\\result\\Image6.txt'),
(7, 'D:\\test\\tuku\\springflowers\\Image07.jpg', 'D:\\test\\tuku\\result\\Image7.txt'),
(8, 'D:\\test\\tuku\\springflowers\\Image08.jpg', 'D:\\test\\tuku\\result\\Image8.txt'),
(9, 'D:\\test\\tuku\\springflowers\\Image09.jpg', 'D:\\test\\tuku\\result\\Image9.txt'),
(10, 'D:\\test\\tuku\\springflowers\\Image10.jpg', 'D:\\test\\tuku\\result\\Image10.txt'),
(11, 'D:\\test\\tuku\\springflowers\\Image11.jpg', 'D:\\test\\tuku\\result\\Image11.txt'),
(12, 'D:\\test\\tuku\\springflowers\\Image12.jpg', 'D:\\test\\tuku\\result\\Image12.txt'),
(13, 'D:\\test\\tuku\\springflowers\\Image13.jpg', 'D:\\test\\tuku\\result\\Image13.txt'),
(14, 'D:\\test\\tuku\\springflowers\\Image14.jpg', 'D:\\test\\tuku\\result\\Image14.txt'),
(15, 'D:\\test\\tuku\\springflowers\\Image15.jpg', 'D:\\test\\tuku\\result\\Image15.txt'),
(16, 'D:\\test\\tuku\\springflowers\\Image16.jpg', 'D:\\test\\tuku\\result\\Image16.txt'),
(17, 'D:\\test\\tuku\\springflowers\\Image17.jpg', 'D:\\test\\tuku\\result\\Image17.txt'),
(18, 'D:\\test\\tuku\\springflowers\\Image18.jpg', 'D:\\test\\tuku\\result\\Image18.txt'),
(19, 'D:\\test\\tuku\\springflowers\\Image19.jpg', 'D:\\test\\tuku\\result\\Image19.txt'),
(20, 'D:\\test\\tuku\\springflowers\\Image20.jpg', 'D:\\test\\tuku\\result\\Image20.txt'),
(21, 'D:\\test\\tuku\\springflowers\\Image21.jpg', 'D:\\test\\tuku\\result\\Image21.txt'),
(22, 'D:\\test\\tuku\\springflowers\\Image22.jpg', 'D:\\test\\tuku\\result\\Image22.txt'),
(23, 'D:\\test\\tuku\\springflowers\\Image23.jpg', 'D:\\test\\tuku\\result\\Image23.txt'),
(24, 'D:\\test\\tuku\\springflowers\\Image24.jpg', 'D:\\test\\tuku\\result\\Image24.txt'),
(25, 'D:\\test\\tuku\\springflowers\\Image25.jpg', 'D:\\test\\tuku\\result\\Image25.txt'),
(26, 'D:\\test\\tuku\\springflowers\\Image26.jpg', 'D:\\test\\tuku\\result\\Image26.txt'),
(27, 'D:\\test\\tuku\\springflowers\\Image27.jpg', 'D:\\test\\tuku\\result\\Image27.txt'),
(28, 'D:\\test\\tuku\\springflowers\\Image28.jpg', 'D:\\test\\tuku\\result\\Image28.txt'),
(29, 'D:\\test\\tuku\\springflowers\\Image29.jpg', 'D:\\test\\tuku\\result\\Image29.txt'),
(30, 'D:\\test\\tuku\\springflowers\\Image30.jpg', 'D:\\test\\tuku\\result\\Image30.txt'),
(31, 'D:\\test\\tuku\\springflowers\\Image31.jpg', 'D:\\test\\tuku\\result\\Image31.txt'),
(32, 'D:\\test\\tuku\\springflowers\\Image32.jpg', 'D:\\test\\tuku\\result\\Image32.txt'),
(33, 'D:\\test\\tuku\\springflowers\\Image33.jpg', 'D:\\test\\tuku\\result\\Image33.txt'),
(34, 'D:\\test\\tuku\\springflowers\\Image34.jpg', 'D:\\test\\tuku\\result\\Image34.txt'),
(35, 'D:\\test\\tuku\\springflowers\\Image35.jpg', 'D:\\test\\tuku\\result\\Image35.txt'),
(36, 'D:\\test\\tuku\\springflowers\\Image36.jpg', 'D:\\test\\tuku\\result\\Image36.txt'),
(37, 'D:\\test\\tuku\\springflowers\\Image37.jpg', 'D:\\test\\tuku\\result\\Image37.txt'),
(38, 'D:\\test\\tuku\\springflowers\\Image38.jpg', 'D:\\test\\tuku\\result\\Image38.txt'),
(39, 'D:\\test\\tuku\\springflowers\\Image39.jpg', 'D:\\test\\tuku\\result\\Image39.txt'),
(40, 'D:\\test\\tuku\\springflowers\\Image40.jpg', 'D:\\test\\tuku\\result\\Image40.txt'),
(41, 'D:\\test\\tuku\\springflowers\\Image41.jpg', 'D:\\test\\tuku\\result\\Image41.txt'),
(42, 'D:\\test\\tuku\\springflowers\\Image42.jpg', 'D:\\test\\tuku\\result\\Image42.txt'),
(43, 'D:\\test\\tuku\\springflowers\\Image43.jpg', 'D:\\test\\tuku\\result\\Image43.txt'),
(44, 'D:\\test\\tuku\\springflowers\\Image44.jpg', 'D:\\test\\tuku\\result\\Image44.txt'),
(45, 'D:\\test\\tuku\\springflowers\\Image45.jpg', 'D:\\test\\tuku\\result\\Image45.txt'),
(46, 'D:\\test\\tuku\\springflowers\\Image46.jpg', 'D:\\test\\tuku\\result\\Image46.txt'),
(47, 'D:\\test\\tuku\\springflowers\\Image47.jpg', 'D:\\test\\tuku\\result\\Image47.txt'),
(48, 'D:\\test\\tuku\\springflowers\\Image48.jpg', 'D:\\test\\tuku\\result\\Image48.txt');

-- --------------------------------------------------------

--
-- Table structure for table `test4`
--

CREATE TABLE IF NOT EXISTS `test4` (
  `id` int(10) NOT NULL,
  `path` varchar(40) NOT NULL,
  `texturepath` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `test4`
--

INSERT INTO `test4` (`id`, `path`, `texturepath`) VALUES
(1, 'D:\\test\\tuku\\brain\\Image01.jpg', 'D:\\test\\tuku\\result\\Image1.txt'),
(2, 'D:\\test\\tuku\\brain\\Image02.jpg', 'D:\\test\\tuku\\result\\Image2.txt'),
(3, 'D:\\test\\tuku\\brain\\Image03.jpg', 'D:\\test\\tuku\\result\\Image3.txt'),
(4, 'D:\\test\\tuku\\brain\\Image04.jpg', 'D:\\test\\tuku\\result\\Image4.txt'),
(5, 'D:\\test\\tuku\\brain\\Image05.jpg', 'D:\\test\\tuku\\result\\Image5.txt'),
(6, 'D:\\test\\tuku\\brain\\Image06.jpg', 'D:\\test\\tuku\\result\\Image6.txt'),
(7, 'D:\\test\\tuku\\brain\\Image07.jpg', 'D:\\test\\tuku\\result\\Image7.txt'),
(8, 'D:\\test\\tuku\\brain\\Image08.jpg', 'D:\\test\\tuku\\result\\Image8.txt'),
(9, 'D:\\test\\tuku\\brain\\Image09.jpg', 'D:\\test\\tuku\\result\\Image9.txt'),
(10, 'D:\\test\\tuku\\brain\\Image10.jpg', 'D:\\test\\tuku\\result\\Image10.txt'),
(11, 'D:\\test\\tuku\\brain\\Image11.jpg', 'D:\\test\\tuku\\result\\Image11.txt'),
(12, 'D:\\test\\tuku\\brain\\Image12.jpg', 'D:\\test\\tuku\\result\\Image12.txt'),
(13, 'D:\\test\\tuku\\brain\\Image13.jpg', 'D:\\test\\tuku\\result\\Image13.txt'),
(14, 'D:\\test\\tuku\\brain\\Image14.jpg', 'D:\\test\\tuku\\result\\Image14.txt'),
(15, 'D:\\test\\tuku\\brain\\Image15.jpg', 'D:\\test\\tuku\\result\\Image15.txt'),
(16, 'D:\\test\\tuku\\brain\\Image16.jpg', 'D:\\test\\tuku\\result\\Image16.txt'),
(17, 'D:\\test\\tuku\\brain\\Image17.jpg', 'D:\\test\\tuku\\result\\Image17.txt'),
(18, 'D:\\test\\tuku\\brain\\Image18.jpg', 'D:\\test\\tuku\\result\\Image18.txt'),
(19, 'D:\\test\\tuku\\brain\\Image19.jpg', 'D:\\test\\tuku\\result\\Image19.txt'),
(20, 'D:\\test\\tuku\\brain\\Image20.jpg', 'D:\\test\\tuku\\result\\Image20.txt'),
(21, 'D:\\test\\tuku\\brain\\Image21.jpg', 'D:\\test\\tuku\\result\\Image21.txt'),
(22, 'D:\\test\\tuku\\brain\\Image22.jpg', 'D:\\test\\tuku\\result\\Image22.txt'),
(23, 'D:\\test\\tuku\\brain\\Image23.jpg', 'D:\\test\\tuku\\result\\Image23.txt'),
(24, 'D:\\test\\tuku\\brain\\Image24.jpg', 'D:\\test\\tuku\\result\\Image24.txt'),
(25, 'D:\\test\\tuku\\brain\\Image25.jpg', 'D:\\test\\tuku\\result\\Image25.txt'),
(26, 'D:\\test\\tuku\\brain\\Image26.jpg', 'D:\\test\\tuku\\result\\Image26.txt'),
(27, 'D:\\test\\tuku\\brain\\Image27.jpg', 'D:\\test\\tuku\\result\\Image27.txt'),
(28, 'D:\\test\\tuku\\brain\\Image28.jpg', 'D:\\test\\tuku\\result\\Image28.txt'),
(29, 'D:\\test\\tuku\\brain\\Image29.jpg', 'D:\\test\\tuku\\result\\Image29.txt'),
(30, 'D:\\test\\tuku\\brain\\Image30.jpg', 'D:\\test\\tuku\\result\\Image30.txt'),
(31, 'D:\\test\\tuku\\brain\\Image31.jpg', 'D:\\test\\tuku\\result\\Image31.txt'),
(32, 'D:\\test\\tuku\\brain\\Image32.jpg', 'D:\\test\\tuku\\result\\Image32.txt'),
(33, 'D:\\test\\tuku\\brain\\Image33.jpg', 'D:\\test\\tuku\\result\\Image33.txt'),
(34, 'D:\\test\\tuku\\brain\\Image34.jpg', 'D:\\test\\tuku\\result\\Image34.txt'),
(35, 'D:\\test\\tuku\\brain\\Image35.jpg', 'D:\\test\\tuku\\result\\Image35.txt'),
(36, 'D:\\test\\tuku\\brain\\Image36.jpg', 'D:\\test\\tuku\\result\\Image36.txt'),
(37, 'D:\\test\\tuku\\brain\\Image37.jpg', 'D:\\test\\tuku\\result\\Image37.txt'),
(38, 'D:\\test\\tuku\\brain\\Image38.jpg', 'D:\\test\\tuku\\result\\Image38.txt'),
(39, 'D:\\test\\tuku\\brain\\Image39.jpg', 'D:\\test\\tuku\\result\\Image39.txt'),
(40, 'D:\\test\\tuku\\brain\\Image40.jpg', 'D:\\test\\tuku\\result\\Image40.txt'),
(41, 'D:\\test\\tuku\\brain\\Image41.jpg', 'D:\\test\\tuku\\result\\Image41.txt'),
(42, 'D:\\test\\tuku\\brain\\Image42.jpg', 'D:\\test\\tuku\\result\\Image42.txt'),
(43, 'D:\\test\\tuku\\brain\\Image43.jpg', 'D:\\test\\tuku\\result\\Image43.txt'),
(44, 'D:\\test\\tuku\\brain\\Image44.jpg', 'D:\\test\\tuku\\result\\Image44.txt'),
(45, 'D:\\test\\tuku\\brain\\Image45.jpg', 'D:\\test\\tuku\\result\\Image45.txt'),
(46, 'D:\\test\\tuku\\brain\\Image46.jpg', 'D:\\test\\tuku\\result\\Image46.txt'),
(47, 'D:\\test\\tuku\\brain\\Image47.jpg', 'D:\\test\\tuku\\result\\Image47.txt'),
(48, 'D:\\test\\tuku\\brain\\Image48.jpg', 'D:\\test\\tuku\\result\\Image48.txt');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
