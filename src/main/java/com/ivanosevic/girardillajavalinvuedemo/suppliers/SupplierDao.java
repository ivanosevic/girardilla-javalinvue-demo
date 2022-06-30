package com.ivanosevic.girardillajavalinvuedemo.suppliers;

import org.jdbi.v3.sqlobject.config.RegisterRowMapper;
import org.jdbi.v3.sqlobject.statement.SqlQuery;

import java.util.List;

public interface SupplierDao {

    @SqlQuery("SELECT\n" +
            "    s.id                        as s_id,\n" +
            "    s.email                     as s_email,\n" +
            "    s.name                      as s_name,\n" +
            "    s.lastname                  as s_lastname,\n" +
            "    s.name || ' ' || s.lastname as s_fullname,\n" +
            "    s.delivery_time             as s_delivery_time,\n" +
            "    s.created_at                as s_joined_at,\n" +
            "    c.name                      as s_country\n" +
            "FROM\n" +
            "    public.supplier s\n" +
            "        INNER JOIN public.country c ON s.country_id = c.id")
    @RegisterRowMapper(SimpleSupplierMapper.class)
    List<Supplier> findAll();
}
