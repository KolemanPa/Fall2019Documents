
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author theko
 */
public class whynot {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        
        int temp;
        temp = sc.nextInt();
        for (int i=0; i<10; i++){
            int someStuff = i+temp;
            System.out.println(someStuff);
        }
    }
    
}
