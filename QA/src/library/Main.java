package library;

public class Main {
	public static void main(String[] args) {
		Library l = new Library(null);
		
		Books b1 = new Books("Java is fun", 461246, "Deaglan Lynch", 2017, false, 0, false, false, false, true);
		Books b2 = new Books("10 Ways that Learning Java makes you Cool", 67836, "Deaglan Lynch", 2017, true, 10, false, false, false, false);
		Magazines mg1 = new Magazines("Coder's Digest", 879629, "Coder's Digest", 2017, false, 0, true, 1);
		Maps mp1 = new Maps("Map of Knoxley and surroundings 1967", 575732, "Ordinance Survey", 1967, false, 0, "Knoxleyshire");
		Records r1 = new Records("Marriages in Knoxley Parish 1850-1890", 567372, "Knoxley Parish", 1892, false, 0, true, "Marriage Register");
		
		l.addItem(b1);
		l.addItem(b2);
		l.addItem(mg1);
		l.addItem(mp1);
		l.addItem(r1);
		l.removeItemByName(null);
		l.emptyLibrary();
		l.outputLibrary();
	}
}