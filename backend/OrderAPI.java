import java.util.*;
import spark.Spark;
import com.google.gson.*;

public class OrderAPI {
    public static void startServer() {
        Spark.port(8080);
        Gson gson = new Gson();

        Spark.post("/api/order", (req, res) -> {
            res.type("application/json");
            Map<String, String> body = gson.fromJson(req.body(), Map.class);
            String foodItem = body.get("foodItem");
            String quantity = body.get("quantity");

            // Simulated DB logic
            System.out.println("Received order: " + foodItem + " x " + quantity);
            return gson.toJson(Map.of("message", "Order placed successfully!"));
        });
    }
}
