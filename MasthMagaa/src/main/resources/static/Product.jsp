<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Product Page</title>
</head>
<body>
<h1>The Product Page</h1>
    <form action="product" method="post">
        <pre>
            Product Name: <input type="text" name="name" value="${productDTO.name}">
            Product Brand: <input type="text" name="brand" value="${productDTO.brand}">
            Product Price: <input type="text" name="price" value="${productDTO.price}">
            Product category: <input type="text" name="category" value="${productDTO.category}">

            <input type="submit" value="Product">

            <h2><span>${productMessage}</span></h2>
        </pre>
    </form>
    <c:forEach items="${validationError}" var="bugs">
        <p style="color:red">${bugs.defaultMessage}</p>
    </c:forEach>
</body>
</html>