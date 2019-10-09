<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/7/12
  Time: 16:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@include file="common/head.jsp"%>

<div class="right">
    <div class="location">
        <strong>你现在所在的位置是:</strong>
        <span>论文管理页面</span>
    </div>
    <div class="search">
        <form method="get" action="${path}/listPagePaper">
            <span>论文主题：</span>
            <input type="text" name="title" value="${queryTitle}">
            <span>论文类型：</span>
            <select name="type" >
                <option value="0">---请选择---</option>
                <c:forEach var="code" items="${codeList}">
                    <option <c:if test="${code.id == queryType }">selected</c:if>
                            value="${code.id}">${code.codeName}</option>
                </c:forEach>
            </select>
            <input type="submit" value="查&nbsp;&nbsp;询" >
        </form>
        <a href="${path}/jsp/addPaper.jsp">添加论文</a>
    </div>
    <table class="providerTable" cellpadding="0" cellspacing="0">
        <tr class="firstTr">
            <td>论文主题</td>
            <td>作者</td>
            <td>论文类型</td>
            <td>发表时间</td>
            <td>修改时间</td>
            <td>操作</td>
        </tr>
        <c:forEach var="paper" items="${paperListPage}">
            <tr>
                <td>${paper.title}</td>
                <td>${paper.createdBy}</td>
                <td>
                    <c:forEach var="code" items="${codeList}">
                        <c:if test="${paper.type eq code.id}">
                            ${code.codeName}
                        </c:if>
                    </c:forEach>
                </td>
                <td>${paper.creationDate}</td>
                <td>${paper.modifyDate}</td>
                <td>
                    <span><a class="modifyUser" href="${pageContext.request.contextPath}/bindUser?userid=${user.id}&path=usermodify"  ><img src="${pageContext.request.contextPath }/img/xiugai.png" alt="修改" title="修改"/></a></span>
                    <span><a class="deleteUser" href="javascript:;" paperID=${paper.id } ><img src="${pageContext.request.contextPath }/img/schu.png" alt="删除" title="删除"/></a></span>
                </td>
            </tr>
        </c:forEach>
        <tr>
            <td colspan="6">
                共${paperPage.totalPageNum}页
                <c:if test="${paperPage.pageIndex ne 1}">
                    <a href="${path}/listPagePaper?title=${queryTitle}&type=${queryType}">首页</a>
                    <a href="${path}/listPagePaper?title=${queryTitle}&type=${queryType}&pageIndex=${paperPage.pageIndex-1}">上一页</a>
                </c:if>
                ${paperPage.pageIndex}/${paperPage.totalPageNum}
                <c:if test="${paperPage.pageIndex ne paperPage.totalPageNum}">
                    <a href="${path}/listPagePaper?title=${queryTitle}&type=${queryType}&pageIndex=${paperPage.pageIndex+1}">下一页</a>
                    <a href="${path}/listPagePaper?title=${queryTitle}&type=${queryType}&pageIndex=${paperPage.totalPageNum}">尾页</a>
                </c:if>
                &nbsp;&nbsp;&nbsp;
                <form action="${path}/listPagePaper" method="post">
                    <input type="hidden" name="title" value="${queryTitle}">
                    <input type="hidden" name="type" value="${queryType}">
                    跳转至 <input type="text" name="pageIndex" style="width: 35px"> 页
                    <input type="submit" value="跳转">
                </form>
            </td>
        </tr>
    </table>
</div>

<%@include file="common/foot.jsp"%>
