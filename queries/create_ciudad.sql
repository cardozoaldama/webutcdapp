-- Table: public.sys_ciudad

-- DROP TABLE IF EXISTS public.sys_ciudad;

CREATE TABLE IF NOT EXISTS public.sys_ciudad
(
    id_ciudad integer NOT NULL,
    nombre character(80) COLLATE pg_catalog."default",
    observacion character(80) COLLATE pg_catalog."default",
    activo character(80) COLLATE pg_catalog."default",
    id_departamento integer,
    id_cuenta integer,
    CONSTRAINT id_ciudad PRIMARY KEY (id_ciudad),
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

ALTER TABLE IF EXISTS public.sys_ciudad
    OWNER to fcardozo;