import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.print("Squared until: ");
        int maxSquare = Integer.parseInt(new BufferedReader(
                new InputStreamReader(System.in)).readLine());

        if (maxSquare > 46340 || maxSquare < 1) {
            System.out.println("Invalid input. Max Value: 46340. Min Value: 1");
            return;
        }

        int current = -1;
        int sum = 0;
        for (int i = 1; i <= maxSquare; i++) {
            current += 2;
            sum += current;
            System.out.println(i + " ^2: " + sum);
        }
    }
}