<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="/WEB-INF/views/template/header_css.jsp"></c:import>
</head>
<body>
<c:import url="/WEB-INF/views/template/nav.jsp"></c:import>
	<div class="row justify-content-center">
		<div class ="row col-md-8">
			<hr class="my-4" />
			<ul class="list-group">
			  <li class="list-group-item active" aria-current="true">초특급 예금상품</li>
			  <li class="list-group-item">인생역전 예금 상품</li>
			  <li class="list-group-item">투자 목적 상품</li>
			  <li class="list-group-item">5년 내내 무이자 상품 </li>
			  <li class="list-group-item">이벤트</li>
			</ul>
		<hr class="my-4" />

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
				<c:forEach items="${list}" var="dto">
					<tr>
						<td>${dto.p_code}</td>
						<td>${dto.ac_num}</td>
						<td><a class= "bg-warning" href="./detail?p_code=${dto.p_code}">${dto.ac_name}</a></td>
						<td>${dto.interest}</td>
						<td>${dto.script}</td>
					</tr>
			
			</c:forEach>
			</tbody>

			
			</table>
			<div class="d-flex justify-content-end mb-4">
				<a class="btn btn-outline-primary text-uppercase" href="./add">상품등록</a>
			</div>

		</div>
<c:import url="/WEB-INF/views/template/footer.jsp"></c:import>
<c:import url="/WEB-INF/views/template/scripts.jsp"></c:import>

</body>
</html>