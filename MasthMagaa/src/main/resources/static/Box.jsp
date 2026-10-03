<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html xmlns:c="http://www.w3.org/1999/html">
<head>
    <tile>Box </tile>
</head>
<body>
<form action="box" method="post">
        <pre>
            Shape: <input type="text" name="shape" value="${boxDTO.shape}">
            type: <input type="text" name="type"   value="${boxDTO.type}">
            price: <input type="text" name="price" value="${boxDTO.price}">
            Hight: <input type="text" name="hight" value="${boxDTO.hight}">
            Weight: <input type="text" name="weight"   value="${boxDTO.weight}">

            <i>${boxMessage}</i>
            <input type="submit" value="submit">
        </pre>
</form>
<c:forEach items = "${validationErrors}" var = "objectError">
    <p style="color:red">${objectError.defaultMessage}</p>
</c:forEach>
</body>
</html>