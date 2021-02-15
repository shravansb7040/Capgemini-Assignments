<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="silogic.html" method="POST">     
<table><tbody>
<tr>        <td><form:label path="p">P :</form:label></td>      <td><form:input path="p"></form:input></td>    </tr>
<tr>      <td><form:label path="r">R:</form:label></td>       <td><form:input path="r"></form:input></td>    </tr>
<tr>       <td><form:label path="t">T:</form:label></td>       <td><form:input path="t"></form:input></td>     </tr>

<tr>         <td colspan="2"><input type="submit" value="Submit"/> </td>       </tr>
</tbody></table>
</form:form>


</body>
</html>
