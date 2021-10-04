package com.company;

public class Main {

    public static void main(String[] args) {

        //Section-3 of the course

        //All The code and notes

        //int

        int myValue = 10000;
        System.out.println(myValue);

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Busted Minimum Value = " + (myMinIntValue - 1));
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("Busted MAX Value = " + (myMaxIntValue + 1));

        int myMaxIntTest = 2_147_483_647;




        //byte

        byte myByteMinValue = Byte.MIN_VALUE;
        byte myByteMaxValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myByteMinValue);
        System.out.println("Byte Maximum Value = " + myByteMaxValue);




        //Short

        short myShortMinValue = Short.MIN_VALUE;
        short myShortMaxValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myShortMinValue);
        System.out.println("Short Maximum Value = " + myShortMaxValue);
        short bigShortLiteralValue = 32767;



        //Long

        long myLongMinValue = Long.MIN_VALUE;
        long myLongMaxValue = Long.MAX_VALUE;
        System.out.println("long Minimum Value = " + myLongMinValue);
        System.out.println("long Maximum Value = " + myLongMaxValue);
        long bigLongLiteralValue = 2147483647_234L;
        System.out.println(bigLongLiteralValue);




        //Casting in JAVA

        int myTotal = (myMinIntValue / 2);

        byte myNewByteValue = (byte) (myByteMinValue / 2);

        short myNewShortValue = (short) (myShortMinValue / 2);




        //Primitive Types Challenge

        byte myChallengeByte = 120;

        short myChallengeShort = 3256;

        int myChallengeInt = 2425;

        long myChallengeLong =  50000L + 10L * (myChallengeByte + myChallengeShort + myChallengeInt);

        System.out.println(myChallengeLong);

        short myShortChallenge = (short) (myChallengeByte + myChallengeShort + myChallengeInt);

        System.out.println(myShortChallenge);





        //Single and Double Precision

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println(myMinFloatValue);
        System.out.println(myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println(myMinDoubleValue);
        System.out.println(myMaxDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatingValue = 5f / 3f;
        double myDoubleValue = 5.00 / 3.00;
        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatingValue = " + myFloatingValue);
        System.out.println("myDoubleValue = " + myDoubleValue);




        //Challenge

        double myPound = 200d;
        double myKGValue = myPound * 0.45359237d;
        System.out.println(myKGValue + " Kg");





        //Char & boolean
        //Char


        char myChar = 'D';
                // unicode in char
        char myUnicodeChar = '\u0044';
        System.out.println(myChar);
        System.out.println(myUnicodeChar);
        char myCopyrightChar = '\u00A9';
        System.out.println(myCopyrightChar);




        //Boolean

        boolean myTrueBoolean = true;
        boolean myFalseBoolean = false;

        boolean isCustomerOverTwentyOne = true;




        //Primitive DataTypes :-

        //byte
        //short
        //int
        //long
        //float
        //double
        //char
        //boolean

        String myString = "This is a String";
        System.out.println("myString is equal to " + myString);
        myString = myString + ", and this is more.";
        System.out.println("myString is equal to " + myString);
        myString = myString + "\u00A9 2019"; // \u00A9 this is unicode of symbol ©
        System.out.println("myString is equal to " + myString);
        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LastString is equal to " + lastString);
        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println("LastString is equal to " + lastString);




        //Operators, Operands and expressions
        //Operators

        int result = 1 + 2; //1 + 2 = 3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult =  " + previousResult );
        result = result -1;
        System.out.println("3 - 1 = " + result);
        System.out.println("previousResult = " + previousResult );

        result = result * 10; //2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        result = result / 5; //20 /5 = 4
        System.out.println("20/ 5 = " + result);

        result = result % 3; //the reminder of (4 % 3) = 1
        System.out.println(" 4 % 3 = " + result);




        //Abbreviating Operators

        //result = result + 1;
        result++;// 1 + 1 = 2
        System.out.println("1 + 1 = " + result);

        result--; // 2 - 1 = 1
        System.out.println("2 - 1 = " + result);

        //result = result + 2;
        result += 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);

        //result = result * 10;
        result *= 10; // 3 * 10 = 30
        System.out.println("3 * 10 = " + result);

        //result = result / 3
        result /= 3;
        System.out.println("30 / 3 = " + result);

        //result = result - 2
        result -= 2; // 10 - 2 = 8
        System.out.println("10 - 2 = " + result);




        //if-then statement

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens");
        }




        //Logical & Operators

        int topScore = 100;
        if (topScore <= 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }




        //Logical (OR is ||) Operators

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) //Using the equal to operator which has two equal signs.
             {
            System.out.println("This is true");

        }

        boolean isCar = false;
        if (isCar = true) //Here the isCar variable is boolean and has been assigned to the value true
        {
            System.out.println("This is not supposed to happen");
        }




        // The NOT operator

        boolean isTruck = false;
        if (! isTruck ) //The ! operator is been used here
        {
            System.out.println("This is not supposed to happen");
        }



        //Ternary Operator


        isCar = true;
        boolean wasCar = isCar ? true : false;

        /* The isCar first operand is the condition we're testing which should
        evaluate as all conditions to true or false.
        So the second operand is the value to assign to wasCar if the first
        condition was true and the third operand is what to assign to wasCar
        if the first operand condition was false. */

        if (wasCar) {
            System.out.println("wasCar is true");
        }



        //Operator Challenge

        /*
        Step 1. Create a double variable with a value of 20.00.
        Step 2. Create a second variable of type double with the value 80.00.
        Step 3. Add both numbers together and multiply by 100.00.
        Step 4. Use the remainder operator to figure out what the remainder from the result of the operation in step 3
        and 40.00.
        Step 5. Create a boolean variable that assigns the value true if the remainder in #4 is 0, or false if its
        not zero.
        Step 6. Output the Boolean variable.
        Step 7. Write an if-then statement that displays a message "Got some remainder" if the boolean in step 5
        is not true.
         */

        double myFirstValue = 20.00d;
        double mySecondValue = 80.00d;
        double myBothNumbers = (myFirstValue + mySecondValue) * 100.00d;
        double theRemainder = myBothNumbers % 40.00d;
        System.out.println("theRemainder = " + theRemainder);
        boolean isNoRemainder = (theRemainder == 0) ? true : false;
        System.out.println("isNoRemainder = " + isNoRemainder);
        if ( ! isNoRemainder) {
            System.out.println("Got some remainder");
        }












         }
}
