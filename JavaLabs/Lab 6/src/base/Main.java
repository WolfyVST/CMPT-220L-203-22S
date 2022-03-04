package base;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import javax.net.ssl.SSLParameters;

public class Main {
    /**
     * # Lab Six
     * ---
     *
     * For this lab we're going to be messing around with our Linear Data Types,
     * as well as creating a plant Object!
     *
     * Our Goals are:
     * - Creating an Array
     * - Creating an ArrayList
     * - Creating an LinkedList
     * - Creating an Queue
     * - Creating an Stack
     * - Create a Plant
     *
     * Please show the ability to:
     * - Create these data types
     * - Populate the data types
     * - Print out the Linear Data Types
     */
    
    public static void main(String[] args) {
        // write your code here
        // Create an Array, Populate it, and Print it out
        problem1();
        // Create an ArrayList, Populate it, and Print it out
        problem2();
        // Create an LinkedList, Populate it, and Print it out
        problem3();
        // Create an Queue, Populate it, and Print it out
        problem4();
        // Create an Stack, Populate it, and Print it out
        problem5();
        // Using the information in the Lab 6 Jupyter Notebook create an instance of plant here.
        plants kate = new plants(true,"Lily","Kate");
        System.out.println(kate.name);
    }
    public static void problem1 (){
        int band = 4 ;
        int[] hotdogs1 = {1,2,3,4,5};

        while (band >= 0 ){
            System.out.println("hot dogs left " + hotdogs1[band]);
            band--;
        }
        
    }

    public static void problem2() {
        
    
        ArrayList<Integer> hotdogs2 = new ArrayList<Integer>();
        for (int i = 0; i < hotdogs2.size(); i++){

            System.out.println("hotdog counter" + hotdogs2.get(i));

        }

        hotdogs2.add(1);
        hotdogs2.add(2);
        hotdogs2.add(3);
        hotdogs2.add(4);
        hotdogs2.add(5);

        for (int i = 0; i < hotdogs2.size(); i++){

        System.out.println("hotdog counter" + hotdogs2.get(i));

        }
    }
    public static void problem3(){
        LinkedList<String> rutine = new LinkedList<String>();

        rutine.add("wake up");
        rutine.add("eat");
        rutine.add("shower");
        rutine.add("go to class");
        rutine.add("eat");
        rutine.add("exercice");
        rutine.add("eat");
        rutine.add("sleep");
        
        System.out.println(rutine);
    }
    public static void problem4(){
        Queue<String> bankpriority = new LinkedList<String>();

        bankpriority.add("sam");
        bankpriority.add("Shanon");
        bankpriority.add("marce");
        bankpriority.add("max");

        System.out.println(bankpriority);

        String headOfLine = bankpriority.remove();

        System.out.println(bankpriority);

        System.out.println(headOfLine);

        System.out.println(bankpriority.element());

        System.out.println(bankpriority);
    }
    public static void problem5 (){
        Stack<String> spells = new Stack<String>();

        spells.push("Firebolt");
        spells.push("Blizzard");
        spells.push("Root");
        spells.push("Avalanch");
        spells.push("Wind Blade");
        
        System.out.println(spells);

        spells.pop();
        spells.pop();

        System.out.println("Spells left"+ spells);
    }
}
