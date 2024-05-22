create table public.log
{
    id_extrato integer NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 10000 CACHE 1 ),
    id_usuario integer NOT NULL,
    datahora timestamp without time zone DEFAULT CURRENT_TIMESTAMP,
    operacao character varying COLLATE pg_catalog."default" NOT NULL,
    valor_realizado double precision NOT NULL,
    moeda_realizada character varying COLLATE pg_catalog."default" NOT NULL,
    cotacao double precision NOT NULL,
    taxa double precision NOT NULL,
    "real" double precision NOT NULL,
    bitcoin double precision NOT NULL,
    ethereum double precision NOT NULL,
    ripple double precision NOT NULL,
    CONSTRAINT log_pkey PRIMARY KEY (id_extrato),
    CONSTRAINT id_usuario FOREIGN KEY (id_usuario)
        REFERENCES public.usuario (id_usuario) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID
};

CREATE TABLE IF NOT EXISTS public.tabelamoedas
(
    moeda character varying COLLATE pg_catalog."default" NOT NULL,
    valor double precision NOT NULL
);

CREATE TABLE IF NOT EXISTS public.usuario
(
    nome character varying COLLATE pg_catalog."default" NOT NULL,
    cpf character varying COLLATE pg_catalog."default" NOT NULL,
    senha character varying COLLATE pg_catalog."default" NOT NULL,
    "real" double precision NOT NULL,
    bitcoin double precision NOT NULL,
    ethereum double precision NOT NULL,
    ripple double precision NOT NULL,
    id_usuario integer NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 100 CACHE 1 ),
    CONSTRAINT usuario_pkey PRIMARY KEY (id_usuario)
);