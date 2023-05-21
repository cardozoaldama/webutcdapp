-- Table: public.sys_zona_barrio

-- DROP TABLE IF EXISTS public.sys_zona_barrio;

CREATE TABLE IF NOT EXISTS public.sys_zona_barrio
(
    id_zona_barrio integer NOT NULL,
    activo character(1) COLLATE pg_catalog."default",
    id_barrio integer,
    id_cuenta integer,
    CONSTRAINT sys_zona_barrio_pkey PRIMARY KEY (id_zona_barrio),
    CONSTRAINT id_barrio FOREIGN KEY (id_barrio)
        REFERENCES public.sys_barrio (id_barrio) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT id_cuenta FOREIGN KEY (id_cuenta)
        REFERENCES public.kwf_cuenta (id_cuenta) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.sys_zona_barrio
    OWNER to fcardozo;