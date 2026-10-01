<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Customer Page</title>
</head>
    <body>
        <form action="customer">
            <pre>
                Customer Name: <input type="text" name="name" value="${customerDTO.name}">
                Customer Age: <input type="text" name="age" value="${customerDTO.age}">
                Customer Address: <input type="text" name="address" value="${customerDTO.address}">
                <input type="submit" value="Customer">

                <h2><span>${customerMessage}</span></h2>

            </pre>

        </form>
    <c:forEach items = "${validationErrors}" var = "ObjectErrors">
        <p style="color:red">${ObjectErrors.defaultMessage}</p>
    </c:forEach>
    </body>
</html>