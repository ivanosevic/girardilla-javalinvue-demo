CREATE TABLE IF NOT EXISTS public.country(
    id INT GENERATED ALWAYS AS IDENTITY,
    name VARCHAR(80) NOT NULL,
    iso2 CHAR(2) NOT NULL UNIQUE,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY(id)
);

CREATE TABLE IF NOT EXISTS public.supplier(
    id INT GENERATED ALWAYS AS IDENTITY,
    country_id INT NOT NULL,
    name VARCHAR(80) NOT NULL,
    lastname VARCHAR(80) NOT NULL,
    delivery_time INT NOT NULL,
    email VARCHAR(320) NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY(id),
    CONSTRAINT fk_supplier_country_id FOREIGN KEY (country_id) REFERENCES public.country(id)
);