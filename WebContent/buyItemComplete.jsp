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
  <title>BuyItemComplate画面</title>
  <link rel="stylesheet" href="./css/index.css" type="text/css">

</head>
<body>
<s:include value="header.jsp" />
  <div class="main">
    <div class="top">
      <p>BuyItemComplete</p>
    </div>
    <div>
      <p>購入手続きが完了致しました。</p>
      <div>

        <p>Homeへ戻る場合は<a href='<s:url action="GoHomeAction" />'>こちら</a></p>
        <p>
						マイぺージは<a href='<s:url action="MyPageAction" />'>こちら</a>
					</p>
      </div>
    </div>
  </div>
   <s:include value="footer.jsp" />

</body>
</html>

