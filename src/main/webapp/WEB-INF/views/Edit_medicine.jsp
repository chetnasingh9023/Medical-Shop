<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
<title>Medical Shop </title>
<link rel ="stylesheet" href = "${pageContext.request.contextPath}/webjars/bootstrap/5.1.3/css/bootstrap.min.css"/>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/webjars/bootstrap-icons/1.8.3/font/bootstrap-icons.css"/>
</head>
<body>
<div class = "container">
<div class = "row">
<form:form method = "post" action ="${pageContext.request.contextPath}/medicine/update"
modelAttribute = "medicine_edited">
<fieldset class ="form-group mb-3">
<form:label class ="form-label" for ="name" path ="name">Name</form:label>
<form:input class = "form-control" id ="name" type ="text" name ="name" path="name"
required ="required"/>
<form:errors cssClass ="text-warning" path ="name"/>
</fieldset>
<fieldset class ="form-group mb-3">
<form:label class ="form-label" for ="Stock" path ="stock">Stock</form:label>
<form:input class = "form-control" id ="Stock" type ="text" name ="Stock" path="stock"
required ="required"/>
<form:errors cssClass ="text-warning" path ="stock"/>
</fieldset>
<fieldset class ="form-group mb-3">
<form:label class ="form-label" for ="CostPrice" path ="costPrice">CostPrice</form:label>
<form:input class = "form-control" id ="CostPrice" type ="text" name ="CostPrice" path="costPrice"
required ="required"/>
<form:errors cssClass ="text-warning" path ="costPrice"/>
</fieldset>
<fieldset class ="form-group mb-3">
<form:label class ="form-label" for ="SellingPrice" path ="sellingPrice">SellingPrice</form:label>
<form:input class = "form-control" id ="SellingPrice" type ="text" name ="SellingPrice" path="sellingPrice"
required ="required"/>
<form:errors cssClass ="text-warning" path ="sellingPrice"/>
</fieldset>
<fieldset class ="form-group mb-3">
<form:label class ="form-label" for ="Profit" path ="profit">Profit</form:label>
<form:input class = "form-control" id ="Profit" type ="text" name ="Profit" path="profit"
required ="required"/>
<form:errors cssClass ="text-warning" path ="profit"/>
</fieldset>
<button type ="reset" class ="btn btn-outline-secondary">cancel
</button>
<button type = "submit" class = "btn btn-primary">Add</button>
</form:form>
</div>
</div>
</body>
</html>