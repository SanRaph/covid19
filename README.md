# A CORONA VIRUS SAMPLING CODE
###### Author: Raphael Sani
###### Date: April 01, 2020
###### Class: Cohort 4 of [Semicolon](http://www.semicolon.africa/)
###### Description: A Corona Virus (COVID-19) sampling code that uses SCOREPOINTS to determine and control the rate of infectious persons.


  **taking String array input from user using _scanner_ **
         Scanner scanner = new Scanner(System.in);
          
          **threatLevel tracks and hold _SCOREPOINTS_ **
         `int threatLevel = 0;`
         **total length of questionaire**
         `int length = 12;`

         **String array to save user inputs**
         `String[] input = new String[length];`
         
         **prompt user for _'yes'_ or _'no'_ **
         System.out.println("Please answer by typing 'yes' or 'no':");

         System.out.println("Do you have cough?");
         **get user input and put into the _input[] array_ by index**
         String q1 = scanner.next();
         input[0] = q1;

         //check to see if the value in the array equals the yes at the position**
         if(input[0].equals("yes")){
         	//if true, increase the var threatLevel by 1**
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
         


         //show the total entries in the array accordingly**
         System.out.print("ENTRIES: ");
         System.out.println(Arrays.toString(input) + ".");

         //show threat level
         System.out.println("THREAT LEVEL:" + threatLevel);

         //print scores**
         System.out.println("SCORE RESULTS:" + threatLevel);

         //check and advice according to threat Level
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

         

         //close the scanner obj
         scanner.close();

         :EMOJICODE:

@SanRaph-semicolon :+1: Stay alive, don't die! :shipit:
