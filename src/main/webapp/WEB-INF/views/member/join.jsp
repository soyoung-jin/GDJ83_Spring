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
			<form method="post" id="form" enctype="multipart /form-data">
				<div class="mb-3">
    	            <label for="id" class="form-label">ID</label>
                    <input id="id" type="text" class="form-control" value="${id}" name="id">
                </div>
                <div class="mb-3">
                     <label for="phone" class="form-label">PHONE</label>
                     <input id="phone" type="phone" class="form-control ch" id="phone" name="phone">
                 </div>

	             <div class="mb-3">
    	             <label for="pw" class="form-label">PASSWORD</label>
                     <input id="pw" type="text" class="form-control ch" name="pw">
                     <div id="password-error"></div>

                 </div>
                 
                 <div class="mb-3">
                    <label for="pw" class="form-label">PASSWORD</label>
                    <input id="pwCheck" type="text" class="form-control ch"  name="pwCheck">
                    <div id="password-eqerror"></div>

                </div>
        
    

                 <div class="mb-3">
	                 <label for="name" class="form-label">NAME</label>
                     <input id="name" type="text" class="form-control ch" id="name" name="name">
                 </div>

                 <div class="mb-3">
                     <label for="ss_num" class="form-label">SOCIAL SECURITY NUMBER</label>
                     <input id="ssNum" type="text" class="form-control ch" id="ss_num" name="ss_num">
                 </div>

                 <div class="mb-3">
                     <label for="email" class="form-label">EMAIL</label>
                     <input id="email" type="text" class="form-control ch" id="email" name="email">
                 </div>
		
				<div class="mb-3">
				    <button id="fileAdd" type="button" class="btn btn-primary">사진파일추가</button>
                </div>
				
				<div id="result">

                </div>
                 
		 		<div class="mb-3">
					<button id="btn" type="button" class="btn btn-primary">회원가입</button>
				</div>
				
			</form>	
		</div>
	
	</div>
	
</div>
<c:import url="/WEB-INF/views/template/footer.jsp"></c:import>
<c:import url="/WEB-INF/views/template/scripts.jsp"></c:import>
<script type="text/javascript" src="/resources/js/commons/files.js"></script>
<script type="text/javascript" src="/resources/js/member/memberJoinCheck.js"></script>

</body>
</html> 