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
        testString = test.toAlphabeticOrder(testString);
        for (String str: testString)
        {
            System.out.println(str);
        }
    }
    
    public String[] toAlphabeticOrder(String[] words)
    {
        for (int i = 1; i < words.length; i ++)
        {
            int j = i-1;
            String temp = words[i];
            while (j >= 0 && temp.compareToIgnoreCase(words[j]) < 0)
            {
                words[j+1] = words[j];
                j--;
            }
            words[j+1] = temp;
        }
        return words;
    }
    
    
}
