<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>

<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>

<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link rel="stylesheet" href="./css/index.css" type="text/css">
<link rel="stylesheet" href="./css/itemview.css" type="text/css">

<title>itemview.jsp</title>

</head>

<body>
<div class="header">
</div>
  <div class="maintop">
    <div class="title">

      <div class="maintxt"></div>
    </div>
  </div>

  <div class="main_right">


    <!-- 商品1列目 -->
    <!--ここまで共通部分-->
    <s:iterator value="searchList">
      <!--　商品１　-->
      <div class="picture1">


        <div class="price">

          <strong><s:property value="itemName" /></strong>
        </div>
        <!-- price end -->

        <a href="<s:url action="GoItemDetailAction"><s:param name="itemId" value="%{itemId}"/></s:url>">

          <img class="item_img" src="<s:property value="imagePath"/>">
        </a>
        <div class="price2">
          <span><s:hidden value="itemId" /></span><span class="font_en"></span>
        </div>
      </div>
      <!--picture1 end  -->


    </s:iterator>



    <div class="clear"></div>
    <!-- 商品一覧 floatを解除 -->

  </div>
  <!-- main_right end -->


  <div class="clear"></div>

<div class="footer">
</div>
</body>
</html>