<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Vodka Display</title>
    <style>
        table {
            border-collapse: collapse;
            width: 100%;
            margin: 20px 0;
        }
        th, td {
            border: 1px solid #ddd;
            padding: 8px;
            text-align: left;
        }
        th {
            background-color: #f2f2f2;
        }
    </style>
    <script>
        function confirmDelete(id) {
            if (confirm("Are you sure you want to delete this record?")) {
                window.location.href = "/opener/vodka/vodkaDelete?id=" + id;
            }
        }
    </script>
</head>
<body>
    <h1>Vodka Display</h1>
    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>Company Name</th>
                <th>Company Address</th>
                <th>Manufacturer Name</th>
                <th>Manufacture Date</th>
                <th>Alcohol Content</th>
                <th>Vodka Type</th>
                <th>Volume</th>
                <th>Price</th>
                <th>Is Bottled</th>
                <th>Expiry Date</th>
                <th>Actions</th>
                <th>Delete</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="vodkaDTO" items="${vodkaDTOList}">
                <tr>
                    <td>${vodkaDTO.id}</td>
                    <td>${vodkaDTO.companyName}</td>
                    <td>${vodkaDTO.companyAddress}</td>
                    <td>${vodkaDTO.manufacturerName}</td>
                    <td>${vodkaDTO.manufactureDate}</td>
                    <td>${vodkaDTO.alcoholContent}</td>
                    <td>${vodkaDTO.vodkaType}</td>
                    <td>${vodkaDTO.volume}</td>
                    <td>${vodkaDTO.price}</td>
                    <td>${vodkaDTO.isBottled}</td>
                    <td>${vodkaDTO.expiryDate}</td>
                    <td><a href="editVodka?id=${vodkaDTO.id}">Edit</a></td>
                    <td><a href="javascript:void(0)" onclick="confirmDelete(${vodkaDTO.id})">Delete</a></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <c:if test="${empty vodkaDTOList}">
        <p>No vodka records found.</p>
    </c:if>
</body>
</html>