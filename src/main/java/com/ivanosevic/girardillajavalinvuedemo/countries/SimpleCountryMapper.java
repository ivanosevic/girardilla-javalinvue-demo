package com.ivanosevic.girardillajavalinvuedemo.countries;

import org.jdbi.v3.core.mapper.ColumnMapper;
import org.jdbi.v3.core.statement.StatementContext;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SimpleCountryMapper implements ColumnMapper<Country> {

    @Override
    public Country map(ResultSet r, int columnNumber, StatementContext ctx) throws SQLException {
        Integer id = r.getInt("id");
        String name = r.getString("name");
        String iso2 = r.getString("iso2");
        return new Country(id, name, iso2);
    }
}
