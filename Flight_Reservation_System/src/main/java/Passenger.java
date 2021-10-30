import java.util.Scanner;

public class Passenger 
{
	private String Name;
	private char Gender;
	private int Age;
	private String Address;
	private long Contact_number;
	private String Passport_number;
	private int Plane_type;
	private String Destination;
	
	public Passenger() 
	{
		Name = " ";
		Gender = ' ';
		Age = -1;
		Address = " ";
		Contact_number = -1;
		Passport_number = " ";
		Plane_type = -1;
		Destination = " ";
	}
	
	public Passenger(String name, char gender, int age, String address, long contact_number, String passport_number,
			int plane_type, String destination) 
	{
		Name = name;
		Gender = gender;
		Age = age;
		Address = address;
		Contact_number = contact_number;
		Passport_number = passport_number;
		Plane_type = plane_type;
		Destination = destination;
	}
	
	public String getName() 
	{
		return Name;
	}

	public void setName(String name) 
	{
		Name = name;
	}

	public char getGender() 
	{
		return Gender;
	}

	public void setGender(char gender) 
	{
		Gender = gender;
	}

	public int getAge() 
	{
		return Age;
	}

	public void setAge(int age) 
	{
		Age = age;
	}

	public String getAddress() 
	{
		return Address;
	}

	public void setAddress(String address) 
	{
		Address = address;
	}

	public long getContact_number() 
	{
		return Contact_number;
	}

	public void setContact_number(long contact_number) 
	{
		Contact_number = contact_number;
	}

	public String getPassport_number() 
	{
		return Passport_number;
	}

	public void setPassport_number(String passport_number) 
	{
		Passport_number = passport_number;
	}

	public int getPlane_type() 
	{
		return Plane_type;
	}

	public void setPlane_type(int plane_type) 
	{
		Plane_type = plane_type;
	}

	public String getDestination() 
	{
		return Destination;
	}

	public void setDestination(String destination) 
	{
		Destination = destination;
	}
	
	public void DisplayPassengerDetails()
	{
		System.out.print("\n************ PASSENGER DETAILS ************\n");
		System.out.print("\nNAME : " + Name);
		System.out.print("\nGENDER : ");
		
		if (Gender == 'M' || Gender == 'm')
			System.out.print("Male");
		else if (Gender == 'F' || Gender == 'f')
			System.out.print("Female");
		
		System.out.print("\nAGE : " + Age + "years");
		System.out.print("\nADDRESS : " + Address);
		System.out.print("\nCONTACT NUMBER : " + Contact_number);
		System.out.print("\nPASSPORT NUMBER : " + Passport_number);
		System.out.print("\nPLANE TYPE : ");
		
		if (Plane_type == 1)
			System.out.print("Boeing");
		else if (Plane_type == 2)
			System.out.print("Airbus");
		
		System.out.print("\nDESTINATION : " + Destination);
		System.out.print("\n\n********************************************");
	}
}
