import java.io.*;

public class Lab29 {
    public static void main(String[] args) throws Exception {
        // Pass the path to the input file as a parameter
        File inputFile = new File("/Users/vaibhavupreti/Desktop/programming/java/test.txt");

        // Pass the path to the output file as a parameter
        File outputFile = new File("/Users/vaibhavupreti/Desktop/programming/java/test2.txt");

        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        String line;

        BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

        while ((line = reader.readLine()) != null) {
            System.out.println(line);
            writer.write(line);
            writer.newLine();
        }

        reader.close();
        writer.close();
    }
}

