<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Opener</title>
</head>
<body>
     <h1>Wine Application</h1>
     <form action="wine" method="post">
         Company Name: <input type="text" name="companyName" value="${wineDTO.companyName}"><br>
         Company Address: <input type="text" name="companyAddress" value="${wineDTO.companyAddress}"><br>
         Manufacturer Name: <input type="text" name="manufacturerName" value="${wineDTO.manufacturerName}"><br>
         Manufacture Date: <input type="date" name="manufactureDate" value="${wineDTO.manufactureDate}"><br>
         Age: <input type="number" name="age" value="${wineDTO.age}"><br>
         Price: <input type="number" name="price" value="${wineDTO.price}"><br>
         <input type="submit" value="Submit">
     </form>

     <p style="color: green;">${wineMessage}</p>

    <c:forEach items="${validationErrors}" var="wine">
        <p style="color: red;">${wine.defaultMessage}</p>
    </c:forEach>
</body>
</html>