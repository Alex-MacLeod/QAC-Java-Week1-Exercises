package library;

public class Records extends Items{
	boolean digitised;
	String type;
		public Records(String name, int iD, String author, int year, boolean onLoan, int loanExpiry, boolean digitised, String type) {
			super(name, iD, author, year, onLoan, loanExpiry);
			this.digitised = digitised;
			this.type = type;
		}
		public boolean isDigitised() {
			return digitised;
		}
		public void setDigitised(boolean digitised) {
			this.digitised = digitised;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public String writeDetails() {
			return name + ", " + iD +", " + author +", " + year +", " + onLoan +", " + loanExpiry +", " + ", " + digitised +", " + type+ "\n";
		}
}
