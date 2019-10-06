//WAP To read a character and check Following 
// a) Uppercase Alphabet
// b) Lowercase Alphabet
// c) Digit
// d) Special Character

import java.io.IOException;


public class Test7 {

    public static void main(String[] args) throws IOException {
        System.out.println("Enter a Character :");
        char ch = (char) System.in.read();
        if (ch >= 65 && ch <= 90) {
            System.out.println("Character is uppercase " + ch);
        } else if (ch >= 91 && ch <= 122) {
            System.out.println("Character is lowercase " + ch);
        } else if (ch >= 48 && ch <= 57) {
            System.out.println("Character is Digits " + ch);
        } else {
            System.out.println("Character is Speical character : " + ch);
        }
    }

}
