<%--
  Created by IntelliJ IDEA.
  User: dell
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Produkty online Justyna</title>
  </head>
  <body>
  <h1 style="color: cadetblue">Witaj w sklepie!</h1>
  <h2>Proszę wprowadzić informacje o produktach, które chcesz kupić.</h2>
  <form method="post" action="controller">
    <input type="text" name="product1" placeholder="Produkt Pierwszy">
    <input type="number" name="price1" step="0.03" placeholder="cena"><br>
    <input type="text" name="product2" placeholder="Produkt Drugi">
    <input type="number" name="price2" step="0.03" placeholder="cena"><br>
    <input type="text" name="product3" placeholder="Produkt Trzeci">
    <input type="number" name="price3" step="0.03" placeholder="cena"><br>
    <input type="text" name="product4" placeholder="Produkt Czwarty">
    <input type="number" name="price4" step="0.03" placeholder="cena"><br>
    <input type="submit" value="Zakup">
  </form>
  </body>
</html>
