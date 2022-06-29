package com.ivanosevic.girardillajavalinvuedemo.countries;

import com.ivanosevic.girardillajavalinvuedemo.common.Controller;
import io.javalin.Javalin;
import io.javalin.http.Context;

public class CountryController implements Controller {

    private final CountryDao countryDao;

    public CountryController(CountryDao countryDao) {
        this.countryDao = countryDao;
    }

    public void findAllCountries(Context ctx) {
        var countries = countryDao.findAll();
        ctx.json(countries);
    }

    @Override
    public void registerRoutes(Javalin app) {
        app.get("/api/countries", this::findAllCountries);
    }
}
