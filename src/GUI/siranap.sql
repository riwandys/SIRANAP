-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 22, 2019 at 01:12 AM
-- Server version: 10.1.38-MariaDB
-- PHP Version: 7.3.2

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
-- Table structure for table `account`
--

CREATE TABLE `account` (
  `NAMA` varchar(50) NOT NULL,
  `USERNAME` varchar(50) NOT NULL,
  `PASSWORD` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `account`
--

INSERT INTO `account` (`NAMA`, `USERNAME`, `PASSWORD`) VALUES
('Riwandy', 'riwandy', 'riwandy');

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
('1748273917', 'Adi Suparto', 'Jantung', '081748273917'),
('2374998160', 'Cristiano Ronaldo', 'Mata', '086493391374'),
('2835791209', 'Bambang Nuswantoro', 'THT', '081547382009'),
('6983172844', 'Okta Febrianti', 'Dokter Gigi', '086983172844'),
('8372665812', 'Dina Agustina', 'Anak', '088372665812');

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
('K01101', 'Kelas I'),
('K02201', 'Kelas II'),
('K03301', 'Kelas III'),
('VIP401', 'VIP');

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
('Kelas I', 2, 475000),
('Kelas II', 2, 325000),
('Kelas III', 3, 145000),
('VIP', 1, 925000);

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
('12477836', 'Dwi Rahmadani', 'Perempuan', '1985-07-22', '081583479888', 'Jl. Supersemar No. 144 Bandarlampung'),
('12748383', 'Silvia Gunadarma', 'Perempuan', '2010-09-01', '088218450000', 'Jl. Sukarame No. 38 Bandarlampung'),
('18302828', 'Joni Swarnabhumi', 'Laki-laki', '1975-08-23', '081277349588', 'Jl. Swarnabhumi No. 154 Lampung Selatan'),
('23947124', 'Dimas Sudarsono', 'Laki-laki', '1982-03-30', '082455217584', 'Jl. Basis Data No. 158124 Wakanda'),
('55378219', 'Juki Syarifuddin', 'Laki-laki', '2014-10-17', '089288884751', 'Jl. Ryacudu No. 90 Bandarlampung'),
('78339284', 'Putri Simangunsong', 'Perempuan', '1999-04-19', '081748298832', 'Jl. Kenanga No. 76 Bandarlampung'),
('98325234', 'Abraham Silberschatz', 'Laki-laki', '1999-06-10', '083185743948', 'Jl. MySQL No. 12 Skandinavia'),
('98746618', 'Gustian Pramono', 'Laki-laki', '1995-12-04', '081234708332', 'Jl. Pancasila No. 12 Bandarlampung');

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
('478392812', 'Shinta Widyawati', '08:00:00', '18:00:00', 'Kelas II'),
('8374462809', 'Yandi Eka Purnomo', '08:00:00', '18:00:00', 'Kelas I');

-- --------------------------------------------------------

--
-- Table structure for table `perawatan`
--

CREATE TABLE `perawatan` (
  `NO_ADM` int(5) UNSIGNED ZEROFILL NOT NULL,
  `TGL_MASUK` date NOT NULL,
  `TGL_KELUAR` date NOT NULL,
  `BIAYA` int(11) NOT NULL,
  `ID_PASIEN` char(8) NOT NULL,
  `NIP_DOKTER` char(10) NOT NULL,
  `KODE_KAMAR` char(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `account`
--
ALTER TABLE `account`
  ADD PRIMARY KEY (`USERNAME`);

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
  ADD KEY `nip_dokter` (`NIP_DOKTER`),
  ADD KEY `kode_kamar` (`KODE_KAMAR`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `perawatan`
--
ALTER TABLE `perawatan`
  MODIFY `NO_ADM` int(5) UNSIGNED ZEROFILL NOT NULL AUTO_INCREMENT;

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
  ADD CONSTRAINT `perawat_ibfk_1` FOREIGN KEY (`KELAS`) REFERENCES `kelas_kamar` (`KELAS`);

--
-- Constraints for table `perawatan`
--
ALTER TABLE `perawatan`
  ADD CONSTRAINT `perawatan_ibfk_1` FOREIGN KEY (`NIP_DOKTER`) REFERENCES `dokter` (`NIP_DOKTER`),
  ADD CONSTRAINT `perawatan_ibfk_2` FOREIGN KEY (`KODE_KAMAR`) REFERENCES `kamar` (`KODE_KAMAR`),
  ADD CONSTRAINT `perawatan_ibfk_3` FOREIGN KEY (`ID_PASIEN`) REFERENCES `pasien` (`ID_PASIEN`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
