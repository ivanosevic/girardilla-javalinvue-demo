package com.ivanosevic.girardillajavalinvuedemo.embedded;

public interface Database {
    void start(int port);
    void stop();
}
