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
<form class="form-horizontal" action="${pageContext.request.contextPath}/updateCar">
    <div class="form-group">
        <label for="vin" class="col-sm-2 control-label">车架号码</label>
        <div class="col-sm-5">
            <input type="input" class="form-control" name="vin" id="vin"
                   required="required" placeholder="车架号码"
                   readonly value=${car.vin}>
        </div>
    </div>
    <div class="form-group">
        <label for="color" class="col-sm-2 control-label">颜色</label>
        <div class="col-sm-5">
            <input type="input" class="form-control" required="required" name="color" id="color"
                   placeholder="颜色" value=${car.color}>
        </div>
    </div>
    <div class="form-group">
        <label for="displacement" class="col-sm-2 control-label">排量</label>
        <div class="col-sm-5">
            <input type="input" class="form-control" required="required"
                   name="displacement" id="displacement"
                   placeholder="排量" value=${car.displacement}>
        </div>
    </div>
    <div class="form-group">
        <label for="price" class="col-sm-2 control-label">售价</label>
        <div class="col-sm-5">
            <input type="input" class="form-control"
                   required="required" name="price" id="price"
                   placeholder="售价" value=${car.price}>
        </div>
    </div>
    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-1">
            <button type="submit"  class="btn btn-success">确认修改</button>
        </div>
        <div>
            <a href="${pageContext.request.contextPath}/allCar">
                <div class="col-sm-1">
                    <button type="button" class="btn btn-info">返回</button>
                </div>
            </a>
        </div>
    </div>
</form>
</body>

</html>
