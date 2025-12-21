package org.example;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import java.io.IOException;
import java.io.OutputStream;

public class CalculatorHttpHandler implements HttpHandler {
    @Override
    public void handle(HttpExchange exchange) throws IOException {
        String query = exchange.getRequestURI().getQuery();

        String[] array = query.split("&");
        String num1 = array[0].split("=")[1];
        String num2 = array[1].split("=")[1];
        String type = array[2].split("=")[1];

        double number1 = Double.parseDouble(num1);
        double number2 = Double.parseDouble(num2);
        double res = 0;

        switch (type) {
            case "sum": res = number1 + number2; break;
            case "sub": res = number1 - number2; break;
            case "mul": res = number1 * number2; break;
            case "div": res = number1 / number2; break;
        }

        String result = String.valueOf(res);
        exchange.sendResponseHeaders(200, result.length());
        try (OutputStream os = exchange.getResponseBody()) {
            os.write(result.getBytes());
        }
    }
}
