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
<div class="header"></div>
<div class="main">
  <div class="main_right">
    <!--　商品１　-->
    <div class="picture">

      <s:iterator value="displayList">
        <div class="main_img">
          <img src="<s:property value="imagePath"/>" height="300"
            width="400" />
        </div>
        <div class="item_name">
            <s:property value="itemName" />
          </div>
          <div class="item_price">
            <s:property value="price"/>
          </div>
          <s:form action="GoCartAction">
<input class="btn" type="submit" value="カートに入れる"/>
<select name="quantities" size="1">
                    <option value="1">1</option>
                    <option value="2">2</option>
                    <option value="3">3</option>
                    <option value="4">4</option>
                    <option value="5">5</option>
                    <option value="6">6</option>
                    <option value="7">7</option>
                    <option value="8">8</option>
                    <option value="9">9</option>
                  </select>
          </s:form>
        </s:iterator>
    </div>
  </div>
</div>

<div class="footer"></div>
</body>
</html>