-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 06-11-2018 a las 23:13:38
-- Versión del servidor: 10.1.36-MariaDB
-- Versión de PHP: 7.2.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `quemepongo`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pmv`
--

CREATE TABLE `pmv` (
  `id` int(11) NOT NULL,
  `descripcion` varchar(30) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `preferencias`
--

CREATE TABLE `preferencias` (
  `id_usuario` int(11) NOT NULL,
  `frio_maxima` double NOT NULL,
  `calor_minima` double NOT NULL,
  `factor_de_correccion` double NOT NULL,
  `paraguas` tinyint(1) NOT NULL,
  `protector` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pronostico`
--

CREATE TABLE `pronostico` (
  `id` int(11) NOT NULL,
  `id_usuario` int(11) NOT NULL,
  `pmv_sugerido` int(11) NOT NULL,
  `pmv_real` int(11) NOT NULL,
  `id_sugerencia` int(11) NOT NULL,
  `fecha` date NOT NULL,
  `humedad` double NOT NULL,
  `ubicacion` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  `minima` double NOT NULL,
  `maxima` double NOT NULL,
  `precipitaciones` double NOT NULL,
  `viento` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `sugerencia`
--

CREATE TABLE `sugerencia` (
  `id` int(11) NOT NULL,
  `pmv` int(11) NOT NULL,
  `texto` varchar(150) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `id` int(11) NOT NULL,
  `username` varchar(20) COLLATE utf8_spanish_ci NOT NULL,
  `email` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  `password` varchar(32) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `pmv`
--
ALTER TABLE `pmv`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `preferencias`
--
ALTER TABLE `preferencias`
  ADD PRIMARY KEY (`id_usuario`);

--
-- Indices de la tabla `pronostico`
--
ALTER TABLE `pronostico`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `sugerencia`
--
ALTER TABLE `sugerencia`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `username` (`username`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
