/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l2q3;

/**
 *
 * @author User
 */
public class rand_nums {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int min = 10;
        int max = 50;
        
        int num1 = (int)(Math.random()*(max-min+1))+min;
        int num2 = (int)(Math.random()*(max-min+1))+min;
        int num3 = (int)(Math.random()*(max-min+1))+min;
        double average = (num1+num2+num3)/3.0;
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println("Sum:"+(num1+num2+num3));
        System.out.printf("Average:%.2f\n",average);
    }
    
}
