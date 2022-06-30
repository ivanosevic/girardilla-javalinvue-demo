package com.ivanosevic.girardillajavalinvuedemo.suppliers;

import com.ivanosevic.girardillajavalinvuedemo.common.Controller;
import io.javalin.Javalin;
import io.javalin.http.Context;

public class SupplierController implements Controller {

    private final SupplierDao supplierDao;

    public SupplierController(SupplierDao supplierDao) {
        this.supplierDao = supplierDao;
    }

    public void findAllSuppliers(Context ctx) {
        var suppliers = supplierDao.findAll();
        ctx.json(suppliers);
    }

    @Override
    public void registerRoutes(Javalin app) {
        app.get("/api/suppliers", this::findAllSuppliers);
    }
}
