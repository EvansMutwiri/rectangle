import java.text.MessageFormat;
import java.util.Scanner;
import static java.lang.System.out;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        out.println("Enter length: ");
        int length = scanner.nextInt();

        out.println("Enter width: ");
        int width = scanner.nextInt();

        Rectangle rectangle = new Rectangle(length, width);
        boolean squareResult = rectangle.isSquare();

        out.println(MessageFormat.format("The dimensions are {0}x{1} its a square = {2}",
                length,
                width,
                squareResult));
    }
}
