<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Gin</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container mt-5">
        <h2 class="mb-4">Gin Information</h2>

        <c:if test="${not empty GinMessage}">
            <div class="alert alert-success">
                ${GinMessage}
            </div>
        </c:if>

        <c:if test="${not empty validationErrors}">
            <div class="alert alert-danger">
                <c:forEach items="${validationErrors}" var="error">
                    <p>${error.defaultMessage}</p>
                </c:forEach>
            </div>
        </c:if>

        <form action="gin" method="post">
            <div class="mb-3">
                <label for="companyName" class="form-label">Company Name</label>
                <input type="text" class="form-control" id="companyName" name="companyName" value="${GinDTO.companyName}" required>
            </div>

            <div class="mb-3">
                <label for="companyAddress" class="form-label">Company Address</label>
                <input type="text" class="form-control" id="companyAddress" name="companyAddress" value="${GinDTO.companyAddress}" required>
            </div>

            <div class="mb-3">
                <label for="manufacturerName" class="form-label">Manufacturer Name</label>
                <input type="text" class="form-control" id="manufacturerName" name="manufacturerName" value="${GinDTO.manufacturerName}" required>
            </div>

            <div class="mb-3">
                <label for="manufactureDate" class="form-label">Manufacture Date</label>
                <input type="date" class="form-control" id="manufactureDate" name="manufactureDate" value="${GinDTO.manufactureDate}" required>
            </div>

            <div class="mb-3">
                <label for="alcoholContent" class="form-label">Alcohol Content (%)</label>
                <input type="number" step="0.1" class="form-control" id="alcoholContent" name="alcoholContent" value="${GinDTO.alcoholContent}" required>
            </div>

            <div class="mb-3">
                <label for="ginType" class="form-label">Gin Type</label>
                <input type="text" class="form-control" id="ginType" name="ginType" value="${GinDTO.ginType}" required>
            </div>

            <div class="mb-3">
                <label for="botanicals" class="form-label">Botanicals</label>
                <input type="text" class="form-control" id="botanicals" name="botanicals" value="${GinDTO.botanicals}" required>
            </div>

            <div class="mb-3">
                <label for="volume" class="form-label">Volume (ml)</label>
                <input type="number" step="0.1" class="form-control" id="volume" name="volume" value="${GinDTO.volume}" required>
            </div>

            <div class="mb-3">
                <label for="price" class="form-label">Price</label>
                <input type="number" step="0.01" class="form-control" id="price" name="price" value="${GinDTO.price}" required>
            </div>

            <div class="mb-3">
                <label for="isAged" class="form-label">Is Aged</label>
                <select class="form-select" id="isAged" name="isAged" required>
                    <option value="">Select</option>
                    <option value="true" ${GinDTO.isAged == true ? 'selected' : ''}>Yes</option>
                    <option value="false" ${GinDTO.isAged == false ? 'selected' : ''}>No</option>
                </select>
            </div>

            <div class="mb-3">
                <label for="ageYears" class="form-label">Age Years</label>
                <input type="number" class="form-control" id="ageYears" name="ageYears" value="${GinDTO.ageYears}">
            </div>

            <div class="mb-3">
                <label for="expiryDate" class="form-label">Expiry Date</label>
                <input type="date" class="form-control" id="expiryDate" name="expiryDate" value="${GinDTO.expiryDate}" required>
            </div>

            <button type="submit" class="btn btn-primary">Submit</button>
        </form>
    </div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>