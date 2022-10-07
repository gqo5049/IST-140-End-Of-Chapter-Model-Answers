import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter the card notation: ");
      String card = in.next();

      // This extracts the value which may be 1 or 2 characters long
      String value = card.substring(0, card.length() - 1);

      // The suit is always the last character
      String suit = card.substring(card.length() - 1);

      String valueAsString = "";
      if (value.compareTo("A") == 0)
      {
         valueAsString = "Ace";
      }
      else if (value.compareTo("J") == 0)
      {
         valueAsString = "Jack";
      }
      else if (value.compareTo("Q") == 0)
      {
         valueAsString = "Queen";
      }
      else if (value.compareTo("K") == 0)
      {
         valueAsString = "King";
      }
      else
      {
         valueAsString = value;
      }

      String suitAsString = "";
      if (suit.compareTo("D") == 0)
      {
         suitAsString = "Diamonds";
      }
      else if (suit.compareTo("H") == 0)
      {
         suitAsString = "Hearts";
      }
      else if (suit.compareTo("S") == 0)
      {
         suitAsString = "Spades";
      }
      else
      {
         suitAsString = "Clubs";
      }
      System.out.printf("%s of %s\n", valueAsString, suitAsString);
   }
}
