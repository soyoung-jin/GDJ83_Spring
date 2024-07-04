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
				<div class="mb-3">
    	            <label for="id" class="form-label">ID</label>
                    <input type="text" class="form-control" value="${id}" name="id">
                </div>
                
	             <div class="mb-3">
    	             <label for="pw" class="form-label">PASSWORD</label>
                     <input type="text" class="form-control" id="pw" name="pw">
                 </div>

		 		<div class="mb-3">
					<button class="btn btn-primary">login</button>
				</div>
				
			</form>	
		</div>
	
	</div>
	
</div>



<c:import url="/WEB-INF/views/sample/bootFooter.jsp"></c:import>
</body>
</html>