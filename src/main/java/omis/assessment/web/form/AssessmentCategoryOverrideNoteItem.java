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
package omis.assessment.web.form;

import java.io.Serializable;
import java.util.Date;
import omis.assessment.domain.AssessmentCategoryOverrideNote;

/**
 * Assessment Category Override Description Item.
 * 
 *@author Annie Wahl
 *@version 0.1.0 (Feb 4, 2019)
 *@since OMIS 3.0
 *
 */
public class AssessmentCategoryOverrideNoteItem implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private AssessmentCategoryOverrideNote assessmentCategoryOverrideNote;
	
	private String description;
	
	private Date date;
	
	private AssessmentItemOperation itemOperation;
	
	/**
	 * Default constructor for AssessmentCategoryOverrideNoteItem.
	 */
	public AssessmentCategoryOverrideNoteItem() {
	}
	
	/**
	 * Returns the assessmentCategoryOverrideNote.
	 *
	 * @return assessmentCategoryOverrideNote
	 */
	public AssessmentCategoryOverrideNote getAssessmentCategoryOverrideNote() {
		return this.assessmentCategoryOverrideNote;
	}
	
	/**
	 * Sets the assessmentCategoryOverrideNote.
	 *
	 * @param assessmentCategoryOverrideNote - assessmentCategoryOverrideNote
	 */
	public void setAssessmentCategoryOverrideNote(
			AssessmentCategoryOverrideNote assessmentCategoryOverrideNote) {
		this.assessmentCategoryOverrideNote = assessmentCategoryOverrideNote;
	}



	/**
	 * Returns the description.
	 *
	 * @return description
	 */
	public String getDescription() {
		return this.description;
	}

	/**
	 * Sets the description.
	 *
	 * @param description - description
	 */
	public void setDescription(final String description) {
		this.description = description;
	}

	/**
	 * Returns the date.
	 *
	 * @return date
	 */
	public Date getDate() {
		return this.date;
	}

	/**
	 * Sets the date.
	 *
	 * @param date - date
	 */
	public void setDate(final Date date) {
		this.date = date;
	}

	/**
	 * Returns the itemOperation.
	 *
	 * @return itemOperation
	 */
	public AssessmentItemOperation getItemOperation() {
		return this.itemOperation;
	}

	/**
	 * Sets the itemOperation.
	 *
	 * @param itemOperation - itemOperation
	 */
	public void setItemOperation(final AssessmentItemOperation itemOperation) {
		this.itemOperation = itemOperation;
	}
	
	 
	
}
