public class Main {
    /**
     * @param args
     */
    public static void myMethod() {
            System.out.println("I just got executed!");
        }
    public static void main(String[] args) {
    System.out.println("Hello, World!");
    String name = "John";
    System.out.println(name);
    int x = 3, y = 4;
    System.out.println(x * y);
    String studentName ="John Sams";
    int studentId = 001;
    int studentAge = 20;
    double studentFee = 75.75d;
    char studentGrade = 'B';

    System.out.println("Student Name: " + studentName);
    System.out.println("Student Id: " + studentId);
    System.out.println("Student Age: " + studentAge);
    System.out.println("Student Fee: " + studentFee);
    System.out.println("Student Grade: " + studentGrade);

    //create integer variabels
    int length = 4;
    int width = 6;
    int area;

    area = length * width;

    System.out.println("Length is: " + length);
    System.out.println("Width is: " + width);
    System.out.println("Area of a rectangle is:" + area);
    //create a double variable
    double d1 = 35e3f;
    float f1 = 12e4f;
    System.out.println("Double value: " + d1);
    System.out.println("Float value: " + f1);

    //create a boolean variable
    boolean isJavaFun = true;
    boolean isFishTasty = false;
    System.out.println("Is Java fun? " + isJavaFun);
    System.out.println("Is fish tasty? " + isFishTasty);

    //create a character variable
    char grade = 'A';
    System.out.println("Grade: " + grade);
    //create variables of different data types
    int items = 50;
    double costPerItem = 9.99d;
    double totalCost = items * costPerItem;
    char currency = '$';
    boolean inStock = true;

    // Print the variables
    System.out.println("Number of items: " + items);
    System.out.println("Cost per item: " + currency + costPerItem);
    System.out.println("Total cost: " + currency + totalCost);
    System.out.println("In stock: " + inStock);

    //Widening Casting 
    int myInt = 9;
    double myDouble = myInt;

    System.out.println(myInt);
    System.out.println(myDouble);

    //Narrowing Casting
    double myDouble2 = 9.78d; 
    int myInt2 = (int) myDouble2; // Manual casting : double to int
    System.out.println(myDouble2);
    System.out.println(myInt2); 

    /*Real-Life example: here is a real life example of casting where we creaye a program to calculate the percentage of a user"s score in relation to the maximum score in a game 
     * 
     * we use type casting to make sure that the result is a floating-point value, rather than an integer.
     */
    // Set the maximum possible score in the game to 500
    int maxScore = 500;

    // The actual score of the user

    int userScore = 423;
    /*Calculate the Percentage of the user's score in relation to the maximum available score. Convert userScore to make sure that the division is accurate */
    Float percentage = (float) userScore / maxScore * 100.0f;
    char percentageSymbol = '%';
    // Print the result
    System.out.println("User's percentage is " + percentage + percentageSymbol);

    /*Java Operators: Operators are used to perform operations on variables and values.
     * in this example, we use the + operator to add together two values 
     */

     //int a = 100 + 50; // Assign the value 150 to a
     
     /*Althoug the + operator is often used to add together two values, like in the example above, it can also be used to add together a variable and a value, or a variable and another variable */

     int sum1 = 100 + 50;
     int sum2 = sum1 + 250;
     int sum3 = sum2 + sum2;
     System.out.println("Sum1: " + sum1);
      System.out.println("Sum2: " + sum2);
      System.out.println("Sum3: " + sum3);

      /*
       * Java Arithmetic Operators: Arithmetic operators are used to perform basic mathematical operations such as addition, subtraction, multiplication, and division.
       * operators
       *        eg.
       *                  same as
       * =	   x = 5	    x = 5	
        +=     x += 3	    x = x + 3	
        -=     x -= 3	    x = x - 3	
        *=	   x *= 3	    x = x * 3	
        /=	   x /= 3   	x = x / 3	
        %=	   x %= 3	    x = x % 3	
        &=   	 x &= 3	    x = x & 3	
        |=	   x |= 3	    x = x | 3	
        ^=	   x ^= 3    	x = x ^ 3	
        >>=	   x >>= 3	  x = x >> 3	
        <<=	   x <<= 3	  x = x << 3
       */

       String txt = "ASHRHDJHFSHGFYHBFUUYGUSGUIYGRYGFUGY";
       System.out.println("The length of the txt string is: " + txt.length());

       String txt2 = "Hello World";
       System.out.println(txt2.toUpperCase());
       System.out.println(txt2.toLowerCase());

       //Finding a character in a string
       String txt3 = "Please can locate where 'locate' occurs!";
       System.out.println(txt3.indexOf("locate"));

       //concatination of strings
       String firstName = "Mark";
       String lastName = "Smith";
       System.out.println(firstName + " " + lastName); 
       //OR
       System.out.println(firstName.concat(lastName));

       String txt4 = "We \'are the\' \\so-called\\ \"Vikings\" from the north.";
       System.out.println(txt4);
      /*\n	New Line	
        \r	Carriage Return	
        \t	Tab	
        \b	Backspace	
        \f	Form Feed */
        String txt5 = "We are the \n so-called \"Vikings\" from the north.";
        System.out.println(txt5);

        /* Java Math: The Math.max(x,y) method can be used to find the highest value of X and Y 
         * Example:
         */
        Math.max(5, 10); // returns 10

        /* Java Math: The Math.min(x,y) method can be used to find the lowest value of X and Y 
         * Example:
         */
        Math.min(5, 10); // returns 5
        /* Java Math: The Math.sqrt(x) method can be used to find the square root of X 
         * Example:
         */
        Math.sqrt(64); // returns 8.0
        /* Java Math: The Math.abs(x) method can be used to find the absolute (positive) value of X 
         * Example:
         */
        double find = Math.abs(-4.7); // returns 4.7
        System.out.println(find);
        /* Java Math: The Math.random() method can be used to generate a random number between 0.0 and 1.0 
         * Example: 
         */ int randomNum = (int)(Math.random() * 101);
         System.out.println("Random Interger between 0 and 100: " + randomNum);
        double randomValue = Math.random(); // returns a random number between 0.0 and 1.0
        System.out.println("Random value: " + randomValue);
        

        // boolean expressinos
        int a = 7;
        int b = 5;
        System.out.println(a>b);

        int e =13;
        System.out.println(e == 13);

        System.out.println(10 == 17);

        int myAge = 25;
        int votingAge = 18;
        System.out.println(myAge >= votingAge);
        /* An even better approach (since we are on a roll now), would be to wrap the code above in an if...else statement, so we can perform different actions depending on the result: */
        int myAge2 = 5;
        int votingAge2 = 18;
        if (myAge2 >= votingAge2) {
            System.out.println("You are old enough to vote.");
        } else {
            System.out.println("You are not old enough to vote.");
        }
        /*Use if to specify a block of code to be executed, if a specified condition is true
Use else to specify a block of code to be executed, if the same condition is false
Use else if to specify a new condition to test, if the first condition is false
Use switch to specify many alternative blocks of code to be executed */
        int num1 = 50;
        int num2 = 45;
        if (num1 > num2) {
          System.out.println(num1 + " is the bigger number");
        } else {
          System.out.println(num2 + " is the bigger number");
        }

        // The else Statement: Use the else statement to specify a block of code to be executed if the condition is False
        
        /*the else if statement: use this statement to specify a new condition if the first condition is fales */
        int time = 20;
        if (time < 10) {
            System.out.println("Good morning.");
        } else if (time == 20) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }

        int time2 = 20;
        String result = (time2 < 30) ? "Good day." : "Good evening.";
        System.out.println(result);

        int myNum = 5;

        if (myNum % 2 == 0) {
            System.out.println(myNum + " is an even number.");
        } else {
            System.out.println(myNum + " is an odd number.");
        }

        /*Java Switch statements
         * Instead of writing many if...else statements, you can use a switch statement to select one of many code blocks to be executed.
         * A switch statement can have one or more case statements, and the switch expression is evaluated once.
         * The switch expression is evaluated once.
The value of the expression is compared with the values of each case.
If there is a match, the associated block of code is executed.
The break and default keywords are optional, and will be described later in this chapter
         */
        int day = 9;
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("It's the weekend!");

            /*
             * Java while loop: Loops can execute a block of code as long as a specified condition is true.
             * loops are handy because they save time, reduce errors and they make code more readable.
             */
        }
        int i = 0;
        while (i <= 5) {
            System.out.println(i);
            i++;
            /*
             * Count downn Example:
             */
            int countdown = 3;
            while (countdown > 0) {
                System.out.println(countdown);
                countdown--;
            }
            System.out.println("Happy New Year!!");
        /*
         * The Do/While Loop
         * The do/while loop is a variant of the while loop. this will execute the code block once,
         * before checking if the condition is true. Then it will reapeat the loop as long as the condition is true.
         *
         * The example below uses a do/while loop. The loop will always be executed at least once, even if the condition is false, because the code block is executed before the code block is executed before the condition is tested:
         */
            int i2 = 1;
            do {
                System.out.println(i2);
                i2++;
            }
            while (i2 < 5);

            int i3 = 10;
            do {
                System.out.println(i3);
                i3++;
            } 
            while (i3 < 6);
        }
        /* A Real-life eample : To demonstrate a practical example of the while loop conbined with an if else statement, let's say we play a game of Yatzy
         */
        int dice = 1;

        while (dice <= 6) { 
        if (dice < 6) {
            System.out.println("No Yatzy.");
        
         } else {
            System.out.println("Yatzy");
         }
         dice = dice + 1;
        }
        /*
         * Java For Loop 
         * When you Know Exactly How many times You want to loop Through a block of code , use The For loop instead of a While  Loop :
         * Statement 1 is executed (one time) before the execution of the code block.
         * Statement 2 defines the condition for executing the code Block.
         * Statement 3 is executed (every time) after the code block has been executed.
         * Print Numbers
         * The example below will print the numbers 0 to 4:
         * Example
         */
        for (int i4 = 0; i4 < 5; i4++) {
            System.out.println(i4);
        }

        for (int w1 = 0; w1 < 10; w1++) {
            System.out.println("yes");
        }
        //FOR loop to print even numbers 
        for (int i5 = 0; i5 <= 20; i5 = i5+ 2) {
            System.out.println(i5);
        }
        //FOR loop to priint the sum of numbers
        //this example calculates the sum of numbers from 1 to 5:

        int sum = 0;
        for (int i6 = 1; i6 <= 5; i6++) {
            sum = sum + i6; // or sum += i6;
        } 
        System.out.println("The sum of numbers from 1 to 5 is: " + sum);

        // countdown2
        for (int i7 = 5; i7 > 0; i7--) {
            System.out.println(i7);
        }

        /*
         * Nested Loops: It is also possible to Place a loop inside another loop. It"s called a Nested loop.
         * The "inner loop" will be executed one time for each iteration of the "outer loop":
         */

         //Outer Loop 
         for (int i8 = 1; i8 <= 2; i8++) {
            System.out.println("Outer loop: " + i8);//Executes 2 times

            // Inner loop
            for (int j = 1; j <= 3; j++) {
                System.out.println("Inner: " + j); // Executes 6 times (2 * 3)
            }
         }
         //Multiplication table example
         //This example uses a nested loops to print a simple multiplication table(1 to 3):
         for ( int i9 = 1; i9 <= 3; i9++) {
            for (int j1 = 1; j1 <= 3; j1++){
                System.out.println(i9 * j1 + " ");
            }
            System.out.println();
         }
         // The for-each Loop : There is also a for-each LOOP, which is used exclisively to loop through elements in an array ( or other data structures.)
         String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
          for (String i0 : cars) {
            System.out.println(i0);
          }
          //More examples on the for loop
          for (int i11 = 0; i11 <= 100; i11 += 10) {
            System.out.println(i11);
          }

          for (int i12 =0; i12 <= 10; i12 += 2) {
            System.out.println(i12);
          }
        
          // in this next example we will have a multipliction table for the number 2 
            int number = 2;

          for (int i13 = 1; i13 <= 10; i13++) {
            System.out.println(number + " x " + i13 + " = " + (number * i13));
          }
           /*
            * Java Break and Continue:
            You have already seen the Break Statement Used In an earlier chapter of this tutorial. It was used to jump Out of a switch Statment 
            The Break Statement can also be used to breake out of a loop.
            This example stops the loop when IT is equal to 4:
            */
            for (int i14 = 0; i14 < 10; i14++) {
                if (i14 == 4) {
                    break; // Breaks the loop when i is equal to 4
                }
                System.out.println(i14);
            }
            /*
             * Java Continue Statement:
             * the continue statement breakes one iteration (in the loop), if a specified condition occurs, and continues with the next iteration in the loop.
             * This examples skips the Value of 4:
             */
            for (int i15 = 0; i15 < 10; i15++) {
                if (i15 == 4) {
                    continue; // Skips the rest of the code in the loop when i is equal to 4
                }
                System.out.println(i15);
            }

            /*
             * Break and Continue in While Loops:
             * The break and continue statements can also be used in while loops.
             */
            int i16 = 0;
            while (i16 < 10) {
                if (i16 == 4) {
                    break; // Breaks the loop when i is equal to 4
                }
                System.out.println(i16);
                i16++;
            }

            //Continue Example
            int i17 = 0;
            while (i17 < 10) {
                if (i17 == 4) {
                    i17++;
                    continue; // Skips the rest of the code in the loop when i is equal to 4
                }
                System.out.println(i17);
                i17++;
            }


            /*
             * JAVA Arrays:
             * Arrays are used to store multiple Values in a single variable, instead of eclearing separeate variables for each value.
            * To declear an array, define the variable type with SQUARE brackets:
             */
            String[] cars2 = {"Volvo", "Benz", "BMW", "Ford", "Toyota"};
            System.out.println(cars2[1]);

            /*
             * Change an Array element:
             * to change the value of a specific element, refer to the index number: 
             */
            String[] cars3 = {"Benz", "BMW", "Toyota", "Jeep", "Bugatti"};
            cars3[0] = "Volvo"; // Change the value of the first element
            System.out.println(cars3[0]);
            // New out put is "Volvo" instead of "Benz"

            /*
             * Array lenght 
             * to find out how many elements an array has, use the length property:
             */
            String[] cars4 = {"Volvo", "BMW", "Ford", "Mazda"};
            System.out.println(cars4.length);
            /*
             * Looping Through an Array:
             * You can loop through the array elements with the for loop, and use the length property to specify how many times the loop should run:
             * 
             * the following example outputs all elements in the cars array:
             */
            String[] cars5 = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String cars51 : cars5) {
            System.out.println(cars51);
        }

            /*
             * Loop through an Array with for-each:
             * There is also a for-each loop, which is used exclusively to loop through elements in Arrays.
             * The following example Outputs all elements in the cars array, usinh a for-each loop:
             */

             String[] cars6 = {"Volvo", "BMW", "Ford", "Mazda"};
             for (String i19 : cars6) {
                System.out.println(i19);
             }
             /*
              * The example above can be read like this: for each String element (called I is an index) in cars; print out the value of i.
              If you compare the for loop and for-each loop, you will see that the for-each method is easier to write, it dose not require a counter (using the length property), and it is more readable.
              */
            //Real life examples:


            // An array storing different ages
            int ages[] = {18, 21, 25, 30, 35};

            float avg, sum4 = 0;

            // Get the length of the array
            int length2 = ages.length;

            // loop through the elements of the array
            for (int age : ages) {
                // add each element to the sum
                sum4 += age;
            }

            //Calculate the average by dividing the sum by the lenght
            avg = sum4 / length2;

            // Print the average age
            System.out.println("The average age is: " + avg);


            //This next example will create a program that finds the lowest age amon different ages:

            int[] ages2 = {18, 21, 25, 30, 35};

            //get the length of the array
            //int lenght3 = ages2.length;
             
            // Create a "lowest age" variable and set it to the first element of ages2 to it
            int lowestAge =  ages2[0];
            // Loop through the elements of the array to find the lowest age
            for (int age : ages2) {
                // If the current age is lower than the lowest age, update the lowest age
                if (age < lowestAge) {
                    lowestAge = age;
                }
            }
            //Output the value of the lowest age
            System.out.println("The Lowest age in arrays is: " + lowestAge);

            /*
             * Multidimensional Arrays 
             * A multidimentional array is an array of arrays.
             * Multidimentional arrays are usefuk whhen you want to store data as a tabular form, like a table with rows and columns.
             * To create a Two-dimensional array, add eacch array within it's own set of curly braces
             * To access the elements of the myNumbers array, specify two indexes: one for the array, and one for the element inside that array. This example accesses the third element (2) in the second array (1) of myNumbers:
             * EXAMPLE:
             */
            int[][] myNumbers = {{1, 2, 3, 4}, {5, 6, 7}};
            System.out.println(myNumbers[1][2]);

            /*
             * Change ELement Values
             * You can also change the valus of an element:
             * Example:
             */
            int[][] myNumbers2 = {{1, 2, 3, 4, }, {5, 6, 7, 8} };
            myNumbers2[1][2] = 9;
            System.out.println(myNumbers2[1][2]); // Outputs 9 instead of 7

            /*
             * Loop through a Multi-Dimensional Arry
             * You can use a for loop insidde another for loop to get the elements of a two-dimensional array (we still have to point to the two indexes):
             * Example:
             */
            int[][] myNumbers3 = {{1, 2, 3, 4}, {5, 6, 7, 8}};
        for (int[] i20 : myNumbers3) {
            for (int j2 = 0; j2 < i20.length; j2++) {
                System.out.println(i20[j2]);
            }
        }
            //or you could use a for-each loop, which is considered easier to read and write:
            int[][] myNumbers4 = {{1, 2, 3, 4}, {5, 6, 7, 8}};
            for (int[] row : myNumbers4) {
                for (int i21 : row) {
                    System.out.println(i21);
                }
            }
            /*
             * Java methods:
             * A Method is a block of code that only runs when it is called.
             * You can passs data, know as parameters, into a method.
             * Methods are used to perform certain actions,
             * and they ar also known as funtions.
             *  why use methods? to reuse code: define the code once, and use it many times.
             * 
             * First you need to create a method:
             * 
             * A method must be decleared within a class. it is defined with the name of the method, followed by parentheses ().  JAVA provides some pre-defined methods, but you can also create your own methods to perform certain actions:
             * Example:
             */
            // Create a method called myMethod refeer to the top of the code for this example : (Line 5)

            // Create a method called myMethod
        
        /*
         * Example Explained 
         * The myMethod() is the name of the method.
         * The static means that the method belongs to the main class and no an object of the Main class. You will learn about Objects and how to access methods through objects later in this tutorial.
         * void means that this method dose not have a returen value. You'll learn about return values later.
         * 
         * Call a method
         * to call a method in java, write the method's name followed by two parentese () and a semicolon;
         * 
         * in the following example myMethod() is used to print a text (the action), when it is called:
         */
        myMethod();
            // This method can also be called multiple times 
        myMethod();
        myMethod();
        myMethod();
        myMethod();
        myMethod();

        }

        

}