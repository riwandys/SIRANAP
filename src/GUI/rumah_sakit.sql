-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 19, 2019 at 05:50 AM
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
-- Database: `rumah_sakit`
--

-- --------------------------------------------------------

--
-- Table structure for table `dokter`
--

CREATE TABLE `dokter` (
  `NIP_DOKTER` varchar(20) NOT NULL,
  `NAMA_DOKTER` varchar(50) NOT NULL,
  `SPESIALIS` varchar(50) NOT NULL,
  `NO_TELPON` varchar(15) NOT NULL,
  `ALAMAT` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `dokter`
--

INSERT INTO `dokter` (`NIP_DOKTER`, `NAMA_DOKTER`, `SPESIALIS`, `NO_TELPON`, `ALAMAT`) VALUES
('P123', 'Dwiki', 'kandungan', '0898000123', 'way dadi,bandar lampung'),
('P223', 'Dini', 'kandungan', '0898122009', 'korpri,bandar lampung'),
('P256', 'rizki', 'jantung', '08237969122', 'korpri,bandar lampung');

-- --------------------------------------------------------

--
-- Table structure for table `kamar`
--

CREATE TABLE `kamar` (
  `KODE_KAMAR` varchar(10) NOT NULL,
  `KELAS` varchar(5) NOT NULL,
  `KAPASITAS` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `kamar`
--

INSERT INTO `kamar` (`KODE_KAMAR`, `KELAS`, `KAPASITAS`) VALUES
('E01', 'biasa', 2),
('E2', 'biasa', 2),
('VIP1', 'VIP', 1),
('VIP2', 'VIP', 1);

-- --------------------------------------------------------

--
-- Table structure for table `pasien`
--

CREATE TABLE `pasien` (
  `ID_PASIEN` varchar(20) NOT NULL,
  `NAMA_PASIEN` varchar(50) NOT NULL,
  `JENIS_KELAMIN` varchar(10) NOT NULL,
  `ALAMAT` text NOT NULL,
  `NO_HP` varchar(16) NOT NULL,
  `KODE_KAMAR` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pasien`
--

INSERT INTO `pasien` (`ID_PASIEN`, `NAMA_PASIEN`, `JENIS_KELAMIN`, `ALAMAT`, `NO_HP`, `KODE_KAMAR`) VALUES
('PA1', 'joko', 'laki-laki', 'kedaton,bandar lampung', '08981223888', 'VIP1'),
('PA2', 'jumadi', 'laki-laki', 'kedaton,bandar lampung', '08213214444', 'VIP2'),
('PA3', 'dewi', 'perempuan', 'tanjung karang,bandar lampung', '08213354343', 'E01');

-- --------------------------------------------------------

--
-- Table structure for table `perawat`
--

CREATE TABLE `perawat` (
  `NIP_PERAWAT` varchar(20) NOT NULL,
  `NAMA_PERAWAT` varchar(50) NOT NULL,
  `JAM_KERJA` time NOT NULL,
  `NO_TELPON` varchar(15) NOT NULL,
  `ALAMAT` varchar(100) NOT NULL,
  `kode_kamar` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `perawat`
--

INSERT INTO `perawat` (`NIP_PERAWAT`, `NAMA_PERAWAT`, `JAM_KERJA`, `NO_TELPON`, `ALAMAT`, `kode_kamar`) VALUES
('D111', 'shanti', '07:00:00', '089712444', 'kedaton,bandar lampung', 'E01'),
('D123', 'santo', '18:00:00', '089787588', 'kedaton,bandar lampung', 'E2'),
('D567', 'mail', '07:00:00', '082322214', 'sukabumi,bandar lampung', 'VIP1'),
('D998', 'upin', '18:00:00', '082300129', 'way dadi baru,bandar lampung', 'VIP2');

-- --------------------------------------------------------

--
-- Table structure for table `perawatan`
--

CREATE TABLE `perawatan` (
  `NO_ADM` varchar(10) NOT NULL,
  `TGL_MASUK` date NOT NULL,
  `TGL_KELUAR` date NOT NULL,
  `BIAYA` int(11) NOT NULL,
  `ID_PASIEN` varchar(20) NOT NULL,
  `NIP_DOKTER` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `perawatan`
--

INSERT INTO `perawatan` (`NO_ADM`, `TGL_MASUK`, `TGL_KELUAR`, `BIAYA`, `ID_PASIEN`, `NIP_DOKTER`) VALUES
('001', '2019-04-09', '2019-04-15', 3500000, 'PA1', 'P256'),
('002', '2019-03-10', '2019-03-14', 2000000, 'PA2', 'P256'),
('003', '2019-03-10', '2019-03-12', 500000, 'PA3', 'P123');

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
  ADD PRIMARY KEY (`KODE_KAMAR`);

--
-- Indexes for table `pasien`
--
ALTER TABLE `pasien`
  ADD PRIMARY KEY (`ID_PASIEN`),
  ADD KEY `KODE_KAMAR` (`KODE_KAMAR`);

--
-- Indexes for table `perawat`
--
ALTER TABLE `perawat`
  ADD PRIMARY KEY (`NIP_PERAWAT`),
  ADD KEY `kode_kamar` (`kode_kamar`);

--
-- Indexes for table `perawatan`
--
ALTER TABLE `perawatan`
  ADD PRIMARY KEY (`NO_ADM`),
  ADD KEY `ID_PASIEN` (`ID_PASIEN`),
  ADD KEY `NIP_DOKTER` (`NIP_DOKTER`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `pasien`
--
ALTER TABLE `pasien`
  ADD CONSTRAINT `pasien_ibfk_1` FOREIGN KEY (`KODE_KAMAR`) REFERENCES `kamar` (`KODE_KAMAR`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `perawat`
--
ALTER TABLE `perawat`
  ADD CONSTRAINT `perawat_ibfk_1` FOREIGN KEY (`kode_kamar`) REFERENCES `kamar` (`KODE_KAMAR`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `perawatan`
--
ALTER TABLE `perawatan`
  ADD CONSTRAINT `perawatan_ibfk_1` FOREIGN KEY (`ID_PASIEN`) REFERENCES `pasien` (`ID_PASIEN`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `perawatan_ibfk_2` FOREIGN KEY (`NIP_DOKTER`) REFERENCES `dokter` (`NIP_DOKTER`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
