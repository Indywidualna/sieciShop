<%@ page import="java.util.List" %>
<%@ page import="pl.model.Product" %>
<%--
  Created by IntelliJ IDEA.
  User: dell
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="pl-PL">
<head>
    <meta charset="UTF-8">
    <title>Podsumowanie</title>
</head>
<body>
<!--meta charset="UTF-8"-->
<h1 style="color: mediumpurple">Sprawdź zakupione produkty</h1>
<h3 style="color: purple">Następujące produkty zostały zakupione:</h3>
<ul>
    <%
        List<Product> products=(List<Product>)request.getAttribute("products");

        for(Product product:products){
            out.println("<li>"+product.getpName()+ " "+ product.getpPrice().toString()+" zl"+"</li>");
        }
    %>
</ul>
<h3>Srednia cena za produkt: <%=request.getAttribute("mean")+" zl"%></h3><br>
<h3>Srednia cena za produkt: <%=request.getAttribute("sum")+" zl"%></h3>

</body>
</html>
