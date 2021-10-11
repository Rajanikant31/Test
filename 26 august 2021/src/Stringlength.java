import java.util.Scanner;
public class Stringlength {
    private static Scanner sc;
    public static void main(String[] args) {
        String a;
        int count = 0, i = 0;

        sc= new Scanner(System.in);

        System.out.print("\nEnter Any String: ");
        a = sc.nextLine();

        while(i < a.length())
        {
            if(a.charAt(i) != ' ') {
                count++;
            }
            i++;
        }
        System.out.println("\nthe length of string is= " + count);
    }
}

