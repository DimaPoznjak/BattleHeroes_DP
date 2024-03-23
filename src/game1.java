import java.util.Arrays;
import java.util.Scanner;

public class game1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int yournumber = scanner.nextInt();
        String str = String.valueOf(yournumber);
        char[] charArray = str.toCharArray();
        int[] numbers = new int[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            numbers[i] = Character.getNumericValue(charArray[i]);
        }
        int sum = 0;
        for (int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }
        if (yournumber % 2 == 0 && sum % 3 == 0) {
            System.out.println("Введеное число делится на 6");
        }else{
            System.out.println("Введенное число не делится на 6");
        }
    }
}
