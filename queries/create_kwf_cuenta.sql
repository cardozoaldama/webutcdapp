-- Table: public.kwf_cuenta

-- DROP TABLE IF EXISTS public.kwf_cuenta;

CREATE TABLE IF NOT EXISTS public.kwf_cuenta
(
    id_cuenta integer NOT NULL,
    cuenta_nombre character(80) COLLATE pg_catalog."default",
    usuario_creacion character(80) COLLATE pg_catalog."default",
    usuario_modificacion character(80) COLLATE pg_catalog."default",
    fecha_creacion timestamp without time zone,
    ultima_modificacion timestamp without time zone,
    uuid character(20) COLLATE pg_catalog."default",
    CONSTRAINT kwf_cuenta_pkey PRIMARY KEY (id_cuenta)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.kwf_cuenta
    OWNER to fcardozo;