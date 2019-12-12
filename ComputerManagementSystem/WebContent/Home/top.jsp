<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en-US" class="no-js">
<head>
    <meta charset="utf-8">
    <meta name="description" content="">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="keywords" content="responsive, template, portfolio, html, css, javascript, Theme" />
    <meta name="author" content="">
    <!--[if IE]><meta http-equiv='X-UA-Compatible' content='IE=edge,chrome=1'><![endif]-->
    <meta name="viewport" content="width=device-width,initial-scale=1.0,maximum-scale=1" />
    <title>top</title>

    <!--favicon icon-->
    <link rel="icon" href="images/favicon.png">

    <!--google font-->
    <link href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700,900" rel="stylesheet">

    <!-- font awesome css -->
    <link rel="stylesheet" href="css/font-awesome.min.css">

    <!-- iconmind icon css -->
    <link rel="stylesheet" href="css/iconmind-line.css">

    <!--bootstrap min css-->
    <link rel="stylesheet" href="css/bootstrap.min.css">

    <!--owl carousel min css-->
    <link rel="stylesheet" href="css/owl.carousel.min.css">

    <!--nice select css-->
    <link rel="stylesheet" href="css/nice-select.css">

    <!--Padding margin css-->
    <link rel="stylesheet" href="css/padding.margin.css">


    <!-- style css -->
    <link rel="stylesheet" href="css/asset/shortcode-common.css">
    <link rel="stylesheet" href="css/asset/typography.css">
    <link rel="stylesheet" href="css/asset/accordion.css">
    <link rel="stylesheet" href="css/asset/alert.css">
    <link rel="stylesheet" href="css/asset/button.css">
    <link rel="stylesheet" href="css/asset/input.css">
    <link rel="stylesheet" href="css/asset/c2action.css">
    <link rel="stylesheet" href="css/asset/testimonial.css">
    <link rel="stylesheet" href="css/asset/carousel.css">
    <link rel="stylesheet" href="css/asset/client.css">
    <link rel="stylesheet" href="css/asset/color.css">
    <link rel="stylesheet" href="css/asset/faq.css">
    <link rel="stylesheet" href="css/asset/grid-systerm.css">
    <link rel="stylesheet" href="css/asset/pricing.css">
    <link rel="stylesheet" href="css/asset/progressbar.css">
    <link rel="stylesheet" href="css/asset/table.css">
    <link rel="stylesheet" href="css/asset/tab.css">
    <link rel="stylesheet" href="css/asset/team.css">
    <link rel="stylesheet" href="css/asset/testimonial.css">
    <link rel="stylesheet" href="css/asset/navbar.css">

    <!--responsive css-->
    <link rel="stylesheet" href="css/asset/shortcode-responsive.css">

    <link rel="stylesheet" href="style.css">

</head>

<body class="spresentation">
    
	<header class="presentation_header">
        <div class="container-fluid">
            <div class="row">
                <div class="col-sm-2">
                    <a href="#" class="logo"><img src="images/logo.png" alt="logo"></a>
                </div>
            </div>
        </div>
    </header>
	<script type="text/javascript" src="js/jquery-2.1.4.min.js"></script>
    <script type="text/javascript" src="js/modernizr-2.6.2.min.js"></script>

    <!--bootstrap min js-->
    <script type="text/javascript" src="js/bootstrap.min.js"></script>

    <!--owl carousel min js-->
    <script type="text/javascript" src="js/owl.carousel.min.js"></script>

    <!--waypoint js-->
    <script type="text/javascript" src="js/waypoints.min.js"></script>

    <!--nice select js-->
    <script type="text/javascript" src="js/jquery.nice-select.min.js"></script>

    <!-- all jQuary activation code here and always it will be bottom of all script tag -->
    <script type="text/javascript" src="js/main.js"></script>


    <script>
        $(".anchor").on("click", function(event) {
            var target = $($(this).attr("href"));

            if (target.length) {
                event.preventDefault();
                $("html, body").animate({
                    scrollTop: target.offset().top - 90 + 'px'
                }, 1000);
            }
        });

        //----------dropdown menu----------
        $(".presentation_sidebar>ul>li").on("click", function() {
            $(this).children(".dropdown").slideToggle();
            $(this).siblings("li").children(".dropdown").slideUp();

        });
        $(".presentation_sidebar .dropdown li ").on("click", function(e) {
            e.stopPropagation();
        });

        //---------presentation sidebar menu---------
        $(".presentation_sidebar i.fa-angle-left").on("click", function() {
            $(".presentation_sidebar").addClass("off");
            $(this).css("display", "none");
            $(".presentation_sidebar i.fa-angle-right").css("display", "block");

        });
        $(".presentation_sidebar i.fa-angle-right").on("click", function() {
            $(".presentation_sidebar").removeClass("off");
            $(this).css("display", "none");
            $(".presentation_sidebar i.fa-angle-left").css("display", "block");

        });


    </script>
</body>
</html>