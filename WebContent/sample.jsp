<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>


<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><s:text
            name="lang.header.header" /></title>



</head>
<body>
 <!-- 未ログイン時ヘッダ -->




        <a href='<s:url action="ItemViewAction"><s:param name="categoryId" value="%{1}"/></s:url>'>a</a>
        <a href='<s:url action="ItemViewAction"><s:param name="categoryId" value="%{'1'}"/></s:url>'>b</a>
        <a href='<s:url action="ItemViewAction"><s:param name="categoryId" value="{1}"/></s:url>'>c</a>



</body>
</html>