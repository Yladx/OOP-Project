-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 24, 2023 at 04:42 PM
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
-- Database: `specificconcern`
--

-- --------------------------------------------------------

--
-- Table structure for table `gsuite account`
--

CREATE TABLE `gsuite account` (
  `GsuiteConcernId` int(11) NOT NULL,
  `ConcernQuestion` varchar(500) NOT NULL,
  `Solution` varchar(500) NOT NULL,
  `y1` varchar(500) NOT NULL,
  `n1` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `student portal`
--

CREATE TABLE `student portal` (
  `StudentPortal` int(11) NOT NULL,
  `ConcernQuestion` varchar(500) NOT NULL,
  `Solution` varchar(500) NOT NULL,
  `y1` varchar(500) NOT NULL,
  `n1` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `student portal`
--

INSERT INTO `student portal` (`StudentPortal`, `ConcernQuestion`, `Solution`, `y1`, `n1`) VALUES
(0, 'I enter my username and password correctly but still it did not log in.', 'Verify username and password: Double-check for accuracy, including uppercase/lowercase letters, special characters, and spaces.\n\nClear browser cache: In your browser settings, clear stored data, ensuring to select \'Cookies\' and \'Cached Images and Files\' to resolve login issues.\n\nDisable extensions: Temporarily turn off browser extensions/add-ons, as they may interfere with the login process.\n\nTry another browser or device: If the problem persists, attempt logging in using a different web browser', 'Thank you!\nWe appreciate your willingness to address your concern. We are here to assist you.', 'Contact SchoolTechSupport:  So we can investigate the issue further and provide you with specific guidance or troubleshoot the problem on their end.'),
(1, 'I\'m unable to locate my grades from the first semester of the  School Year on my Student Portal.', 'Above the Certificate of Registration (COR) button, you\'ll find a filter option. By clicking on it, you can filter and select the specific semester and school year you\'re interested in.', 'Thank you!\nWe appreciate your willingness to address your concern. We are here to assist you.', 'Recommendations:\n\nClear browser cache: This can resolve issues with loading or displaying information. Try clearing your cache and refreshing the page to see if your grades appear.\nContact SchoolTechSupport:  So we can investigate the issue further and provide you with specific guidance or troubleshoot the problem on their end.\n\n\nCheck for announcements: Schools may make announcements about changes or updates to the student portal. Look for notifications from y'),
(2, 'The School ID picture I uploaded was not accepted by the system', 'Ensure your school ID photo meets the following requirements: a white background, absence of electronic devices and eyeglasses, recent capture (within the last 6 months), a forward-facing pose with 80% emphasis on head and shoulders, a centered composition, no name tag, and no extreme hair color.', 'It\'s possible that there is a temporary issue with the system. I suggest trying to submit the photo again at a later time. If the problem persists, please Contact SchoolTechSupport. So we can investigate the issue further and provide you with specific guidance or troubleshoot the problem on their end', 'Please attempt uploading another picture that adheres to the specified photo requirements.\n'),
(4, 'The subject is already taken and passed but appears as no grade on the Curriculum  Subject.\r\n', 'There is a possible code or description mismatch between your grade records and curriculum subjects. You can check all your grades by clicking the \'All Grades\' button. In case of code or description mismatch, you may seek assistance from the Registrar\'s Office.\r\n', 'Thank you!\r\nWe appreciate your willingness to address your concern. We are here to assist you.', 'Contact SchoolTechSupport:  So we can investigate the issue further and provide you with specific guidance or troubleshoot the problem on their end.');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `gsuite account`
--
ALTER TABLE `gsuite account`
  ADD PRIMARY KEY (`GsuiteConcernId`);

--
-- Indexes for table `student portal`
--
ALTER TABLE `student portal`
  ADD PRIMARY KEY (`StudentPortal`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
