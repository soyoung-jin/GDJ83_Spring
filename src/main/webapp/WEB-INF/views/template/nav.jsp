<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- Navigation-->
     <nav class="navbar navbar-expand-lg navbar-light" id="mainNav">
        <div class="container px-4 px-lg-5">
            <a class="navbar-brand" href="/">SoYoung-Bank</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
                Menu
                <i class="fas fa-bars"></i>
            </button>
            <div class="collapse navbar-collapse" id="navbarResponsive">
            	<c:choose>
            		<c:when test="${not empty member}">
            		<ul class="navbar-nav ms-auto py-4 py-lg-0">
	                    <li class="nav-item"><a class="nav-link px-lg-3 py-3 py-lg-4" href="/">Home</a></li>
	                    <li class="nav-item"><a class="nav-link px-lg-3 py-3 py-lg-4" href="/product/list">상품리스트</a></li>
	                    <li class="nav-item"><a class="nav-link px-lg-3 py-3 py-lg-4" href="/member/mypage">마이페이지</a></li>
	                    <li class="nav-item"><a class="nav-link px-lg-3 py-3 py-lg-4" href="/member/logout">로그아웃</a></li>
                	</ul>
            		</c:when>

            		<c:otherwise>

	                <ul class="navbar-nav ms-auto py-4 py-lg-0">
	                    <li class="nav-item"><a class="nav-link px-lg-3 py-3 py-lg-4" href="/">Home</a></li>
	                    <li class="nav-item"><a class="nav-link px-lg-3 py-3 py-lg-4" href="/product/list">상품리스트</a></li>
	                    <li class="nav-item"><a class="nav-link px-lg-3 py-3 py-lg-4" href="/member/join">회원가입</a></li>
	                    <li class="nav-item"><a class="nav-link px-lg-3 py-3 py-lg-4" href="/member/login">로그인</a></li>
	                </ul>
	            	</c:otherwise>
            	</c:choose>
            </div>
        </div>
    </nav>

    <!-- Page Header-->    
	<header class="masthead" style="background-image: url('assets/img/home-bg.jpg')">
	    <div class="container position-relative px-4 px-lg-5">
	        <div class="row gx-4 gx-lg-5 justify-content-center">
	            <div class="col-md-10 col-lg-8 col-xl-7">
	                <div class="site-heading">
	                    <h1>SY-Bank </h1>
	                    <span class="subheading">다양하고 풍성한 혜택으로 고객님께 다가갑니다</span>
	                </div>
	            </div>
	        </div>
	    </div>
	</header>
	
</body>
</html>