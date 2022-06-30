package com.ivanosevic.girardillajavalinvuedemo.embedded;

import org.hsqldb.cmdline.SqlFile;
import org.hsqldb.cmdline.SqlToolError;
import org.jdbi.v3.core.Handle;
import org.jdbi.v3.core.Jdbi;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

public class DataBootstrap {

    private final Jdbi jdbi;

    public DataBootstrap(Jdbi jdbi) {
        this.jdbi = jdbi;
    }

    public void dropTables() {
        try(Handle handle = jdbi.open()) {
            handle.execute("DROP TABLE public.supplier");
            handle.execute("DROP TABLE public.country");
        }
    }

    public void createTables() {
        try(Handle handle = jdbi.open()) {
            SqlFile sqlFile = new SqlFile(new File("src/main/resources/scripts/ddl.sql"));
            sqlFile.setConnection(handle.getConnection());
            sqlFile.execute();
        } catch (SQLException | SqlToolError | IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void insertData() {
        try(Handle handle = jdbi.open()) {
            SqlFile sqlFile = new SqlFile(new File("src/main/resources/scripts/data.sql"));
            sqlFile.setConnection(handle.getConnection());
            sqlFile.execute();
        } catch (SQLException | SqlToolError | IOException e) {
            throw new RuntimeException(e);
        }
    }
}
