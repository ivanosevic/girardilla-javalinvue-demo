package com.ivanosevic.girardillajavalinvuedemo;

import com.ivanosevic.girardillajavalinvuedemo.common.Controller;
import com.ivanosevic.girardillajavalinvuedemo.countries.CountryController;
import com.ivanosevic.girardillajavalinvuedemo.countries.CountryDao;
import com.ivanosevic.girardillajavalinvuedemo.embedded.DataBootstrap;
import com.ivanosevic.girardillajavalinvuedemo.embedded.Database;
import com.ivanosevic.girardillajavalinvuedemo.embedded.DatabaseFactory;
import io.javalin.Javalin;
import io.javalin.plugin.rendering.vue.VueComponent;
import org.jdbi.v3.core.Jdbi;
import org.jdbi.v3.core.statement.Slf4JSqlLogger;
import org.jdbi.v3.sqlobject.SqlObjectPlugin;

import java.util.ArrayList;
import java.util.List;

public class GirardillaApplication {

    public static void main(String[] args) {
        Database h2Database = DatabaseFactory.getH2Database();
        h2Database.start(9092);

        Jdbi jdbi = Jdbi.create("jdbc:h2:~/girardilla_javalinvue_demo", "sa", "");
        jdbi.installPlugin(new SqlObjectPlugin());
        jdbi.setSqlLogger(new Slf4JSqlLogger());

        DataBootstrap dataBootstrap = new DataBootstrap(jdbi);
        dataBootstrap.dropTables();
        dataBootstrap.createTables();
        dataBootstrap.insertData();

        CountryDao countryDao = jdbi.onDemand(CountryDao.class);

        List<Controller> controllers = new ArrayList<>();
        Controller countryController = new CountryController(countryDao);
        controllers.add(countryController);

        Javalin app = Javalin.create(config -> {
            config.enableWebjars();
            config.enableDevLogging();
            config.showJavalinBanner = false;
            config.enableCorsForAllOrigins();
        });

        /*
            Registration of api routes
            before starting application.
         */
        for(Controller controller : controllers) {
            controller.registerRoutes(app);
        }

        /*
            Registration of vue routes
            before starting the application
         */
        app.get("/hello-world", new VueComponent("hello-world"));
        app.get("/", new VueComponent("home-page"));
        app.get("/suppliers", new VueComponent("suppliers-page"));
        app.get("/wines", new VueComponent("wines-page"));
        app.get("/orders", new VueComponent("orders-page"));

        // Start web server
        app.start();
    }
}
