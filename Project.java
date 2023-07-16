package com.pack2;
import java.time.*;
import java.util.*;

public class Project 
{
	ArrayList<String>PName = new ArrayList<String>();
	ArrayList<String>PCode = new ArrayList<String>();
	ArrayList<Double>Price = new ArrayList<Double>();
	ArrayList<Integer>Quantity = new ArrayList<Integer>();
	ArrayList<Double>Total_Price = new ArrayList<Double>();
	Scanner sc = new Scanner(System.in);
	double totalbill = 0.0;
	public void start()
	{
		System.out.println();
		System.out.println(" \u2738 \u2771 \u2771 \u2771 \u2771 \u2771 \u2771 \u2771 \u2771 \u2771 \u2771 \u2771   Welcome to Organic Store    \u2770 \u2770 \u2770 \u2770 \u2770 \u2770 \u2770 \u2770 \u2770 \u2770 \u2770 \u2738");
		System.out.println();
		System.out.println("Press 1 to Continue ");
		int ip = sc.nextInt();
		if(ip==1)
		{
			this.item_list();
		}
		else
		{
			System.out.println("Invalid Input....Press correct Option");
			this.start();
		}
	}
	void item_list()
	{
		System.out.println("-------------------------------------------------");
		System.out.println("|		1)Fruits         		|\n|		2)Vegetables    		|\n|		3)Cosmetics     		|\n|		4)Masala Powders		|\n|		5)Exist         		|");
		System.out.println("-------------------------------------------------");
		System.out.println("Please Choose Your Option :");
		int a = sc.nextInt();
		this.meth2(a);		
	}
	void meth2(int a)
	{
		if(a<=5)
		{
			System.out.println("To Continue press-1\tTo go back press-2");
			int b = sc.nextInt();
			if(b==1)
			{
				this.items(a);
			}
			else if(b==2)
			{
				this.item_list();
			}
			else
			{
				System.out.println("Invalid Input....Press correct Option");
				this.meth2(a);
			}
			
		}
		else
		{
			System.out.println();
			System.out.println("Invalid Input....Choose correct Option");
			System.out.println();
			this.item_list();
		}
	}
	void items(int a)
	{
		switch(a)
		{
			case 1:
				System.out.println("---------------------------------------------------------");
				System.out.println("|	101)Mango---------------1Kg---Rs.200		|\n|	102)Apple---------------1Kg---Rs.250		|\n|	103)Banana--------------1Kg---Rs.100		|\n|	104)Pine apple----------1Kg---Rs.120		|\n|	105)Papaya--------------1Kg---Rs.60		|\n\n		   0)Exit			");
				System.out.println("---------------------------------------------------------");
				System.out.print("Please Choose Your Option :");
				int choice1 = sc.nextInt();
				if(choice1 == 101)
				{
					this.mango(a);
				}
				else if(choice1 == 102)
				{
					this.apple(a);
				}
				else if(choice1 == 103)
				{
					this.banana(a);
				}
				else if(choice1 == 104)
				{
					this.pineApple(a);
				}
				else if(choice1 == 105)
				{
					this.papaya(a);
				}
				else if(choice1 == 0)
				{
					
				}
				else
				{
					System.out.println();
					System.out.println("Invalid Input....Choose correct Option");
					System.out.println();
					this.items(a);
				}
				break;
			case 2:
				System.out.println("-----------------------------------------------------");
				System.out.println("|	201)Tomato--------------1Kg---Rs.50	    |\n|	202)Onion---------------1Kg---Rs.60	    |\n|	203)Carrot--------------1Kg---Rs.25	    |\n|	204)Cabbage-------------1Kg---Rs.30	    |\n|	205)Potato--------------1Kg---Rs.45	    |\n\n			0)Exit		   ");
				System.out.println("-----------------------------------------------------");
				System.out.print("Please Choose Your Option :");
				int choice2 = sc.nextInt();
				if(choice2 == 201)
				{
					this.tomato(a);
				}
				else if(choice2 == 202)
				{
					this.onion(a);
				}
				else if(choice2 == 203)
				{
					this.carrort(a);
				}
				else if(choice2 == 204)
				{
					this.cabbage(a);
				}
				else if(choice2 == 205)
				{
					this.potato(a);
				}
				else
				{
					System.out.println();
					System.out.println("Invalid Input....Choose correct Option");
					System.out.println();
					this.items(a);
				}
				break;
			case 3:
				System.out.println("------------------------------------------------------");
				System.out.println("|	301)Kajal---------------1---Rs.50	     |\n|	302)Lip stick-----------1---Rs.20	     |\n|	303)Nail polish---------1---Rs.30	     |\n|	304)Face Powder---------1---Rs.70	     |\n|	305)Lotion--------------1---Rs.120	     |\n\n		  0)Exit		");
				System.out.println("------------------------------------------------------");
				System.out.print("Please Choose Your Option :");
				int choice3 = sc.nextInt();
				if(choice3 == 301)
				{
					this.kajal(a);
				}
				else if(choice3 == 302)
				{
					this.lip_stick(a);
				}
				else if(choice3 == 303)
				{
					this.nail_polish(a);
				}
				else if(choice3 == 304)
				{
					this.face_powder(a);
				}
				else if(choice3 == 305)
				{
					this.lotion(a);
				}
				else
				{
					System.out.println();
					System.out.println("Invalid Input....Choose correct Option");
					System.out.println();
					this.items(a);
				}
				break;
			case 4:
				System.out.println("------------------------------------------------------");
				System.out.println("|	401)Turmeric Powder-----1pack---Rs.30	     |\n|	402)Red Chilli Powder---1pack---Rs.60	     |\n|	403)Rasam Powder--------1pack---Rs.15	     |\n|	404)Sambar Powder-------1pack---Rs.13	     |\n|	405)Garam Masala--------1pack---Rs.20	     |\n\n		   0)Exit		");
				System.out.println("------------------------------------------------------");
				System.out.print("Please Choose Your Option :");
				int choice4 = sc.nextInt();
				if(choice4 == 401)
				{
					this.turmeric_powder(a);
				}
				else if(choice4 == 402)
				{
					this.red_chilli_powder(a);
				}
				else if(choice4 == 403)
				{
					this.rasam_powder(a);
				}
				else if(choice4 == 404)
				{
					this.sambar_powder(a);
				}
				else if(choice4 == 405)
				{
					this.garam_masala(a);
				}
				else
				{
					System.out.println();
					System.out.println("Invalid Input....Choose correct Option");
					System.out.println();
					this.items(a);
				}
				break;
			case 5:
				totalbill = 0.0;
				System.out.println();
				System.out.println("Succesfully Exited");
				System.out.println("****************************************************");
				System.out.println();
				System.out.println();
				this.start();
		}
	}
	void mango(int a)
	{
		System.out.println();
		System.out.println("Press 1 to Continue \t press 2 to go back \t press 3 to go to main list");
		int s = sc.nextInt();
		String productName = "Mango               ";
		String productCode = "101";
		double price = 200; 
		if(s==1)
		{
			System.out.println();
			System.out.println("How Many Kgs of Mangos do you need ?");
			int quantity = sc.nextInt();
			double total = quantity*200;
			this.bill_data(total, productName, productCode, price, quantity);
		}
		else if(s==2)
		{
			this.items(a);
		}
		else if(s==3)
		{
			this.item_list();
		}
		else
		{
			System.out.println();
			System.out.println("Invalid Input....Choose correct Option");
			System.out.println();
			this.mango(a);
		}
	}
	void apple(int a)
	{
		System.out.println();
		System.out.println("Press 1 to Continue \t press 2 to go back \t press 3 to go to main list");
		int s = sc.nextInt();
		String productName = "Apple               ";
		String productCode = "102";
		double price = 250; 
		if(s==1)
		{
			System.out.println();
			System.out.println("How Many Kgs of Apples do you need ?");
			int quantity = sc.nextInt();
			double total = quantity*250;
			this.bill_data(total, productName, productCode, price, quantity);
		}
		else if(s==2)
		{
			this.items(a);
		}
		else if(s==3)
		{
			this.item_list();
		}
		else
		{
			System.out.println();
			System.out.println("Invalid Input....Choose correct Option");
			System.out.println();
			this.apple(a);
		}
	}
	void banana(int a)
	{
		System.out.println();
		System.out.println("Press 1 to Continue \t press 2 to go back \t press 3 to go to main list");
		int s = sc.nextInt();
		String productName = "Banana              ";
		String productCode = "103";
		double price = 100;
		if(s==1)
		{
			System.out.println();
			System.out.println("How Many Kgs of Bananas do you need ?");
			int quantity = sc.nextInt();
			double total = quantity*100;
			this.bill_data(total, productName, productCode, price, quantity);
		}
		else if(s==2)
		{
			this.items(a);
		}
		else if(s==3)
		{
			this.item_list();
		}
		else
		{
			System.out.println();
			System.out.println("Invalid Input....Choose correct Option");
			System.out.println();
			this.banana(a);
		}
	}
	void pineApple(int a)
	{
		System.out.println();
		System.out.println("Press 1 to Continue \t press 2 to go back \t press 3 to go to main list");
		int s = sc.nextInt();
		String productName = "Pine Apple          ";
		String productCode = "104";
		double price = 120;
		if(s==1)
		{
			System.out.println();
			System.out.println("How Many Kgs of Pine Apples do you need ?");
			int quantity = sc.nextInt();
			double total = quantity*120;
			this.bill_data(total, productName, productCode, price, quantity);
		}
		else if(s==2)
		{
			this.items(a);
		}
		else if(s==3)
		{
			this.item_list();
		}
		else
		{
			System.out.println();
			System.out.println("Invalid Input....Choose correct Option");
			System.out.println();
			this.pineApple(a);
		}
	}
	void papaya(int a)
	{
		System.out.println();
		System.out.println("Press 1 to Continue \t press 2 to go back \t press 3 to go to main list");
		int s = sc.nextInt();
		String productName = "Papaya              ";
		String productCode = "105";
		double price = 60;
		if(s==1)
		{
			System.out.println();
			System.out.println("How Many Kgs of Papaya do you need ?");
			int quantity = sc.nextInt();
			double total = quantity*60;
			this.bill_data(total, productName, productCode, price, quantity);
		}
		else if(s==2)
		{
			this.items(a);
		}
		else if(s==3)
		{
			this.item_list();
		}
		else
		{
			System.out.println();
			System.out.println("Invalid Input....Choose correct Option");
			System.out.println();
			this.papaya(a);
		}
	}
	void tomato(int a)
	{
		System.out.println();
		System.out.println("Press 1 to Continue \t press 2 to go back \t press 3 to go to main list");
		int s = sc.nextInt();
		String productName = "Tomato              ";
		String productCode = "201";
		double price = 50;
		if(s==1)
		{
			System.out.println();
			System.out.println("How Many Kgs of Tomato do you need ?");
			int quantity = sc.nextInt();
			double total = quantity*50;
			this.bill_data(total, productName, productCode, price, quantity);
		}
		else if(s==2)
		{
			this.items(a);
		}
		else if(s==3)
		{
			this.item_list();
		}
		else
		{
			System.out.println();
			System.out.println("Invalid Input....Choose correct Option");
			System.out.println();
			this.tomato(a);
		}
	}
	void onion(int a)
	{
		System.out.println();
		System.out.println("Press 1 to Continue \t press 2 to go back \t press 3 to go to main list");
		int s = sc.nextInt();
		String productName = "Onion               ";
		String productCode = "202";
		double price = 60;
		if(s==1)
		{
			System.out.println();
			System.out.println("How Many Kgs of Onions do you need ?");
			int quantity = sc.nextInt();
			double total = quantity*60;
			this.bill_data(total, productName, productCode, price, quantity);
		}
		else if(s==2)
		{
			this.items(a);
		}
		else if(s==3)
		{
			this.item_list();
		}
		else
		{
			System.out.println();
			System.out.println("Invalid Input....Choose correct Option");
			System.out.println();
			this.onion(a);
		}
	}
	void carrort(int a)
	{
		System.out.println();
		System.out.println("Press 1 to Continue \t press 2 to go back \t press 3 to go to main list");
		int s = sc.nextInt();
		String productName = "Carrort             ";
		String productCode = "203";
		double price = 25;
		if(s==1)
		{
			System.out.println();
			System.out.println("How Many Kgs of Carrorts do you need ?");
			int quantity = sc.nextInt();
			double total = quantity*25;
			this.bill_data(total, productName, productCode, price, quantity);
		}
		else if(s==2)
		{
			this.items(a);
		}
		else if(s==3)
		{
			this.item_list();
		}
		else
		{
			System.out.println();
			System.out.println("Invalid Input....Choose correct Option");
			System.out.println();
			this.carrort(a);
		}
	}
	void cabbage(int a)
	{
		System.out.println();
		System.out.println("Press 1 to Continue \t press 2 to go back \t press 3 to go to main list");
		int s = sc.nextInt();
		String productName = "Cabbage             ";
		String productCode = "204";
		double price = 30;
		if(s==1)
		{
			System.out.println();
			System.out.println("How Many Kgs of Cabbage do you need ?");
			int quantity = sc.nextInt();
			double total = quantity*30;
			this.bill_data(total, productName, productCode, price, quantity);
		}
		else if(s==2)
		{
			this.items(a);
		}
		else if(s==3)
		{
			this.item_list();
		}
		else
		{
			System.out.println();
			System.out.println("Invalid Input....Choose correct Option");
			System.out.println();
			this.cabbage(a);
		}
	}
	void potato(int a)
	{
		System.out.println();
		System.out.println("Press 1 to Continue \t press 2 to go back \t press 3 to go to main list");
		int s = sc.nextInt();
		String productName = "Potato              ";
		String productCode = "205";
		double price = 45;
		if(s==1)
		{
			System.out.println();
			System.out.println("How Many Kgs of Potatos do you need ?");
			int quantity = sc.nextInt();
			double total = quantity*45;
			this.bill_data(total, productName, productCode, price, quantity);
		}
		else if(s==2)
		{
			this.items(a);
		}
		else if(s==3)
		{
			this.item_list();
		}
		else
		{
			System.out.println();
			System.out.println("Invalid Input....Choose correct Option");
			System.out.println();
			this.potato(a);
		}
	}
	void kajal(int a)
	{
		System.out.println();
		System.out.println("Press 1 to Continue \t press 2 to go back \t press 3 to go to main list");
		int s = sc.nextInt();
		String productName = "Kajal               ";
		String productCode = "301";
		double price = 50;
		if(s==1)
		{
			System.out.println();
			System.out.println("How Many Kajals do you need ?");
			int quantity = sc.nextInt();
			double total = quantity*50;
			this.bill_data(total, productName, productCode, price, quantity);
		}
		else if(s==2)
		{
			this.items(a);
		}
		else if(s==3)
		{
			this.item_list();
		}
		else
		{
			System.out.println();
			System.out.println("Invalid Input....Choose correct Option");
			System.out.println();
			this.kajal(a);
		}
	}
	void lip_stick(int a)
	{
		System.out.println();
		System.out.println("Press 1 to Continue \t press 2 to go back \t press 3 to go to main list");
		int s = sc.nextInt();
		String productName = "Lip Stick           ";
		String productCode = "302";
		double price = 20;
		if(s==1)
		{
			System.out.println();
			System.out.println("How Many Lip Sticks do you need ?");
			int quantity = sc.nextInt();
			double total = quantity*20;
			this.bill_data(total, productName, productCode, price, quantity);
		}
		else if(s==2)
		{
			this.items(a);
		}
		else if(s==3)
		{
			this.item_list();
		}
		else
		{
			System.out.println();
			System.out.println("Invalid Input....Choose correct Option");
			System.out.println();
			this.lip_stick(a);
		}
	}
	void nail_polish(int a)
	{
		System.out.println();
		System.out.println("Press 1 to Continue \t press 2 to go back \t press 3 to go to main list");
		int s = sc.nextInt();
		String productName = "Nail Polish         ";
		String productCode = "303";
		double price = 30;
		if(s==1)
		{
			System.out.println();
			System.out.println("How Many Nail Polishes do you need ?");
			int quantity = sc.nextInt();
			double total = quantity*30;
			this.bill_data(total, productName, productCode, price, quantity);
		}
		else if(s==2)
		{
			this.items(a);
		}
		else if(s==3)
		{
			this.item_list();
		}
		else
		{
			System.out.println();
			System.out.println("Invalid Input....Choose correct Option");
			System.out.println();
			this.nail_polish(a);
		}
	}
	void face_powder(int a)
	{
		System.out.println();
		System.out.println("Press 1 to Continue \t press 2 to go back \t press 3 to go to main list");
		int s = sc.nextInt();
		String productName = "Face Powder         ";
		String productCode = "304";
		double price = 70;
		if(s==1)
		{
			System.out.println();
			System.out.println("How Many Face powders do you need ?");
			int quantity = sc.nextInt();
			double total = quantity*70;
			this.bill_data(total, productName, productCode, price, quantity);
		}
		else if(s==2)
		{
			this.items(a);
		}
		else if(s==3)
		{
			this.item_list();
		}
		else
		{
			System.out.println();
			System.out.println("Invalid Input....Choose correct Option");
			System.out.println();
			this.face_powder(a);
		}
	}
	void lotion(int a)
	{
		System.out.println();
		System.out.println("Press 1 to Continue \t press 2 to go back \t press 3 to go to main list");
		int s = sc.nextInt();
		String productName = "Lotion              ";
		String productCode = "305";
		double price = 120;
		if(s==1)
		{
			System.out.println();
			System.out.println("How Many Lotions do you need ?");
			int quantity = sc.nextInt();
			double total = quantity*120;
			this.bill_data(total, productName, productCode, price, quantity);
		}
		else if(s==2)
		{
			this.items(a);
		}
		else if(s==3)
		{
			this.item_list();
		}
		else
		{
			System.out.println();
			System.out.println("Invalid Input....Choose correct Option");
			System.out.println();
			this.lotion(a);
		}
	}
	void turmeric_powder(int a)
	{
		System.out.println();
		System.out.println("Press 1 to Continue \t press 2 to go back \t press 3 to go to main list");
		int s = sc.nextInt();
		String productName = "Turmeric Powder     ";
		String productCode = "401";
		double price = 30;
		if(s==1)
		{
			System.out.println();
			System.out.println("How Many packets of Turmeric Powder do you need ?");
			int quantity = sc.nextInt();
			double total = quantity*30;
			this.bill_data(total, productName, productCode, price, quantity);
		}
		else if(s==2)
		{
			this.items(a);
		}
		else if(s==3)
		{
			this.item_list();
		}
		else
		{
			System.out.println();
			System.out.println("Invalid Input....Choose correct Option");
			System.out.println();
			this.turmeric_powder(a);
		}
	}
	void red_chilli_powder(int a)
	{
		System.out.println();
		System.out.println("Press 1 to Continue \t press 2 to go back \t press 3 to go to main list");
		int s = sc.nextInt();
		String productName = "RedChilli Powder    ";
		String productCode = "402";
		double price = 60;
		if(s==1)
		{
			System.out.println();
			System.out.println("How Many packets of Red Chilli Powder do you need ?");
			int quantity = sc.nextInt();
			double total = quantity*60;
			this.bill_data(total, productName, productCode, price, quantity);
		}
		else if(s==2)
		{
			this.items(a);
		}
		else if(s==3)
		{
			this.item_list();
		}
		else
		{
			System.out.println();
			System.out.println("Invalid Input....Choose correct Option");
			System.out.println();
			this.red_chilli_powder(a);
		}
	}
	void rasam_powder(int a)
	{
		System.out.println();
		System.out.println("Press 1 to Continue \t press 2 to go back \t press 3 to go to main list");
		int s = sc.nextInt();
		String productName = "Rasam Powder        ";
		String productCode = "403";
		double price = 15;
		if(s==1)
		{
			System.out.println();
			System.out.println("How Many packets of Rasam Powder do you need ?");
			int quantity = sc.nextInt();
			double total = quantity*15;
			this.bill_data(total, productName, productCode, price, quantity);
		}
		else if(s==2)
		{
			this.items(a);
		}
		else if(s==3)
		{
			this.item_list();
		}
		else
		{
			System.out.println();
			System.out.println("Invalid Input....Choose correct Option");
			System.out.println();
			this.rasam_powder(a);
		}
	}
	void sambar_powder(int a)
	{
		System.out.println();
		System.out.println("Press 1 to Continue \t press 2 to go back \t press 3 to go to main list");
		int s = sc.nextInt();
		String productName = "Sambar Powder       ";
		String productCode = "404";
		double price = 13;
		if(s==1)
		{
			System.out.println();
			System.out.println("How Many packets of Sambar Powder do you need ?");
			int quantity = sc.nextInt();
			double total = quantity*13;
			this.bill_data(total, productName, productCode, price, quantity);
		}
		else if(s==2)
		{
			this.items(a);
		}
		else if(s==3)
		{
			this.item_list();
		}
		else
		{
			System.out.println();
			System.out.println("Invalid Input....Choose correct Option");
			System.out.println();
			this.sambar_powder(a);
		}
	}
	void garam_masala(int a)
	{
		System.out.println();
		System.out.println("Press 1 to Continue \t press 2 to go back \t press 3 to go to main list");
		int s = sc.nextInt();
		String productName = "Garam Masala        ";
		String productCode = "405";
		double price = 20;
		if(s==1)
		{
			System.out.println();
			System.out.println("How Many packets of Garam Masala do you need ?");
			int quantity = sc.nextInt();
			double total = quantity*20;
			this.bill_data(total, productName, productCode, price, quantity);
		}
		else if(s==2)
		{
			this.items(a);
		}
		else if(s==3)
		{
			this.item_list();
		}
		else
		{
			System.out.println();
			System.out.println("Invalid Input....Choose correct Option");
			System.out.println();
			this.garam_masala(a);
		}
	}
	void bill_data(double total,String productName,String productCode,double price,int quantity)
	{
		System.out.println("Press 1 for Continue Shopping....");
		System.out.println("Press 2 for Stop here and get Bill.....");
		System.out.println("Press 3 for Exit");
		int press = sc.nextInt();
		if(press==1)
		{
			totalbill = totalbill+total;
			this.data_store(productName, productCode, price, quantity, total);
			this.item_list();
		}
		else if(press==2)
		{
			totalbill = totalbill +total;
			this.data_store(productName,productCode,price,quantity,total);
			
			System.out.print("Enter your Name :");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Enter Your Address :");
			String address = sc.nextLine();
			int i = 1;
			String phNo="";
			while(i==1)
			{
				System.out.print("Enter Your Phone Number :");
				String phone = sc.nextLine();
				if(phone.length()==10)
				{
					phNo=phNo+phone;
					i--;
				}
				else
				{
					System.out.println("Please Enter Valid Phone Number.....");
				}
				System.out.println();
				
			}
			System.out.println();
			this.bill_display(name,address,phNo);
		}
		else if(press==3)
		{
			System.out.println();
			this.items(5);
		}
		else
		{
			System.out.println();
			System.out.println("You entered value is not there, choose correct option");
			System.out.println();
			this.bill_data(total, productName, productCode, price, quantity);
		}
	}
	void bill_display(String name,String address,String PhNo)
	{
		System.out.println("                                                     Date :- "+LocalDate.now());
		System.out.println("                                                     Time :- "+LocalTime.now());
		System.out.println("\u2771 \u2771 \u2771 \u2771 \u2771 \u2771 \u2771 \u2771 \u2771 \u2771 \u2771 \u2771 \u2771 \u2771 \u2771 \u2771 \u2771 \u2771 \u2771 \u2771 \u2771 \u2771 \u2771 \u2771 \u2771 \u2771 \u2771 \u2771 \u2771 \u2771 \u2771 \u2771 \u2771 \u2771 \u2771 \u2771 \u2771 \u2771 \u2771 \u2771 \u2771 \u2771 \u2771 \u2771 \u2771 \u2771 \u2771 \u2771 \u2771 \u2771 \u2771 \u2771");
		System.out.println();
		System.out.println("S.No  product Name             Product Code  Quantity   Price    Total Price");
		System.out.println("----  ------------             ------------  --------  -------  -------------");
		for(int i=0;i<PName.size();i++)
		{
			System.out.println(" "+(i+1)+"    "+PName.get(i)+"        "+PCode.get(i)+"            "+Quantity.get(i)+"      "+Price.get(i)+"    "+Total_Price.get(i));
		}
		System.out.println("                                                                --------------");
		System.out.println("                                                                 "+totalbill);
		System.out.println();
		if(this.totalbill>1000)
		{
			double discount = (this.totalbill*10)/100;
			System.out.println("Congrats "+name+"!!!! You got Discount of 10% :"+discount);
			System.out.println();
			System.out.println("                                            Your Final Bill is :- "+(this.totalbill-discount)+"/-");
		}
		else
		{
			System.out.println("Sorry "+name+"....You are Not Eligible for Discount");
			System.out.println();
			System.out.println("                                            Your Final Bill is :- "+this.totalbill +"/-");
		}
		System.out.println("\u2770 \u2770 \u2770 \u2770 \u2770 \u2770 \u2770 \u2770 \u2770 \u2770 \u2770 \u2770 \u2770 \u2770 \u2770 \u2770 \u2770 \u2770 \u2770 \u2770 \u2770 \u2770 \u2770 \u2770 \u2770 \u2770 \u2770 \u2770 \u2770 \u2770 \u2770 \u2770 \u2770 \u2770 \u2770 \u2770 \u2770 \u2770 \u2770 \u2770 \u2770 \u2770 \u2770 \u2770 \u2770 \u2770 \u2770 \u2770 \u2770 \u2770 \u2770 \u2770");
		System.out.println();
		System.out.println("Customer Details");
		System.out.println("----------------");
		System.out.println("Name :"+name);
		System.out.println("Address :"+address);
		System.out.println("Phone Number :"+PhNo);
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("<<<<<<<<<<<<<<<<<<<< Thank You Visit Again >>>>>>>>>>>>>>>>>>>>");
		System.out.println();
		System.out.println();
	}
	void data_store(String productName,String productCode,double price,int quantity,double total)
	{
		PName.add(productName);
		PCode.add(productCode);
		Price.add(price);
		Quantity.add(quantity);
		Total_Price.add(total);
	}
	public static void main(String[] args) 
	{
		new Project().start();
		
	}
}
