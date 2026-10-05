<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Travel Registration</title>
    <style>
        body { font-family: Arial, sans-serif; padding: 20px; }
        form { max-width: 500px; margin: 0 auto; }
        .form-group { margin-bottom: 15px; }
        label { display: block; margin-bottom: 5px; font-weight: bold; }
        input, select, textarea { width: 100%; padding: 8px; box-sizing: border-box; }
        button { padding: 10px 20px; background-color: #007bff; color: white; border: none; cursor: pointer; }
        button:hover { background-color: #0056b3; }
    </style>
</head>
<body>
    <h1>Travel Registration</h1>

    <form action="register" method="post">
        <div class="form-group">
            <label for="name">Name:</label>
            <input type="text" id="name" name="name" value="${travelRegistrationDTO.name}" required>
        </div>
        <div class="form-group">
            <label for="email">Email:</label>
            <input type="email" id="email" name="email" value="${travelRegistrationDTO.email}" required>
        </div>
        <div class="form-group">
            <label for="phone">Phone:</label>
            <input type="tel" id="phone" name="phone" value="${travelRegistrationDTO.phone}" required>
        </div>
        <div class="form-group">
            <label for="destination">Destination:</label>
            <input type="text" id="destination" name="destination" value="${travelRegistrationDTO.destination}" required>
        </div>
        <div class="form-group">
            <label for="travelDate">Travel Date:</label>
            <input type="date" id="travelDate" name="travelDate" value="${travelRegistrationDTO.travelDate}" required>
        </div>
        <div class="form-group">
            <label for="numberOfTravelers">Number of Travelers:</label>
            <input type="number" id="numberOfTravelers" name="numberOfTravelers" min="1" value="${travelRegistrationDTO.numberOfTravelers}" required>
        </div>
        <div class="form-group">
            <label for="travelType">Travel Type:</label>
            <select id="travelType" name="travelType" required>
                <c:forEach items="${travelTypes}" var="travelType">
                    <option value="${travelType}">${travelType}</option>
                </c:forEach>
            </select>
        </div>
        <div class="form-group">
            <label for="paymentMethod">Payment Method:</label>
            <select id="paymentMethod" name="paymentMethod" required>
                <c:forEach items="${paymentMethods}" var="paymentMethod">
                    <option value="${paymentMethod}">${paymentMethod}</option>
                </c:forEach>
            </select>
        </div>
        <div class="form-group">
            <label for="specialRequirements">Special Requirements:</label>
            <textarea id="specialRequirements" name="specialRequirements" rows="3">${travelRegistrationDTO.specialRequirements}</textarea>
        </div>
        <button type="submit">Register</button>
    </form>

    <c:forEach items="${validationErrors}" var="objectError">
        <p style="color: red;">${objectError.defaultMessage}</p>
    </c:forEach>

    <p style="color: green;">${travelMessage}</p>

</body>
</html>