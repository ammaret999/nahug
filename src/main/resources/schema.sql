CREATE TABLE IF NOT EXISTS test_user(
    id_user integer NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
    first_name character(20) COLLATE pg_catalog."default" NOT NULL,
    last_name character(20) COLLATE pg_catalog."default" NOT NULL,
    email_user character(35) COLLATE pg_catalog."default" NOT NULL,
    password character(20) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT test_user_pkey PRIMARY KEY (id_user),
    CONSTRAINT user_e_uq UNIQUE (email_user)
);

CREATE TABLE IF NOT EXISTS cat(
    id_cat integer NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
    name character(20) COLLATE pg_catalog."default",
    age_year integer DEFAULT 0,
    age_month integer DEFAULT 1,
    weight integer NOT NULL DEFAULT 1,
    gender character(20) COLLATE pg_catalog."default",
    id_user integer NOT NULL,
    id_food integer,
    cal_day integer DEFAULT 0,
    CONSTRAINT cat_pkey PRIMARY KEY (id_cat),
    CONSTRAINT cat_id_user_fkey FOREIGN KEY (id_user)
        REFERENCES public.test_user (id_user) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID

);

CREATE TABLE IF NOT EXISTS brand(
    id_brand integer NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
    description character(40) COLLATE pg_catalog."default",
    brand character(25) COLLATE pg_catalog."default" NOT NULL,
    cal integer NOT NULL,
    CONSTRAINT brand_pkey PRIMARY KEY (id_brand),
    CONSTRAINT u_brand UNIQUE (brand)

);

CREATE TABLE IF NOT EXISTS vaccine(
    id_vaccine integer NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
    name_vaccine character(20) COLLATE pg_catalog."default" NOT NULL,
    age_month integer NOT NULL,
    CONSTRAINT vaccine_pkey PRIMARY KEY (id_vaccine),
    CONSTRAINT u_name_vaccine UNIQUE (name_vaccine)

);

CREATE TABLE IF NOT EXISTS phase(
    id_phase integer NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
    next_time integer DEFAULT 0,
    count_vaccine integer NOT NULL,
    vaccine_id integer NOT NULL,
    phase integer NOT NULL,
    CONSTRAINT phase_pkey PRIMARY KEY (id_phase),
    CONSTRAINT pv_fk FOREIGN KEY (vaccine_id)
        REFERENCES public.vaccine (id_vaccine) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID

);

CREATE TABLE IF NOT EXISTS public.history
(
    id integer NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
        id_vaccine integer NOT NULL,
        id_cat integer NOT NULL,
        start_date date NOT NULL,
        end_date date NOT NULL,
        count integer DEFAULT 0,
        phase_history integer DEFAULT 1,
        CONSTRAINT history_pkey PRIMARY KEY (id),
        CONSTRAINT history_id_cat FOREIGN KEY (id_cat)
            REFERENCES public.cat (id_cat) MATCH SIMPLE
            ON UPDATE NO ACTION
            ON DELETE NO ACTION
            NOT VALID,
        CONSTRAINT history_id_vaccine FOREIGN KEY (id_vaccine)
            REFERENCES public.vaccine (id_vaccine) MATCH SIMPLE
            ON UPDATE NO ACTION
            ON DELETE NO ACTION
            NOT VALID
);