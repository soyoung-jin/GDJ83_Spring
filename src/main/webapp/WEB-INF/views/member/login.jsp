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



<form>
  <div class="mb-3">
    <label for="id" class="form-label">ID</label>
    <input type="text" class="form-control" id="id" aria-describedby="emailHelp">
    <div id="emailHelp" class="form-text">We'll never share your id with anyone else.</div>
  </div>
  <div class="mb-3">
    <label for="pw" class="form-label">Password</label>
    <input type="password" class="form-control" id="pw">
  </div>
  <div class="mb-3 form-check">
    <input type="checkbox" name= "remember" class="form-check-input" id="exampleCheck1">
    <label class="form-check-label" for="exampleCheck1">ID 기억하기</label>
  </div>
  <button type="submit" class="btn btn-primary">Submit</button>
</form>



<c:import url="/WEB-INF/views/sample/bootFooter.jsp"></c:import>
</body>
</html>