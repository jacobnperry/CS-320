import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ContactTest {
	protected String contactID,firstName,lastName,phone,address;
	

	
	  @Test
	  void contactTest() throws invalidInput {
			String contactID = "1293867";
			String firstName = "Jacob";
			String lastName = "Perry";
			String phone = "2074002227";
			String address = "Richmond, VA";
	    Contact contact = new Contact(contactID,firstName,lastName,phone,address);
	    assertAll("constructor",
	              ()
	                  -> assertNotNull(contact.getContactID()),
	              ()
	                  -> assertNotNull(contact.getFirstName()),
	              ()
	                  -> assertNotNull(contact.getLastName()),
	              ()
	                  -> assertNotNull(contact.getPhone()),
	              () -> assertNotNull(contact.getAddress()));
	  }
}
