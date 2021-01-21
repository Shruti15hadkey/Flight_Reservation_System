import java.util.Scanner;

import static java.lang.System.*;
public class FlightReservation
{

    public static void main(String[] args)
     {
	  boolean[] arrSeats = new boolean[10];
      Scanner sc = new Scanner(in);
      String section = null;
               
             // SETTERS
             // Assigns first empty seat in relevant section
               
       boolean assignSeat(String(section));
		{
         if (section == "first")
            {
                if (getFreeSeats(section) > 0)
                    {
                        for (int i = 0; i < 5; i++)
                            {
                                if (arrSeats[i] == false)
                                {
                                  arrSeats[i] = true;
                                  printBoardingPass(i);
                                  return true;
                                }
                            }
                    }
            }
                else if (section == "economy")
                   {
                       if (getFreeSeats(section) > 0)
                       {
                           for (int i = 5; i < arrSeats.length; i++)
                           {
                               if (arrSeats[i] == false)
                               {
                                   arrSeats[i] = true;
                                   printBoardingPass(i);
                                   return true;
                               }
                           }

                       }

                       // seats in chosen section full
                       // check if ok to assign to other section

            System.out.printf("All seats in section \"%s\" are booked.\n", section);
            System.out.printf("Would you like to be moved to section \"%s\" (y/n)? ",
            (section == "first") ? "economy" : "first");

                if (sc.next().charAt(0) == 'y')
                    {
                        System.out.print(assignSeat((section == "first") ? "economy" : "first"));
                    }
                else
                    System.out.println("\nNext flight leaves in 3 hours.\n");

                    return false;
             }
                        // GETTERS
                        // returns number of free seats in each section

                        //private static boolean getFreeSeats (String (section))
        } 

            int total = 0;
              if (section == "first")
               {
                   // first class 1-5 (array 0-4)
                  for (int i = 0; i < 5; i++)
                     {
                      if (arrSeats[i] == false)
                      total += 1;
                     }
               } 
			  else if (section == "economy")
               {
                   // economy 6-10 (array 5-9)
                 for (int i = 5; i < arrSeats.length; i++)
                 {
                   if (arrSeats[i] == false)
                   total += 1;
                 }
               }
               return total;
           }
    // check whether or not all seats are booked

        public boolean seatsAvailable()
          {
    // if empty seat found return true
            boolean[] arrSeats = new boolean[0];

            for (boolean seat : arrSeats)
                if (seat == false)
                    return true;

    // if none seat found plane is full
                    return false;
          }

        public void printGreeting()
          {
               
			   System.out.println("\nWelcome to Fly-High Airlines booking system.\n");
          }
           
    // print the menu with remaining number of seats for each section
        public void printMenu()
           {
               System.out.printf("1. Economy class %s\n",
                       (getFreeSeats("economy") > 0) ?
                               "(" + Integer.toString(getFreeSeats("economy")) + ")" : "(full)");
               System.out.printf("2. First class %s\n",
                       (getFreeSeats("first") > 0 ?
                               "(" + Integer.toString(getFreeSeats("first")) + ")" : "(full)"));
               System.out.print(" > ");
           }

           private static int getFreeSeats(String economy)
           {
               String section = null;
               int total = 0;

             //  boolean arrSeats;
               if (section == "first")
               {
                   //boolean arrSeats;
                   // first class 1-5 (array 0-4)
                   for (int i = 0; i < 5; i++)
                   {
                       if (arrSeats[i] == false)
                           total += 1;
                   }
               }
               else if (section == "economy")
               {
                   // economy 6-10 (array 5-9)
                   for (int i = 5; i < arrSeats.length; i++)
                   {
                       if (arrSeats[i] == false)
                           total += 1;
                   }
               }
               return total;
           }

           // prints the boarding pass

           private static void printBoardingPass(int seat)
           {
               out.println("\nBoarding pass for Fly-High Airlines.");
               out.printf("\nSECTION: %s\nSEAT NUMBER: %d\n\n\n",
                       (seat < 5) ? "first" : "economy", seat + 1);
           }

}