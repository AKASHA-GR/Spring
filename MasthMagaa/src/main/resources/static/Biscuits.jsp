<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <tile> </tile>
</head>
<body>
    <form action="biscuits">
        <pre>
            Name: <input type="text" name="name" value="${biscuitsDTO.name}">
            Brand: <input type="text" name="brand" value="${biscuitsDTO.brand}">
            price: <input type="text" name="price" value="${biscuitsDTO.price}">
            TotleSuger: <input type="text" name="totleSuger" value="${biscuitsDTO.totleSuger}">
            BrandLocation: <input type="text" name="location" value="${biscuitsDTO.location}">

            <i>${biscuitMessage}</i>
            <input type="submit" value="submit">
        </pre>
    </form>
    <c:forEach items = "${validationErrors}" var = "objectError">
        <p style="color:red">${objectError.defaultMessage}</p>
    </c:forEach>
</body>
</html>