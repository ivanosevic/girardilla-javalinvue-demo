INSERT INTO public.country(name, iso2) VALUES ('Dominican Republic', 'DO'),
                                              ('Cuba', 'CU'),
                                              ('Italy', 'IT'),
                                              ('United States of America', 'US'),
                                              ('Spain', 'ES');

INSERT INTO public.supplier(name, lastname, email, delivery_time, country_id) VALUES ('Felipe', 'Torres', 'FelipeTorres@girardilla.cu', 90, 2),
                                                                                     ('Ivan', 'Garcia', 'IvanGarcia@girardilla.do', 25, 1),
                                                                                     ('María', 'Gómez', 'MariaGomez@girardilla.do', 20, 1),
                                                                                     ('Joseph', 'McGuillen', 'McGuilleJoseph@girardilla.us', 10, 4);