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
    <title>订单展示页面</title>

    <script type="text/javascript"
            src="${pageContext.request.contextPath}/js/http_cdn.staticfile.org_jquery_2.0.0_jquery.js"></script>

    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>

    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>

<!-- 订单添加模态框 -->
<div class="modal fade" id="orderAddModal" tabindex="-1" role="dialog"
            aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal"
                        aria-label="Close"><span aria-hidden="true">&times;</span>
                </button>
                <h4 class="modal-title" id="myModalLabel">创建订单</h4>
            </div>
            <div class="modal-body">
                <%--                模态框的body--%>
                <form class="form-horizontal" action="${pageContext.request.contextPath}/addOrder">
                    <div class="form-group">
                        <label for="vin" class="col-sm-2 control-label">车架编号</label>
                        <div class="col-sm-10">
                            <input type="text" required="required" name="vin" class="form-control"
                                   id="vin"
                                   placeholder="务必输入正确的车架编号">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="employeeId" class="col-sm-2 control-label">员工编号</label>
                        <div class="col-sm-10">
                            <input type="text" required="required" name="employeeId" class="form-control"
                                   id="employeeId"
                                   placeholder="务必输入正确的员工编号">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="customerId" class="col-sm-2 control-label">客户编号</label>
                        <div class="col-sm-10">
                            <input type="text" required="required" name="customerId" class="form-control"
                                   id="customerId"
                                   placeholder="务必输入正确的客户编号">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="price" class="col-sm-2 control-label">成交价</label>
                        <div class="col-sm-10">
                            <input type="text" required="required" name="price" class="form-control"
                                   id="price" placeholder="成交价">
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
                <li class="active">
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
        <div class="col-md-2 col-md-offset-10">
            <button class="btn btn-info" type="button" id="order_add_modal_btn">新增一项</button>
        </div>
    </div>
    <div class="row-fluid">
        <div class="span12">
            <table class="table table-striped table-hover">
                <thead>
                <tr>
                    <th>
                        订单编号
                    </th>
                    <th>
                        车架编号
                    </th>
                    <th>
                        员工编号
                    </th>
                    <th>
                        员工姓名
                    </th>
                    <th>
                        顾客编号
                    </th>
                    <th>
                        顾客姓名
                    </th>
                    <th>
                        交易时间
                    </th>
                    <th>
                        成交价
                    </th>
                    <th>
                        操作
                    </th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${orderList}" var="order">
                    <tr>
                        <td>${order.orderId}</td>
                        <td>${order.vin}</td>
                        <td>${order.employeeId}</td>
                        <td>${order.employeeName}</td>
                        <td>${order.customerId}</td>
                        <td>${order.customerName}</td>
                        <td>${order.dealTime}</td>
                        <td>${order.price}</td>
                        <td>
                            <a href="${pageContext.request.contextPath}/editOrder?orderId=${order.orderId}&price=${order.price}">
                                <button class="btn btn-info" type="button">
                                    <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>编辑
                                </button>
                            </a>
                            <a href="${pageContext.request.contextPath}/deleteOrder?orderId=${order.orderId}&vin=${order.vin}">
                                <button class="btn btn-danger" type="button">
                                    <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>删除
                                </button>
                            </a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>

<script type="text/javascript">

    $("#order_add_modal_btn").click(function () {
        $("#orderAddModal").modal({
            backdrop: "static"
        });
    });

</script>

</body>

</html>
