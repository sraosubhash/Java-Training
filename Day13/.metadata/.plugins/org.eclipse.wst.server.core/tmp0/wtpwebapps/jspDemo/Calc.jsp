<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form method="get" action="Calc.jsp">
	
		<center>
		
			First Number :
			<input type="number" name="firstNo"><br><br>
			Second Number :
			<input type="number" name="secondNo"><br><br>
			<input type="submit" value="Calculate">
		
		</center>
	
	</form>
	
	<%
		int firstNo, secondNo, result;
		if (request.getParameter("firstNo")!=null && request.getParameter("secondNo")!=null){
			firstNo = Integer.parseInt(request.getParameter("firstNo"));
			secondNo = Integer.parseInt(request.getParameter("secondNo"));
			result = firstNo + secondNo;
			out.println("Sum is : <b>"+result+"</b><br>" );
			result = firstNo - secondNo;
			out.println("Sub is : <b>"+result+"</b><br>" );
			result = firstNo * secondNo;
			out.println("Mul is : <b>"+result+"</b><br>" );
		}
	%>

</body>
</html>