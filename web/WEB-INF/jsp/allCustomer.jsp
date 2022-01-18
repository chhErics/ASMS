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
    <title>客户展示页面</title>

    <script type="text/javascript"
            src="${pageContext.request.contextPath}/js/http_cdn.staticfile.org_jquery_2.0.0_jquery.js"></script>

    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>

    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>

<!-- Modal 管理员添加模态框 -->
<div class="modal fade" id="customerAddModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span>
                </button>
                <h4 class="modal-title" id="myModalLabel">Modal title</h4>
            </div>
            <div class="modal-body">
                <%--                模态框的body--%>
                <form class="form-horizontal" action="${pageContext.request.contextPath}/addCustomer">
                    <div class="form-group">
                        <label for="adminName" class="col-sm-2 control-label">姓名</label>
                        <div class="col-sm-10">
                            <input type="text" required="required" name="name" class="form-control" id="adminName" placeholder="姓名">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="adminUsername" class="col-sm-2 control-label">性别</label>
                        <div class="col-sm-10">
                            <input type="text" required="required" name="gender" class="form-control" id="adminUsername" placeholder="男或女">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="adminAge" class="col-sm-2 control-label">年龄</label>
                        <div class="col-sm-10">
                            <input type="text" required="required" name="age" class="form-control" id="adminAge" placeholder="年龄">
                        </div>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                        <button type="submit" class="btn btn-primary" id="admin_add_save">提交</button>
                    </div>
                </form>
                <%--                模态框的body结束--%>
            </div>

        </div>
    </div>
</div>

<div class="container-fluid">
    <div class="row-fluid">
        <div class="span12">
            <h3 class="text-center">
                ASMS
            </h3>
        </div>
    </div>
    <div class="row-fluid">
        <div class="span12">
            <ul class="nav nav-pills">
                <li>
                    <a href="${pageContext.request.contextPath}/allAdmin">管理员</a>
                </li>
                <li>
                    <a href="${pageContext.request.contextPath}/allModel">车型</a>
                </li>
                <li>
                    <a href="${pageContext.request.contextPath}/allCar">车辆</a>
                </li>
                <li>
                    <a href="${pageContext.request.contextPath}/allOrder">订单</a>
                </li>
                <li class="active">
                    <a href="${pageContext.request.contextPath}/allCustomer">客户</a>
                </li>
                <li>
                    <a href="${pageContext.request.contextPath}/allDepository">仓库</a>
                </li>
                <li>
                    <a href="${pageContext.request.contextPath}/allEmployee">员工</a>
                </li>
            </ul>
        </div>
    </div>
    <div class="row-fluid">
        <div class="col-md-2 col-md-offset-10">
            <button class="btn btn-info" type="button" id="customer_add_modal_btn">新增一项</button>
        </div>
    </div>
    <div class="row-fluid">
        <div class="span12">
            <table class="table table-striped table-hover">
                <thead>
                <tr>
                    <th>
                        客户编号
                    </th>
                    <th>
                        姓名
                    </th>
                    <th>
                        性别
                    </th>
                    <th>
                        年龄
                    </th>
                    <th hidden>
                        操作
                    </th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${customerList}" var="customer">
                    <tr>
                        <td>${customer.customerId}</td>
                        <td>${customer.name}</td>
                        <td>${customer.gender}</td>
                        <td>${customer.age}</td>
                        <td hidden>
                            <button class="btn btn-info" type="button" disabled="disabled">
                                <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>编辑
                            </button>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>

<script type="text/javascript">

    $("#customer_add_modal_btn").click(function () {
        $("#customerAddModal").modal({
            backdrop:"static"
        });
    });

</script>

</body>

</html>
