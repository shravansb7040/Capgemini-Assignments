<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ page session="false"%>
 
 
<!DOCTYPE html>
 
<html>
<head>
 
<meta charset="UTF-8">
 
<title><spring:message code="label.title" /></title>
</head>
<body>
 
    <div style="text-align: right;padding:5px;margin:5px 0px;background:#ccc;">
       <a href="${pageContext.request.contextPath}/login1?lang=en">Login (English)</a>
       &nbsp;&nbsp;
       <a href="${pageContext.request.contextPath}/login1?lang=fr">Login (French)</a>
       &nbsp;&nbsp;
       <a href="${pageContext.request.contextPath}/login1?lang=vi">Login (Vietnamese)</a>
    </div>
  
    <form method="post" action="">
        <table>
            <tr>
                <td>
                 <strong>
                <spring:message    code="label.userName" />
                </strong>
                </td>
                <td><input name="userName" /></td>
            </tr>
            <tr>
                <td>
                 <strong>
                <spring:message    code="label.password" />
                </strong>
                </td>
                <td><input name="password" /></td>
            </tr>
            <tr>
                <td colspan="2">
                <spring:message code="label.submit" var="labelSubmit"></spring:message>
                <input type="submit" value="${labelSubmit}" />
                </td>
            </tr>
        </table>
    </form>
</body>
</html>
