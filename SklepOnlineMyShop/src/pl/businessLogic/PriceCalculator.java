package pl.businessLogic;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import pl.model.Product;
import java.util.ArrayList;


public class PriceCalculator {


    public static double liczSrednia(ArrayList<Product> products){
        double srednia=0;

        double suma=liczCene(products);
        srednia=suma/products.size();

        return srednia;
    }

    public static double liczCene(ArrayList<Product> products){
        double podsuma=0;

        for (Product product: products){
            double price=Double.parseDouble(product.getpPrice());
            podsuma+=price;
        }
        return podsuma;
    }


}