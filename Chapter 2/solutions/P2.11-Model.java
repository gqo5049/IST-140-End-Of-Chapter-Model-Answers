import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      
      System.out.print("Please enter the number of gallons of gas in the tank: ");
      double gallonsOfGas = in.nextDouble();
      
      System.out.print("Please enter the fuel efficency (miles per gallon): ");
      double milesPerGallon = in.nextDouble();
      
      System.out.print("Please enter the price of gas per gallon: ");
      double pricePerGallon = in.nextDouble();
      
      double costPer100Miles = 100 / milesPerGallon * pricePerGallon;
      double maximumDistance = milesPerGallon * gallonsOfGas;
      
      System.out.printf("To drive 100 miles, it will cost 
      $%.2f.\n", costPer100Miles);
      System.out.printf("The car can currently drive a maximum of %f 
      miles.", maximumDistance);
   }
}
