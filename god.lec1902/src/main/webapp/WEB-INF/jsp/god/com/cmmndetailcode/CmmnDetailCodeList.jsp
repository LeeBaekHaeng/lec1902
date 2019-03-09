<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="ui" uri="http://egovframework.gov/ctl/ui"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<form:form commandName="cmmnDetailCodeVO" method="get">

	<form:hidden path="pageIndex" />

	<ol>
		<li>resultCnt=<c:out value="${resultCnt}"></c:out></li>
		<li>paginationInfo=<c:out value="${paginationInfo}"></c:out></li>
	</ol>

	<table>
		<tbody>
			<c:forEach items="${resultList}" var="result">
				<tr>
					<td><c:out value="${result.codeId}"></c:out></td>
					<td><c:out value="${result.code}"></c:out></td>
					<td><c:out value="${result.codeNm}"></c:out></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

	<ui:pagination paginationInfo="${paginationInfo}" type="image"
		jsFunction="fn_selectCmmnDetailCodeList" />

</form:form>

<script>
	function fn_selectCmmnDetailCodeList(pageIndex) {
		document.cmmnDetailCodeVO.pageIndex.value = pageIndex;
		document.cmmnDetailCodeVO.action = "<c:url value="/cmmndetailcode/selectCmmnDetailCodeList.do" />";
		document.cmmnDetailCodeVO.submit();
	}
</script>
