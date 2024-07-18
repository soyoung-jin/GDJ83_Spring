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
<div class="container">
		<div class="row">
			<h1>등록 폼</h1>
		</div>
	
		<div class="row">
			<form action="./add" method="post">
			  <div class="mb-3">
			    <label for="p_code" class="form-label">상품코드</label>
			    <input type="text" class="form-control" id="p_code" name="p_code">
			  </div>
			  
			  <div class="mb-3">
			    <label for="ac_num" class="form-label">계좌번호</label>
			    <input type="text" class="form-control" id="ac_num" name="ac_num">
			  </div>
			  
			  <div class="mb-3">
			    <label for="ac_name" class="form-label">상품이름</label>
			    <input type="text" class="form-control" id="ac_name" name="ac_name">
			  </div>
			  <div class="mb-3">
			    <label for="interest" class="form-label">이자</label>
			    <input type="text" class="form-control" id="interest" name="interest">
			  </div>
			  <div class="mb-3">
			    <label for="script" class="form-label">상품설명</label>
			    <input type="text" class="form-control" id="script" name="script">
			  </div>			  

			  <button type="submit" class="btn btn-outline-primary">등록</button>
			</form>
		</div>
	
	</div>


<c:import url="/WEB-INF/views/template/footer.jsp"></c:import>
<c:import url="/WEB-INF/views/template/scripts.jsp"></c:import>
</body>
</html> 