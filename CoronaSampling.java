/*
*Author: Raphael Sani Enejo.
*Problem description: code that samples the possibility of COVID-19 infection using scoring points.
*Date: April 01, 2020
*/
import java.util.Arrays;
import java.util.Scanner;

public class CoronaSampling{
       public static void main(String[] args){


         // taking String array input from user
         Scanner scanner = new Scanner(System.in);
          
         int threatLevel = 0;
         //total length of questionair
         int length = 12;

         //String array to save user input
         String[] input = new String[length];
         
         //prompt user
         System.out.println("Please answer by typing 'yes' or 'no':");

         System.out.println("Do you have cough?");
         String q1 = scanner.next();
         input[0] = q1;

         if(input[0].equals("yes")){
         threatLevel += 1;
         }
         

         System.out.println("Do you have a running nose?");
         String q2 = scanner.next();
         input[1] = q2;
         
         if(input[1].equals("yes")){
         threatLevel += 1;
         }

         System.out.println("Do you have diarrhea?");
         String q3 = scanner.next();
         input[2] = q3;

         if(input[2].equals("yes")){
         threatLevel += 1;
         }

         System.out.println("Do you have Headache?");
         String q4 = scanner.next();
         input[3] = q4;

         if(input[3].equals("yes")){
         threatLevel += 1;
         }

         System.out.println("Are you experiencing MYALGIA or body aches?");
         String q5 = scanner.next();
         input[4] = q5;

         if(input[4].equals("yes")){
         threatLevel += 1;
         }

         System.out.println("Are you having sore throat?");
         String q6 = scanner.next();
         input[5] = q6;

         if(input[5].equals("yes")){
         threatLevel += 1;
         }

         System.out.println("Are you having fever (temperature 37.8C and above)?");
         String q7 = scanner.next();
         input[6] = q7;

         if(input[6].equals("yes")){
         threatLevel += 1;
         }

         System.out.println("Are you having difficulty breathing?");
         String q8 = scanner.next();
         input[7] = q8;

         if(input[7].equals("yes")){
         threatLevel += 2;
         }


         System.out.println("Are you experiencing fatigue?");
         String q9 = scanner.next();
         input[8] = q9;

         if(input[8].equals("yes")){
         threatLevel += 2;
         }


         System.out.println("Have you traveled recently during the past 14 days?");
         String q10 = scanner.next();
         input[9] = q10;

         if(input[9].equals("yes")){
         threatLevel += 3;
         }


         System.out.println("Do you have a travel history to COVID-19 INFECTED AREA?");
         String q11 = scanner.next();
         input[10] = q11;

         if(input[10].equals("yes")){
         threatLevel += 3;
         }


         System.out.println("Do you have direct contact or taking care of a positive COVID-19 PATIENT?");
         String q12 = scanner.next();
         input[11] = q12;

         if(input[11].equals("yes")){
         threatLevel += 3;
         }
         


         System.out.print("ENTRIES: ");
         System.out.println(Arrays.toString(input) + ".");

         System.out.println("THREAT LEVEL:" + threatLevel);

         System.out.println("SCORE RESULTS:" + threatLevel);

         if(threatLevel <= 2){
          System.out.println("ADVICE: May be stress related and observe.");

         } else if (threatLevel <= 3 || threatLevel <= 5 ){
          System.out.println("ADVICE: Hydrate properly and proper personal hygiene.");

         } else if (threatLevel <= 6 || threatLevel <= 12  ){
          System.out.println("ADVICE: Seek a consultation with a Doctor.");
         } else if (threatLevel <= 20){
          System.out.println("PLEASE CALL THE NCDC HOTLINE 080097000010");
         } else {
          System.out.println("DEATH ALERT");
         }

         

         scanner.close();

       }

}