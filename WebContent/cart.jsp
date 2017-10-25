<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>cart.jsp</title>
</head>
<body>
		<s:if test="%{cartList.size() > 0 && #session.userId != null}">

	<s:property value="item_name" />
	a
	<s:property value="price" />
	a
	<s:property value="quantities" />
	a
	<s:property value="item_id" />
	a
	<s:property value="userId" />
	</s:if>

	<s:else>
	<h2>カートは空です</h2>
	</s:else>

	item_id
</body>
</html>