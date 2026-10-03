<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Register Page</title>
</head>
<body>
<form action="register">
    <pre>
        FirstName: <input type="text" name="firstName" value="${registerDTO.firstName}">
        LastName: <input type="text" name="lastName" value="${registerDTO.lastName}">
        Email: <input type="text" name="email" value="${registerDTO.email}">
        MobileNO: <input type="text" name="mobile" value="${registerDTO.mobile}">
        <input type="submit" value="Register">

        <h2><span>${registerMessage}</span></h2>
</pre>
</form>
    <c:forEach items="${validationErrors}" var="errors">
        <p style="color:red">${errors.defaultMessage}</p>
    </c:forEach>
</body>
</html>