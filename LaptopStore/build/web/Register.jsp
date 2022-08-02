<%-- 
    Document   : login
    Created on : Feb 21, 2022, 11:08:01 PM
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
            <section class="login py-5 border-top-1">
                <div class="container">
                    <div class="row justify-content-center">
                        <div class="col-lg-5 col-md-8 align-item-center">
                            <div class="border border">
                                <h3 class="bg-gray p-4">Register Now</h3>
                                <div class="text-danger" role="alert" style="margin-left: 20px; margin-right: 20px; font-size: 20px">${messs}</div>
                                <div class="text-danger" role="alert" style="margin-left: 20px; margin-right: 20px; font-size: 20px">${exist}</div>
                            <form action="register" method="post">
                                <fieldset class="p-4">
                                    <input name="user" type="text" placeholder="Username*" class="border p-3 w-100 my-2">
                                    <input name="pass" type="password" placeholder="Password*" class="border p-3 w-100 my-2">
                                    <input name="repass" type="password" placeholder="Confirm Password*" class="border p-3 w-100 my-2">
                                    <div class="loggedin-forgot d-inline-flex my-3">
                                        <input type="checkbox" id="registering" class="mt-1">
                                        <label for="registering" class="px-2">By registering, you accept our <a class="text-dark font-weight-bold" href="terms-condition.html">Terms & Conditions</a></label>
                                    </div>
                                    <button type="submit" class="d-block py-3 px-4 bg-dark text-white border-0 rounded font-weight-bold">Register Now</button>
                                </fieldset>
                            </form>
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
