package com.sdmicroserviceproj.model;


import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ValueMapping")
public class AccountModel {

	private int accNo;
	private String accName;

	private String accID;

	public AccountModel() {

	}

	public AccountModel(int accNo, String accName,  String accID) {
		super();
		this.accNo = accNo;
		this.accName = accName;		
		this.accID = accID;
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}


	public String getaccID() {
		return accID;
	}

	public void setaccID(String accID) {
		this.accID = accID;
	}
}
