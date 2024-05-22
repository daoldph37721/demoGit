<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add</title>
</head>
<body>
<h3>Them khach hang</h3>
<form:form method="post" modelAttribute="kh">
    <p>Họ tên:
        <form:input path="hoten"/>
        <form:errors path="hoten"/>
    </p>
    <p>Dien thoai:
        <form:input path="dienthoai"/>
        <form:errors path="dienthoai"/>
    </p>
    <p>Diem:
        <form:input path="diem"/>
        <form:errors path="diem"/>
    </p>
    <p>Ma hang:
        <form:select path="maHang">
            <form:option value="">---</form:option>
            <form:options items="${dsHang}" itemLabel="ten" itemValue="ma"/>
        </form:select>
        <form:errors path="maHang"/>
    </p>
    <p>Trang thai:
        <form:checkbox path="trangthai"/>
    </p>
    <button>Luu lai</button>
</form:form>
</body>
</html>
