/*
 * For testing minToFront (String version)
 * Created by David Johnson, October 4, 2017
 * for CS211 course, Bellevue College
 */
package Quiz10;

import java.util.ArrayList;

public class Quiz10Tester {
    
    public static void main(String[] args) {
        
        ArrayList<String> words = new ArrayList<>();
        words.add("Alaska");  words.add("alaska");  words.add("one"); words.add("coffee"); words.add("the"); words.add("coffin");
        System.out.println(words); // [three, two, one]
        Quiz10.minToFront(words); 
        System.out.println(words); // [one, three, two]
    
        words.clear();
        Quiz10.minToFront(words);
        System.out.println(words);
    }
}
