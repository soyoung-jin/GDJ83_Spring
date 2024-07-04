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
			<form method="post">
				<input type="hidden" name="p_code" value="${dto.p_code}">
				<div class="mb-3">
					<label for="p_code" class="form-label">상품코드</label>
					<input type="text" name="p_code" value="${dto.p_code}" class="form-control" id="p_code">
				</div>
				<div class="mb-3">
					<label for="ac_num" class="form-label">계좌번호</label>
					<input type="text" name="ac_num" value="${dto.ac_num}" class="form-control" id="ac_num">
				</div>
				<div class="mb-3">
					<label for="ac_name" class="form-label">상품명</label>
					<input type="text" name="ac_name" value="${dto.ac_name}" class="form-control" id="ac_name">
				</div>				
				<div class="mb-3">
					<label for="interest" class="form-label">이자율</label>
				  	<textarea name="interest" class="form-control" id="interest" rows="3">${dto.interest}</textarea>
				</div>
				<div class="mb-3">
					<label for="script" class="form-label">상품설명</label>
				  	<textarea name="script" class="form-control" id="interest" rows="3">${dto.script}</textarea>
				</div>
				
				<div class="mb-3">
					<button class="btn btn-primary">등록</button>
				</div>
				
			</form>	
		</div>
	
	</div>
	
</div>

	
<c:import url="/WEB-INF/views/sample/bootFooter.jsp"></c:import>
</body>
</html>