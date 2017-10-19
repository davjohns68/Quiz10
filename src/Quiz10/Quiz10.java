/*
 * minToFront takes an ArrayList of Strings and moves the first word
 * (alphabetically as defined by compareTo) to the front of the list, leaving
 * allother words and ordering intact.
 * Created by David Johnson, October 4, 2017
 * for CS211 course, Bellevue College
 */
package Quiz10;

import java.util.ArrayList;

public class Quiz10 {

    public static void minToFront(ArrayList<String> words) {
        // Local variable to track the "minimum" word
        String min;
        
        // Return if the list is empty
        if(words.isEmpty()) {
            return;
        }
        
        // Set min (arbitrarily) to the first word in the list
        // Then compare each word in the list to it
        min = words.get(0);
        for(String word: words) {
            // If the word is more min than min, then it becomes min
            if(word.compareTo(min) < 0) {
                min = word;
            }
        }
        
        // Add min to the front of the list and remove it from its old position
        words.add(0, min);
        words.remove(words.lastIndexOf(min));
    }    
}
