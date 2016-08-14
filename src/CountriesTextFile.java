import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CountriesTextFile {

	public static void writeToFile(File myConfigFile) {
		PrintWriter wrt = null;
		try {
			wrt = new PrintWriter(myConfigFile);

			wrt.println("Hello World!");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			wrt.close();
		}
	}

	public static void readFile(File myConfigFile) {
		try {
			FileReader reader = new FileReader(myConfigFile);

			BufferedReader bReader = new BufferedReader(reader);

			String newLine = bReader.readLine();

			while (newLine != null) {
				System.out.println(newLine);

				newLine = bReader.readLine();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {

		}
	}

	public static void writeToFileAppend(File myConfigFile) {
		FileWriter wrt = null;
		try {
			wrt = new FileWriter(myConfigFile, true);

			wrt.append("Hello World!");
			wrt.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} catch (IOException e) {

		}

	}

}// End of CountriesTextFile
