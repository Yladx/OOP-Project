-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 24, 2023 at 04:41 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `schooltech`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `AdminID` int(11) NOT NULL,
  `AdminEmail` varchar(50) NOT NULL,
  `AdminPass` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`AdminID`, `AdminEmail`, `AdminPass`) VALUES
(1, 'admin', 'admin123');

-- --------------------------------------------------------

--
-- Table structure for table `emails`
--

CREATE TABLE `emails` (
  `emailid` int(11) NOT NULL,
  `EmailSender` varchar(500) NOT NULL,
  `Receiver` varchar(500) NOT NULL,
  `Subject` text NOT NULL,
  `Message` text NOT NULL,
  `Status` varchar(50) NOT NULL,
  `DateTime` datetime NOT NULL,
  `Replies` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `emails`
--

INSERT INTO `emails` (`emailid`, `EmailSender`, `Receiver`, `Subject`, `Message`, `Status`, `DateTime`, `Replies`) VALUES
(65, 'as', 'SchoolTech@ict-support.com', 'sfa', 'asfasfas', 'Archived', '2023-11-23 21:48:26', ''),
(68, 'as', 'SchoolTech@ict-support.com', 'asfas', 'fasfasfas', 'Sent', '2023-11-23 22:05:04', ''),
(69, 'as', 'SchoolTech@ict-support.com', 'safas', 'fasfasfas', 'Replied', '2023-11-23 22:07:56', 'safasfas'),
(71, 'juan@fake.com', 'SchoolTech@ict-support.com', 'asf', 'safasfas', 'Sent', '2023-11-24 00:09:29', ''),
(72, 'juan@fake.com', 'SchoolTech@ict-support.com', 'tangahin', 'safasf', 'Replied', '2023-11-24 00:09:35', 'fsafas');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `Name` text NOT NULL,
  `SrCode` text NOT NULL,
  `Emails` text NOT NULL,
  `DateOfBirth` date NOT NULL,
  `Password` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`Name`, `SrCode`, `Emails`, `DateOfBirth`, `Password`) VALUES
('Juan Tmad', '1313', 'juan@fake.com', '2003-11-18', '1010'),
('as', '12', 'as', '2003-11-18', 'as');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`AdminID`);

--
-- Indexes for table `emails`
--
ALTER TABLE `emails`
  ADD PRIMARY KEY (`emailid`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `AdminID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `emails`
--
ALTER TABLE `emails`
  MODIFY `emailid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=73;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
