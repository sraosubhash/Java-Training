<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<jsp:useBean id="beanAgentDao" class="com.java.agent.dao.AgentDaoImpl" />
	<c:set var="result" value="${beanAgentDao.deleteAgentDao(param.agentid) }" />
	<jsp:forward page="ShowAgent.jsp" />
	

</body>
</html>