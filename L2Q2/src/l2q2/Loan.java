/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l2q2;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class Loan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("The price of the car:RM");
        double P = input.nextDouble();
        System.out.print("Down payment:RM");
        double D = input.nextDouble();
        System.out.print("Interest Rate in %:");
        double R = input.nextDouble();
        System.out.print("Loan duration in year:");
        double Y = input.nextDouble();
        double M = (P-D) * (1+R*Y/100)/(Y*12);
        System.out.printf("Monthly Payment:RM%.2f\n",M);
    }
    
}
