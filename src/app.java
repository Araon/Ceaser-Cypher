//A Java Program to illustrate Caesar Cipher Technique
import java.util.Scanner;

class fileReader extends CaesarCipher
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);


        System.out.println("Do you want to encrypt(1) or Decrypt(2)");

        int des = sc.nextInt();
        sc.nextLine();
        if (des == 1) {
            System.out.println("Enter text to encrypt:");
            String text = sc.nextLine();
            System.out.println("Enter the Shift Parameter(0-25):");
            int s = sc.nextInt();
            System.out.println("Text : " + text);
            System.out.println("Shift : " + s);
            System.out.println("Cipher: " + encrypt(text, s));
        }
        else {
            System.out.println("Enter text to decrypt:");
            String text = sc.nextLine();
            System.out.println("Enter the Shift Parameter(0-25):");
            int s = sc.nextInt();
            System.out.println("Text : " + text);
            System.out.println("Shift : " + s);
            System.out.println("Cipher: " + decrypt(text, s));
        }


    }
}
