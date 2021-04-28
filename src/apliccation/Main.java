package apliccation;

import java.text.ParseException;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Main {

	public static void main(String[] args) throws ParseException {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter cliente data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("E-mail: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY) ");
		String birth = sc.nextLine();
		System.out.println("Enter order data: ");
		System.out.print("Status : ");
		String status = sc.nextLine();
				
		Order or = new Order(OrderStatus.valueOf(status),new Client(name,email,birth));
		
		
		char question='s';  
		int contador = 0;
		// int n = 1;  // Nescessario para utilização do for.
		
	
		while(question=='s') {
			contador++;
			System.out.println("ENTER #"+contador+" item data:");
			System.out.print("Product Name: ");
			if(contador>1){
			sc.nextLine();
			}
			String productname = sc.nextLine();
			System.out.print("Product Price: ");
			double productprice = sc.nextDouble();
			System.out.print("Quantity: ");
			int productquantity = sc.nextInt();
			
			Product item = new Product(productname,productprice);
			OrderItem items = new OrderItem(productquantity,productprice,item);
			or.addItem(items);
			System.out.print("Deseja Inserir mais produtos : [s] - SIM | [n] = NAO ?");
			question = sc.next().charAt(0);
			
		}
		
		
		/*for(int i=1; i<=n ; i++) {
			System.out.println("ENTER #"+i+" item data:");
			System.out.print("Product Name: ");
			sc.nextLine();
			String productname = sc.nextLine();
			System.out.print("Product Price: ");
			double productprice = sc.nextDouble();
			System.out.print("Quantity: ");
			int productquantity = sc.nextInt();
			
			Product item = new Product(productname,productprice);
			OrderItem items = new OrderItem(productquantity,productprice,item);
			or.addItem(items);
		}
*/
		
		System.out.println();
		System.out.println("ORDER SUMMARY:");
		System.out.println(or);
		
		
		sc.close();
	
		
	}

}
