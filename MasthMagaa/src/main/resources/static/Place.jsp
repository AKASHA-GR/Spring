<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Place Page</title>
</head>
<body>
    <form action="place" method="post">
        <pre>
            Name: <input type="text" name="name" value="${placeDTO.name}">
            Number of House: <input type="text" name="house" value="${placeDTO.house}">
            Number of Villages: <input type="text" name="village" value="${placeDTO.village}">
            Famous Temple: <input type="text" name="temple" value="${placeDTO.temple}">
            Famous Food: <input type="text" name="food" value="${placeDTO.food}">
            <input type="submit" value="Place">

            <h2><span>${placeMessage}</span></h2>

        </pre>
    </form>
    <c:forEach items="${validationError}" var="bugs">
        <p style="color:red">${bugs.defaultMessage}</p>
    </c:forEach>
</body>
</html>