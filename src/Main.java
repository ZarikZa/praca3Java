import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean pobeda = true;
        while (pobeda){
            System.out.println("Ведите слово: ");
            Scanner scanner = new Scanner(System.in);
            String slovo = scanner.nextLine().toLowerCase().replace(" ", "");
            char[] bukvi = slovo.toCharArray();
            char[] reversBukv = new char[bukvi.length];
            for(int i = 1; i <= bukvi.length; i++){
                reversBukv[i-1] = bukvi[bukvi.length-i];
            }
            String asd = String.valueOf(reversBukv);
            if(asd.equals(slovo)){
                System.out.println("Это палиндром");
            }
            else {
                pobeda = false;
                System.out.println("Это не палиндром");
            }
        }
    }
}