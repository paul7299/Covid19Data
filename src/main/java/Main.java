import java.io.IOException;

public class Main {

    public static void main(String args[]) throws IOException {

        FileHandler f = new FileHandler();

        System.out.println(f.readFile().toString());

    }
}
