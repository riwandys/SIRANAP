-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 21, 2019 at 05:20 PM
-- Server version: 10.1.37-MariaDB
-- PHP Version: 5.6.40

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `rumah_sakit1`
--

-- --------------------------------------------------------

--
-- Table structure for table `dokter`
--

CREATE TABLE `dokter` (
  `NIP_DOKTER` char(10) NOT NULL,
  `NAMA_DOKTER` varchar(50) NOT NULL,
  `SPESIALIS` varchar(50) NOT NULL,
  `NO_TELPON` char(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `dokter`
--

INSERT INTO `dokter` (`NIP_DOKTER`, `NAMA_DOKTER`, `SPESIALIS`, `NO_TELPON`) VALUES
('P123', 'diana', 'kandungan', '0721123456'),
('P345', 'dini', 'kulit', '082345231310'),
('P678', 'hasan', 'saraf', '0721111222');

-- --------------------------------------------------------

--
-- Table structure for table `kamar`
--

CREATE TABLE `kamar` (
  `KODE_KAMAR` char(6) NOT NULL,
  `KELAS` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `kamar`
--

INSERT INTO `kamar` (`KODE_KAMAR`, `KELAS`) VALUES
('E01', 'ekonomi'),
('E2', 'ekonomi'),
('VIP1', 'VIP'),
('VIP2', 'VIP');

-- --------------------------------------------------------

--
-- Table structure for table `kelas_kamar`
--

CREATE TABLE `kelas_kamar` (
  `KELAS` varchar(15) NOT NULL,
  `KAPASITAS` tinyint(3) NOT NULL DEFAULT '3',
  `TARIF_PERHARI` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `kelas_kamar`
--

INSERT INTO `kelas_kamar` (`KELAS`, `KAPASITAS`, `TARIF_PERHARI`) VALUES
('ekonomi', 2, 250000),
('vip', 1, 500000),
('vvip', 1, 750000);

-- --------------------------------------------------------

--
-- Table structure for table `pasien`
--

CREATE TABLE `pasien` (
  `ID_PASIEN` char(8) NOT NULL,
  `NAMA_PASIEN` varchar(50) NOT NULL,
  `JENIS_KELAMIN` enum('Laki-laki','Perempuan') DEFAULT NULL,
  `TGL_LAHIR` date NOT NULL,
  `NO_TELPON` char(12) NOT NULL,
  `ALAMAT` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pasien`
--

INSERT INTO `pasien` (`ID_PASIEN`, `NAMA_PASIEN`, `JENIS_KELAMIN`, `TGL_LAHIR`, `NO_TELPON`, `ALAMAT`) VALUES
('PA2', 'jumadi', 'Laki-laki', '1970-09-10', '08213214444', 'kedaton,bandar lampung'),
('PA3', 'dewi', 'Perempuan', '1990-10-23', '08213354343', 'tanjung karang,bandar lampung'),
('PA4', 'joko', 'Laki-laki', '1978-01-01', '08981223888', 'kedaton,bandar lampung');

-- --------------------------------------------------------

--
-- Table structure for table `perawat`
--

CREATE TABLE `perawat` (
  `NIP_PERAWAT` char(10) NOT NULL,
  `NAMA_PERAWAT` varchar(50) NOT NULL,
  `JAM_MULAI_KERJA` time NOT NULL,
  `JAM_SELESAI_KERJA` time NOT NULL,
  `KELAS` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `perawat`
--

INSERT INTO `perawat` (`NIP_PERAWAT`, `NAMA_PERAWAT`, `JAM_MULAI_KERJA`, `JAM_SELESAI_KERJA`, `KELAS`) VALUES
('D111', 'shanti', '07:00:00', '17:00:00', 'EKONOMI'),
('D123', 'susanto', '18:00:00', '06:00:00', 'vip'),
('D444', 'susana', '12:00:00', '23:00:00', 'ekonomi'),
('D567', 'mail', '07:00:00', '17:00:00', 'VVIP'),
('D998', 'upin', '18:00:00', '06:00:00', 'VIP');

-- --------------------------------------------------------

--
-- Table structure for table `perawatan`
--

CREATE TABLE `perawatan` (
  `NO_ADM` int(10) UNSIGNED ZEROFILL NOT NULL,
  `TGL_MASUK` date NOT NULL,
  `TGL_KELUAR` date NOT NULL,
  `BIAYA` int(11) NOT NULL,
  `ID_PASIEN` char(8) NOT NULL,
  `NIP_DOKTER` char(10) NOT NULL,
  `KODE_KAMAR` char(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `perawatan`
--

INSERT INTO `perawatan` (`NO_ADM`, `TGL_MASUK`, `TGL_KELUAR`, `BIAYA`, `ID_PASIEN`, `NIP_DOKTER`, `KODE_KAMAR`) VALUES
(0000000001, '2019-04-09', '2019-04-15', 3500000, 'PA4', 'P256', 'VIP1'),
(0000000003, '2019-03-10', '2019-03-20', 2500000, 'PA3', 'P123', 'E01'),
(0000000004, '2019-04-15', '2019-04-20', 500000, 'PA3', 'P123', 'E2'),
(0000000006, '2019-09-10', '2019-09-20', 2500000, 'PA4', 'P345', 'E2');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `dokter`
--
ALTER TABLE `dokter`
  ADD PRIMARY KEY (`NIP_DOKTER`);

--
-- Indexes for table `kamar`
--
ALTER TABLE `kamar`
  ADD PRIMARY KEY (`KODE_KAMAR`),
  ADD KEY `KELAS` (`KELAS`);

--
-- Indexes for table `kelas_kamar`
--
ALTER TABLE `kelas_kamar`
  ADD PRIMARY KEY (`KELAS`);

--
-- Indexes for table `pasien`
--
ALTER TABLE `pasien`
  ADD PRIMARY KEY (`ID_PASIEN`);

--
-- Indexes for table `perawat`
--
ALTER TABLE `perawat`
  ADD PRIMARY KEY (`NIP_PERAWAT`),
  ADD KEY `KELAS` (`KELAS`);

--
-- Indexes for table `perawatan`
--
ALTER TABLE `perawatan`
  ADD PRIMARY KEY (`NO_ADM`),
  ADD KEY `ID_PASIEN` (`ID_PASIEN`),
  ADD KEY `kode_kamar` (`KODE_KAMAR`),
  ADD KEY `NIP_DOKTER` (`NIP_DOKTER`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `perawatan`
--
ALTER TABLE `perawatan`
  MODIFY `NO_ADM` int(10) UNSIGNED ZEROFILL NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `kamar`
--
ALTER TABLE `kamar`
  ADD CONSTRAINT `kamar_ibfk_1` FOREIGN KEY (`KELAS`) REFERENCES `kelas_kamar` (`KELAS`);

--
-- Constraints for table `perawat`
--
ALTER TABLE `perawat`
  ADD CONSTRAINT `perawat_ibfk_1` FOREIGN KEY (`KELAS`) REFERENCES `kelas_kamar` (`KELAS`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `perawatan`
--
ALTER TABLE `perawatan`
  ADD CONSTRAINT `perawatan_ibfk_2` FOREIGN KEY (`KODE_KAMAR`) REFERENCES `kamar` (`KODE_KAMAR`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `perawatan_ibfk_3` FOREIGN KEY (`ID_PASIEN`) REFERENCES `pasien` (`ID_PASIEN`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `perawatan_ibfk_4` FOREIGN KEY (`NIP_DOKTER`) REFERENCES `dokter` (`NIP_DOKTER`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
