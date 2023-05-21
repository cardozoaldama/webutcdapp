-- Table: public.sys_barrio

-- DROP TABLE IF EXISTS public.sys_barrio;

CREATE TABLE IF NOT EXISTS public.sys_barrio
(
    id_barrio integer NOT NULL,
    nombre character(100) COLLATE pg_catalog."default",
    observacion character(100) COLLATE pg_catalog."default",
    activo character(45) COLLATE pg_catalog."default",
    id_ciudad integer,
    id_departamento integer,
    id_cuenta integer,
    CONSTRAINT sys_barrio_pkey PRIMARY KEY (id_barrio),
    CONSTRAINT id_ciudad FOREIGN KEY (id_ciudad)
        REFERENCES public.sys_ciudad (id_ciudad) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT id_cuenta FOREIGN KEY (id_cuenta)
        REFERENCES public.kwf_cuenta (id_cuenta) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT id_departamento FOREIGN KEY (id_departamento)
        REFERENCES public.sys_departamento (id_departamento) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.sys_barrio
    OWNER to fcardozo;