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


	<div class="row justify-content-center">
		<div class ="row col-md-8">
			<table class="table table-striped table-hover">
		
				<thead>
					<tr>
						<th>글 번호</th>
						<th>카테고리</th>
						<th>제목</th> 
						<th>작성자</th> 
						<th>작성일</th>
						<th>조회수</th>
					</tr>
				</thead>
			<tbody>
				<c:forEach items="${list}" var="dto">
					<tr>
						<td>${dto.boardNum}</td>
						<td>${dto.category}</td>
						<td>${dto.boardTitle}</td>
						<td>${dto.boardWriter}</td>
						<td>${dto.createDate}</td>
						<td>${dto.boardhit}</td>
						
					</tr>
			
			</c:forEach>
			</tbody>
			
			</table>
			<div class="row">
			
			
			</div>
		</div>
		</div>


<c:import url="/WEB-INF/views/sample/bootFooter.jsp"></c:import>
</body>
</html>