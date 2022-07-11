<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jstl" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
<title>Medical Shop </title>
<link rel ="stylesheet" href = "webjars/bootstrap/5.1.3/css/bootstrap.min.css"/>
</head>
<body>
<div class = "container">
<div class = "row">
<table class="table col-12">
  <thead>
    <tr>
      <th scope="col">Medicine Id</th>
      <th scope="col">Name</th>
      <th scope="col">Stock</th>
      <th scope="col">Cost Price</th>
      <th scope="col">Selling Price</th>
      <th scope="col">Profit</th>
    </tr>
  </thead>
  <tbody>
  <jstl:forEach items = "${medicines}" var = "medicines">
    <tr>
      <th scope="row">${medicine.Medicine_Id}</th>
      <td>${medicine.Medicine_Name}</td>
      <td>${medicine.Stock}</td>
      <td>${medicine.CostPrice}</td>
      <td>${medicine.SellingPrice}</td>
      <td>${medicine.Profit}</td>
    </tr>
    </jstl:forEach>
  </tbody>
</table>
</div>
<div class = "row">

</div>
</div>
</body>
</html>