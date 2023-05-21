-- Table: public.sys_departamento

-- DROP TABLE IF EXISTS public.sys_departamento;

CREATE TABLE IF NOT EXISTS public.sys_departamento
(
    id_departamento integer NOT NULL,
    nombre character(45) COLLATE pg_catalog."default",
    observacion character(80) COLLATE pg_catalog."default",
    activo character(40) COLLATE pg_catalog."default",
    codigo character(25) COLLATE pg_catalog."default",
    id_cuenta integer,
    CONSTRAINT sys_departamento_pkey PRIMARY KEY (id_departamento),
    CONSTRAINT id_cuenta FOREIGN KEY (id_cuenta)
        REFERENCES public.kwf_cuenta (id_cuenta) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.sys_departamento
    OWNER to fcardozo;

COMMENT ON CONSTRAINT id_cuenta ON public.sys_departamento
    IS 'Foreign key from kwf_cuenta table';