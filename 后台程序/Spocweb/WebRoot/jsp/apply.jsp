<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>加入我们</title>
	<!-- Bootstrap core CSS -->
    <link href="../css/bootstrap.min.css" rel="stylesheet">
    <link href="../css/list_style.css" rel="stylesheet">
    <script src="../js/bootstrap.min.js"></script>
    <script type="text/javascript" src="../js/jquery.min.js"></script>
</head>

<body>
<div class="container-fluid bg" style="backgroud-color:#a4bccd;">
<div class="container bg1">
	<center>
            <div class="bg2">
              <form action="apply.do" method="post">
            	<div class="text-center"><img src="../image/1_02.gif"></div>
            	<div class="list_top">姓名</div>
                <div>
                	<textarea name="name" class="underline textarea_style"></textarea>
                </div>
                <div class="list_top">性别</div>
                <div class="list_top1">
                	<input name="sex" value="1" type="radio">
                    <label for="q2_1">男</label>
                    <input name="sex" id="q2_2" value="2" type="radio">
                    <label for="q2_2">女</label>
                </div>
                <div  class="list_top">学院班级</div>
                <div class="list_top1">
                	<select  name="college">
                	  <option value="-1">请选择</option>	
			             <c:forEach items='${colleges }' var="college">
			               <option value="${college.cname}"> ${college.cname} </option>	
			             </c:forEach>                	
                	</select>  
                    <select name="grade" >
                      <option>请选择 </option>
                      <option value="大一">大一</option>
                      <option value="大二"> 大二 </option>
                      <option value="大三"> 大三 </option>
                      <option value="大四"> 大四 </option>
                     </select>  
                    <script class="resources library" src="up_file/area.js" type="text/javascript"></script>
                    <script type="text/javascript">_init_area();</script>
                </div>
                <div class="list_top1">
                	<input type="text" name="major" class="form-control textarea_style" id="inputEmail3" placeholder="班级">
                </div>
                <div class="list_top">手机号</div>
                <div>
                	<textarea name="phone" class="underline textarea_style"></textarea>
                </div>
                 <div class="list_top">申报组别</div>
                <div class="list_top1">
                	<ul class="list-unstyled" id="spoc_gruop">
                	   <c:forEach items='${groups}' var="group">
			              <li>
                        	<input value="${group.gdesc}" name="group" type="radio">
                            <label>${group.gdesc} </label>
                        </li>
			             </c:forEach>          	                       
                    </ul>
                </div>
                <div class="list_top2 text-center">
                	<input type="submit" name="submit"  class="btn btn-danger" style="width:100px;">
                </div>
                </form>
            </div>
      </center>
</div>
</div>
</body>
</html>
