CREATE TABLE public.sys_reclamo_aux (
    idreclamo integer NOT NULL,
    telefono character(20),
    nombre character(100),
    apellido character(100),
    direccion character(150),
    referencia character(150),
    correo character(100),
    fecha_hora_recepcion timestamp without time zone,
    departamento character(100),
    ciudad character(100),
    barrio character(150),
    activo character(10),
    usuario_modificacion character(120),
    usuario_creacion character(120)
);