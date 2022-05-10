import java.util.Scanner;

public class CharacterSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        for(int symbol = 0;symbol < input.length();symbol++){
            char letter = input.charAt(symbol);
            System.out.println(letter);
        }







    }
}
