<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Beer List</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css">
</head>
<body>
    <div class="container mt-5">
        <h2 class="mb-4">All Beer Records</h2>
        
        <c:if test="${not empty beerList}">
            <table class="table table-bordered table-striped">
                <thead>
                    <tr>
                        <th>Company Name</th>
                        <th>Company Address</th>
                        <th>Manufacturer Name</th>
                        <th>Manufacture Date</th>
                        <th>Alcohol Content</th>
                        <th>Beer Type</th>
                        <th>Volume</th>
                        <th>Price</th>
                        <th>Is Bottled</th>
                        <th>Expiry Date</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${beerList}" var="beer">
                        <tr>
                            <td>${beer.companyName}</td>
                            <td>${beer.companyAddress}</td>
                            <td>${beer.manufacturerName}</td>
                            <td>${beer.manufactureDate}</td>
                            <td>${beer.alcoholContent}</td>
                            <td>${beer.beerType}</td>
                            <td>${beer.volume}</td>
                            <td>${beer.price}</td>
                            <td>${beer.isBottled}</td>
                            <td>${beer.expiryDate}</td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </c:if>
        
        <c:if test="${empty beerList}">
            <div class="alert alert-info">
                No beer records found.
            </div>
        </c:if>
        
        <a href="/opener/index.jsp" class="btn btn-primary">Back to Home</a>
    </div>
</body>
</html>