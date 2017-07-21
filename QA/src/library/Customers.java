package library;

public class Customers {
	String forename;
	String surname;
	String dateOfBirth;
	int customerID;
	String Address1;
	String Address2;
	String Address3;
	String postCode;
		public Customers(String forename, String surname, String dateOfBirth, int customerID, String Address1, String Address2, String Address3, String postCode) {
				this.forename = forename;
				this.surname = surname;
				this.dateOfBirth = dateOfBirth;
				this.customerID = customerID;
				this.Address1 = Address1;
				this.Address2 = Address2;
				this.Address3 = Address3;
				this.postCode = postCode;
		}
		public String getForename() {
			return forename;
		}
		public void setForename(String forename) {
			this.forename = forename;
		}
		public String getSurname() {
			return surname;
		}
		public void setSurname(String surname) {
			this.surname = surname;
		}
		public String getDateOfBirth() {
			return dateOfBirth;
		}
		public void setDateOfBirth(String dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}
		public int getCustomerID() {
			return customerID;
		}
		public void setCustomerID(int customerID) {
			this.customerID = customerID;
		}
		public String getAddress1() {
			return Address1;
		}
		public void setAddress1(String address1) {
			Address1 = address1;
		}
		public String getAddress2() {
			return Address2;
		}
		public void setAddress2(String address2) {
			Address2 = address2;
		}
		public String getAddress3() {
			return Address3;
		}
		public void setAddress3(String address3) {
			Address3 = address3;
		}
		public String getPostCode() {
			return postCode;
		}
		public void setPostCode(String postCode) {
			this.postCode = postCode;
		}
}
