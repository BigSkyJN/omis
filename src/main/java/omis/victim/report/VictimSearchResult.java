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
package omis.victim.report;

import omis.search.report.PersonSearchResult;

/**
 * Victim Search Result.
 * 
 *@author Annie Wahl 
 *@version 0.1.0 (Jan 23, 2018)
 *@since OMIS 3.0
 *
 */
public class VictimSearchResult extends PersonSearchResult {
	
	private static final long serialVersionUID = 1L;
	
	private final Long victimAssociationId;
	
	/**
	 * @param victimAssociationId - Long Victim Association ID
	 * @param nameId - Long Name ID
	 * @param personId - Long Person ID
	 * @param firstName - String First Name
	 * @param middleName - String Middle Name
	 * @param lastName - String Last Name
	 * @param suffixName - String Suffix
	 */
	public VictimSearchResult(
			final Long victimAssociationId,
			final Long nameId, final Long personId,
			final String firstName, final String middleName,
			final String lastName, final String suffixName) {
		super(nameId, personId, firstName, middleName, lastName, suffixName);
		this.victimAssociationId = victimAssociationId;
	}

	/**
	 * Returns the victimAssociationId.
	 * @return victimAssociationId - Long
	 */
	public Long getVictimAssociationId() {
		return this.victimAssociationId;
	}
	
	
}
