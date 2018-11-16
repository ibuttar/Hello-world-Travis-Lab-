/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travislab;

/**
 *
 * @author Inderpreet
 */



import java.util.List;
import java.util.function.Predicate;



public class Hello {
    
    static int i = 0;

    public static <T> int linearSearch(List<T> list, Predicate<T> check) {
        for (T list1 : list) {
            if (list1 == check) {
                return i;
            }
            else {
                i++;
            }
        }

        return -1;
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<String> stringList = null;
        List<Integer> integerList = null;

        
        
        stringList.add("Hello");
        stringList.add("World");
        stringList.add("....");
        
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        

        
        
        // TODO code application logic here
    }
    
}
