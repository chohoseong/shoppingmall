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


<!-- Slide Show -->
<section>
    <table>
    
        <tr>
            <th> 문의번호 </th>
            <th> 제목 </th>
            <th> 작성시간 </th>
            <th> ID </th> 
        </tr>
        
        <tr th:each="list : ${title}" >
        
          <td th:text="${list.getQnum()}"></td>
          <td th:text="${list.getTitle()}"></td>
          <td th:text="${list.getTime()}"></td>
          <td th:text="${list.getMemberId()}"></td>
           
        </tr>
        
        
      </table>
      
      
</section>


<th:block th:replace="/footer :: footerFragment" ></th:block>

</body>
</html>


