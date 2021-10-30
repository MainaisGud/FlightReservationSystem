import java.util.Scanner;

public class Driver 
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int choice;		
		
		String name;
		char gender;
		int age;
		String address;
		long contact_number;
		String passport_number;
		
		System.out.print("\nENTER THE INQUIRED CREDENTIALS TO CREATE YOUR ACCOUNT.");
		
		System.out.print("\nENTER YOUR NAME : ");
		name = input.nextLine();
		
		do
		{
			System.out.print("\nENTER YOUR GENDER (M or F only) : ");
			gender = input.next().charAt(0);
			
			if(gender!='m' || gender!='M' || gender!='f' || gender!='F')
				System.out.print("\nINVALID ENTRY !");
			
		}while(gender!='m' || gender!='M' || gender!='f' || gender!='F');
		
		System.out.print("\nENTER YOUR AGE : ");
		age = input.nextInt();
		
		System.out.print("\nENTER YOUR ADDRESS : ");
		address = input.nextLine();
		
		System.out.print("\nENTER YOUR CONTACT NUMBER : ");
		contact_number = input.nextLong();
		
		System.out.print("\nENTER YOUR PASSPORT NUMBER : ");
		passport_number = input.nextLine();
		
		Passenger P1 = new Passenger (name,gender,age,address,contact_number,passport_number,0," ");
		Flight F1 = new Flight (872369197, ' ',150,150000,80000);
		
		do
		{
			do 
			{	
				System.out.print("\n*****************************************************"
								+"\n        WELCOME TO FLIGHT RESERVATION SYSTEM"
								+"\n*****************************************************"
								+"\nENTER THE NUMBER CORRESPONDING TO YOUR DESIRED CHOICE"
								+"\n1- BOOK A FLIGHT."
								+"\n2- CANCEL A FLIGHT."
								+"\n3- VIEW YOUR CREDENTIALS."
								+"\n4- EDIT YOUR CREDENTIALS."
								+"\n5- VIEW THE PRICE LIST."
								+"\n6- EXIT.\n");
						
					choice = input.nextInt();
					
					if(choice<1 || choice>6)
						System.out.print("\nINVALID ENTRY !");
				
			}while(choice<1 || choice>6);
			
			if(choice==1)
			{
				String dest;
				int t1, t2, t3;
				
				System.out.print("\n*****************************************************"
								+"\n        			BOOK A FLIGHT"
								+"\n*****************************************************");
				
				System.out.print("\nENTER YOUR DESTINATION : ");
				dest = input.nextLine();
				
				do
				{
					System.out.print("\nENTER YOUR PLANE TYPE (1 for Boeing AND 2 for AirBus) : ");
					t1 = input.nextInt();
					
					if(t1<1 || t1>2)
						System.out.print("\nINAVLID ENTRY!");
					
				}while(t1<1 || t1>2);
				
				do
				{
					System.out.print("\nENTER YOUR PLANE TYPE (1 for Business AND 2 for Economy) : ");
					t2 = input.nextInt();
					
					if(t2<1 || t2>2)
						System.out.print("\nINAVLID ENTRY!");
					
				}while(t2<1 || t2>2);
				
				P1.setDestination(dest);
				P1.setPlane_type(t1);
				F1.setFlight_type(t2);
				
				do
				{
					System.out.print("\nENTER YOUR SEAT NUMBER YOU WANT TO BOOK (1-150) : ");
					t3 = input.nextInt();
					
					if(t3<1 || t3>150)
						System.out.print("\nINAVLID ENTRY!");
					
				}while(t3<1 || t3>150);
				
				if(!F1.BookSeat(t3))
					System.out.print("\nSEAT WAS NOT BOOKED!");
				else
					System.out.print("\nSEAT BOOKED SUCCESSFULLY");
			}
			else if(choice==2)
			{
				int t4;
				System.out.print("\n*****************************************************"
								+"\n        			CANCEL A FLIGHT"
								+"\n*****************************************************");
				System.out.print("\nENTERED THE SEAT NUMBER YOU WANT TO CANCEL : ");
				t4 = input.nextInt();
				if(!F1.CancelSeat(t4))
					System.out.print("\nSEAT CANCELLATION UNSUCCESSFUL!");
				else
					System.out.print("\nSEAT CANCELLATION SUCCESSFUL!");
			}
			else if(choice==3)
			{
				P1.DisplayPassengerDetails();
			}
			else if(choice==4)
			{
				int user_ch;
				
				do
				{
					do
					{
						System.out.print("\n*****************************************************"
										+"\n        		EDIT YOUR CREDENTIALS"
										+"\n*****************************************************"
										+"\nENTER THE NUMBER CORRESPONDING TO YOUR DESIRED CHOICE"
										+"\n1- EDIT YOUR NAME"
										+"\n2- EDIT YOUR GENDER"
										+"\n3- EDIT YOR AGE"
										+"\n4- EDIT YOUR ADDRESS"
										+"\n5- EDIT YOUR CONTACT NUMBER"
										+"\n6- EDIT YOUR PASSPORT NUMBER"
										+"\n7- EXIT"
										+"\nCHOICE : ");
						user_ch = input.nextInt();
						
						if(user_ch<1 || user_ch>7)
							System.out.print("\nINAVLID ENTRY!");
			
					}while(user_ch<1 || user_ch>7);
					
					switch(user_ch)
					{
						case 1:
							System.out.print("\nENTER YOUR NAME : ");
							name = input.nextLine();
							P1.setName(name);
							break;
							
						case 2:
							do
							{
								System.out.print("\nENTER YOUR GENDER (M or F only) : ");
								gender = input.next().charAt(0);
								
								if(gender!='m' || gender!='M' || gender!='f' || gender!='F')
									System.out.print("\nINVALID ENTRY !");
								
							}while(gender!='m' || gender!='M' || gender!='f' || gender!='F');
							P1.setGender(gender);
							break;
							
						case 3:
							System.out.print("\nENTER YOUR AGE : ");
							age = input.nextInt();
							P1.setAge(age);
							break;
							
						case 4:
							System.out.print("\nENTER YOUR ADDRESS : ");
							address = input.nextLine();
							P1.setAddress(address);
							break;
							
						case 5:
							System.out.print("\nENTER YOUR CONTACT NUMBER : ");
							contact_number = input.nextLong();
							P1.setContact_number(contact_number);
							break;
							
						case 6:
							System.out.print("\nENTER YOUR PASSPORT NUMBER : ");
							passport_number = input.nextLine();
							P1.setPassport_number(passport_number);
							break;
							
						case 7:
							break;
					}
				}while(user_ch!=7);
	
			}
			else if(choice==5)
			{
				System.out.print("\n*****************************************************"
								+"\n        			PRICE LIST"
								+"\n*****************************************************"
								+"\nECONOMY CLASS (LOWEST FARE) : PKR 80,000"
								+"\nBUSINESS CLASS (HIGHEST FARE) : PKR 150,000");
			}
			
		}while(choice!=6);
	}
}
