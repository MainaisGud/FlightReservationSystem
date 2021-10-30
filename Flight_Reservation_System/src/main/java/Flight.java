public class Flight 
{
	private long Flight_number;
	private int Flight_type;
	private int Capacity;
	private int Highest_fare;
	private int Lowest_fare;
	private boolean [] seat_status; 
	private int number_of_avaialbleSeats;

	public Flight() 
	{
		Flight_number = -1;
		Flight_type = 0;
		Capacity = -1;
		Highest_fare = -1;
		Lowest_fare = -1;
		this.seat_status = null;
		number_of_avaialbleSeats = -1;
	}
	
	public Flight(long flight_number, int flight_type, int capacity, int highest_fare, int lowest_fare) 
	{
		Flight_number = flight_number;
		Flight_type = flight_type;
		Capacity = capacity;
		Highest_fare = highest_fare;
		Lowest_fare = lowest_fare;
		this.seat_status = new boolean [capacity] ;
		number_of_avaialbleSeats = capacity;
	}
	
	public long getFlight_number() 
	{
		return Flight_number;
	}

	public void setFlight_number(long flight_number) 
	{
		Flight_number = flight_number;
	}

	public int getFlight_type() 
	{
		return Flight_type;
	}

	public void setFlight_type(int flight_type) 
	{
		Flight_type = flight_type;
	}

	public int getCapacity() 
	{
		return Capacity;
	}

	public void setCapacity(int capacity) 
	{
		Capacity = capacity;
	}

	public int getHighest_fare() 
	{
		return Highest_fare;
	}

	public void setHighest_fare(int highest_fare) 
	{
		Highest_fare = highest_fare;
	}

	public int getLowest_fare() 
	{
		return Lowest_fare;
	}

	public void setLowest_fare(int lowest_fare) 
	{
		Lowest_fare = lowest_fare;
	}

	public boolean getSeat_status(int index) 
	{
		return seat_status[index];
	}

	public void setSeat_status(int index, boolean val) 
	{
		seat_status[index] = val;
	}
	
	public int getNumber_of_avaialbleSeats() 
	{
		return number_of_avaialbleSeats;
	}

	public void setNumber_of_avaialbleSeats(int number_of_avaialbleSeats) 
	{
		this.number_of_avaialbleSeats = number_of_avaialbleSeats;
	}
	
	public boolean BookSeat(int num) 
	{
		if(seat_status[num-1] == true)
		{
			System.out.print("\nSEAT UNAVAILABLE. Please choose another seat !");
			return false;
		}
		else if(seat_status[num-1] == false)
		{
			seat_status[num-1] = true;
			System.out.print("\nSEAT BOOKED SUCCESSFULLY !");
			number_of_avaialbleSeats--;
		}	
		return true;
	}
	
	public boolean CancelSeat(int num) 
	{
		if(seat_status[num-1] == true)
		{
			seat_status[num-1] = false;
			System.out.print("\nYOUR BOOKING HAS BEEN CANCELLED.");
			number_of_avaialbleSeats++;
			return true;
		}
		else if(seat_status[num-1] == true)
		{
			System.out.print("\nTHE REQUESTED SEAT FOR CANCELLATION WASN'T BOOKED INITIALLY. ENTER CORRECT SEAT NUMBER.");
		}
		return false;
	}
}
