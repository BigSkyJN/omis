package omis.user.domain.impl;

import java.util.Date;

import omis.person.domain.Person;
import omis.user.domain.UserAccount;

/**
 * Implementation of user account.
 * 
 * <p>Supports password management.
 * 
 * @author Stephen Abson
 * @version 0.1.2 (Dec 11, 2012)
 * @since OMIS 3.0
 */
public class UserAccountWithPasswordImpl implements UserAccount {

	private static final long serialVersionUID = 1L;
	
	private static final String USERNAME_REQUIRED_MSG = "Username required";
	
	private Person user;
	
	private String username;
	
	private String password;
	
	private Boolean enabled;
	
	private Integer attempt;

	private Long id;

	private Date passwordExpirationDate;
	
	/** Instantiates a default user account. */
	public UserAccountWithPasswordImpl() {
		// Default instantiation
	}
	
	/** {@inheritDoc} */
	@Override
	public Long getId() {
		return this.id;
	}
	
	/** {@inheritDoc} */
	@Override
	public void setId(final Long id) {
		this.id = id;
	}
	
	/** {@inheritDoc} */
	@Override
	public Person getUser() {
		return this.user;
	}

	/** {@inheritDoc} */
	@Override
	public void setUser(final Person user) {
		this.user = user;
	}

	/** {@inheritDoc} */
	@Override
	public String getUsername() {
		return this.username;
	}

	/** {@inheritDoc} */
	@Override
	public void setUsername(final String username) {
		this.username = username;
	}

	/** {@inheritDoc} */
	@Override
	public String getPassword() {
		return this.password;
	}

	/** {@inheritDoc} */
	@Override
	public void setPassword(final String password) {
		this.password = password;
	}
	
	/** {@inheritDoc} */
	@Override
	public Boolean getEnabled() {
		return this.enabled;
	}

	/** {@inheritDoc} */
	@Override
	public void setEnabled(final Boolean enabled) {
		this.enabled = enabled;
	}
	
	/** {@inheritDoc} */
	@Override
	public Integer getAttempt() {
		return this.attempt;
	}
	
	/** {@inheritDoc} */
	@Override
	public void setAttempt(final Integer attempt) {
		this.attempt = attempt;
	}
	
	/** {@inheritDoc} */
	@Override
	public void incrementAttempt() {
		this.setAttempt(this.getAttempt() + 1);
	}
	
	/** {@inheritDoc} */
	@Override
	public void resetAttempt() {
		this.setAttempt(0);
	}
	
	/** {@inheritDoc} */
	@Override
	public void enable() {
		this.setEnabled(true);
	}
	
	/** {@inheritDoc} */
	@Override
	public void disable() {
		this.setEnabled(false);
	}
	
	/** {@inheritDoc} */
	@Override
	public Date getPasswordExpirationDate() {
		return this.passwordExpirationDate;
	}

	/** {@inheritDoc} */
	@Override
	public void setPasswordExpirationDate(final Date passwordExpirationDate) {
		this.passwordExpirationDate = passwordExpirationDate;
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean equals(final Object obj) {
		if (obj == this) {
			return true;
		}
		if (!(obj instanceof UserAccount)) {
			return false;
		}
		UserAccount that = (UserAccount) obj;
		if (this.getUsername() == null) {
			throw new IllegalStateException(USERNAME_REQUIRED_MSG);
		}
		return this.getUsername().equals(that.getUsername());
	}
	
	/** {@inheritDoc} */
	@Override
	public int hashCode() {
		if (this.getUsername() == null) {
			throw new IllegalStateException(USERNAME_REQUIRED_MSG);
		}
		return 14 + (29 * this.getUsername().hashCode() + 1);
	}
	
	/** {@inheritDoc} */
	@Override
	public String toString() {
		return this.getUsername();
	}
}