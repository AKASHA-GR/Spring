<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Opener</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">
    <div class="container mt-5">
        <h1 class="text-center mb-4">Wine Application</h1>
        <div class="card shadow">
            <div class="card-body">
                <form action="wine" method="post" class="needs-validation">
                    <div class="mb-3">
                        <label for="companyName" class="form-label">Company Name</label>
                        <input type="text" class="form-control" id="companyName" name="companyName" value="${wineDTO.companyName}">
                    </div>
                    <div class="mb-3">
                        <label for="companyAddress" class="form-label">Company Address</label>
                        <input type="text" class="form-control" id="companyAddress" name="companyAddress" value="${wineDTO.companyAddress}">
                    </div>
                    <div class="mb-3">
                        <label for="manufacturerName" class="form-label">Manufacturer Name</label>
                        <input type="text" class="form-control" id="manufacturerName" name="manufacturerName" value="${wineDTO.manufacturerName}">
                    </div>
                    <div class="mb-3">
                        <label for="manufactureDate" class="form-label">Manufacture Date</label>
                        <input type="date" class="form-control" id="manufactureDate" name="manufactureDate" value="${wineDTO.manufactureDate}">
                    </div>
                    <div class="mb-3">
                        <label for="age" class="form-label">Age</label>
                        <input type="number" class="form-control" id="age" name="age" value="${wineDTO.age}">
                    </div>
                    <div class="mb-3">
                        <label for="price" class="form-label">Price</label>
                        <input type="number" class="form-control" id="price" name="price" value="${wineDTO.price}">
                    </div>
                    <button type="submit" class="btn btn-primary w-100">Submit</button>
                </form>

                <c:if test="${not empty wineMessage}">
                    <div class="alert alert-success mt-3">${wineMessage}</div>
                </c:if>

                <c:forEach items="${validationErrors}" var="wine">
                    <div class="alert alert-danger mt-2">${wine.defaultMessage}</div>
                </c:forEach>
            </div>
        </div>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>