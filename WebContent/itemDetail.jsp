<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>

<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>

<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link rel="stylesheet" href="./css/index.css" type="text/css">
<link rel="stylesheet" href="./css/itemview.css" type="text/css">

<title>Insert title here</title>
</head>
<body>
<div id="header"></div>
  <div class="main_right">
    <!--　商品１　-->
    <div class="picture">

      <s:iterator value="displayList">
        <div class="main_img">
          <img src="<s:property value="imagePath"/>" height="300"
            width="400" />

        </div>
        </s:iterator>
    </div>
  </div>


<div id="footer"></div>
</body>
</html>