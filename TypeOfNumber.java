import java.util.Objects;
import java.util.Scanner;

public class TypeOfNumber {
    public static void main(String[] args){
        int num = numRead();
        numCheck(num);

        String number_sign = signCheck(num);

        String number_parity = parityCheck(num);

        String number_length = lengthCheck(num);

        String answer = ansSolving(number_sign, number_parity, number_length);

        writeAns(answer);
    }

    private static int numRead(){
        System.out.print("Enter number: ");
        Scanner scanner = new Scanner(System.in);

        return scanner.nextInt();
    }

    private static void numCheck(int num){
        if (num >= 1000 || num <= -1000){
            System.out.println("Number may be from -999 to 999");
            System.exit(0);
        }
    }

    private static String signCheck(int num){
        if (num < 0){
            return "Negative";
        }
        else if (num == 0) {
            return "Zero";
        }
        else {
            return "Positive";
        }
    }

    private static String parityCheck(int num) {
        if (num % 2 == 0) {
            return "even";
        }
        else {
            return "odd";
        }
    }

    private static String lengthCheck(int num) {
        int len = 0;
        num = Math.abs(num);

        while (num != 0) {
            len++;
            num /= 10;
        }


        if (len == 1) {
            return "single digit";
        }
        else if (len == 2) {
            return "two-digit";
        }
        else if (len == 3) {
            return "three-digit";
        }
        else {
            return "zero";
        }
    }

    private static String ansSolving(String sign, String parity, String length) {
        if (Objects.equals(sign, "zero")) {
            return "zero number";
        }
        else {
            return sign + " " + parity + " " + length + " " + "number";
        }
    }

    private static void writeAns(String ans) {
        System.out.println(ans);
    }
}
