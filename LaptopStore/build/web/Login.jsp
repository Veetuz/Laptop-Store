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
                            <div class="border">
                                <h3 class="bg-gray p-4">Login Now</h3>
                                <div class="text-danger" role="alert" style="margin-left: 20px; margin-right: 20px; font-size: 20px">${mess}</div>
                                <form action="login" method="post">
                                <fieldset class="p-4">
                                    <input type="text" name="user" placeholder="Username" class="border p-3 w-100 my-2">
                                    <input type="password" name="pass"  placeholder="Password" class="border p-3 w-100 my-2">
                                    <div class="loggedin-forgot">
                                        <input type="checkbox" id="keep-me-logged-in">
                                        <label for="keep-me-logged-in" class="pt-3 pb-2">Remember</label>
                                    </div>
                                    <button type="submit" class="d-block py-3 px-5 bg-dark text-white border-0 rounded font-weight-bold mt-3">Log in</button>
                                    <a class="mt-3 d-block  text-dark" href="#">Forget Password?</a>
                                    <a class="mt-3 d-inline-block text-dark" href="Register.jsp">Register Now</a>
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
