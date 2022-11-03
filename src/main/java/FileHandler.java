import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler {

    public ArrayList<Covid19Data> readFile() throws IOException {

        ArrayList<Covid19Data> dataList = new ArrayList<Covid19Data>();
        Scanner sc = new Scanner(new File("Covid19Data_opgave.csv"), StandardCharsets.ISO_8859_1);

        while (sc.hasNext()) {
            String line = sc.nextLine();
            String[] attributes = line.split(";");
            Covid19Data covid19Data = new Covid19Data(
                    attributes[0],
                    attributes[1],
                    Integer.parseInt(attributes[2]),
                    Integer.parseInt(attributes[3]),
                    Integer.parseInt(attributes[4]),
                    Integer.parseInt(attributes[5]),
                    attributes[6]);

            dataList.add(covid19Data);

        }

        return dataList;

    }

}
