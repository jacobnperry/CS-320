import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.jupiter.api.Test;

public class ContactServiceTest {
	
	  @Test
	  void contactServiceTest() throws invalidInput {
		  
		String contactID = "123456";
		String firstName = "Jacob";
		String lastName = "Perry";
		String phoneNumber = "2074002227";
		String address = "Richmond, VA";
		
		String contactIDTest = "98765234";
		String firstNameTest = "Kelly";
		String lastNameTest = "Perry";
		String phoneNumberTest = "2074002227";
		String addressTest = "Richmond, VA";
		

	    ContactService contact = new ContactService();

	    Contact initialArray = contact.intialArray(contactID, firstName, lastName, phoneNumber, address);
	    contact.newContact(contactIDTest, firstNameTest, lastNameTest, phoneNumberTest, addressTest);
	    contact.updateAddress(address, contactID);
	    contact.updateFirstName(firstName, contactID);
	    contact.updateLastName(lastName, contactID);
	    contact.updatePhone(phoneNumber, contactID);
	    

	  }
	  
	  
}
