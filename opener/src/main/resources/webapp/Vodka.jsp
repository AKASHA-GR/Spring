<html>
    <head>
        <title>Vodka</title>
    </head>
    <body>
        <h1>Vodka</h1>
        <form action="vodka" method="post">
            Company name: <input type="text" name="companyName"><br>

            Company address: <input type="text" name="companyAddress"><br>

            Manufacturer name: <input type="text" name="manufacturerName"><br>

            Manufacture date: <input type="date" name="manufactureDate"><br>

            Alcohol content (%): <input type="number" name="alcoholContent" step="0.1"><br>

            Vodka type: <input type="text" name="vodkaType"><br>

            Botanicals: <input type="text" name="botanicals"><br>

            Volume (ml): <input type="number" name="volume" step="0.1"><br>

            Price: <input type="number" name="price" step="0.01"><br>

            Is aged: <select name="isAged">
                <option value="">Select</option>
                <option value="true">Yes</option>
                <option value="false">No</option>
            </select>
        </form>
        <a href="/opener/index.jsp">Back to Home</a>
    </body>
</html>