package com.Evaluation2_Q3;

public class Ola {

	public Car bookCar(int numberOfPassenger, int numberOfKMs) {
		
		if(numberOfPassenger > 0 && numberOfPassenger <= 3)
		{
			Sedan s1 = new Sedan();
			s1.setNumberOfPassenger(numberOfPassenger);
			s1.setNumberOfKms(numberOfKMs);
			
			return s1;
		}
		else if(numberOfPassenger > 3) {
			HatchBack h1 = new HatchBack();
			h1.setNumberOfPassenger(numberOfPassenger);
			h1.setNumberOfKms(numberOfKMs);
			
			return h1;
		}
		else {
			return null;
		}
	}
	
	
	public int calculateBill(Car car) {
		
		int totalFare ;
		
		if(car instanceof Sedan)
		{
			Sedan s = (Sedan)car;
		
			totalFare = s.farePerKm * s.getNumberOfKms();
			
			return totalFare;
		}
		else if(car instanceof HatchBack) {
            HatchBack h = (HatchBack)car;
            
            totalFare = h.farePerKm * h.getNumberOfKms();
			
			return totalFare;
		}
		else {
			System.out.println("Please choose a valid number of passengers.");
			return 0;
		}
		
	}
}
