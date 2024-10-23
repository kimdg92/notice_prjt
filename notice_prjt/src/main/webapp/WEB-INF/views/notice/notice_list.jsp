<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>공지사항 목록</title>
</head>
<body>
    <h1>공지사항 목록</h1>
    <table border="1">
        <tr>
            <th>번호</th>
            <th>구분</th>
            <th>제목</th>
            <th>등록일</th>
        </tr>
        <c:forEach var="notice" items="${noticeList}">
            <tr>
                <td>${notice.nIdx}</td>
                <td>${notice.nCategory}</td>
                <td><a href="/notice/view/${notice.nIdx}">${notice.nTitle}</a></td>
                <td>${notice.nRegdate}</td>
            </tr>
        </c:forEach>
    </table>
    <a href="/notice/write">공지사항 작성</a>
</body>
</html>
