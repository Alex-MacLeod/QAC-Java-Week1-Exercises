package library;

public class Magazines extends Items{
	boolean eMag;
	int issueNum;
		public Magazines(String name, int iD, String author, int year, boolean onLoan, int loanExpiry, boolean eMag, int issueNum) {
			super(name, iD, author, year, onLoan, loanExpiry);
			this.eMag = eMag;
			this.issueNum = issueNum;
		}
		public boolean isEMag() {
			return eMag;
		}
		public void setEMag(boolean eMag) {
			this.eMag = eMag;
		}
		public int getIssueNum() {
			return issueNum;
		}
		public void setIssueNum(int issueNum) {
			this.issueNum = issueNum;
		}
		public String writeDetails() {
			return name + ", " + iD +", " + author +", " + year +", " + onLoan +", " + loanExpiry +", " + eMag +", " + issueNum + "\n";
		}
}
