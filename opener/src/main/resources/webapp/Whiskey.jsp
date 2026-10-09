<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Whiskey</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container mt-5">
        <h2 class="mb-4">Whiskey Information</h2>

        <c:if test="${not empty whiskeyMessage}">
            <div class="alert alert-success">
                ${whiskeyMessage}
            </div>
        </c:if>

        <c:if test="${not empty validationErrors}">
            <div class="alert alert-danger">
                <c:forEach items="${validationErrors}" var="error">
                    <p>${error.defaultMessage}</p>
                </c:forEach>
            </div>
        </c:if>

        <form action="whiskey" method="post">
            <div class="mb-3">
                <label for="companyName" class="form-label">Company Name</label>
                <input type="text" class="form-control" id="companyName" name="companyName" value="${whiskeyDTO.companyName}" required>
            </div>

            <div class="mb-3">
                <label for="companyAddress" class="form-label">Company Address</label>
                <input type="text" class="form-control" id="companyAddress" name="companyAddress" value="${whiskeyDTO.companyAddress}" required>
            </div>

            <div class="mb-3">
                <label for="manufacturerName" class="form-label">Manufacturer Name</label>
                <input type="text" class="form-control" id="manufacturerName" name="manufacturerName" value="${whiskeyDTO.manufacturerName}" required>
            </div>

            <div class="mb-3">
                <label for="manufactureDate" class="form-label">Manufacture Date</label>
                <input type="date" class="form-control" id="manufactureDate" name="manufactureDate" value="${whiskeyDTO.manufactureDate}" required>
            </div>

            <div class="mb-3">
                <label for="alcoholContent" class="form-label">Alcohol Content (%)</label>
                <input type="number" step="0.1" class="form-control" id="alcoholContent" name="alcoholContent" value="${whiskeyDTO.alcoholContent}" required>
            </div>

            <div class="mb-3">
                <label for="whiskeyType" class="form-label">Whiskey Type</label>
                <input type="text" class="form-control" id="whiskeyType" name="whiskeyType" value="${whiskeyDTO.whiskeyType}" required>
            </div>

            <div class="mb-3">
                <label for="region" class="form-label">Region</label>
                <input type="text" class="form-control" id="region" name="region" value="${whiskeyDTO.region}" required>
            </div>

            <div class="mb-3">
                <label for="volume" class="form-label">Volume (ml)</label>
                <input type="number" step="0.1" class="form-control" id="volume" name="volume" value="${whiskeyDTO.volume}" required>
            </div>

            <div class="mb-3">
                <label for="price" class="form-label">Price</label>
                <input type="number" step="0.01" class="form-control" id="price" name="price" value="${whiskeyDTO.price}" required>
            </div>

            <div class="mb-3">
                <label for="isAged" class="form-label">Is Aged</label>
                <select class="form-select" id="isAged" name="isAged" required>
                    <option value="">Select</option>
                    <option value="true" ${whiskeyDTO.isAged == true ? 'selected' : ''}>Yes</option>
                    <option value="false" ${whiskeyDTO.isAged == false ? 'selected' : ''}>No</option>
                </select>
            </div>

            <div class="mb-3">
                <label for="ageYears" class="form-label">Age Years</label>
                <input type="number" class="form-control" id="ageYears" name="ageYears" value="${whiskeyDTO.ageYears}">
            </div>

            <div class="mb-3">
                <label for="expiryDate" class="form-label">Expiry Date</label>
                <input type="date" class="form-control" id="expiryDate" name="expiryDate" value="${whiskeyDTO.expiryDate}" required>
            </div>

            <button type="submit" class="btn btn-primary">Submit</button>
        </form>
    </div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>