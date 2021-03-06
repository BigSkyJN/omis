/*
 * OMIS - Offender Management Information System
 * Copyright (C) 2011 - 2017 State of Montana
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package omis.workassignment.report.impl.hibernate;

import org.hibernate.SessionFactory;

import omis.offender.domain.Offender;
import omis.workassignment.report.WorkAssignmentSummary;
import omis.workassignment.report.WorkAssignmentSummaryItemReportService;

/**
 * Work Assignment Summary Item Report Service Hibernate Implementation.
 * 
 * @author Annie Wahl
 * @author Josh Divine 
 * @version 0.1.1 (Feb 14, 2018)
 * @since OMIS 3.0
 *
 */
public class WorkAssignmentSummaryItemReportServiceHibernateImpl
		implements WorkAssignmentSummaryItemReportService {
	
	private static final String FIND_WORK_ASSIGNMENT_SUMMARY_QUERY_NAME =
			"findWorkAssignmentByOffender";
	
	private static final String OFFENDER_PARAMETER_NAME = "offender";
	
	private final SessionFactory sessionFactory;
	
	/**
	 * Constructor for WorkAssignmentSummaryItemReportServiceHibernateImpl.
	 * 
	 * @param sessionFactory - Session Factory
	 */
	public WorkAssignmentSummaryItemReportServiceHibernateImpl(
			final SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	/**{@inheritDoc} */
	@Override
	public WorkAssignmentSummary findWorkAssignmentSummaryByOffender(
			final Offender offender) {
		WorkAssignmentSummary summary = (WorkAssignmentSummary)
				this.sessionFactory.getCurrentSession()
				.getNamedQuery(FIND_WORK_ASSIGNMENT_SUMMARY_QUERY_NAME)
				.setParameter(OFFENDER_PARAMETER_NAME, offender)
				.setMaxResults(1)
				.setReadOnly(true)
				.uniqueResult();
				
		return summary;
	}
}