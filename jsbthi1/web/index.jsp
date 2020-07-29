<%--
  Created by IntelliJ IDEA.
  User: Pham Viet Khanh
  Date: 29/07/2020
  Time: 14:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title>User list </title>
  <link rel="stylesheet"
        href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
        integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk"
        crossorigin="anonymous">

</head>
<body>
  <table class="table table-bordered">
    <thead>
    <tr>
      <th>ID</th>
      <th>Name</th>
      <th>Price</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="banks" items="${listBank}">
      <tr>
        <td> <c:out value="${banks.id}"/></td>

        <td> <c:out value="${banks.getStockName}"/></td>

        <td> <c:out value="${banks.getStockPrice}"/></td>

      </tr>
    </c:forEach>
    </tbody>
  </table>

</body>
</html>

