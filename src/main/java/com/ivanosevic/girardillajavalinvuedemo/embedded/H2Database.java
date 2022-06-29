package com.ivanosevic.girardillajavalinvuedemo.embedded;

import org.h2.tools.Server;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.SQLException;

public class H2Database implements Database {

    private Server server;
    private static final Logger logger = LoggerFactory.getLogger(H2Database.class);

    @Override
    public void start(int port) {
        try {
            logger.info("Starting H2 database.");
            server = Server.createTcpServer("-tcpPort", String.valueOf(port), "-webAllowOthers", "-ifNotExists");
            server.start();
        } catch (SQLException e) {
            logger.error("Error while creating database: { }", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void stop() {
        if(server != null) {
            logger.info("Stopping database.");
            server.stop();
        }
    }
}
