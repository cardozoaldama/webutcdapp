--
-- PostgreSQL database dump
--

-- Dumped from database version 14.8
-- Dumped by pg_dump version 14.8

-- Started on 2023-06-14 20:01:54 -04

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 217 (class 1259 OID 16530)
-- Name: sys_reclamo_aux; Type: TABLE; Schema: public; Owner: fcardozo
--

CREATE TABLE public.sys_reclamo_aux (
    id_reclamo integer NOT NULL,
    numero_reclamo character(45),
    nis integer,
    telefono character(20),
    nombre character(100),
    apellido character(100),
    direccion character(150),
    referencia character(150),
    numero_movil character(20),
    correo character(100),
    observacion character(100),
    fecha_hora_recepcion timestamp without time zone,
    departamento character(100),
    ciudad character(100),
    barrio character(150)
);


ALTER TABLE public.sys_reclamo_aux OWNER TO fcardozo;

--
-- TOC entry 3933 (class 0 OID 16530)
-- Dependencies: 217
-- Data for Name: sys_reclamo_aux; Type: TABLE DATA; Schema: public; Owner: fcardozo
--



--
-- TOC entry 3793 (class 2606 OID 16536)
-- Name: sys_reclamo_aux sys_reclamo_aux_pkey; Type: CONSTRAINT; Schema: public; Owner: fcardozo
--

ALTER TABLE ONLY public.sys_reclamo_aux
    ADD CONSTRAINT sys_reclamo_aux_pkey PRIMARY KEY (id_reclamo);


-- Completed on 2023-06-14 20:01:54 -04

--
-- PostgreSQL database dump complete
--
