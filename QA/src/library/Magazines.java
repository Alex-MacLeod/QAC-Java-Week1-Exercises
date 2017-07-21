package library;

public class Magazines extends Items{
	boolean eMag;
	int issueNum;
		public Magazines(String name, int iD, String author, int year, boolean isReserved, int bookingExpiry, boolean eMag, int issueNum) {
			super(name, iD, author, year, isReserved, bookingExpiry);
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
}
