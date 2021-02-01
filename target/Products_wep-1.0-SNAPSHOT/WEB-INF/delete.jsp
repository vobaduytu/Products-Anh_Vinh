<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Deleting products</title>
</head>
<body>
<h1>Delete products</h1>
<p>
    <a href="${pageContext.request.contextPath}/products">Back to products list</a>
</p>
<form  method="post" >
    <h3>Are you sure?</h3>
    <fieldset>
        <legend>Products information</legend>
        <table>
            <tr>
                <td>Name: </td>
                <td>${requestScope["product"].getName()}</td>
            </tr>
            <tr>
                <td>Prime: </td>
                <td>${requestScope["product"].getPrime()}</td>
            </tr>

            <tr>
                <td><input type="submit" value="Delete products"></td>
                <td><a href="${pageContext.request.contextPath}/products">Back to product list</a></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>