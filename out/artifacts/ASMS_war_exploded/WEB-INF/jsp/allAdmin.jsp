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
    <title>管理员展示页面</title>

    <script type="text/javascript"
            src="${pageContext.request.contextPath}/js/http_cdn.staticfile.org_jquery_2.0.0_jquery.js"></script>

    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>

    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>

<!-- Modal 管理员添加模态框 -->
<div class="modal fade" id="adminAddModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span>
                </button>
                <h4 class="modal-title" id="myModalLabel">Modal title</h4>
            </div>
            <div class="modal-body">
<%--                模态框的body--%>
                <form class="form-horizontal" action="${pageContext.request.contextPath}/addAdmin">
                    <div class="form-group">
                        <label for="adminName" class="col-sm-2 control-label">姓名</label>
                        <div class="col-sm-10">
                            <input type="text" required="required" name="name" class="form-control" id="adminName" placeholder="姓名">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="adminUsername" class="col-sm-2 control-label">用户名</label>
                        <div class="col-sm-10">
                            <input type="text" required="required" name="username" class="form-control" id="adminUsername" placeholder="用户名不可重复">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="adminPassword" class="col-sm-2 control-label">密码</label>
                        <div class="col-sm-10">
                            <input type="text" required="required" name="password" class="form-control" id="adminPassword" placeholder="密码">
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
                ASMS(当前账号[${username}])
            </h3>
        </div>
    </div>
    <div class="row-fluid">
        <div class="span12">
            <ul class="nav nav-pills">
                <li class="active">
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
                <li>
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
        <div class="col-md-2 col-md-offset-10" >
            <c:if test="${username eq 'root'}">
                <button class="btn btn-info" type="button" id="admin_add_modal_btn">新增一项</button>
            </c:if>
        </div>
    </div>
    <div class="row-fluid">
        <div class="span12">
            <table class="table table-striped table-hover">
                <thead>
                <tr>
                    <th>
                        编号
                    </th>
                    <th>
                        姓名
                    </th>
                    <th>
                        账号
                    </th>
                    <th>
                        密码
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
                <c:if test="${username eq 'root'}">
                    <c:forEach items="${adminList}" var="admin">
                        <tr>
                            <td>${admin.id}</td>
                            <td>${admin.name}</td>
                            <td>${admin.username}</td>
                            <td>${admin.password}</td>
                            <td>${admin.age}</td>
                            <td hidden="hidden">
                                <button class="btn btn-info" type="button" disabled="disabled">
                                    <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>编辑
                                </button>
                            </td>
                        </tr>
                    </c:forEach>
                </c:if>
                </tbody>
            </table>
        </div>
    </div>
</div>

<script type="text/javascript">

    $("#admin_add_modal_btn").click(function () {
        $("#adminAddModal").modal({
            backdrop:"static"
        });
    });

</script>
</body>
</html>
