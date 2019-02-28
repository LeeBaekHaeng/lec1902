<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:choose>
	<c:when test="${brdMstrVO.tmplatCours.indexOf('.jsp') != -1}">
		<c:import url="${brdMstrVO.tmplatCours}" />
	</c:when>
	<c:otherwise>
		<c:import
			url="/WEB-INF/jsp/god/com/cop/bbs/${brdMstrVO.tmplatId}/EgovNoticeList.jsp" />
	</c:otherwise>
</c:choose>
