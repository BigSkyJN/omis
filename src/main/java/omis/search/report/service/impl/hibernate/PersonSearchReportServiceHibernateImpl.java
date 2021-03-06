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
package omis.search.report.service.impl.hibernate;

import org.hibernate.SessionFactory;

import omis.search.report.PersonSearchResult;
import omis.search.report.service.PersonSearchReportService;

/** 
 * Implementation for person search service.
 * 
 * @author Ryan Johns
 * @author Josh Divine
 * @author Annie Wahl
 * @version 0.1.2 (Mar 20, 2019)
 * @since OMIS 3.0 
 */
public class PersonSearchReportServiceHibernateImpl
	extends AbstractPersonSearchReportServiceHibernateImpl<PersonSearchResult>
	implements PersonSearchReportService {

	private static final String
		FIND_BY_FIRST_LAST_NAME_SEARCH_QUERY_NAME =
			"findAllNameByFirstLastNameSearch";
	
	private static final String[] FIND_BY_FIRST_LAST_NAME_SEARCH_PARAMS =
			{"name1" , "name2"};

	private static final String
			FIND_BY_FIRST_MIDDLE_LAST_NAME_SEARCH_QUERY_NAME =
					"findAllNameByFirstMiddleLastSearch";

	private static final String[] FIND_BY_FIRST_MIDDLE_LAST_NAME_SEARCH_PARAMS =
			{"first" , "middle" , "last"};

	private static final String FIND_PERSON_NAME_BY_NAME_SEARCH_QUERY =
			"findNameByLastNameSearch";

	private static final String FIND_PERSON_NAME_BY_NAME_SEARCH_PARAM =
			"name";

	private static final String FIND_PERSON_SEARCH_BY_ID =
			"findPersonSearchById";

	private static final String FIND_PERSON_SEARCH_BY_ID_PARAM = "id";
	
	private static final String FIND_PERSON_NAME_BY_SSN_SEARCH_QUERY =
			"findPersonNameBySsn";
	
	private static final String FIND_PERSON_NAME_BY_SSN_SEARCH_PARAM = "ssn";

	/** constructor.
	 * @param sessionFactory session factory. */
	public PersonSearchReportServiceHibernateImpl(
			final SessionFactory sessionFactory) {
		super(sessionFactory);
	}

	/** {@inheritDoc} */
	@Override
	public PersonSearchResult findById(final Long id) {
		return (PersonSearchResult) this.getSessionFactory().getCurrentSession()
				.getNamedQuery(FIND_PERSON_SEARCH_BY_ID)
				.setParameter(FIND_PERSON_SEARCH_BY_ID_PARAM, id)
				.setReadOnly(true)
				.uniqueResult();
	}

	/** {@inheritDoc} */
	@Override
	public String getFindByFirstLastNameSearchQuery() {
		return FIND_BY_FIRST_LAST_NAME_SEARCH_QUERY_NAME;
	}

	/** {@inheritDoc} */
	@Override
	public String[] getFindByFirstLastNameSearchParams() {
		return FIND_BY_FIRST_LAST_NAME_SEARCH_PARAMS;
	}

	/** {@inheritDoc} */
	@Override
	public String getFindByFirstMiddleLastNameSearchQuery() {
		return FIND_BY_FIRST_MIDDLE_LAST_NAME_SEARCH_QUERY_NAME;
	}

	/** {@inheritDoc} */
	@Override
	public String[] getFindByFirstMiddleLastNameSearchParams() {
		return FIND_BY_FIRST_MIDDLE_LAST_NAME_SEARCH_PARAMS;
	}

	/** {@inheritDoc} */
	@Override
	public String getFindPersonNameByNameSearchQuery() {
		return FIND_PERSON_NAME_BY_NAME_SEARCH_QUERY;
	}

	/** {@inheritDoc} */
	@Override
	public String getFindPersonNameByNameSearchParam() {
		return FIND_PERSON_NAME_BY_NAME_SEARCH_PARAM;
	}
	
	/** {@inheritDoc} */
	@Override
	public String getFindPersonNameBySsnSearchQuery() {
		return FIND_PERSON_NAME_BY_SSN_SEARCH_QUERY;
	}

	/** {@inheritDoc} */
	@Override
	public String getFindPersonNameBySsnSearchParam() {
		return FIND_PERSON_NAME_BY_SSN_SEARCH_PARAM;
	}
}