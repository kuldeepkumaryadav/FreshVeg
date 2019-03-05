package com.freshveg.pojo;

public class Customer {
	

	private String CustFirstName;
	private String CustlastName;
	private String CustPrimaryPhnNo;
	private String CustSecondaryPhnNo;
	private String CustPrimaryEmailId;
	private String CustSecondaryEmailId;
	private Address CustAddress;
	private String CustStateName;
	private String CustSex;
	private int CustAge;
	public String getCustFirstName() {
		return CustFirstName;
	}
	public void setCustFirstName(String custFirstName) {
		CustFirstName = custFirstName;
	}
	public String getCustlastName() {
		return CustlastName;
	}
	public void setCustlastName(String custlastName) {
		CustlastName = custlastName;
	}
	public String getCustPrimaryPhnNo() {
		return CustPrimaryPhnNo;
	}
	public void setCustPrimaryPhnNo(String custPrimaryPhnNo) {
		CustPrimaryPhnNo = custPrimaryPhnNo;
	}
	public String getCustSecondaryPhnNo() {
		return CustSecondaryPhnNo;
	}
	public void setCustSecondaryPhnNo(String custSecondaryPhnNo) {
		CustSecondaryPhnNo = custSecondaryPhnNo;
	}
	public String getCustPrimaryEmailId() {
		return CustPrimaryEmailId;
	}
	public void setCustPrimaryEmailId(String custPrimaryEmailId) {
		CustPrimaryEmailId = custPrimaryEmailId;
	}
	public String getCustSecondaryEmailId() {
		return CustSecondaryEmailId;
	}
	public void setCustSecondaryEmailId(String custSecondaryEmailId) {
		CustSecondaryEmailId = custSecondaryEmailId;
	}
	public Address getCustAddress() {
		return CustAddress;
	}
	public void setCustAddress(Address custAddress) {
		CustAddress = custAddress;
	}
	public String getCustStateName() {
		return CustStateName;
	}
	public void setCustStateName(String custStateName) {
		CustStateName = custStateName;
	}
	public String getCustSex() {
		return CustSex;
	}
	public void setCustSex(String custSex) {
		CustSex = custSex;
	}
	public int getCustAge() {
		return CustAge;
	}
	public void setCustAge(int custAge) {
		CustAge = custAge;
	}
	@Override
	public String toString() {
		return "Customer [CustFirstName=" + CustFirstName + ", CustlastName=" + CustlastName + ", CustPrimaryPhnNo="
				+ CustPrimaryPhnNo + ", CustSecondaryPhnNo=" + CustSecondaryPhnNo + ", CustPrimaryEmailId="
				+ CustPrimaryEmailId + ", CustSecondaryEmailId=" + CustSecondaryEmailId + ", CustAddress=" + CustAddress
				+ ", CustStateName=" + CustStateName + ", CustSex=" + CustSex + ", CustAge=" + CustAge + "]";
	}
}
