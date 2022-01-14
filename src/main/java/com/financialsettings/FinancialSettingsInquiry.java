package com.financialsettings;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class FinancialSettingsInquiry implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String country;
	private java.lang.String city;
	private java.lang.Integer ics;
	private java.lang.String channel;
	private java.lang.Double maxLoan;
	private java.lang.Double interestRate;
	private java.lang.Double pti;

	public FinancialSettingsInquiry() {
	}

	public java.lang.String getCountry() {
		return this.country;
	}

	public void setCountry(java.lang.String country) {
		this.country = country;
	}

	public java.lang.String getCity() {
		return this.city;
	}

	public void setCity(java.lang.String city) {
		this.city = city;
	}

	public java.lang.Integer getIcs() {
		return this.ics;
	}

	public void setIcs(java.lang.Integer ics) {
		this.ics = ics;
	}

	public java.lang.String getChannel() {
		return this.channel;
	}

	public void setChannel(java.lang.String channel) {
		this.channel = channel;
	}

	public java.lang.Double getMaxLoan() {
		return this.maxLoan;
	}

	public void setMaxLoan(java.lang.Double maxLoan) {
		this.maxLoan = maxLoan;
	}

	public java.lang.Double getInterestRate() {
		return this.interestRate;
	}

	public void setInterestRate(java.lang.Double interestRate) {
		this.interestRate = interestRate;
	}

	public java.lang.Double getPti() {
		return this.pti;
	}

	public void setPti(java.lang.Double pti) {
		this.pti = pti;
	}

	public FinancialSettingsInquiry(java.lang.String country,
			java.lang.String city, java.lang.Integer ics,
			java.lang.String channel, java.lang.Double maxLoan,
			java.lang.Double interestRate, java.lang.Double pti) {
		this.country = country;
		this.city = city;
		this.ics = ics;
		this.channel = channel;
		this.maxLoan = maxLoan;
		this.interestRate = interestRate;
		this.pti = pti;
	}

}