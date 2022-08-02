<%-- 
    Document   : Home
    Created on : Feb 28, 2022, 10:00:45 AM
    Author     : Veetu
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <title>Laptop Gaming Store</title>
        <!-- FAVICON -->
        <link href="images/logoshop1.png" sizes="180x180" rel="shortcut icon">
        <!-- Bootstrap icons-->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css" rel="stylesheet" />
        <!-- Core theme CSS (includes Bootstrap)-->
        <link href="css/styles.css" rel="stylesheet" />
        <link href="css/style.css" rel="stylesheet" />
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.4.1/css/all.css" >
        <style>
            /* Code By Webdevtrick ( https://webdevtrick.com ) */
            @import url(https://fonts.googleapis.com/css?family=Open+Sans:400,700);
            @import url(https://weloveiconfonts.com/api/?family=entypo);

            [class^="entypo-"]:before {
                font-family: 'entypo', sans-serif;
            }
            body {
                background: #e6e6e6;
            }
            #social-sidebar {
                left: 0;
                position: fixed;
                top: 30%;
            }
            #social-sidebar li:first-child a { border-top-right-radius: 5px; }
            #social-sidebar li:last-child a { border-bottom-right-radius: 5px; }

            #social-sidebar a {
                background: rgba(0, 0, 0, .7);
                color: #fff;
                text-decoration: none;
                display: block;
                height: 50px;
                width: 50px;  
                font-size: 24px;
                line-height: 50px;
                position: relative;
                text-align: center;
                cursor: pointer;
            }
            #social-sidebar a:hover span {
                left: 120%;
                opacity: 1;
            }
            #social-sidebar a span {
                font: 12px "Open Sans", sans-serif;
                text-transform: uppercase;
                border-radius: 3px;
                line-height: 24px;
                left: -100%;
                margin-top: -16px;
                opacity: 0;
                padding: 4px 8px;
                position: absolute;
                transition: opacity .3s, left .4s;
                top: 50%;
                z-index: -1;
            }

            #social-sidebar a span:before {
                content: "";
                display: block;
                height: 8px;
                width: 8px;
                left: -4px;
                margin-top: -4px;
                position: absolute;
                top: 50%;
                transform: rotate(45deg);
            }

            #social-sidebar a[class*="twitter"]:hover,
            #social-sidebar a[class*="twitter"] span,
            #social-sidebar a[class*="twitter"] span:before {background: #00aced;}

            #social-sidebar a[class*="facebook"]:hover,
            #social-sidebar a[class*="facebook"] span,
            #social-sidebar a[class*="facebook"] span:before {background: #3B5998;}

            #social-sidebar a[class*="gplus"]:hover,
            #social-sidebar a[class*="gplus"] span,
            #social-sidebar a[class*="gplus"] span:before {background: #E34429;}

            #social-sidebar a[class*="dribbble"]:hover,
            #social-sidebar a[class*="dribbble"] span,
            #social-sidebar a[class*="dribbble"] span:before {background: #ea4c89;}

            #social-sidebar a[class*="dropbox"]:hover,
            #social-sidebar a[class*="dropbox"] span,
            #social-sidebar a[class*="dropbox"] span:before {background: #8DC5F2;}

            #social-sidebar a[class*="github"]:hover,
            #social-sidebar a[class*="github"] span,
            #social-sidebar a[class*="github"] span:before {background: #9C7A5B;}

            #social-sidebar a[class*="evernote"]:hover,
            #social-sidebar a[class*="evernote"] span,
            #social-sidebar a[class*="evernote"] span:before {background: #6BB130;}
        </style>
    </head>
    <body>
        <!-- Navigation-->
        <jsp:include page="Menu.jsp"></jsp:include>
            <!-- Header-->
            <header>
                <div id="carouselExampleInterval" class="carousel slide" data-bs-ride="carousel">
                    <div class="carousel-inner">
                        <div class="carousel-item active" data-bs-interval="3000">
                            <img src="images/header/header1.png" class="d-block w-100" style="height: 540px">
                        </div>
                        <div class="carousel-item" data-bs-interval="3000">
                            <img src="images/header/header2.png" class="d-block w-100" style="height: 540px">
                        </div>
                        <div class="carousel-item" data-bs-interval="3000">
                            <img src="images/header/header3.png" class="d-block w-100" style="height: 540px">
                        </div>
                    </div>
                    <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleInterval" data-bs-slide="prev">
                        <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                        <span class="visually-hidden">Previous</span>
                    </button>
                    <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleInterval" data-bs-slide="next">
                        <span class="carousel-control-next-icon" aria-hidden="true"></span>
                        <span class="visually-hidden">Next</span>
                    </button>
                </div>
            </header>
            <!-- Section-->
            <section class="py-5">
                <div class="container px-4 px-lg-5 mt-5">
                    <div class="row">
                        <div class="col-md-3 mb-sm-2">
                            <div class="list-group">
                                <a href="#" class="list-group-item list-group-item-dark " aria-current="true" style="background-color: black; color: white">Category</a>
                            <c:forEach items="${listCC}" var="o">
                                <a href="category?cid=${o.cid}" class="list-group-item list-group-item-action">${o.cname}</a>
                            </c:forEach>
                        </div>
                        <div class="card bg-light mb-3">
                            <div class="list-group-item list-group-item-dark" style="background-color: black; color: white">New product</div>
                            <div class="card-body">
                                <img class="img-fluid" src="${p.image}" />
                                <h5 class="card-title" href="detail?pid=${o.id}">${p.name}</h5>
                                <p class="card-text">${p.title}</p>
                                <p class="bloc_left_price">${p.price} $</p>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-9">
                        <div class="row gx-4 gx-lg-5 row-cols-2 row-cols-md-3 justify-content-center">
                            <c:forEach items="${listP}" var="o">
                                <div class="col mb-5">
                                    <div class="card h-100">
                                        <!-- Product image-->
                                        <img class="card-img-top" src="${o.image}" alt="..." />
                                        <!-- Product details-->
                                        <div class="card-body p-4">
                                            <div class="text-center">
                                                <!-- Product name-->
                                                <h5 class="fw-bolder"><a class="text-dark" style="text-decoration: none" href="detail?pid=${o.id}">${o.name}</a></h5>
                                                <!-- Product price-->
                                                ${o.price}$
                                            </div>
                                        </div>
                                        <!-- Product actions-->
                                        <div class="card-footer p-4 pt-0 border-top-0 bg-transparent">
                                            <div class="text-center"><a class="btn btn-outline-dark mt-auto" href="cart?id=${o.id}">Add to cart</a></div>
                                        </div>
                                    </div>
                                </div>
                            </c:forEach>
                        </div>
                    </div>
                </div> 
            </div>

        </section>
        <!-- Footer-->
        <jsp:include page="Footer.jsp"></jsp:include>
        <!-- Bootstrap core JS-->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
        <!-- Core theme JS-->
        <script src="js/scripts.js"></script>
    </body>
</html>
