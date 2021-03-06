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
package omis.paroleeligibility.domain.component;

import java.io.Serializable;
import java.util.Date;

import omis.paroleeligibility.domain.EligibilityStatusCategory;
import omis.paroleeligibility.domain.EligibilityStatusReason;

/**
 * Parole eligibility status COMPONENT.
 *
 * @author Trevor Isles
 * @version 0.1.0 (Nov 7, 2017)
 * @since OMIS 3.0
 */
public class ParoleEligibilityStatus implements Serializable {

	private static final long serialVersionUID = 1L;

	private Date date;
	
	private String comment;
		
	private EligibilityStatusCategory category;
	
	private EligibilityStatusReason reason;
	
	public ParoleEligibilityStatus(
			final Date date,
			final String comment,
			final EligibilityStatusCategory category,
			final EligibilityStatusReason reason) {
		this.date = date;
		this.comment = comment;
		this.category = category;
		this.reason = reason;
	}
	
	public ParoleEligibilityStatus() {
		// Default constructor
	}

	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(final Date date) {
		this.date = date;
	}

	/**
	 * @return the comment
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * @param comment the comment to set
	 */
	public void setComment(final String comment) {
		this.comment = comment;
	}

	/**
	 * @return the eligibilityStatusCategory
	 */
	public EligibilityStatusCategory getCategory() {
		return category;
	}

	/**
	 * @param eligibilityStatusCategory the eligibilityStatusCategory to set
	 */
	public void setCategory(final EligibilityStatusCategory category) {
		this.category = category;
	}

	/**
	 * @return the eligibilityStatusReason
	 */
	public EligibilityStatusReason getReason() {
		return reason;
	}

	/**
	 * @param eligibilityStatusReason the eligibilityStatusReason to set
	 */
	public void setReason(final EligibilityStatusReason reason) {
		this.reason = reason;
	}
}
