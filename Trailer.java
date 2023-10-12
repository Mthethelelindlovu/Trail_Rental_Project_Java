/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trailer;

/**
 *
 * @author Mthetheleli Ndlovu
 */
import java.util.Scanner;
public class Trailer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        // declaring variables
        int distanceTravelled;
        int numDays;
        final int costPerDay = 200;
         int costPerKilo ;                   
        final double additionalSurcharge = 0.05;
        final double discount =0.12;
        double amountDue;
        
        // prompting the user to enter information
        System.out.println("Enter the distance travelled: ");
        distanceTravelled = sc.nextInt();
        System.out.println("Enter the number of days: ");
        numDays = sc.nextInt();
        System.out.println("Enter the amount per kilometre");
        costPerKilo = sc.nextInt();
        
        // perform calculation if the distance is less than 50 kilometres
        if(distanceTravelled < 50)
        {
            amountDue = (distanceTravelled*costPerKilo) + (numDays*costPerDay) + additionalSurcharge * (distanceTravelled*costPerKilo) + (numDays*costPerDay);
            System.out.println("The cost of hiring the trailer is, R"+amountDue);
        }
        
        // performing calculation if the the distance is more than 400 kilometres
        else if(distanceTravelled > 400)
        {
            amountDue = (distanceTravelled*costPerKilo) + (numDays*costPerDay) - discount * (distanceTravelled*costPerKilo) + (numDays*costPerDay);
            System.out.println("The cost of hiring the trailer is, R"+amountDue);
        }
        
        
    }
    
}
