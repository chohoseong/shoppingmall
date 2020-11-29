<!DOCTYPE html>

<html xmlns:th="http://www.thymeleaf.org">
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/3/w3.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.6.3/css/font-awesome.min.css">
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
	
<th:block th:replace="/header :: headerFragment" ></th:block>

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
            <th th:each="list : ${att}" th:text="${list.getName()}"></th> 
        </tr>
        
        <tr th:each="list : ${title}" >
          <td th:each="ll : ${method}" th:text="${ll.invoke(list)}">
          
          <!--  <td th:text="${list.getPartName()}"></td>
          <td th:text="${list.getPrice()}"></td>
          <td th:text="${list.getHorizontal()}"></td>
          <td th:text="${list.getVertical()}"></td>
          <td th:text="${list.getHeight()}"></td>
          <td th:text="${list.getWeight()}"></td>-->  
          
        </tr>
        
        
      </table>
      
      
</section>


<th:block th:replace="/footer :: footerFragment" ></th:block>

</body>
</html>


