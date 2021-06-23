import org.junit.jupiter.api.Test;

public class ContactService {
	static Contact[] objStore = new Contact[1];
	
	@Test
	public static ContactService newContact(String uniqueID,String firstName,String lastName,String phoneNumber, String address) throws invalidInput {
		
		//checks for existing object in array with same ID and adds it to the array if no match is found.

			if(objStore.length < 1) {
				System.out.println("No values in array");
			}else {
			for(int x = 0; x < objStore.length-1;x++) {
			if(objStore[x].getContactID() == uniqueID) {
				throw new invalidInput(uniqueID);
			}else {				
				Contact newContact = new Contact(uniqueID, firstName,lastName,phoneNumber,address);
				objStore = addID(objStore,newContact);
			}
			}
		}
		for(int x = 0; x < objStore.length;x++) {
			Contact output = objStore[x];
			System.out.println(output);
		}
		return null;
	}
	
	public static Contact intialArray(String contactID, String firstName, String lastName, String phone, String address) throws invalidInput {
		Contact contact = new Contact(contactID,firstName,lastName,phone,address);
		objStore[0] = contact;
		return contact;	
	}

	//function to add the new object into the pre-existing array storing all objects.
	@Test
	public static Contact[] addID(Contact[] array, Contact newObject) {
		Contact tempArray[] = new Contact[array.length + 1];
		for(int x = 0; x < array.length;x++) {
			tempArray[x] = array[x];
		}
		tempArray[array.length] = newObject;
		
		return tempArray;
	}
	@Test
	private static Contact[] deleteID(Contact[] oldArray, int elemIndex) {
		Contact[] tempArray = new Contact[oldArray.length - 1];
		System.arraycopy(oldArray, 0, tempArray, 0, elemIndex);
		System.arraycopy(oldArray, elemIndex + 1, tempArray, elemIndex, oldArray.length - elemIndex - 1);
		return tempArray;
			
		}
	
	@Test
	public static void updateAddress(String address, String contactID) {
		int elemPlace = 0;
		for(int x = 0;x < objStore.length;x++) {
			if(objStore.length > 0 && objStore[x].getContactID() == contactID) {
				elemPlace = x;
			}else {
			}
			objStore[elemPlace].setAddress(address);
		}

	}
	
	@Test
	public static void updateFirstName(String firstName, String contactID) {
		int elemPlace = 0;
		for(int x = 0;x < objStore.length;x++) {
			if(objStore[x].getContactID() == contactID) {
				elemPlace = x;
			}else {
			}
		}
		objStore[elemPlace].setFirstName(firstName);;
	}
	
	@Test
	public static void updateLastName(String lastName, String contactID) {
		int elemPlace = 0;
		for(int x = 0;x < objStore.length;x++) {
			if(objStore[x].getContactID() == contactID) {
				elemPlace = x;
			}else {
			}
		}
		objStore[elemPlace].setLastName(lastName);;
	}
	
	@Test
	public static void updatePhone(String phone, String contactID) {
		int elemPlace = 0;
		for(int x = 0;x < objStore.length;x++) {
			if(objStore[x].getContactID() == contactID) {
				elemPlace = x;
			}else {
			}
		}
		objStore[elemPlace].setPhone(phone);
	}
}

