<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>

<!-- 国際化 -->
<%@ taglib prefix="s" uri="/struts-tags"%>



<!DOCTYPE html>

<html>
<head>
<!-- 国際化 -->


<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link rel="stylesheet" href="./css/index.css" type="text/css">
<title>itemview.jsp</title>




</head>

<body>


 <div class="maintop">
    <div class="title">

            <div class="maintxt">

</div><!-- maintxt end-->





          <div class="img_left">
<img src="img/interior11.png" width="150px" height="170px">
</div><!-- img_left end-->

          <div class="img_center">
<img src="img/interior14.png" width="700px" height="130px">
</div><!-- img_left end-->



<div class="img_right">
<img src="img/interior10.png" width="150px" height="170px">
</div><!-- img_left end-->


</div><!-- title end -->







   </div><!-- main_left end -->






    <!-- 画面中央・右側　インテリア商品３つ -->
    <div class="main_right">
 <s:property value="imagePath[1]"/>

        <!-- 商品1列目 -->
  <!--ここまで共通部分-->
 <s:iterator value="searchList">
            <!--　商品１　-->
            <div class="picture1">


                     <div class="price">

                         <strong><s:property value="itemName" /></strong>
                         </div><!-- price end -->

  <a href="<s:url action="GoItemDetailAction"><s:param name="itemId" value="%{itemId}"/></s:url>">

                        <img class="item_img" src="<s:property value="imagePath[0]"/>">
                         </a>
                        <div class="price2">
                        <span><s:hidden value="itemId" /></span><span class="font_en"><s:text name="lang.itemview.doru" /></span><strong><s:text name="lang.itemview.price" /></strong>
            </div>
            </div><!--picture1 end  -->


</s:iterator>



               <div class="clear">
               </div><!-- 商品一覧 floatを解除 -->








   </div><!-- main_right end -->


    <div class="clear"></div>











</body>
</html>