package com.ivanosevic.girardillajavalinvuedemo.suppliers;

import org.jdbi.v3.core.mapper.RowMapper;
import org.jdbi.v3.core.statement.StatementContext;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.Instant;

public class SimpleSupplierMapper implements RowMapper<Supplier> {

    @Override
    public Supplier map(ResultSet rs, StatementContext ctx) throws SQLException {
        Integer id = rs.getInt("s_id");
        String name = rs.getString("s_name");
        String lastname = rs.getString("s_lastname");
        String fullname = rs.getString("s_fullname");
        Integer deliveryTime = rs.getInt("s_delivery_time");
        Instant joinedAt = rs.getTimestamp("s_joined_at").toInstant();
        String country = rs.getString("s_country");
        String email = rs.getString("s_email");
        return new Supplier(id, name, lastname, fullname, email, country, deliveryTime, joinedAt);
    }
}
