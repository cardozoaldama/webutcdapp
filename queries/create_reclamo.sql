-- Create sys_reclamo for quejas.jsp

CREATE TABLE public.sys_reclamo (
    id_reclamo integer NOT NULL,
    numero_reclamo character(45),
    nis integer,
    telefono character(20),
    nombre character(50),
    apellido character(50),
    direccion character(150),
    referencia character(150),
    numero_movil character(20),
    correo character(100),
    observacion character(80),
    fecha_hora_recepcion timestamp without time zone,
    asignacion_usuario character(80),
    id_departamento integer,
    id_ciudad integer,
    id_barrio integer,
    id_cuenta integer
);


ALTER TABLE ONLY public.sys_reclamo
    ADD CONSTRAINT sys_reclamo_pkey PRIMARY KEY (id_reclamo);

ALTER TABLE ONLY public.sys_reclamo
    ADD CONSTRAINT id_barrio FOREIGN KEY (id_barrio) REFERENCES public.sys_barrio(id_barrio);

ALTER TABLE ONLY public.sys_reclamo
    ADD CONSTRAINT id_ciudad FOREIGN KEY (id_ciudad) REFERENCES public.sys_ciudad(id_ciudad);

ALTER TABLE ONLY public.sys_reclamo
    ADD CONSTRAINT id_cuenta FOREIGN KEY (id_cuenta) REFERENCES public.kwf_cuenta(id_cuenta);

ALTER TABLE ONLY public.sys_reclamo
    ADD CONSTRAINT id_departamento FOREIGN KEY (id_departamento) REFERENCES public.sys_departamento(id_departamento);