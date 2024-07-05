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
	<h1> 상품상세</h1>
	<div class="row justify-content-center">
		<div class ="row col-md-8">
			<table class="table table-striped table-hover">
		
				<thead>
					<tr>
						<th>상품코드</th>
						<th>계좌번호</th>
						<th>통장상품명</th> 
						<th>이자</th> 
						<th>상품설명</th> 
					</tr>
				</thead>
			<tbody>
					<tr>
						<td>${dto.p_code}</td>
						<td>${dto.ac_num}</td>
						<td>${dto.ac_name}</a></td>
						<td>${dto.interest}</td>
						<td>${dto.script}</td>
						
					</tr>
			
			</tbody>
			
			</table>
			<div class="row">
			
				<div>
					<a href="" class="btn btn-primary">상품 가입</a>
					<a href="./update?p_code=${dto.p_code}" class="btn btn-danger">상품 수정</a>
					<a href="./delete?p_code=${dto.p_code}" class="btn btn-primary">상품 삭제</a>
				
				</div>
			
			
			</div>
		</div>
		</div>

<c:import url="/WEB-INF/views/sample/bootFooter.jsp"></c:import>
</body>
</html>