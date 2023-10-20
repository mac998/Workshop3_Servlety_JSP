<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ include file="/header.jsp" %>

<div class="container-fluid">

    <!-- Page Heading -->
    <div class="d-sm-flex align-items-center justify-content-between mb-4">
        <h1 class="h3 mb-0 text-gray-800">UsersCrud</h1>
        <a href='<c:url value="/user/add?id=${user.id}"/>'
           class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm">
            <i class="fas fa-download fa-sm text-white-50"></i> Add user</a>
    </div>
    <div class="card shadow mb-4">
        <div class="card-header py-3">
            <h6 class="m-0 font-weight-bold text-primary">Dane użykownika</h6>
        </div>
        <div class="card-body">
            <div class="table-responsive">
    <table class="table">
        <tr>
            <th scope="col"><strong>Id: </strong></th><td>${user.id}</td>
        </tr>
        <tr>
            <th scope="col"><strong>User Name: </strong></th><td>${user.userName}</td>
        </tr>
        <tr>
            <th scope="col"><strong>Email: </strong></th><td>${user.email}</td>
        </tr>
    </table>
</div>
<!-- /.container-fluid -->

<%@ include file="/footer.jsp" %>
<!-- End of Footer -->
