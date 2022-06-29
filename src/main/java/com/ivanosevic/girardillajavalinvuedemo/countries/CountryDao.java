package com.ivanosevic.girardillajavalinvuedemo.countries;

import org.jdbi.v3.sqlobject.config.RegisterColumnMapper;
import org.jdbi.v3.sqlobject.statement.SqlQuery;

import java.util.List;

public interface CountryDao {

    @RegisterColumnMapper(SimpleCountryMapper.class)
    @SqlQuery("SELECT c.id, c.name, c.iso2 FROM public.country c")
    List<Country> findAll();
}
