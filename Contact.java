import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Contact {

	
	private String contactID;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	
	
	public Contact(String contactID,String firstName,String lastName,String phone, String address) throws invalidInput {
		if(inputValidator(contactID) && contactID != null) {
			this.contactID=contactID;
		}else {
			throw new invalidInput(contactID);
		}
		if(inputValidator(firstName) && firstName != null) {
			this.firstName = firstName;
		}else {
			throw new invalidInput(firstName);
		}
		if(inputValidator(lastName) && lastName != null) {
			this.lastName = lastName;
		}else {
			throw new invalidInput(lastName);
		}
		if (phone.length()==10 && phone != null) {
			this.phone = phone;
		}else {
			throw new invalidInput(phone);
		}
		if (address.length() < 31 && address != null) {
			this.address = address;
		}else {
			throw new invalidInput(address);
		}
	}
	
	private boolean inputValidator(String input) throws invalidInput {
		if(input.length() > 10) {
			throw new invalidInput(input);
			
		}else {
			return true;
		}
	}
	
	public void setContactID(String contactID) {
		this.contactID = contactID;
	}
	
	public String getContactID() {
		return contactID;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getAddress() {
		return address;
	}

}
