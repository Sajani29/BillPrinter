import java.util.*;
class BillPrint{
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		
		
		System.out.println("\n================================================================================== \n");
		System.out.println("__          __  _                            _          _ __  __            _");
		System.out.println("\\ \\        / / | |                          | |        (_)  \\/  |          | |");
		System.out.println(" \\ \\  /\\  / /__| | ___ ___  _ __ ___   ___  | |_ ___    _| \\  / | __ _ _ __| |_");
		System.out.println("  \\ \\/  \\/ / _ \\ |/ __/ _ \\| '_ '_  \\ / _ \\ | __/ _ \\  | | |\\/| |/ _' | '__| __|");
		System.out.println("   \\  /\\  /  __/ | (_| (_) | | | | | |  __/ | || ( ) | | | |  | | (_| | |  | |_");
		System.out.println("    \\/  \\/ \\___|_|\\___\\___/|_| |_| |_|\\___| \\___\\___/  |_|_|  |_|\\__,_|_|   \\__| \n");
		System.out.println("\n================================================================================== \n");
		
		
		//Get user phone number
		System.out.print("Enter Customer Phone Number - ");
		String pNumber = input.nextLine();
		System.out.println();
		
		//get user name
		System.out.print("Enter Customer Name - ");
		String name = input.nextLine();
		System.out.println();
		
		System.out.println("\n================================================================================== \n");

		System.out.println();
		
		System.out.print("Basmathi Qty(kg)  - ");
		int basmathiQTY = input.nextInt();
		
		System.out.print("\nDhal Qty(kg)      - ");
		int dhalQTY = input.nextInt();

		System.out.print("\nSugar Qty(kg)     - ");
		int sugarQTY = input.nextInt();

		System.out.print("\nHigland Qty       - ");
		int highlandQTY = input.nextInt();

		System.out.print("\nYoghurt Qty       - ");
		int yoghurtQTY = input.nextInt();

		System.out.print("\nFlour Qty(kg)     - ");
		int flourQTY = input.nextInt();

		System.out.print("\nSoap Qty          - ");
		int soapQTY = input.nextInt();


		//pricess

		double basmathiPrice = 250;
		double dhalPrice = 180.00;
		double sugarPrice = 150.00;
		double highlandPrice = 1200.00;
		double yoghurtPrice = 50.00;
		double flourPrice = 120.00;
		double soapPrice = 160.00;
		
		//totalPricess
		
		double totalBasmathi = basmathiPrice * basmathiQTY;
		double totalDhal = dhalPrice * dhalQTY;
		double totalSugar = sugarPrice * sugarQTY;
		double totalHighland = highlandPrice * highlandQTY;
		double totalYoghurt = yoghurtPrice * yoghurtQTY;
		double totalFlour = flourPrice * flourQTY;
		double totalSoap = soapPrice * soapQTY;
		
		//total
		
		double total = totalBasmathi + totalDhal + totalSugar + totalHighland + totalYoghurt + totalFlour + totalSoap;


		//discount
		
		double discount = total * 0.1;
		
		//price
		double price = total - discount;
		


		
		System.out.println("+------------------------------------------------------------------+");
		System.out.println("|                 _   __   __           _____ _______              |"); 
		System.out.println("|                (_) |  \\ /  |    /\\   |  __ \\__   __|             |");
		System.out.println("|                 _  | \\   / |   /  \\  | |__) | | |                |");
		System.out.println("|                | | | |\\ /| |  / /\\ \\ |  _  /  | |                |");
		System.out.println("|                | | | |   | | / ____ \\| | \\ \\  | |                |");
		System.out.println("|                |_| |_|   |_|/_/    \\_\\_|  \\_\\ |_|                |");
		System.out.println("|                     225,Galle Road,Panadura.                     |");
		System.out.println("|                                                                  |");
		System.out.println("+------------------------------------------------------------------+");
		System.out.printf("|                         #Tel    : %-30s |\n",pNumber);
		System.out.printf("|                         #Name   : %-30s |\n",name);
		System.out.println("+------------------+--------------+---------------+----------------+");						
		System.out.println("|                  |   Qty        |   unit price  |      Price     |");
		System.out.println("+------------------+--------------+---------------+----------------+");		
		System.out.printf("|   %-9s      |      %-8d|    %-11.1f|   %-13.2f|\n","#Basmathi" ,basmathiQTY,basmathiPrice,totalBasmathi);
		System.out.printf("|   %-9s      |      %-8d|    %-11.1f|   %-13.2f|\n","#Dhal" ,dhalQTY,dhalPrice,totalDhal);	
		System.out.printf("|   %-9s      |      %-8d|    %-11.1f|   %-13.2f|\n","#Sugar" ,sugarQTY,sugarPrice,totalSugar);
		System.out.printf("|   %-9s      |      %-8d|    %-11.1f|   %-13.2f|\n","#Highland" ,highlandQTY,highlandPrice,totalHighland);
		System.out.printf("|   %-9s      |      %-8d|    %-11.1f|   %-13.2f|\n","#Yoghurt" ,yoghurtQTY,yoghurtPrice,totalYoghurt);
		System.out.printf("|   %-9s      |      %-8d|    %-11.1f|   %-13.2f|\n","#Flour" ,flourQTY,flourPrice,totalFlour);	
		System.out.printf("|   %-9s      |      %-8d|    %-11.1f|   %-13.2f|\n","#Soap" ,soapQTY,soapPrice,totalSoap);
		System.out.println("+------------------+--------------+---------------+----------------+");
		System.out.printf("|                                 |     Total     |    %11.1f | \n",total);
		System.out.printf("|                                 |   Discount    |    %11.1f | \n",discount);
		System.out.printf("|                                 |     Total     |    %11.1f | \n",price);
		System.out.println("+------------------+--------------+---------------+----------------+");


		//cash
		
		System.out.print("\nEnter cash amount : ");
		double cash = input.nextDouble();
		
		//Change
		
		double change = cash - price;
		
		System.out.println("\n+------------------+------------------+");
		System.out.printf("|   Net Amount     |   %-11.1f    | \n",price);
		System.out.printf("|   Cash           |   %-11.1f    | \n",cash);
		System.out.printf("|   Change         |   %-11.1f    | \n",price);
		System.out.println("+------------------+------------------+\n");
	
		
		
		int r5000 = (int)change/ 5000;
		change %= 5000;
		
		int r2000 = (int)change/ 2000;
		change %= 2000;
		
		int r1000 = (int)change/ 1000;
		change %= 1000;
		
		int r500 = (int)change/500;
		change %= 500;
		
		int r100 = (int)change/ 100;
		change %= 100;
		
		int r50 = (int)change/ 50;
		change %= 50;
		
		int r20 = (int)change/ 20;
		change %= 20;
		
		int r10 = (int)change/ 10;
		change %= 10;
		
		int r5 = (int)change/5;
		change %= 5;
		
		int r2 = (int)change/2;
		change %= 2;
		
		int r1 = (int)change%2;
		
		int notes = r5000 + r2000 + r1000 + r500 + r100 + r50 + r20;
		int coins = r10 + r5 + r2 + r1;


		System.out.println("+---------------+---------------+");
		System.out.println("|     Value     |      No       |");
		System.out.println("+---------------+---------------+");
		System.out.printf("|  %-8s     |     %-10d|\n","Rs.5000 ",r5000);
		System.out.println("+---------------+---------------+");
		System.out.printf("|  %-8s     |     %-10d|\n","Rs.2000 ",r2000);
		System.out.println("+---------------+---------------+");
		System.out.printf("|  %-8s     |     %-10d|\n","Rs.1000 ",r1000);
		System.out.println("+---------------+---------------+");
		System.out.printf("|  %-8s     |     %-10d|\n","Rs.500 ",r500);
		System.out.println("+---------------+---------------+");
		System.out.printf("|  %-8s     |     %-10d|\n","Rs.100 ",r100);
		System.out.println("+---------------+---------------+");
		System.out.printf("|  %-8s     |     %-10d|\n","Rs.50 ",r50);
		System.out.println("+---------------+---------------+");
		System.out.printf("|  %-8s     |     %-10d|\n","Rs.20 ",r20);
		System.out.println("+---------------+---------------+");
		System.out.printf("|  %-8s     |     %-10d|\n","Rs.10 ",r10);
		System.out.println("+---------------+---------------+");
		System.out.printf("|  %-8s     |     %-10d|\n","Rs.5",r5);
		System.out.println("+---------------+---------------+");
		System.out.printf("|  %-8s     |     %-10d|\n","Rs.2 ",r2);
		System.out.println("+---------------+---------------+");
		System.out.printf("|  %-8s     |     %-10d|\n","Rs.1 ",r1);
		System.out.println("+---------------+---------------+");
		System.out.printf("|  %-8s |    %-10d |\n","No of Notes ",notes);
		System.out.println("+---------------+---------------+");
		System.out.printf("|  %-8s |    %-10d |\n","No of Coins ",coins);
		System.out.println("+---------------+---------------+");
			
		System.out.println("---------------------------------");
		System.out.println(" THANK YOU FOR SHOPPING WITH US  ");
		System.out.println("---------------------------------");
		

	}
}

