package bookApplication;

import java.util.Scanner;

public class BookApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Book book = new Book("Java for dummies", "Raya Meresa","an Introduction to jave book", 20.00,true);
		
		System.out.println(book.getDisplaytext());
		System.out.println("Please enter number of orders!");
		int numberOfOrder = scan.nextInt();
		System.out.println(book.pricing(numberOfOrder));

		scan.close();
	}

}
