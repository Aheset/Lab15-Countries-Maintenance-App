import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class CountriesApp extends CountriesTextFile {

	public static void main(String[] args) {

		System.out.println("Welcome to the Countries Maintenance Application!");
		System.out.println("-------------------------------------------------");
		String fileName = "countries.txt";

		try {
			PrintWriter pw = new PrintWriter(fileName);
			pw.println("India\nThe United States\nChina\nRwanda");
			// pw.flush();
			pw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		Path filePath = Paths.get("countries.txt");

		File countriesFile = filePath.toFile();

		System.out.println("1 - See the list of counties\n2 - Add a country\n3 - Exit");

		String choice = "yes";
		while (choice.equalsIgnoreCase("yes")) {

			System.out.println("Enter menu number: (1/2/3)");

			Scanner scan1 = new Scanner(System.in);
			String userInput = scan1.nextLine();

			if (userInput.equalsIgnoreCase("1")) {
				readFile(countriesFile);
			} else if (userInput.equalsIgnoreCase("2")) {

				System.out.print("Enter country:  ");
				userInput = scan1.nextLine();

				FileWriter wrt = null;
				try {
					wrt = new FileWriter(countriesFile, true);

					wrt.append(userInput);
					wrt.close();
					System.out.println("This country has been saved!");

				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();

				} catch (IOException e) {

				}
			} else if (userInput.equalsIgnoreCase("3")) {
				System.out.println("Buh-bye!");
			} else {
				System.out.println("Invalid Input, please try again!");
			}
			System.out.println();
			System.out.print("Continue? (yes/no): ");
			choice = scan1.nextLine();
			System.out.println();
		}

	}// End of Main
} // End of CountriesApp
