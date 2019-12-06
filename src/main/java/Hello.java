import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;
import static spark.Spark.*;
import java.util.HashMap;
import java.util.Map;

public class Hello {

    public static void main(String[] args) {
        get("/hello", (req, res) -> {

            Map<String, String> dataMap = new HashMap<>();
            dataMap.put("name", "Ntando");
            return new ModelAndView(dataMap, "hello.hbs");

        }, new HandlebarsTemplateEngine());
    }

}
