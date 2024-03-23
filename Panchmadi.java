import java.util.*;

public class Panchmadi
{
	public void pipariya()
	{
		Panchmadi p1 = new Panchmadi();
		System.out.println("You reached at Pipariya");
		
		System.out.println("Select the Transportation by which you want to go to Panchamadi");
		System.out.println("Press 1 for Bus ");
		System.out.println("Press 2 for Private Traveller ");
		System.out.println("Press 3 for Car ");
		System.out.println("Press 4 for Bike ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if (a == 1)
		{
			p1.bus();
		}
		else if (a == 2)
		{
			p1.private_vehicle();
		}
		else if (a == 3)
		{
			p1.car();
		}
		else if (a == 4)
		{
			p1.bike();
		}
		else 
		{
			System.out.println("Please Enetr the correct option");
		}
	}
	public void bus()
	{
		Panchmadi p1 = new Panchmadi();
		
		System.out.println("Welcome to the Bus Service   ");
		System.out.println("Now you have to select the Bus through which you have to go.. ");
		System.out.println("Press 1 for Verma Bus Services");
		System.out.println("Press 2 for Charted Bus Services");
		System.out.println("Press 3 for Nandan Traveller Services");
		System.out.println("Press 4 for Neelkamal Bus Services");
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		if (a == 1)
		{
			p1.verma();
		}
		else if (a == 2)
		{
			p1.charted();
		}
		else if (a == 3)
		{
			p1.nandan();
		}
		else if (a == 4 )
		{
			p1.neelkamal();
		}
		else 
		{
			System.out.println("Press select the correct option ");
		}
	}
	public void verma()
	{
		System.out.println("Welcome to Verma Bus Service   :) ");
		System.out.println(" Select which seat you want .....");
		System.out.println(" There are two Option..");
		System.out.println(" Press 1 for Seater ");
		System.out.println(" Press 2 for Sleeper");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if (a == 1)
		{
			System.out.println("Your Seat will cost  - 90 Ruppees");
			System.out.println(" Thank you for using bus service  .|. ");
		}
		else
		{
			System.out.println("Your Sleeper will cost  - 200 Ruppees");
			System.out.println(" Thank you for using bus service  .|. ");
		}
	}
	public void charted()
	{
		System.out.println("Welcome to Charted Bus Service   :) ");
		System.out.println(" Select which seat you want .....");
		System.out.println(" There are two Option..");
		System.out.println(" Press 1 for Seater ");
		System.out.println(" Press 2 for Sleeper");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if (a == 1)
		{
			System.out.println("Your Seat will cost  - 120 Ruppees");
			System.out.println(" Thank you for using bus service  .|. ");
		}
		else
		{
			System.out.println("Your Sleeper will cost  - 250 Ruppees");
			System.out.println(" Thank you for using bus service  .|. ");
		}
	}
	public void nandan()
	{
		System.out.println("Welcome to Nandan Traveller Service   :) ");
		System.out.println(" Select which seat you want .....");
		System.out.println(" There are two Option..");
		System.out.println(" Press 1 for Seater ");
		System.out.println(" Press 2 for Sleeper");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if (a == 1)
		{
			System.out.println("Your Seat will cost  - 100 Ruppees");
			System.out.println(" Thank you for using bus service  .|. ");
		}
		else
		{
			System.out.println("Your Sleeper will cost  - 220 Ruppees");
			System.out.println(" Thank you for using bus service  .|. ");
		}
	}
	
	public void neelkamal()
	{
		System.out.println("Welcome to Neelkamal Bus Services   :) ");
		System.out.println(" Select which seat you want .....");
		System.out.println(" There are two Option..");
		System.out.println(" Press 1 for Seater ");
		System.out.println(" Press 2 for Sleeper");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if (a == 1)
		{
			System.out.println("Your Seat will cost  - 100 Ruppees");
			System.out.println(" Thank you for using bus service  .|. ");
		}
		else
		{
			System.out.println("Your Sleeper will cost  - 220 Ruppees");
			System.out.println(" Thank you for using bus service  .|. ");
		}
	}
	
	
	public void private_vehicle()
	{
		System.out.println("You have to book private traveller vehicle by calling on the given number of agents:");
		System.out.println("Agent Name      :     Agent Number");
		System.out.println("                                  ");
		System.out.println("Aryan           :     9098565575");
		System.out.println("Aman            :     9098548784");
		System.out.println("Ayush           :     8545545575");
		System.out.println("Prince          :     9098535484");
		System.out.println("Harsh           :     7974215484");
		
		System.out.println("Thankyou for using Private Traveller   :)  ");
	}
	
	public void car()
	{
		System.out.println("you can book Car by the following places in Pipariya  --  ");
		System.out.println("Shop Name             :       Shop Owner Number");
		System.out.println("Sharma Car rental	  :       7697258345");
		System.out.println("Sahu  Car rental	  :       9977315533");
		System.out.println("Harman Rental   	  :       7974523567");
		System.out.println("Alka Enterpricesses   :       9671506802");
		
		System.out.println("                                        ");
		System.out.println("You can also book car online by the following links  --");
		System.out.println("www.carbooking.com");
		System.out.println("www.cardekho.com");
		System.out.println("www.book_kro_car.com");
		System.out.println("                                        ");
		
		System.out.println("Thankyou for using Car  Services   :)  ");

	}
	public void bike()
	{
		System.out.println("you can book Bike by the following places in Pipariya  --  ");
		System.out.println("Shop Name             :       Shop Owner Number");
		System.out.println("Sharma  rental   	  :       7697258345");
		System.out.println("Sahu   rental	      :       9977315533");
		System.out.println("Harman Rental   	  :       7974523567");
		System.out.println("Alka Enterpricesses   :       9671506802");
		
		System.out.println("                                        ");
		System.out.println("You can also book car online by the following links  --");
		System.out.println("www.bike_booking.com");
		System.out.println("www.bikedekho.com");
		System.out.println("www.book_kro_bike.com");
		System.out.println("                                        ");
		
		System.out.println("Thankyou for using Bike  Services    :)  ");

	}
	public void flight()
	{
			Panchmadi p1 = new Panchmadi();
		System.out.println("To reach Pipariya the closest Airport is in Bhopal  ");
		System.out.println("From Bhopal you have to either take Train , Bus , Car, Bike or Private Traveller to reach Pipariya ");
		System.out.println("            ");
	    System.out.println("            ");
		System.out.println("Select the Transportation by which you want to go to Pipariya");
		System.out.println("Press 1 for Bus ");
		System.out.println("Press 2 for Private Traveller ");
		System.out.println("Press 3 for Car ");
		System.out.println("Press 4 for Bike ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if (a == 1)
		{
			p1.bus_from_bhopal();
		}
		else if (a == 2)
		{
			p1.private_vehicle();
		}
		else if (a == 3)
		{
			p1.car();
		}
		else if (a == 4)
		{
			p1.bike();
		}
		else 
		{
			System.out.println("Please Enetr the correct option");
		}
		
		System.out.println("If you further want to enquire on how to reach Panchmari, then write  Yes  otherwise write No ");
		String s = sc.next();
		if(s.equalsIgnorCase("yes"))
		{
			p1.bus();
		}
	}
	public void train()
	{
		Panchmadi p1 = new Panchmadi();
		System.out.println("To reach Pipariya. You have to book your ticket to Pipariya Station");
		p1.pipariya();
	}
	public void car1()
	{
		System.out.println("you can book Car by the following places in Pipariya  --  ");
		System.out.println("Shop Name             :       Shop Owner Number");
		System.out.println("Sharma Car rental	  :       7697258345");
		System.out.println("Sahu  Car rental	  :       9977315533");
		System.out.println("Harman Rental   	  :       7974523567");
		System.out.println("Alka Enterpricesses   :       9671506802");
		
		System.out.println("                                        ");
		System.out.println("You can also book car online by the following links  --");
		System.out.println("www.carbooking.com");
		System.out.println("www.cardekho.com");
		System.out.println("www.book_kro_car.com");
		System.out.println("                                        ");
		
		System.out.println("Thankyou for using Car  Services   :)  ");

	}
	public void bus_from_bhopal()
	{
		Panchmadi p1 = new Panchmadi();
		
		System.out.println("Welcome to the Bus Service   ");
		System.out.println("Now you have to select the Bus through which you have to go.. ");
		System.out.println("Press 1 for Verma Bus Services");
		System.out.println("Press 2 for Charted Bus Services");
		System.out.println("Press 3 for Nandan Traveller Services");
		System.out.println("Press 4 for Neelkamal Bus Services");
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		if (a == 1)
		{
			p1.verma1();
		}
		else if (a == 2)
		{
			p1.charted2();
		}
		else if (a == 3)
		{
			p1.nandan3();
		}
		else if (a == 4 )
		{
			p1.neelkamal4();
		}
		else 
		{
			System.out.println("Press select the correct option ");
		}
	}
	public void verma1()
	{
		System.out.println("Welcome to Verma Bus Service   :) ");
		System.out.println(" Select which seat you want .....");
		System.out.println(" There are two Option..");
		System.out.println(" Press 1 for Seater ");
		System.out.println(" Press 2 for Sleeper");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if (a == 1)
		{
			System.out.println("Your Seat will cost  - 350 Ruppees");
			System.out.println(" Thank you for using bus service  .|. ");
		}
		else
		{
			System.out.println("Your Sleeper will cost  - 500 Ruppees");
			System.out.println(" Thank you for using bus service  .|. ");
		}
	}
	public void charted2()
	{
		System.out.println("Welcome to Charted Bus Service   :) ");
		System.out.println(" Select which seat you want .....");
		System.out.println(" There are two Option..");
		System.out.println(" Press 1 for Seater ");
		System.out.println(" Press 2 for Sleeper");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if (a == 1)
		{
			System.out.println("Your Seat will cost  - 420 Ruppees");
			System.out.println(" Thank you for using bus service  .|. ");
		}
		else
		{
			System.out.println("Your Sleeper will cost  - 600 Ruppees");
			System.out.println(" Thank you for using bus service  .|. ");
		}
	}
	public void nandan3()
	{
		System.out.println("Welcome to Nandan Traveller Service   :) ");
		System.out.println(" Select which seat you want .....");
		System.out.println(" There are two Option..");
		System.out.println(" Press 1 for Seater ");
		System.out.println(" Press 2 for Sleeper");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if (a == 1)
		{
			System.out.println("Your Seat will cost  - 250 Ruppees");
			System.out.println(" Thank you for using bus service  .|. ");
		}
		else
		{
			System.out.println("Your Sleeper will cost  - 450 Ruppees");
			System.out.println(" Thank you for using bus service  .|. ");
		}
	}
	
	public void neelkamal4()
	{
		System.out.println("Welcome to Neelkamal Bus Services   :) ");
		System.out.println(" Select which seat you want .....");
		System.out.println(" There are two Option..");
		System.out.println(" Press 1 for Seater ");
		System.out.println(" Press 2 for Sleeper");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if (a == 1)
		{
			System.out.println("Your Seat will cost  - 320 Ruppees");
			System.out.println(" Thank you for using bus service  .|. ");
		}
		else
		{
			System.out.println("Your Sleeper will cost  - 460 Ruppees");
			System.out.println(" Thank you for using bus service  .|. ");
		}
	}
	
public static void main(String[] args)
{
	System.out.println("            ~~~ WELCOME TO THE TRAVELLER GUIDE ~~           ");
	System.out.println("                       ");
	System.out.println("                       ");
	System.out.println("In this section we will be guiding, how you can reach to the Panchamadi , The biggest hill ststion of Madhya Pradesh  ");
	System.out.println("            ");
	System.out.println("            ");
	
	System.out.println(" To go to the panchmadi you first have to go to the Pipariya, which is the last city from Panchamadi           ");
	System.out.println("            ");
	System.out.println("            ");
	System.out.println("There are three posibile way to reach PIpariya. They are -");
	System.out.println("  1) By Flight          ");
	System.out.println("  2) By Train          ");
	System.out.println("  3) By Bus          ");
	System.out.println("            ");
	System.out.println("            ");
	System.out.println("   Press 1 for Enquiry          ");
	System.out.println("   Press 2 for Booking          ");
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	if (a==1)
	{
		System.out.println("You have to select the transportation route to reach Pipariya");
		System.out.println("Press 1 for Flight");
		System.out.println("Press 2 for Train");
		System.out.println("Press 3 for Bus");
		//Panchmadi p1 = new Panchmadi();
	    //p1.pipariya();
		int b = sc.nextInt();
		if (b==1)
		{
			Panchmadi p1 = new Panchmadi();
			p1.flight();
			
			
		}
		else if  (b==2)
		{
			Panchmadi p1 = new Panchmadi();
			p1.train();
			
		}
		else if (b == 3)
		{
		Panchmadi p1 = new Panchmadi();
			p1.bus();	
		}
		else 
		{
			System.out.println("Enter the correct choice");
		}
	}
	else if (a == 2)
	{
		System.out.println("You may go to the online booking websites for booking tickets");
	}
	
	
}
}