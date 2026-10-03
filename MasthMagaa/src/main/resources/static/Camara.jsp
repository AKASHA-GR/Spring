<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Camara</title>
</head>
<body>
    <pre>
        <form action="camara" method="post">
            Brand: <input type="text" name="brand" value="${camaraDTO.brand}">
            Model: <input type="text" name="model" value="${camaraDTO.model}">
            SensorType: <input type="text" name="sensorType" value="${camaraDTO.sensorType}">
            Price: <input type="text" name="price" value="${camaraDTO.price}">
        <input type="submit" value="submit">
            <i>${camaraMessage}</i>
        </form>

        <c:forEach items = "${validationErrors}" var = "objectError">
            <p style="color:red">${objectError.defaultMessage}</p>
        </c:forEach>

    </pre>
</body>
</html>