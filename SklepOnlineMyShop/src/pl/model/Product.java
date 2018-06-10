package pl.model;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class Product  {
    private String pName;
    private String pPrice;

    public Product(String productName, String productPrice) {
        this.pName = productName;
        this.pPrice = productPrice;
    }

    public String getpName() {
        return pName;
    }

    public String getpPrice() {
        return pPrice;
    }

    @Override
    public String toString() {
        return "Nazwa produktu : "+pName+ "   Cena produktu : "+pPrice;
    }
}
