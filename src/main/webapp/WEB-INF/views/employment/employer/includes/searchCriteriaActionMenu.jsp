<!-- 
 - Author: Sheronda Vaughn
 - Version: 0.1.0 (Apr 05, 2016)
 - Since: OMIS 3.0
 -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<fmt:bundle basename="omis.employment.msgs.employment">
	<ul>
		<li class="taskLinkItem">
			<a class="homeLink" href="${pageContext.request.contextPath}/home.html">				
				<fmt:message key="homeLinkLabel"/>
			</a>
		</li>	
		<li>
			<a class="printLink">
				<span class="visibleLinkLabel">
					<fmt:message key="printScreenLabel"/>
				</span>
			</a>
		</li>
		<li>
			<a class="helpLink">
				<span class="visibleLinkLabel">
					<fmt:message key="searchHelpLabel"/>
				</span>
			</a>
		</li>	
	</ul>
</fmt:bundle>