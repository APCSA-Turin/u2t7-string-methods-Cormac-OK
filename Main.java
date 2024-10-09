import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str1;
        String str2;

        System.out.println("Enter first string:");
        str1 = scanner.nextLine();

        System.out.println("Enter second string:");
        str2 = scanner.nextLine();

        if (str1.length() > str2.length()){
            System.out.println(str1 + " is longer");
        }
        else if (str2.length() > str1.length()){
            System.out.println(str2 + " is longer");
        }
        else{
            System.out.println("They're the same length.");
        }

        System.out.println("First half: " + str1.substring(0, str1.length()/2));
        System.out.println("Second half: " + str1.substring(str1.length()/2, str1.length()));

        System.out.println("First half: " + str2.substring(0, str2.length()/2));
        System.out.println("Second half: " + str2.substring(str2.length()/2, str2.length()));

        int index = str1.indexOf(str2);

        if (index == -1){
            System.out.println(str2 + " is NOT found in " + str1);
        }
        else{
            System.out.println(str2 + " is found in " + str1 + " at index " + index);
        }

        scanner.close();
    }
}
