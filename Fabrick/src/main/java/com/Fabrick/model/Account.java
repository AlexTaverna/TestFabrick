package com.Fabrick.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity

public class Account {
	public Account(String accountId, String iban, String abiCode, String countryCode, String internationalCin,
			String nationalCin, String account, String alias, String productName, String holderName,
			String activatedDate, String currency) {
		super();
		this.accountId = accountId;
		this.iban = iban;
		this.abiCode = abiCode;
		this.countryCode = countryCode;
		this.internationalCin = internationalCin;
		this.nationalCin = nationalCin;
		this.account = account;
		this.alias = alias;
		this.productName = productName;
		this.holderName = holderName;
		this.activatedDate = activatedDate;
		this.currency = currency;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String accountId;
	private String iban;
	private String abiCode;
	private String countryCode;
	private String internationalCin;
	private String nationalCin;
	private String account;
	private String alias;
	private String productName;
	private String holderName;
	private String activatedDate;
	private String currency;
	
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public String getIban() {
		return iban;
	}
	public void setIban(String iban) {
		this.iban = iban;
	}
	public String getAbiCode() {
		return abiCode;
	}
	public void setAbiCode(String abiCode) {
		this.abiCode = abiCode;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getInternationalCin() {
		return internationalCin;
	}
	public void setInternationalCin(String internationalCin) {
		this.internationalCin = internationalCin;
	}
	public String getNationalCin() {
		return nationalCin;
	}
	public void setNationalCin(String nationalCin) {
		this.nationalCin = nationalCin;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getHolderName() {
		return holderName;
	}
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	public String getActivatedDate() {
		return activatedDate;
	}
	public void setActivatedDate(String activatedDate) {
		this.activatedDate = activatedDate;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", iban=" + iban + ", abiCode=" + abiCode + ", countryCode="
				+ countryCode + ", internationalCin=" + internationalCin + ", nationalCin=" + nationalCin + ", account="
				+ account + ", alias=" + alias + ", productName=" + productName + ", holderName=" + holderName
				+ ", activatedDate=" + activatedDate + ", currency=" + currency + "]";
	}
	
}
