/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l2q1;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class celsius {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here lol
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature in degree Fahrenheit:");
        double temperature = input.nextDouble();
        double Celsius;
        Celsius = (temperature-32)/1.8;
        System.out.printf("%.2f°F = %.2f°C\n",temperature,Celsius);
    }
}
