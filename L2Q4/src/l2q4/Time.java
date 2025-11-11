/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l2q4;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Time {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of seconds: ");
        int time = input.nextInt();
        int hour = time/3600;
        int minute = (time/60)-(hour*60);
        int second = time - (hour*3600) - (minute*60);
        System.out.println(time+" seconds is "+hour+" hours,"+minute+" minutes and "+second+" seconds");
    }
    
}
