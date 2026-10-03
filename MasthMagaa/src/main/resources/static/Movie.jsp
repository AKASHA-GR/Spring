<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html >
<head>
    <title>Movie</title>
</head>
<body>
    <form action="movie" method="post">
        Movie Name: <input type="text" name="name" value="${movieDTO.name}"><br>
        Movie price: <input type="text" name="price" value="${movieDTO.price}"><br>
        Movie Duration: <input type="text" name="duration" value="${movieDTO.duration}"><br>
        Movie Budget: <input type="text" name="budget" value="${movieDTO.budget}"><br>
        <input type="submit" value="Movie">

        <h2><span>${movieMessage}</span></h2>
    </form>

    <c:forEach items = "${validationError}" var = "bugs">
        <p style="color:red">${bugs.defaultMessage}</p>
    </c:forEach>


</body>
</html>