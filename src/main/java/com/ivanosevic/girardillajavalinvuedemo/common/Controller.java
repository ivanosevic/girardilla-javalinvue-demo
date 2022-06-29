package com.ivanosevic.girardillajavalinvuedemo.common;

import io.javalin.Javalin;

public interface Controller {
    void registerRoutes(Javalin app);
}
