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
package omis.stg.exception;

import omis.exception.DuplicateEntityFoundException;

/**
* Security threat group activity note exists exception.
*
* @version Sheronda Vaughn
* @version 0.0.1 (Sep 12, 2018)
* @since OMIS 3.0
*/

public class SecurityThreatGroupActivityNoteExistsException 
	extends DuplicateEntityFoundException {

	private static final long serialVersionUID = 1L;

	/** Instantiates default security threat group activity exists exception. */
	public SecurityThreatGroupActivityNoteExistsException() {
		// Default constructor.
	}

	/**
	 *  Constructor.
	 *  
	 * @param message message
	 * @param cause cause
	 */
	public SecurityThreatGroupActivityNoteExistsException(final String message, final Throwable cause) {
		super(message, cause);
	}

	/**
	 *  Constructor.
	 *  
	 * @param message message
	 */
	public SecurityThreatGroupActivityNoteExistsException(final String message) {
		super(message);
	}

	/**
	 *  Constructor.
	 *  
	 * @param cause cause
	 */
	public SecurityThreatGroupActivityNoteExistsException(final Throwable cause) {
		super(cause);
	}
}