package library;

public class Maps extends Items{
	String area;
		public Maps(String name, int iD, String author, int year, boolean onLoan, int loanExpiry, String area) {
			super(name, iD, author, year, onLoan, loanExpiry);
			this.area = area;
		}
		public String getArea() {
			return area;
		}
		public void setArea(String area) {
			this.area = area;
		}
		public String writeDetails() {
			return name + ", " + iD +", " + author +", " + year +", " + onLoan +", " + loanExpiry + ", " + area + "\n";
		}
}
