
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double tempCelsius = 0;
        double tempFahrenheint = 0;
        String trash = "";

        System.out.print("Enter the temperature in Celsius value: ");
        if(in.hasNextDouble()) {
            tempCelsius = in.nextDouble();
            in.nextLine();
            tempFahrenheint = 32 + (tempCelsius * 9 / 5);
            System.out.println("The temperature you entered from celsius to fahrenheit is at the freezing point: " + tempFahrenheint);
        }
        else
        {
            trash = in.nextLine();
            System.out.println("The temperature you entered is invalid: " + trash);
        }


        System.out.print("Enter the temperature in Celsius value: ");
        if(in.hasNextDouble())
        {
            tempCelsius = in.nextDouble();
            in.nextLine();
            tempFahrenheint = 32 + (tempCelsius * 9 / 5);
            System.out.println("The temperature you entered from celsius to fahrenheit is at the boiling point: " + tempFahrenheint);
        }
        else
        {
            trash = in.nextLine();
            System.out.println("The temperature you entered is invalid: " + trash);
        }

        System.out.print("Enter the temperature in Celsius value: ");
        if(in.hasNextDouble())
        {
            tempCelsius = in.nextDouble();
            in.nextLine();
            tempFahrenheint = 32 + (tempCelsius * 9 / 5);
            System.out.println("The temperature you entered from celsius to fahrenheit is: " + tempFahrenheint);
        }

        else{
            trash = in.nextLine();
            System.out.println("The temperature you entered is invalid: " + trash);
        }

        // write your code here
    }
}
