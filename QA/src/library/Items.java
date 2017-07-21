package library;

public abstract class Items {
	String name;					//define attributes
	int iD;
	String author;
	int year;
	boolean isReserved;
	int bookingExpiry;
		public Items(String name, int iD, String author, int year, boolean isReserved, int bookingExpiry) {
			this.name = name;
			this.iD = iD;
			this.author = author;
			this.year = year;
			this.isReserved = isReserved;
			this.bookingExpiry = bookingExpiry;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getID() {
			return iD;
		}
		public void setID(int iD) {
			this.iD = iD;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		public int getYear() {
			return year;
		}
		public void setYear(int year) {
			this.year = year;
		}
		public boolean isReserved() {
			return isReserved;
		}
		public void setReserved(boolean isReserved) {
			this.isReserved = isReserved;
		}
		public int getBookingExpiry() {
			return bookingExpiry;
		}
		public void setBookingExpiry(int bookingExpiry) {
			this.bookingExpiry = bookingExpiry;
		}
}
