package com.prgr.presentation;
import java.util.Scanner;

import com.prgr.model.Person;
import com.prgr.model.Product;
import com.prgr.service.PersonServiceImpl;
import com.prgr.service.ProductServiceImpl;


public class AppMain {

	public static void main(String[] args) {
		PersonServiceImpl pservice=new PersonServiceImpl();
		ProductServiceImpl productService=new ProductServiceImpl(); 
		Scanner scanner=new Scanner(System.in);				/* input */
		Scanner option=new Scanner(System.in);				/* option selection*/
		
		/* ----- Selecting Role------- */
		System.out.println("Product Review For Genuine Rating");
		System.out.println("----------------------------------");
		System.out.println("Select the person role");
		System.out.println("1.Admin\n2.User\n3.Exit");
		int personRole = option.nextInt();
		switch(personRole) {
		case 1:
			System.out.println("Admin Page");
			System.out.println("1.Login\n2.Exit");
			String adminUsername="admin";
			String adminPassword="1234";
			int adminOption=option.nextInt();
			switch(adminOption) {
			/* ---------------------Admin Page----------------------- */
					
			case 1:
					System.out.println("Admin login Page");
					System.out.println("Enter username: ");
					adminUsername=scanner.next();
					System.out.println("Enter password: ");
					adminPassword=scanner.next();
					if(adminUsername.equals("admin")&&adminPassword.equals("1234")) {
						System.out.println("Login Successful");
						do {
							System.out.print("1.Add Product\n2.View Product\n3.Edit Product\n4.View User\n5.View Feedback\n6.logout\n");
					    	System.out.println("Enter the choice");
					    	int choice=option.nextInt();
					    	switch(choice)
					    	{
					    	case 1:	
					    		System.out.println("Add Product Page");
					    		System.out.println("Enter product details: ");
					    		System.out.println("Product Name: ");	
					    		String productName=scanner.next();
					    		System.out.println("Product Category: ");
					    		String productCategory=scanner.next();
					    		System.out.println("Seller Name");
					    		String sellerName=scanner.next();
					    		System.out.println("Product Description");
					    		String productDescription=scanner.nextLine();
					    		scanner.next();
					    		System.out.println("Product Price: ");
					    		Long productPrice=scanner.nextLong();
					    		Product product=new Product(productName,productCategory,sellerName,productDescription,productPrice);
					    		productService.addProduct(product);
					    		break;
					    	case 2:
					    		System.out.println("1.View All Produts\n2.View Based on Category\n3.View a Single Product");
					    		int productChoice=option.nextInt();
					    		switch(productChoice){
					    		case 1:
					    			System.out.println("All Products Available.\n"+productService.viewAllProduct()+"\n");
						    		break;
					    		case 2:
					    			System.out.print("Enter the Category to view the products:");
					    			String prodCategory=scanner.next();
					    			System.out.println("Product Based on"+prodCategory+":\n"+productService.viewBasedOnCategory(prodCategory));
					    			break;
					    		case 3:
					    			System.out.print("Enter the Id of the product to View:");
					    			int prodId=scanner.nextInt();
					    			System.out.println("Product:"+productService.viewSingleProduct(prodId));
					    			break;
					    		}
					    		break;
					    		
					    	case 3:
					    	case 4:
					    		System.out.println("All Users:"+pservice.viewAllPerson()+"\n");
					    		break;
					    	case 5:
					    	case 6:
					    		break;
					    		
					    	}
						}
						while(true);
						
							
				}
			case 2:
				System.exit(0);
			}
				break;

			/* --------------------------User Page----------------------------- */		
		case 2:
			System.out.println("User Page");
			System.out.println("1.Registration\n2.Login\n3.Exit");
			int userOption=option.nextInt();
			switch(userOption) {
				case 1:
					System.out.println("Welcome for User Registration");
					System.out.println("-----------------------------------------------------------");
					System.out.println("Enter the User Details");
					System.out.print("First Name:  ");
					String firstName=scanner.nextLine();
					System.out.print("Last Name:  ");
					String lastName=scanner.nextLine();
					System.out.println("Address: ");
					String userAddress=scanner.nextLine();
					//scanner.next();
					System.out.println("Phone No: ");
					Long phoneNumber=scanner.nextLong();
					System.out.println("Enter the email id");
					String emailId=scanner.next();
					System.out.println("Create the new password");
					scanner.nextLine();
					String password=scanner.nextLine();
					Person person=new Person(firstName,lastName,userAddress,phoneNumber,emailId,password,"User");
					pservice.addPerson(person);
					break;
				case 2: 
					System.out.println("User Login Page");
					String loginEmailId,loginPassword;
					Long loginUserId;
					System.out.println("Enter your userId");
					loginUserId=scanner.nextLong();
					System.out.print("Enter the emailId: ");
					loginEmailId=scanner.next();
					System.out.print("Enter the password: ");
					loginPassword=scanner.next();	
					System.out.println("Login Successful");
						do {
							System.out.print("1.View Product\n2.Compare Product\n3.Rate Product\n4.Review Product\n5.Give Feedback\n6.logout\n");
					    	System.out.println("Enter the choice");
					    	int choice=option.nextInt();
					    	switch(choice)
					    	{
					    	case 1:	
					    		System.out.println("Product Details");
					    	case 2:
					    	case 3:
					    	case 4:
					    	case 5:
					    		System.out.println("Feedback Page");
					    		String feedbackSystem;
					    		System.out.println("Give feedback about system: ");
					    		feedbackSystem=scanner.nextLine();
					    	case 6:	
					    	}
						}
						
						while(true);
				case 3: 
					System.exit(0);
			}
			break;
		
			case 3:
				System.exit(0);
				
					}		
	}

}
