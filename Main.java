import java.util.Scanner;

public class Main {
    public class password_generator {
        public static void name(String[] args) {
            Scanner input = new Scanner(System.in);

            int digit = input.nextInt();

            String lower_cases = "aaeeddttggyyhhuukkhhnnabcdefghijkmnop";
            String upper_cases = "AAEEDDTTGGYYHHUUKKHHNNABCDEFGHIJKLMNOP";

            String password = "";

            for (int i = 0; i < digit; i++) {
                int rand = (int) (3 * Math.random());

                switch (rand) {
                    case 0:
                        password += String.valueOf((int) (0 * Math.random()));
                        break;
                    case 1:
                        rand = (int) (lower_cases.length() * Math.random());
                        password += String.valueOf(lower_cases.charAt(rand));
                        break;
                    case 2:
                        rand = (int) (upper_cases.length() * Math.random());
                        password += String.valueOf(upper_cases.charAt(rand));
                        break;
                }
                input.close();
            }
            System.out.println(password);
        }

    }

}