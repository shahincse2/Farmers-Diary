-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306:4306
-- Generation Time: Mar 10, 2022 at 08:10 PM
-- Server version: 10.4.17-MariaDB
-- PHP Version: 8.0.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `farmersdiary`
--

-- --------------------------------------------------------

--
-- Table structure for table `buyer`
--

CREATE TABLE `buyer` (
  `id` int(11) DEFAULT NULL,
  `fname` varchar(20) DEFAULT NULL,
  `lname` varchar(30) DEFAULT NULL,
  `gender` varchar(7) DEFAULT NULL,
  `nid` varchar(17) DEFAULT NULL,
  `birdthday` varchar(33) DEFAULT NULL,
  `tredLicense` varchar(50) DEFAULT NULL,
  `phone` varchar(15) DEFAULT NULL,
  `password` varchar(40) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `buyer`
--

INSERT INTO `buyer` (`id`, `fname`, `lname`, `gender`, `nid`, `birdthday`, `tredLicense`, `phone`, `password`) VALUES
(NULL, 'hasdjkf', 'alksdfoie', 'Male', '8392840302932', '11/03/2022', '3223', '01938073856', '01938073856');

-- --------------------------------------------------------

--
-- Table structure for table `farmers`
--

CREATE TABLE `farmers` (
  `id` int(11) DEFAULT NULL,
  `fname` varchar(25) DEFAULT NULL,
  `lname` varchar(25) DEFAULT NULL,
  `Gender` varchar(20) NOT NULL,
  `nid` varchar(110) DEFAULT NULL,
  `dateOfBirdth` varchar(20) DEFAULT NULL,
  `Address` varchar(255) NOT NULL,
  `phone` varchar(11) NOT NULL,
  `PASSWORD` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE `product` (
  `pid` int(11) NOT NULL,
  `productType` varchar(300) DEFAULT NULL,
  `weight` float DEFAULT NULL,
  `dates` varchar(20) DEFAULT NULL,
  `totalAmount` int(11) DEFAULT NULL,
  `sellerPhone` varchar(13) DEFAULT NULL,
  `buyerPhone` varchar(14) DEFAULT NULL,
  `sID` varchar(22) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `productgroup`
--

CREATE TABLE `productgroup` (
  `name` varchar(255) DEFAULT NULL,
  `price` varchar(20) DEFAULT NULL,
  `amount` varchar(10) DEFAULT NULL,
  `dates` varchar(255) DEFAULT NULL,
  `SellerPhone` varchar(255) DEFAULT NULL,
  `mediatorPhone` varchar(255) DEFAULT NULL,
  `buyerPhone` varchar(255) DEFAULT NULL,
  `id` int(11) NOT NULL,
  `totalPrice` varchar(10) DEFAULT NULL,
  `gid` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `sellermdiator`
--

CREATE TABLE `sellermdiator` (
  `id` int(11) NOT NULL,
  `fname` varchar(20) DEFAULT NULL,
  `lname` varchar(30) DEFAULT NULL,
  `gender` varchar(7) DEFAULT NULL,
  `nid` varchar(17) DEFAULT NULL,
  `birdthday` varchar(33) DEFAULT NULL,
  `tredLicense` varchar(50) DEFAULT NULL,
  `phoneNo` varchar(15) DEFAULT NULL,
  `password` varchar(40) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `transection`
--

CREATE TABLE `transection` (
  `tid` int(11) NOT NULL,
  `amount` int(11) DEFAULT NULL,
  `datas` varchar(33) DEFAULT NULL,
  `paymentType` varchar(40) DEFAULT NULL,
  `pid` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `farmers`
--
ALTER TABLE `farmers`
  ADD PRIMARY KEY (`phone`);

--
-- Indexes for table `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`pid`);

--
-- Indexes for table `productgroup`
--
ALTER TABLE `productgroup`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `sellermdiator`
--
ALTER TABLE `sellermdiator`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `transection`
--
ALTER TABLE `transection`
  ADD PRIMARY KEY (`tid`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `product`
--
ALTER TABLE `product`
  MODIFY `pid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=62;

--
-- AUTO_INCREMENT for table `productgroup`
--
ALTER TABLE `productgroup`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT for table `sellermdiator`
--
ALTER TABLE `sellermdiator`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=104;

--
-- AUTO_INCREMENT for table `transection`
--
ALTER TABLE `transection`
  MODIFY `tid` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
