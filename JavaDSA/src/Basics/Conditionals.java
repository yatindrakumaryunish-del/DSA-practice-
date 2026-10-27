package Basics;
public class Conditionals {
    public static void main(String[] args) {

        int age = 20;
        int marks = 75;
        int day = 1;
        boolean license = true;

        // 1. if
        if(age >= 18){
            System.out.println("Adult");
        }

        // 2. if-else
        if(age >= 18){
            System.out.println("Eligible");
        } else {
            System.out.println("Not Eligible");
        }

        // 3. else-if ladder
        if(marks >= 90){
            System.out.println("Grade A");
        } else if(marks >= 70){
            System.out.println("Grade B");
        } else {
            System.out.println("Grade C");
        }

        // 4. Nested if
        if(age >= 18){
            if(license){
                System.out.println("Can Drive");
            }
        }

        // 5. switch
        switch(day){
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            default:
                System.out.println("Invalid Day");
        }
    }
}