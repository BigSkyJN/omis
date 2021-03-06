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
 - Author: Josh Divine
 - Author: Annie Wahl
 - Date: Jan 30, 2019
 - Since: OMIS 3.0
 --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<fmt:setBundle basename="omis.msgs.common" var="commonBundle" />
<fmt:bundle basename="omis.paroleeligibility.msgs.paroleEligibility">
<ul>
	<sec:authorize access="hasRole('PAROLE_ELIGIBILITY_VIEW') or hasRole('ADMIN')">
		<c:if test="${not empty eligibility}">
			<li>
				<a class="viewEditLink" href="${pageContext.request.contextPath}/paroleEligibility/edit.html?eligibility=${eligibility.id}"><span class="visibleLinkLabel"><fmt:message key="viewParoleEligibilityEditLink"/></span></a>
			</li>
		</c:if>
	</sec:authorize>
	<sec:authorize access="hasRole('PAROLE_ELIGIBILITY_LIST') or hasRole ('ADMIN')">
			<c:if test="${not empty eligibility}">
				<li>
			<a href="${pageContext.request.contextPath}/paroleEligibility/paroleEligibilityDetailsReport.html?eligibility=${eligibility.id}&reportFormat=PDF" class="newTab printLink"><fmt:message key="paroleEligibilityDetailsReportLinkLabel"/></a>
				</li>
			</c:if>	
	</sec:authorize>
</ul>
</fmt:bundle>