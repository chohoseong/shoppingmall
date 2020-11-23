<!DOCTYPE html>

<html>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/3/w3.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.6.3/css/font-awesome.min.css">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <style>
    table {
      border-collapse: collapse;
      border-spacing: 0;
      width: 100%;
      border: 1px solid #ddd;
    }
    
    th, td {
      text-align: left;
      padding: 16px;
    }
    
    tr:nth-child(even) {
      background-color: #f2f2f2;
    }
    </style>
    </head>

<body>
	
	

<!-- Navigation -->
<nav class="w3-bar w3-black">
  <a href="/home" class="w3-button w3-bar-item">Home</a>
  <a href="/partorder" class="w3-button w3-bar-item">PartOrder</a>
  <a href="#tour" class="w3-button w3-bar-item">Board</a>
  <a href="#contact" class="w3-button w3-bar-item">NewPartOrder</a>
  <a href="#contact" class="w3-button w3-bar-item">OrderHistory</a>
  <a href="#contact" class="w3-button w3-bar-item">ShoppingBasket</a>

  <a href="/logout" class="w3-button w3-bar-item" style="float: right;">Logout</a>
</nav>

<section>

			<form  method="post">
               <input type="submit" name="part" value="Frame">
			   <input type="submit" name="part" value="Propeller">
			   <input type="submit" name="part" value="Motor">
			   <input type="submit" name="part" value="Camera">			
			   <input type="submit" name="part" value="Battery">
			   </form>


</section>

<!-- Slide Show -->
<section>
    <table>
    
        <tr>
          <th>Name</th>
          <th>Price</th>
          <th>Horizontal</th>
          <th>Vertical</th>
          <th>Height</th>
          <th>Weight</th>
        </tr>
        
       
        
        <c:forEach items="${title}" var="list" varStatus="status">
        
        <tr>
          <td>${list.getPartName()}</td>
          <td>${list.getPrice()}</td>
          <td>${list.getHorizontal()}</td>
          <td>${list.getVertical()}</td>
          <td>${list.getHeight()}</td>
          <td>${list.getWeight()}</td>  
        </tr>
        
        </c:forEach>
      </table>
      
      
</section>




<!-- Footer -->
<footer class="w3-container w3-padding-64 w3-center w3-black w3-xlarge">
  <a href="#"><i class="fa fa-facebook-official"></i></a>
  <a href="#"><i class="fa fa-pinterest-p"></i></a>
  <a href="#"><i class="fa fa-twitter"></i></a>
  <a href="#"><i class="fa fa-flickr"></i></a>
  <a href="#"><i class="fa fa-linkedin"></i></a>
  <p class="w3-medium">
  Powered by <a href="https://www.w3schools.com/w3css/default.asp" target="_blank">w3.css</a>
  </p>
</footer>

<script>
// Automatic Slideshow - change image every 3 seconds
var myIndex = 0;
carousel();

function carousel() {
  var i;
  var x = document.getElementsByClassName("mySlides");
  for (i = 0; i < x.length; i++) {
     x[i].style.display = "none";
  }
  myIndex++;
  if (myIndex > x.length) {myIndex = 1}
  x[myIndex-1].style.display = "block";
  setTimeout(carousel, 3000);
}
</script>

</body>
</html>


