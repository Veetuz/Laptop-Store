<%-- 
    Document   : Detail
    Created on : Mar 4, 2022, 7:23:08 PM
    Author     : Veetu
--%>

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
    </head>
    <body>
        <!-- Navigation-->
        <jsp:include page="Menu.jsp"></jsp:include>
            <section class="py-5">
                <div class="container px-4 px-lg-5 my-5">
                    <div class="row gx-4 gx-lg-5 align-items-center">
                        <div class="col-md-6"><img class="card-img-top mb-5 mb-md-0" src="${detail.image}" alt="..." /></div>
                        <div class="col-md-6">
                            <h2 class="display-5 fw-bolder">${detail.name}</h2>
                            <h7 class="display-15">${detail.title}</h7>
                            <div class="fs-5 mb-5">
                                <span class="text-decoration-line-through">${detail.price + 350 }$</span>
                                <span>${detail.price}$</span>
                            </div>
                            <p class="lead">${detail.description}</p>
                            <div class="d-flex">
                                <input class="form-control text-center me-3" id="inputQuantity" type="num" value="1" style="max-width: 3rem" />
                                <a class="btn btn-outline-dark mt-auto" href="cart?id=${o.id}">Add to cart</a>
                            </div>
                        </div>
                    </div>
                </div>
            </section>                       
            <!--============================
            =            Footer            =
            =============================-->


        <jsp:include page="Footer.jsp"></jsp:include>

        <!-- JAVASCRIPTS -->
        <script src="plugins/jQuery/jquery.min.js"></script>
        <script src="plugins/bootstrap/js/popper.min.js"></script>
        <script src="plugins/bootstrap/js/bootstrap.min.js"></script>
        <script src="plugins/bootstrap/js/bootstrap-slider.js"></script>
        <!-- tether js -->
        <script src="plugins/tether/js/tether.min.js"></script>
        <script src="plugins/raty/jquery.raty-fa.js"></script>
        <script src="plugins/slick-carousel/slick/slick.min.js"></script>
        <script src="plugins/jquery-nice-select/js/jquery.nice-select.min.js"></script>
        <script src="plugins/fancybox/jquery.fancybox.pack.js"></script>
        <script src="plugins/smoothscroll/SmoothScroll.min.js"></script>
        <!-- google map -->
        <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCcABaamniA6OL5YvYSpB3pFMNrXwXnLwU&libraries=places"></script>
        <script src="plugins/google-map/gmap.js"></script>
        <script src="js/script.js"></script>

    </body>

</html>

