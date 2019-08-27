package com.lnt.pos.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name=" POS_TBL_Creditcard")
public class CreditcardBean {
	@Id
	@Column
	private String creditcard;
	@Column
	private String cardName;
	@Column
	private String balance;
	@Column
	private String validFrom;
	@Column
	private String 	validTo;
	@Column
	private String cvv;

	@Override
	public String toString() {
		return "CreditcardBean [creditcard=" + creditcard + ", cardName=" + cardName + ", balance=" + balance
				+ ", validFrom=" + validFrom + ", validTo=" + validTo + ", cvv=" + cvv + "]";
	}
	/*
	 * @OneToOne(cascade=CascadeType.MERGE)
	 * 
	 * @JoinColumn(name="userID") private ProfileBean pb;
	 */
	public String getCardName() {
		return cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	public String getValidFrom() {
		return validFrom;
	}
	public void setValidFrom(String validFrom) {
		this.validFrom = validFrom;
	}
	public String getValidTo() {
		return validTo;
	}
	public void setValidTo(String validTo) {
		this.validTo = validTo;
	}
	public String getBalance() {
		return balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}
	public String getCvv() {
		return cvv;
	}
	public void setCvv(String cvv) {
		this.cvv = cvv;
	}
	public String getCreditcard() {
		return creditcard;
	}
	public void setCreditcard(String creditcard) {
		this.creditcard = creditcard;
	}
}
