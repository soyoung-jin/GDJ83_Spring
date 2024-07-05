<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="/WEB-INF/views/sample/bootHeader.jsp"></c:import>
</head>
<body>
<c:import url="/WEB-INF/views/sample/header.jsp"></c:import>

<div class="container-fluid mt-5">
	<div class="row justify-content-center">
		<div class="col-md-6">
			<h1>${member.id}</h1>
			<h1>${member.phone}</h1>
			<h1>${member.pw}</h1>
			<h1>${member.name}</h1>
			<h1>${member.ss_num}</h1>
			<h1>${member.email}</h1>
		</div>
		<div>
			<a href="./update" class="btn btn-primary">회원수정</a>
			<form action="./delete" method="post">
				<div>
				<button class= "btn btn-danger">회원탈퇴</button>
		
				</div>
			</form>
	
		
		
		</div>
	</div>
</div>



<c:import url="/WEB-INF/views/sample/bootFooter.jsp"></c:import>
</body>
</html>