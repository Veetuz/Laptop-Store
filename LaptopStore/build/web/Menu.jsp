<%-- 
    Document   : Menu
    Created on : Feb 28, 2022, 6:20:22 PM
    Author     : Veetu
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <div class="container px-4 px-lg-5">
        <a href="home">
            <img src="images/logoshop.png" style="width: 200px; height: auto;padding-left: 100px" href="home">
        </a>

        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation"><span class="navbar-toggler-icon"></span></button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0 ms-lg-4">
                <li class="nav-item"><a class="nav-link active" aria-current="page" href="home">Home</a></li>
                <li class="nav-item"><a class="nav-link" href="#!">About</a></li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" id="navbarDropdown" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">Shop</a>
                    <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                        <li><a class="dropdown-item" href="#!">All Products</a></li>
                        <li><hr class="dropdown-divider" /></li>
                        <li><a class="dropdown-item" href="#!">Popular Items</a></li>
                        <li><a class="dropdown-item" href="#!">New Arrivals</a></li>
                    </ul>
                </li>
            </ul>
            <form action="search" method="post" class="d-flex mx-auto mb-sm-2">
                <input class="form-control me-2" name="txt" type="text" placeholder="Search" aria-label="Search">
                <button class="btn btn-outline-light" type="submit">Search</button>
            </form>
            <form class="d-flex mb-sm-2">
                <li class="nav-item">
                    <c:if test="${sessionScope.acc == null}">
                        <a href="Login.jsp" class="btn btn-outline-light" type="submit">Login</a>
                        <a href="Register.jsp" class="btn btn-outline-light" type="submit">Register</a>
                    </c:if>
                    <c:if test="${sessionScope.acc != null}">
                        <div class="btn-group">
                            <button type="button" class="btn btn-outline-light dropdown-toggle" data-bs-toggle="dropdown" aria-expanded="false">
                                Hello ${sessionScope.acc.user}
                            </button>
                            <ul class="dropdown-menu">
                                <li><a class="dropdown-item" href="#">Setting</a></li>
                                    <c:if test="${sessionScope.acc.isSell == 1}">
                                    <li><a class="dropdown-item" href="manager">Manager Product</a></li>
                                    </c:if>
                                    <c:if test="${sessionScope.acc.isAdmin == 1}">
                                    <li><a class="dropdown-item" href="#">Manager Account</a></li>
                                    </c:if>
                                    <c:if test="${sessionScope.acc.isAdmin == 0 && sessionScope.acc.isSell == 0}">
                                    <li><a class="dropdown-item" href="#">User Profile</a></li>
                                    </c:if>
                                <li><hr class="dropdown-divider"></li>
                                <li><a class="dropdown-item" href="logout">Logout</a></li>
                            </ul>
                        </div>
                    </c:if>

                </li>
            </form>
            <form class="d-flex mb-sm-2 ms-lg-2">
                <a href="print" class="btn btn-outline-light " type="submit">Cart</a>
            </form>
        </div>
    </div>
</nav>
