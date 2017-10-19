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
<meta charset="utf-8">
<title></title>
<link rel="stylesheet" href="./css/index.css" type="text/css">



</head>
<body>
  <s:include value="header.jsp" />
  <div class="haikei">
    <div class="main">
      <div class="top"></div>
      <div class="chosei">
        <div class="chosei2">
          <s:form action="LoginAction">
            <s:textfield name="loginUserId" />
            <s:password name="loginPassword" />
            <s:submit value="ログイン" />
          </s:form>
          <br />
          <div class="text-link">
            <p>
              新規ユーザー登録は<a href='<s:url action="UserCreateAction" />'>こちら</a>
            </p>
            <p>
              Homeへ戻る場合は<a href='<s:url action="GoHomeAction" />'>こちら</a>
            </p>
          </div>
        </div>
      </div>
    </div>
  </div>
  <s:include value="footer.jsp" />
</body>
</html>