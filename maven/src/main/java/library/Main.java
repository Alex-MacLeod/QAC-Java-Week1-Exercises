package library;

public interface Main {
	public static void main(String[] args) {
	
		Library l = new Library();
		
		l.searchItem(null, null);
		
		l.checkOutItem(null, null, null);
		l.checkInItem(null, null);
		
		l.addItem(null);
		l.addPerson(null);
		
		l.removeItemByName(null, null);
		//l.emptyLibrary(null);
		//l.outputLibrary(null);
		l.updateItemByName(null, null, null, 0, null, 0, false, 0);
	
		l.removeCustomerByID(null, 0);
		//l.emptyCustomers(null);
		//l.outputCustomers(null);
		l.updateCustomerByID(null, 0, null, null, null, 0, null, null, null, null);
		l.contents(null, null);
	}
}