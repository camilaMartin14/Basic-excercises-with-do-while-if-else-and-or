
package basicsudemy2;

import java.util.Scanner;
//contacatenar = sumar cadenas
public class BasicsUdemy2 {

    //Request a string through the console and it shows the characters one by one.
    public static void main(String[] args) {
    Scanner keyboard =new Scanner (System.in);
    keyboard.useDelimiter("\n");
    
        System.out.println("Insert a phrase please!");
        String frase = keyboard.next ();
        
        char character;
        for (int i = 0; i < frase.length(); i++) {
            character = frase.charAt(i);
            System.out.println(character);
        }
    System.out.println("------------------------------------------------------");
    /*prompt the user for words until they type an empty string. 
    Show the concatenation of those words at the end.*/
    Scanner sc = new Scanner (System.in);
    sc.useDelimiter("\n");
    
        System.out.println("Give me a string please, the loop ends with an empty string");
        String stUser =sc.next();
        
        String concatenation = "";
        while   (!stUser.isEmpty ()) {//When is not there the empty chain, enters
            //or... !stUser.equals ("") indica cuando una cadena es igual a otra
            concatenation += stUser;// concatenation = stUser + concatenation
            
            System.out.println("Give me a string");
           stUser = sc.next();
    
                
        }
        System.out.println(concatenation);
    System.out.println("------------------------------------------------------");

        
        /*
        Asks for a year by keyboard (in numbers) and indicates whether it is a leap year or not.
        It is a leap year when it is divisible by 4 and not divisible by 100 
        or if it is divisible by 400.
        */
        System.out.println("Write a year below (in numbers) that you want to know if it is a leap or not :)");
        
        Scanner scan = new Scanner (System.in);
        int year = scan.nextInt();
        
        if (year % 4 == 0 && year % 100 !=0 || year % 400 ==0) {
            System.out.println("It's a leap year");
        } else  {
            System.out.println("It's not a leap year");
        }

        /*
        CONDITIONS (theoretical notes)
        && and:
            T & T = T
            T & F = F
            F & T = F
            F & F = F
        
        || or:
            T | T = T
            T | F = T
            F | T = T
            F | F = F
        */

    System.out.println("------------------------------------------------------");
    
        
    /*Request a number through the console and validate that it is between 0 and 10.
    Do it with a do-while
    */
    Scanner s =new Scanner (System.in);
            

    int number;
        do {
            System.out.println("Escribe un número, te diré si está entre 0 y 10:");
            number = s.nextInt();
            if (!(number >= 0 && number <= 10)) {
                System.out.println("Debes escribir un número entre 0 y 10.");
            } else {
                System.out.println("El número " + number + " está entre 0 y 10.");
            }
        } while (!(number >= 0 && number <= 10));
    
    /* DO-WHILE (theoretical notes)
    es un bucle, se ejecuta mínimo una vez (mientras que el while o for se pueden
    ejecutar 0 o n veces)
    
    */
    
     System.out.println("-----------------------------------------------------" );

    }
    
}
