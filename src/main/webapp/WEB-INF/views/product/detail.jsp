<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
<meta name="description" content="" />
<meta name="author" content="" />
<title>Insert title here</title>
<c:import url="/WEB-INF/views/template/header_css.jsp"></c:import>
</head>
<body>
<c:import url="/WEB-INF/views/template/nav.jsp"></c:import>
	<div class="row justify-content-center">
		<div class ="row col-md-8">
			<div class="card" style="width: 18rem;">
			  <img src="/resources/images/index/first.jpg" class="card-img-top" alt="...">
			  <div class="card-body">
			    <h5 class="card-title">상품 : ${dto.ac_name}</h5>
			    <p class="card-text">${dto.script}</p>
			  </div>
			  <ul class="list-group list-group-flush">
			    <li class="list-group-item">번호 : ${dto.p_code}</li>
			    <li class="list-group-item">계좌번호 : ${dto.ac_num}</li>
			    <li class="list-group-item">이자율 : ${dto.interest}</li>
			  </ul>
		

			<div class="row">
			
				<div>
					<a href="../account/add?p_code=${dto.p_code}" class="btn btn-primary">상품 가입</a>
					<a href="./update?p_code=${dto.p_code}" class="btn btn-primary">상품 수정</a>
					<a href="./delete?p_code=${dto.p_code}" class="btn btn-danger">상품 삭제</a>
				
				</div>
		
			
			</div>
		</div>
		</div>
	</div>
<c:import url="/WEB-INF/views/template/footer.jsp"></c:import>
<c:import url="/WEB-INF/views/template/scripts.jsp"></c:import>
</body>
</html> 