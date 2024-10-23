<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>공지사항 작성</title>
</head>
<body>
    <h1>공지사항 작성</h1>
    <form action="/notice/write" method="post">
        <label>구분:</label>
        <select name="nCategory">
            <option value="일반">일반</option>
            <option value="오픈소식">오픈소식</option>
            <option value="서비스">서비스</option>
            <option value="당첨자발표">당첨자발표</option>
        </select>
        <br>
        <label>제목:</label>
        <input type="text" name="nTitle">
        <br>
        <label>내용:</label>
        <textarea name="nContent"></textarea>
        <br>
        <button type="submit">저장</button>
    </form>
</body>
</html>
