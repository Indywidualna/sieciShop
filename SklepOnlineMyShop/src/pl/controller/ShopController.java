package pl.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import pl.businessLogic.PriceCalculator;
import pl.model.Product;

@WebServlet("/controller")
public class ShopController extends HttpServlet {

    double srednia;
    double suma;
    private ArrayList<Product> products;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter printWriter=response.getWriter();
        products=new ArrayList<>();
        String produkt1=request.getParameter("product1");
        String produkt2=request.getParameter("product2");
        String produkt3=request.getParameter("product3");
        String produkt4=request.getParameter("product4");

        String cena1=request.getParameter("price1");
        cena1=cena1.replaceAll(",",".");
        String cena2=request.getParameter("price2");
        cena2=cena2.replaceAll(",",".");
        String cena3=request.getParameter("price3");
        cena3=cena3.replaceAll(",",".");
        String cena4=request.getParameter("price4");
        cena4=cena4.replaceAll(",",".");

        if(cena1==""||cena2==""||cena3==""||cena4==""||
                produkt1==""||produkt2==""||produkt3==""||produkt4==""){
            response.sendRedirect("nothing.jsp");
        }
        else {
            Product p1=new Product(produkt1,cena1);
            Product p2=new Product(produkt2,cena2);
            Product p3=new Product(produkt3,cena3);
            Product p4=new Product(produkt4,cena4);

            products.add(p1);
            products.add(p2);
            products.add(p3);
            products.add(p4);

            srednia=PriceCalculator.liczSrednia(products);
            suma=PriceCalculator.liczCene(products);

            request.setAttribute("products",products);
            request.setAttribute("sum",suma);
            request.setAttribute("mean",srednia);
            request.getRequestDispatcher("sum.jsp").forward(request,response);
            response.sendRedirect("sum.jsp");
        }
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
