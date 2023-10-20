<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ include file="/header.jsp" %>

<div class="container-fluid">

    <!-- Page Heading -->
    <div class="d-sm-flex align-items-center justify-content-between mb-4">
        <h1 class="h3 mb-0 text-gray-800">UsersCRUD</h1>
        <a href='<c:url value="/user/add?id=${user.id}"/>' class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm">
            <i class="fas fa-download fa-sm text-white-50"></i> Add user</a>
    </div>
    <div class="card shadow mb-4">
        <div class="card-header py-3">
            <h6 class="m-0 font-weight-bold text-primary">Lista użykowników</h6>
        </div>
        <div class="card-body">
            <div class="table-responsive">

    <table class="table">
        <thead>
        <tr>
            <th scope="col">id</th>
            <th scope="col">User Name</th>
            <th scope="col">Email</th>
            <th scope="col">Akcja</th>

        </tr>
        </thead>
        <tbody>
        <c:forEach var="user" items="${users}">
            <tr>
                <td>${user.id}</td>
                <td>${user.userName}</td>
                <td>${user.email}</td>
                <td>
                    <a href='<c:url value="/user/delete?id=${user.id}"/>'>Usuń</a>
                    <a href='<c:url value="/user/edit?id=${user.id}"/>'>Edytuj</a>
                    <a href='<c:url value="/user/show?id=${user.id}"/>'>Wyświetl</a>
                </td>
            </tr>
        </c:forEach>

        </tbody>
    </table>

</div>
<!-- /.container-fluid -->

<%@ include file="/footer.jsp" %>
<!-- End of Footer -->
