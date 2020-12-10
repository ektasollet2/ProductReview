package com.prgr.presentation;

import java.util.Map;
import java.util.Scanner;

import com.prgr.model.Feedback;
import com.prgr.model.Person;
import com.prgr.model.Product;
import com.prgr.model.Review;
import com.prgr.service.FeedbackService;
import com.prgr.service.FeedbackServiceImpl;
import com.prgr.service.PersonService;
import com.prgr.service.PersonServiceImpl;
import com.prgr.service.ProductService;
import com.prgr.service.ProductServiceImpl;
import com.prgr.service.ReviewService;
import com.prgr.service.ReviewServiceImpl;

public class AppMain {
	
	public static void main(String[] args) {
		PersonService pservice = new PersonServiceImpl();
		ProductService productService = new ProductServiceImpl();
		ReviewService reviewService = new ReviewServiceImpl();
		FeedbackService feedbackService=new FeedbackServiceImpl();

		Scanner scanner = new Scanner(System.in); /* Integer input */
		Scanner scannerString = new Scanner(System.in); /* String input */
		Scanner option = new Scanner(System.in); /* option selection */

		/* ----- Selecting Role------- */
		System.out.println("Product Review For Genuine Rating");
		System.out.println("----------------------------------");
		System.out.println("Select the person role");
		System.out.println("1.Admin\n2.User\n3.Exit");
		int personRole = option.nextInt();
		switch (personRole) {
		case 1:
			System.out.println("Admin Page");
			System.out.println("1.Login\n2.Exit");
			String adminUsername = "admin";
			String adminPassword = "1234";
			int adminOption = option.nextInt();
			switch (adminOption) {
			/* ---------------------Admin Page----------------------- */
			/*----------*/
			case 1:
				System.out.println("Admin login Page");
				System.out.println("Enter username: ");
				adminUsername = scanner.next();
				System.out.println("Enter password: ");
				adminPassword = scanner.next();
				if (adminUsername.equals("admin")
						&& adminPassword.equals("1234")) {
					System.out.println("Login Successful");
					do {
						System.out
								.print("1.Add Product\n2.View Product\n3.Edit Product\n4.View User\n5.Feedback\n6.logout\n");
						System.out.println("Enter the choice");
						int choice = option.nextInt();
						switch (choice) {
						case 1:
							System.out.println("Add Product Page");
							System.out.println("Enter product details: ");
							System.out.println("Product Id:");
							int productId = scanner.nextInt();
							System.out.println("Product Name: ");
							String productName = scanner.next();
							System.out.println("Product Category: ");
							String productCategory = scanner.next();
							System.out.println("Seller Name");
							String sellerName = scanner.next();
							System.out.println("Product Description");
							String productDescription = scanner.nextLine();
							scanner.next();
							System.out.println("Product Price: ");
							Long productPrice = scanner.nextLong();
							Product product = new Product(productId,
									productName, productCategory, sellerName,
									productDescription, productPrice);
							productService.addProduct(product);
							break;
						case 2:
							System.out
									.println("1.View All Produts\n2.View Based on Category\n3.View a Single Product");
							int productChoice = option.nextInt();
							switch (productChoice) {
							case 1:
								System.out.println("All Products Available.\n"
										+ productService.viewAllProduct()
										+ "\n");
								break;
							case 2:
								System.out
										.print("Enter the Category to view the products:");
								String prodCategory = scanner.next();
								System.out
										.println("Product Based on "
												+ prodCategory
												+ ":\n"
												+ productService
														.viewBasedOnCategory(prodCategory));
								break;
							case 3:
								System.out
										.print("Enter the Id of the product to View:");
								int prodId = scanner.nextInt();
								System.out.println("Product:"
										+ productService
												.viewSingleProduct(prodId));
								break;
							}
							break;

						case 3:
							System.out.println("1.Update\n2.Delete");
							int updateChoice= option.nextInt();
							switch (updateChoice) {
							case 1:
								System.out.println("Enter ID of the product to Update: ");
								int productId1 = scanner.nextInt();
								System.out.println("Product Name: ");
								String productName1 = scanner.next();
								System.out.println("Product Category: ");
								String productCategory1 = scanner.next();
								System.out.println("Seller Name");
								String sellerName1 = scanner.next();
								System.out.println("Product Description");
								String productDescription1 = scanner.next();
								// scanner.next();
								System.out.println("Product Price: ");
								Long productPrice1 = scanner.nextLong();
								Product productUpdate = new Product(productId1,productName1, productCategory1,
										sellerName1, productDescription1, productPrice1);

								productService.updateProduct(productUpdate);
								break;
							case 2:
								System.out.println("Enter ID of the product to delete: ");
								int productId2 = scanner.nextInt();
								productService.deleteProduct(productId2);
								break;
							
							}
						case 4:
							System.out.println("All Users:"
									+ pservice.viewAllPerson() + "\n");
							break;
						case 5:
							System.out.println("Feedback Page");
							System.out.println("Menu\n1.View Feedbacks\n2.Delete Feedback");
							int feedbackChoice=scanner.nextInt();
							switch(feedbackChoice){
							case 1:
								System.out.println("All Feedbacks:"+feedbackService.viewAllFeedback());
								break;
							case 2:
								System.out.print("Enter the Feedback Id to delete:");
								int feedbackDelete=scanner.nextInt();
								System.out.println(feedbackService.deleteFeedback(feedbackDelete));
								System.out.println("Feedback Successfully Deleted");
							}
							
						case 6:
							break;

						}
					} while (true);

				}
			case 2:
				System.exit(0);
			}
			break;

		/* --------------------------User Page----------------------------- */
		case 2:
			System.out.println("User Page");
			System.out.println("1.Registration\n2.Login\n3.Exit");
			int userOption = option.nextInt();
			switch (userOption) {
			case 1:
				System.out.println("Welcome for User Registration");
				System.out
						.println("-----------------------------------------------------------");
				System.out.println("Enter the User Details");
				System.out.println("Person Id:");
				int personId = scanner.nextInt();
				System.out.print("First Name:  ");
				String firstName = scanner.nextLine();
				System.out.print("Last Name:  ");
				String lastName = scanner.nextLine();
				System.out.println("Address: ");
				String userAddress = scanner.nextLine();
				// scanner.next();
				System.out.println("Phone No: ");
				Long phoneNumber = scanner.nextLong();
				System.out.println("Enter the email id");
				String emailId = scanner.next();
				System.out.println("Create the new password");
				scanner.nextLine();
				String password = scanner.nextLine();
				Person person = new Person(personId, firstName, lastName,
						userAddress, phoneNumber, emailId, password, "User");
				pservice.addPerson(person);
				break;
			case 2:
				System.out.println("User Login Page");
				String loginEmailId,
				loginPassword;
				int loginUserId;
				System.out.println("Enter your userId");
				loginUserId = scanner.nextInt();
				System.out.print("Enter the emailId: ");
				loginEmailId = scanner.next();
				System.out.print("Enter the password: ");
				loginPassword = scanner.next();
				if (loginEmailId.equals("user") && loginPassword.equals("1234")) {
					System.out.println("Login Successful");
					do {
						System.out
								.print("Menu\n1.View All Products\n2.View Category\n3.Compare Product\n4.Update Details\n5.Give Feedback\n6.logout\n");
						System.out.println("Enter the choice");
						int choice = option.nextInt();
						switch (choice) {
						case 1:
							System.out.println("All Products Details");
							System.out.println(productService.viewAllProduct());
							System.out
									.println("Menu:\n1.View a Single Product\n2.Previous Menu");
							int userChoice = option.nextInt();
							switch (userChoice) {
							case 1:
								System.out
										.print("Enter the Product Id of the product to View:");
								int userProductId = scanner.nextInt();
								System.out.println(productService
										.viewSingleProduct(userProductId));
								System.out.println("1.Rate & Review\n2.Exit");
								System.out.print("Enter the Choice:");
								int rateReview = option.nextInt();
								switch (rateReview) {
								case 1:
									System.out
											.print("Enter the Rating for Product Id"
													+ userProductId);
									int userRate = scanner.nextInt();
									System.out
											.println("Enter the Review for Product Id"
													+ userProductId);
									String userReview = scannerString
											.nextLine();
									Review review = new Review(userProductId,
											loginUserId, userRate, userReview);
									System.out.println(reviewService
											.addReviewRating(review));
									break;
								default:
									break;
								}
								break;
							case 2:
								break;

							}
							break;
						case 2:
							System.out.print("Enter the Category to view the products:");
							String prodCategory = scanner.next();
							System.out.println("Product Based on"+ prodCategory+ ":\n"+ productService.viewBasedOnCategory(prodCategory));
							break;	
						case 3:
							System.out.println("Compare two Products:");
							System.out
									.print("Enter the Product Id of Product1:");
							int productId1 = scanner.nextInt();
							System.out
									.print("Enter the Product Id of Product2:");
							int productId2 = scanner.nextInt();
							System.out.println("Comparsion of two Products:");
							for (Map.Entry<Product, Product> pr : productService
									.compareProduct(productId1, productId2)
									.entrySet()) {
								System.out.println("Product 1:" + pr.getKey()
										+ "\n" + "Product 2:" + pr.getValue());
							}
							break;
						case 4:
							System.out.println("Enter the following to Update User:");
							System.out.println("Enter id: ");
							int personId1=scanner.nextInt();
							System.out.print("First Name:  ");
							String firstName1 = scanner.next();
							System.out.print("Last Name:  ");
							String lastName1 = scanner.next();
							System.out.println("Address: ");
							String userAddress1 = scannerString.nextLine();
							// scanner.next();
							System.out.println("Phone No: ");
							Long phoneNumber1 = scanner.nextLong();
							System.out.println("Enter the email id");
							String emailId1 = scanner.next();
							System.out.println("Create the new password");
							//scanner.nextLine();
							String password1= scannerString.nextLine();
							Person person1 = new Person(personId1,firstName1, lastName1, userAddress1, phoneNumber1, emailId1, password1, "User");
							pservice.updatePerson(person1);
							break;
						case 5:
							System.out.println("Feedback Page");
							System.out.print("Give feedback about system or product: ");
							String feedbackAbout = scanner.next();
							System.out.println("Enter the FeedbackDescription:");
							String feedbackDescription=scannerString.nextLine();
							Feedback feedback=new Feedback(feedbackAbout,feedbackDescription);
							feedbackService.addFeedback(feedback);
							break;
						case 6:
						}
					}

					while (true);
				}
			case 3:
				System.exit(0);
			}
			break;

		case 3:
			System.exit(0);

		}
		scanner.close();
		scannerString.close();
		option.close();
	}

}
