<?xml version="1.0" encoding="UTF-8"?>
<%--
 - OMIS - Offender Management Information System
 - Copyright (C) 2011 - 2017 State of Montana
 -
 - This program is free software: you can redistribute it and/or modify
 - it under the terms of the GNU General Public License as published by
 - the Free Software Foundation, either version 3 of the License, or
 - (at your option) any later version.
 -
 - This program is distributed in the hope that it will be useful,
 - but WITHOUT ANY WARRANTY; without even the implied warranty of
 - MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 - GNU General Public License for more details.
 -
 - You should have received a copy of the GNU General Public License
 - along with this program.  If not, see <http://www.gnu.org/licenses/>.
 --%>

<%--
 - Screen to edit tracked document receival.
 -
 - Author: Yidong Li
 - Version: 0.1.0 (Dec 15, 2017)
 - Since: OMIS 3.0
 -
 --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
	<fmt:setBundle basename="omis.msgs.common" var="commonBundle"/>
	<fmt:setBundle basename="omis.trackeddocument.msgs.trackedDocument" var = "trackedDocument"/>
	<head>
		<title>
			<c:choose>
				<c:when test="${createFlag}">  
					<fmt:message key="trackDocumentLabel" bundle="${trackedDocument}"></fmt:message>
				</c:when>	
				<c:otherwise>
					<fmt:message key="updateTrackDocumentLabel" bundle="${trackedDocument}"></fmt:message>
				</c:otherwise>	
			</c:choose>
			<jsp:include page="/WEB-INF/views/offender/includes/offenderNameSummary.jsp"/>
		</title>
		<jsp:include page="/WEB-INF/views/common/includes/headerOffenderFormResources.jsp"/>
		<jsp:include page="/WEB-INF/views/common/includes/messageResolverResources.jsp"/>
		<jsp:include page="/WEB-INF/views/common/includes/linksResources.jsp"/>
		<jsp:include page="/WEB-INF/views/common/includes/toolsResources.jsp"/>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/supervision/style/links.css"/>
		<script type="text/javascript" src="${pageContext.request.contextPath}/resources/trackeddocument/scripts/trackedDocument.js"></script>
		
		<script type="text/javascript">
  			var itemIndex= ${itemIndex};
  			var createFlag= ${createFlag};
  			var offender = ${offender.id};
  		</script>
	</head>
	<body>
		<c:if test="${not empty offenderSummary}">
			<jsp:include page="/WEB-INF/views/offender/includes/offenderHeader.jsp"/>
		</c:if>
		<h1>
			<a class="actionMenuItem" id="trackedDocumentEditActionMenuLink" href="${pageContext.request.contextPath}/trackedDocument/trackedDocumentEditScreenActionMenu.html?offender=${offenderSummary.id}"></a><span class="visibleLinkLabel"/>
			<c:choose>
				<c:when test="${createFlag}">
					<fmt:message key="trackDocumentLabel" bundle="${trackedDocument}"></fmt:message>
				</c:when>	
				<c:otherwise>
					<fmt:message key="updateTrackDocumentLabel" bundle="${trackedDocument}"></fmt:message>
				</c:otherwise>	
			</c:choose>
		</h1>
		<jsp:include page="/WEB-INF/views/trackedDocument/includes/editForm.jsp"/>
	</body>
</html>