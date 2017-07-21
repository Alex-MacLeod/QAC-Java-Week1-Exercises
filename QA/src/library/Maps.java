package library;

public class Maps extends Items{
	String area;
		public Maps(String name, int iD, String author, int year, boolean isReserved, int bookingExpiry, String area) {
			super(name, iD, author, year, isReserved, bookingExpiry);
			this.area = area;
		}
		public String getArea() {
			return area;
		}
		public void setArea(String area) {
			this.area = area;
		}
}
