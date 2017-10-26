<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
  <meta http-equiv="Content-Style-Type" content="text/css" />
  <meta http-equiv="Content-Script-Type" content="text/javascript" />
  <meta http-equiv="imagetoolbar" content="no" />
  <meta name="description" content="" />
  <meta name="keywords" content="" />
  <title>Home画面</title>
  <link rel="stylesheet" href="./css/index.css" type="text/css">

</head>
<body>
  <div class="header">
    <div class="pr">
    </div>
  </div>
  <div class="main">
    <div class="top">
      <p>Home</p>
    </div>
<a href='<s:url action="ItemViewAction"><s:param name="categoryId" value="%{1}"/></s:url>'>商品一覧</a>
    <div class="text-center">

      <s:if test="#session.userId != null">
        <p>ログアウトする場合は<a href='<s:url action="LogoutAction" />'>こちら</a></p>
      </s:if>
    </div>
  </div>
  <div class="footer">
    <div class="pr">
    </div>
  </div>
</body>
</html>