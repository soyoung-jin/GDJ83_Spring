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
<c:import url="/WEB-INF/views//template/header_css.jsp"></c:import>
</head>
<body>
<c:import url="/WEB-INF/views/template/nav.jsp"></c:import>
<div class="container-fluid mt-5">
	<div class="row justify-content-center">
		<div class="col-md-6">
			<form method="post">
				<div class="mb-3">
    	            <label for="id" class="form-label">ID</label>
                    <input type="text" class="form-control" value="${id}" name="id">
                </div>
                <div class="mb-3">
                     <label for="phone" class="form-label">PHONE</label>
                     <input type="phone" class="form-control" id="phone" name="phone">
                 </div>

	             <div class="mb-3">
    	             <label for="pw" class="form-label">PASSWORD</label>
                     <input type="text" class="form-control" id="pw" name="pw">
                 </div>

                 <div class="mb-3">
	                 <label for="name" class="form-label">NAME</label>
                     <input type="text" class="form-control" id="name" name="name">
                 </div>

                 <div class="mb-3">
                     <label for="ss_num" class="form-label">SOCIAL SECURITY NUMBER</label>
                     <input type="text" class="form-control" id="ss_num" name="ss_num">
                 </div>

                 <div class="mb-3">
                     <label for="email" class="form-label">EMAIL</label>
                     <input type="text" class="form-control" id="email" name="email">
                 </div>
                 
		 		<div class="mb-3">
					<button class="btn btn-primary">회원가입</button>
				</div>
				
			</form>	
		</div>
	
	</div>
	
</div>
<c:import url="/WEB-INF/views/template/footer.jsp"></c:import>
<c:import url="/WEB-INF/views/template/scripts.jsp"></c:import>
</body>
</html> 