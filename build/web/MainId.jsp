<%@ page contentType="text/html;charset=UTF-8" language="jsp" %>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <title>Web-Buddy by Chitkara</title>
        <meta name="description" content="Pushy is an off-canvas navigation menu for your website.">
        <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no">

        <link rel="stylesheet" href="css1/normalize.css">
        <link rel="stylesheet" href="css1/demo.css">
    
        <link rel="stylesheet" href="css1/pushy.css">
        
     
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
    </head>
    <body background="images/bg.jpg">

        <div class="site-header push" align="left"> 
		<button class="menu-btn" ><h2>&#9776; Menu</h2></button>
		 <img src="images/mlogo.png" width="800" height="60" align="center" class="img-chit"></img>
		<img src="images/logoc.png" width="175" height="50" align="right" class="img-chit"></img>
		
        </div>

        <nav class="pushy pushy-left" data-focus="#first-link">
            <div class="pushy-content">
                <ul>
                    <li class="pushy-submenu">
                       
                       
                    </li>
                 
                    <li class="pushy-link"><a href="#"><img src="img1/ppic.png" width="140" height="140"></img>
						<br>
<h3 align="center">Name</h3></a></li>
<hr>
                    <li class="pushy-link"><a href="#">My Questions</a></li>
					<li class="pushy-link"><a href="#">My Answers</a></li>
                   
                </ul>
            </div>
        </nav>

        <!-- Site Overlay -->
        <div class="site-overlay"></div>

     

        <footer class="site-footer push">This is a footer</footer>

        <!-- Pushy JS -->
        <script src="js1/pushy.min.js"></script>

    </body>
</html>
