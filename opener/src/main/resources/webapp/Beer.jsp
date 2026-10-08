<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Beer</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">
    <div class="container mt-5">
        <h1 class="text-center mb-4">Beer Application</h1>
        <div class="card shadow">
            <div class="card-body">
                <form action="beer" method="post" class="needs-validation">
                    <div class="mb-3">
                        <label for="companyName" class="form-label">Company Name</label>
                        <input type="text" class="form-control" id="companyName" name="companyName" value="${beerDTO.companyName}">
                    </div>
                    <div class="mb-3">
                        <label for="companyAddress" class="form-label">Company Address</label>
                        <input type="text" class="form-control" id="companyAddress" name="companyAddress" value="${beerDTO.companyAddress}">
                    </div>
                    <div class="mb-3">
                        <label for="manufacturerName" class="form-label">Manufacturer Name</label>
                        <input type="text" class="form-control" id="manufacturerName" name="manufacturerName" value="${beerDTO.manufacturerName}">
                    </div>
                    <div class="mb-3">
                        <label for="manufactureDate" class="form-label">Manufacture Date</label>
                        <input type="date" class="form-control" id="manufactureDate" name="manufactureDate" value="${beerDTO.manufactureDate}">
                    </div>
                    <div class="mb-3">
                        <label for="alcoholContent" class="form-label">Alcohol Content (%)</label>
                        <input type="number" step="0.1" class="form-control" id="alcoholContent" name="alcoholContent" value="${beerDTO.alcoholContent}">
                    </div>
                    <div class="mb-3">
                        <label for="beerType" class="form-label">Beer Type</label>
                        <input type="text" class="form-control" id="beerType" name="beerType" value="${beerDTO.beerType}">
                    </div>
                    <div class="mb-3">
                        <label for="volume" class="form-label">Volume (ml)</label>
                        <input type="number" class="form-control" id="volume" name="volume" value="${beerDTO.volume}">
                    </div>
                    <div class="mb-3">
                        <label for="price" class="form-label">Price</label>
                        <input type="number" step="0.01" class="form-control" id="price" name="price" value="${beerDTO.price}">
                    </div>
                    <div class="mb-3 form-check">
                        <input type="checkbox" class="form-check-input" id="isBottled" name="isBottled" ${beerDTO.isBottled ? 'checked' : ''}>
                        <label for="isBottled" class="form-check-label">Is Bottled</label>
                    </div>
                    <div class="mb-3">
                        <label for="expiryDate" class="form-label">Expiry Date</label>
                        <input type="date" class="form-control" id="expiryDate" name="expiryDate" value="${beerDTO.expiryDate}">
                    </div>
                    <button type="submit" class="btn btn-primary w-100">Submit</button>
                </form>

                <c:if test="${not empty beerMessage}">
                    <div class="alert alert-success mt-3">${beerMessage}</div>
                </c:if>

                <c:forEach items="${validationErrors}" var="error">
                    <div class="alert alert-danger mt-2">${error.defaultMessage}</div>
                </c:forEach>
            </div>
        </div>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>