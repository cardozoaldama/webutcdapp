-- Table: public.usuario

-- DROP TABLE IF EXISTS public.usuario;

CREATE TABLE IF NOT EXISTS public.usuario
(
    idusuario numeric(9,0) NOT NULL,
    nombre character varying(50) COLLATE pg_catalog."default" NOT NULL,
    clave character varying(50) COLLATE pg_catalog."default" NOT NULL,
    activo character varying(1) COLLATE pg_catalog."default" NOT NULL,
    usuario_inicio_sesion character varying(25) COLLATE pg_catalog."default",
    fecha_inicio_sesion timestamp without time zone,
    usuario_fin_sesion character varying(25) COLLATE pg_catalog."default",
    fecha_fin_sesion timestamp without time zone,
    CONSTRAINT "usuario-idusuario_pk" PRIMARY KEY (idusuario)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.usuario
    OWNER to fcardozo;