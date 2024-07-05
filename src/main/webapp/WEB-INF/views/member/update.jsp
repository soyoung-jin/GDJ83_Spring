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
			<form action="./update" method="post">
				<input type="hidden" name="id" value="${id}">
				<div class="mb-3">
    	            <label for="id " class="form-label">ID</label>
                    <input type="text" class="form-control" value="${member.id}" name="id" readonly/>
                </div>
                <div class="mb-3">
                     <label for="phone" class="form-label">PHONE</label>
                     <input type="phone" class="form-control" value="${member.phone}" id="phone" name="phone">
                 </div>

	             <div class="mb-3">
    	             <label for="pw" class="form-label">PASSWORD</label>
                     <input type="text" class="form-control" value="${member.pw}" id="pw" name="pw">
                 </div>

                 <div class="mb-3">
	                 <label for="name" class="form-label">NAME</label>
                     <input type="text" class="form-control" value="${member.name}" id="name" name="name">
                 </div>

                 <div class="mb-3">
                     <label for="ss_num" class="form-label">SOCIAL SECURITY NUMBER</label>
                     <input type="text" class="form-control" value="${member.ss_num}" id="ss_num" name="ss_num">
                 </div>

                 <div class="mb-3">
                     <label for="email" class="form-label">EMAIL</label>
                     <input type="text" class="form-control" value="${member.email}" id="email" name="email">
                 </div>
                 <div>
			<button class="btn btn-primary">수정</button>
		
		
		</div>
                 
	
				
			</form>	
		</div>
	
	</div>
	
</div>

	
<c:import url="/WEB-INF/views/sample/bootFooter.jsp"></c:import>
</body>
</html>