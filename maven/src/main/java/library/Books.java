package library;

public class Books extends Items{
	private boolean fiction;
	private boolean eBook;
	private boolean audioBook;
	private boolean forKids;
		public Books(String name, int iD, String author, int year, boolean onLoan, int loanExpiry, boolean fiction, boolean eBook, boolean audioBook, boolean forKids) {
			super(name, iD, author, year, onLoan, loanExpiry);
			this.fiction = fiction;
			this.eBook = eBook;
			this.audioBook = audioBook;
			this.forKids = forKids;
		}
		public boolean isFiction() {
			return fiction;
		}
		public void setFiction(boolean fiction) {
			this.fiction = fiction;
		}
		public boolean isEBook() {
			return eBook;
		}
		public void setEBook(boolean eBook) {
			this.eBook = eBook;
		}
		public boolean isAudioBook() {
			return audioBook;
		}
		public void setAudioBook(boolean audioBook) {
			this.audioBook = audioBook;
		}
		public boolean isForKids() {
			return forKids;
		}
		public void setForKids(boolean forKids) {
			this.forKids = forKids;
		}
		public String writeDetails() {
			return name + ", " + iD +", " + author +", " + year +", " + onLoan +", " + loanExpiry +", " + fiction +", "
					+ eBook +", " + audioBook +", " + forKids + "\n";
		}
}
