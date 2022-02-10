package base;

public class Main {
    /**
     * # Lab Three
     *
     * Ok for this lab we're going to reiterate a lot of the things that we went over in class.
     *
     * Our Goals are:
     * - Conditionals
     *     - If
     *     - Else
     *     - Else If
     */
    public static void main(String[] args) {
        // Make an if statement that triggers a print or println statement
        if (true){
            System.out.println("Hi");
        }
        // Make an if, else statement where the else statement triggers a print or println statement
        if (!true){
            System.out.println("hi me llamo rick");

        }else{
            System.out.println("who are you? ");
        }
        // Make an if, else if, else statement where the else if statement triggers a print or println statement
        if (!true) {

            System.out.println("I want to eat");
        } else if (true){
            System.out.println("Im hungry");

        } else {
            System.out.println("Ill order mackdonalds");

        }
        // Make 2 variables and use them in an if else conditional print from one of the sections
        int pm = 1 ;
        int am = 2;

        if (pm < am){
            System.out.println("its afternoon");
        }else{
            System.out.println("its morning");
        }
        // Make an if statement using 2 variables and an AND(&&) statement that triggers a print or println statement
        boolean toast = true;
        boolean butter = true;

        if (toast || butter){
            System.out.println("your toast is readty");
        }
        // Make an if statement using 2 variables and an OR(||) statement that triggers a print or println statement
        boolean cheese = true;
        boolean trap   = true;

        if (cheese && trap){
            System.out.println("your mouse trap is ready");
        }
    }
}
