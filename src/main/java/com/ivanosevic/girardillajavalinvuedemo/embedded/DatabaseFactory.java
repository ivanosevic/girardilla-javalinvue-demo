package com.ivanosevic.girardillajavalinvuedemo.embedded;

import javax.xml.crypto.Data;

public class DatabaseFactory {

    public static Database getH2Database() {
        return new H2Database();
    }
}
