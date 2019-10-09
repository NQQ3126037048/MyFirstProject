<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/7/14
  Time: 13:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@include file="common/head.jsp"%>

<div class="right">

    <form action="/filePaper" method="post" enctype="multipart/form-data">
        论文题目：<input type="text" name="title">
        类型：
        <select name="type">
            <option value="0">选择</option>
        </select>
        论文摘要：<textarea name="paperSummary" id="" cols="30" rows="10"></textarea>
        论文内容：<input type="file" name="fileName">
        <input type="submit" value="保存">
    </form>
    <h3>${fileStatus}</h3><br/>
    <a href="/downloadFile"><button>下载论文</button></a>
</div>

<%@include file="common/foot.jsp"%>
