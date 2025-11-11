/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l2q5;
import java.util.Random;
/**
 *
 * @author User
 */
public class randAndsumDigits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rand = new Random();
        int randNum = rand.nextInt(10001);
        System.out.println(randNum);
        int sum = 0, temp = randNum;
        while (temp>0){
            sum += (temp%10);
            temp=temp/10;
        }
        System.out.println("Sum of all digits:"+sum);
        
    }
    
}
