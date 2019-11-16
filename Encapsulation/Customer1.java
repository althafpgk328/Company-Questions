package Encapsulation;

public class Customer1 {
	int number;
	
	
	String name;
	String address;
	String contactNumber;
	String email;
	String proofType;
	String proofID;
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public boolean setName(String name) {
		if (name.matches("^[a-zA-Z]*$"))
        {
            this.name=name;
            return true;
        }
        else
        {
            System.out.println("Invalid  Name");
            return false;
        }
	
	}
	public String getAddress() {
		return address;
	}
	public boolean setAddress(String address) {
		if (address.matches("^[a-zA-z0-9]*$"))
        {
            this.address=address;
            return true;
        }
        else
        {
            System.out.println("Invalid Contact Number");
            return false;
        }
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public boolean setContactNumber(String contact)
    {
        if (contact.matches("^[0-9]*$"))
        {
            this.contactNumber=contact;
            return true;
        }
        else
        {
            System.out.println("Invalid Contact Number");
            return false;
        }
    }
   
	public String getEmail() {
		return email;
	}
	public boolean setEmail(String email) {
		 if (email.contains("@"))
         {
             this.email=email;
             return true;
         }
         else
         {
             System.out.println("Invalid Email");
             return false;
         }
     }
       
	public String getProofType() {
		return proofType;
	}
	public boolean setProofType(String proofType) {
		if (proofType.matches("^[a-zA-z0-9]*$"))
        {
            this.proofType=proofType;
            return true;
        }
        else
        {
            System.out.println("Invalid proof");
            return false;
        }
	}
	public String getProofID() {
		return proofID;
	}
	public boolean setProofID(String proofID) {
		if (proofID.matches("^[a-zA-z0-9]*$"))
        {
            this.proofID=proofID;
            return true;
        }
        else
        {
            System.out.println("Invalid Proof Id");
            return false;
        }
	}
	void display()
	{
		System.out.println("Your Details");
		System.out.println(getNumber());
		System.out.println(getName());
		System.out.println(getAddress());
		System.out.println(getContactNumber());
		System.out.println(getEmail());
		System.out.println(getProofType());
		System.out.println(getProofID());
		System.out.printf("Your id is ",+getNumber());
	}
	

}
