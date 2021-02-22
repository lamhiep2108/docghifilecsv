import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        readFileCSV("countries.csv");
    }

    private static void writeFileCSV(String fileName) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));
            System.out.print("How many country? ");
            int countryCount = scanner.nextInt();
            scanner.nextLine();
            for (int i = 0; i < countryCount; i++) {
                System.out.print("IPv1 version 1: ");
                bufferedWriter.write(scanner.nextLine() + ",");
                System.out.print("IPv1 version 2: ");
                bufferedWriter.write(scanner.nextLine() + ",");
                System.out.print("Country code version 1: ");
                bufferedWriter.write(scanner.nextLine() + ",");
                System.out.print("Country code version 2: ");
                bufferedWriter.write(scanner.nextLine() + ",");
                System.out.print("Name country acronym: ");
                bufferedWriter.write(scanner.nextLine() + ",");
                System.out.print("Name country: ");
                bufferedWriter.write(scanner.nextLine() + ",\n");
            }
            bufferedWriter.flush();
            List<String> content = new ArrayList<>();
            bufferedWriter.close();
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Can't write to file " + fileName + ".");
        }
    }

    private static void readFileCSV(String fileName) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                String[] strings = line.split(",");
                System.out.println(strings[strings.length - 1]);
            }
            bufferedReader.close();
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Can't read file " + fileName + ".");
        }
    }
}