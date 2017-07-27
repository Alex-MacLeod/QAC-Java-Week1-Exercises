package library;

public class Customers {
	String forename;
	String surname;
	String dateOfBirth;
	int customerID;
	String address1;
	String address2;
	String address3;
	String postCode;
		public Customers(String forename, String surname, String dateOfBirth, int customerID, String address1, String address2, String address3, String postCode) {
				this.forename = forename;
				this.surname = surname;
				this.dateOfBirth = dateOfBirth;
				this.customerID = customerID;
				this.address1 = address1;
				this.address2 = address2;
				this.address3 = address3;
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
			return address1;
		}
		public void setAddress1(String address1) {
			this.address1 = address1;
		}
		public String getAddress2() {
			return address2;
		}
		public void setAddress2(String address2) {
			this.address2 = address2;
		}
		public String getAddress3() {
			return address3;
		}
		public void setAddress3(String address3) {
			this.address3 = address3;
		}
		public String getPostCode() {
			return postCode;
		}
		public void setPostCode(String postCode) {
			this.postCode = postCode;
		}
}
