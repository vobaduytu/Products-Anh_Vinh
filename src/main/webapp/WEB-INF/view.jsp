<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View product</title>
</head>
<body>
<h1>Products details</h1>
<p>
    <a href="/products">Back to products list</a>
</p>
<table>
    <tr>
        <td>Name: </td>
        <td>${requestScope["product"].getName()}</td>
    </tr>
    <tr>
        <td>Prime: </td>
        <td>${requestScope["product"].getPrime()}</td>
    </tr>

</table>
</body>
</html>