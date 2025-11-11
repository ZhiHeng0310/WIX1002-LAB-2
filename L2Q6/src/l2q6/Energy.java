/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l2q6;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Energy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the amount of water in gram:");
        double m = sc.nextDouble();
        double M = m/1000;
        System.out.print("Enter the initial temperature in Fahrenheit:");
        double ini_temp = sc.nextDouble();
        System.out.print("Enter the final temperature in Celsius:");
        double final_temp = sc.nextDouble();
        double ini_temp_cel = (ini_temp-32)/1.8;
        double final_temp_cel = (final_temp-32)/1.8;
        double Q = M*(final_temp_cel - ini_temp_cel)*4184;
        System.out.printf("The energy needed is %e%n",Q);
    }
    
}
