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
    <title>车辆展示页面</title>

    <script type="text/javascript"
            src="${pageContext.request.contextPath}/js/http_cdn.staticfile.org_jquery_2.0.0_jquery.js"></script>

    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>

    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>

<!-- Modal 车辆添加模态框 -->
<div class="modal fade" id="carAddModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span>
                </button>
                <h4 class="modal-title" id="myModalLabel">新增车辆</h4>
            </div>
            <div class="modal-body">
                <%--                模态框的body--%>
                <form class="form-horizontal" action="${pageContext.request.contextPath}/addCar">
                    <div class="form-group">
                        <label for="vin" class="col-sm-2 control-label">车架编号</label>
                        <div class="col-sm-10">
                            <input type="text" required="required" name="vin" class="form-control" id="vin"
                                   placeholder="车架编号">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="en" class="col-sm-2 control-label">发动机编号</label>
                        <div class="col-sm-10">
                            <input type="text" required="required" name="en" class="form-control" id="en"
                                   placeholder="发动机编号">
                        </div>
                    </div>
                    <%--                    型号下拉列表开始--%>
                    <div class="form-group">
                        <label for="model" class="col-sm-2 control-label">型号</label>
                        <div class="col-sm-10" id="model">
                            <select class="form-control" name="model">
                                <c:forEach items="${modelList}" var="model">
                                    <option>${model.model}</option>
                                </c:forEach>
                            </select>
                        </div>
                    </div>
                    <%--                    型号下拉列表结束--%>
                    <div class="form-group">
                        <label for="color" class="col-sm-2 control-label">颜色</label>
                        <div class="col-sm-10">
                            <input type="text" required="required" name="color" class="form-control" id="color"
                                   placeholder="颜色">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="displacement" class="col-sm-2 control-label">排量</label>
                        <div class="col-sm-10">
                            <input type="text" required="required" name="displacement" class="form-control"
                                   id="displacement" placeholder="排量">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="price" class="col-sm-2 control-label">售价</label>
                        <div class="col-sm-10">
                            <input type="text" required="required" name="price" class="form-control" id="price"
                                   placeholder="售价">
                        </div>
                    </div>
                    <%--                    仓库下拉列表开始--%>
                    <div class="form-group">
                        <label for="deNo" class="col-sm-2 control-label">仓库编号</label>
                        <div class="col-sm-10" id="deNo">
                            <select class="form-control" name="deNo">
                                <c:forEach items="${depositoryList}" var="depository">
                                    <option>${depository.deNo}</option>
                                </c:forEach>
                            </select>
                        </div>
                    </div>
                    <%--                    仓库下拉列表结束--%>
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
                <li class="active">
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
        <div class="col-md-2 col-md-offset-10">
            <button class="btn btn-info" type="button" id="car_add_modal_btn">新增一项</button>
        </div>
    </div>
    <div class="row-fluid">
        <div class="span12">
            <table class="table table-striped table-hover">
                <thead>
                <tr>
                    <th>
                        车架编号
                    </th>
                    <th>
                        发动机编号
                    </th>
                    <th>
                        型号
                    </th>
                    <th>
                        型号名字
                    </th>
                    <th>
                        颜色
                    </th>
                    <th>
                        是否卖出
                    </th>
                    <th>
                        排量
                    </th>
                    <th>
                        售价
                    </th>
                    <th>
                        仓库编号
                    </th>
                    <th>
                        仓库地址
                    </th>
                    <th>
                        仓库名字
                    </th>
                    <th>
                        操作
                    </th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${carList}" var="car">
                    <tr>
                        <td>${car.vin}</td>
                        <td>${car.en}</td>
                        <td>${car.model.model}</td>
                        <td>${car.model.name}</td>
                        <td>${car.color}</td>
                        <c:if test="${car.isSell==1}">
                            <td>已售出</td>
                        </c:if>
                        <c:if test="${car.isSell==0}">
                            <td>未售出</td>
                        </c:if>
                        <td>${car.displacement}</td>
                        <td>${car.price}</td>
                        <td>${car.depository.deNo}</td>
                        <td>${car.depository.address}</td>
                        <td>${car.depository.name}</td>
                        <td>
                            <a href="${pageContext.request.contextPath}/editCar?vin=${car.vin}">
                                <button class="btn btn-info" type="button">
                                    <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>编辑
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

    $("#car_add_modal_btn").click(function () {
        $("#carAddModal").modal({
            backdrop: "static"
        });
    });

</script>

</body>

</html>
