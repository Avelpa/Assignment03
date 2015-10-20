/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dmitry
 */
public class A3Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A3Q7 test = new A3Q7();
        String[] testString = {"abcdefg", "abcdeff"};
        test.toAlphabeticOrder(testString);
        for (String str: testString)
        {
            System.out.println(str);
        }
    }
    
    /**
     * Sorts an array of words into their alphabetic order using the insertion sort algorithm
     * @param words
     * @return 
     */
    public void toAlphabeticOrder(String[] words)
    {
        for (int i = 1; i < words.length; i ++)
        {
            // words[j-1] is the previous word
            int j = i-1;
            // temp is the word which is going to be placed back (if it is out of place)
            String temp = words[i];
            // while j is in bounds AND temp is alphabetically before words[j], bring words[j] up
            while (j >= 0 && temp.compareToIgnoreCase(words[j]) < 0)
            {
                words[j+1] = words[j];
                j--;
            }
            // put temp into the last parsed position
            words[j+1] = temp;
        }
    }
    
    
}
