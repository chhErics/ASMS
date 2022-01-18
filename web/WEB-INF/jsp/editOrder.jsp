<%--
  Created by IntelliJ IDEA.
  User: chhEric
  Date: 2021/11/30
  Time: 22:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>修改车辆页面</title>

    <script type="text/javascript"
            src="${pageContext.request.contextPath}/js/http_cdn.staticfile.org_jquery_2.0.0_jquery.js"></script>

    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>

    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>
<form class="form-horizontal" action="${pageContext.request.contextPath}/updateOrder">
    <div class="form-group">
        <label for="orderId" class="col-sm-2 control-label">订单编号</label>
        <div class="col-sm-5">
            <input type="input" class="form-control" name="orderId" id="orderId"
                   required="required" placeholder="订单编号"
                   readonly value=${orderId}>
        </div>
    </div>
    <div class="form-group">
        <label for="price" class="col-sm-2 control-label">成交价</label>
        <div class="col-sm-5">
            <input type="input" class="form-control"
                   required="required" name="price" id="price"
                   placeholder="成交价" value=${price}>
        </div>
    </div>
    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-1">
            <button type="submit"  class="btn btn-success">确认修改</button>
        </div>
        <div>
            <a href="${pageContext.request.contextPath}/allOrder">
                <div class="col-sm-1">
                    <button type="button" class="btn btn-info">返回</button>
                </div>
            </a>
        </div>
    </div>
</form>
</body>

</html>
