<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html xmlns:c="http://www.w3.org/1999/XSL/Transform">
<head>
    <title>Vodka</title>
</head>
<body>
<h1>Vodka</h1>
<form action="vodkaUpdate" method="post">
    <input type="text" disabled value="${vodkaDTO.id}">
    <input type="hidden" name="id" value="${vodkaDTO.id}">
    Company name: <input type="text" name="companyName" value="${vodkaDTO.companyName}"><br>

    Company address: <input type="text" name="companyAddress" value="${vodkaDTO.companyAddress}"><br>

    Manufacturer name: <input type="text" name="manufacturerName" value="${vodkaDTO.manufacturerName}"><br>

    Manufacture date: <input type="date" name="manufactureDate" value="${vodkaDTO.manufactureDate}"><br>

    Alcohol content (%): <input type="number" name="alcoholContent" step="0.1" value="${vodkaDTO.alcoholContent}"><br>

    Vodka type: <input type="text" name="vodkaType" value="${vodkaDTO.vodkaType}"><br>

    Is bottled: <select name="isBottled">
    <option value="">Select</option>
    <option value="true" ${vodkaDTO.isBottled == true ? 'selected' : ''}>Yes</option>
    <option value="false" ${vodkaDTO.isBottled == false ? 'selected' : ''}>No</option>
</select><br>

    Expiry date: <input type="date" name="expiryDate" value="${vodkaDTO.expiryDate}"><br>

    Volume (ml): <input type="number" name="volume" step="0.1" value="${vodkaDTO.volume}"><br>

    Price: <input type="number" name="price" step="0.01" value="${vodkaDTO.price}"><br>

    <input type="submit" value="Update">
</form>
<a href="/opener/index.jsp">Back to Home</a>

<c:forEach items = "${validationErrors}" var = "errors">
    <p>${errors.defaultMessage}</p>
</c:forEach>

<c:if test = "${message != null}">
    <p>${message}</p>
</c:if>
</body>
</html>