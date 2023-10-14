<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ include file="/header.jsp" %>

<div class="container-fluid">

    <!-- Page Heading -->
    <div class="d-sm-flex align-items-center justify-content-between mb-4">
        <h1 class="h3 mb-0 text-gray-800">Dashboard</h1>
        <a href="#" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm"><i
                class="fas fa-download fa-sm text-white-50"></i> Add user</a>
    </div>

<c:if test = "${userCreated}">
    <div class="alert alert-success">STWORZONO UZYTKOWNIKA</div>

</c:if>


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
                <td>akcja</td>
            </tr>
        </c:forEach>

        </tbody>
    </table>

</div>
<!-- /.container-fluid -->

<%@ include file="/footer.jsp" %>
<!-- End of Footer -->
