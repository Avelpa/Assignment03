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
        String testString = "zyxwvutsrqp\0onmlkihjgfAedcba";
        testString = test.toAlphabeticOrder(testString);
        System.out.println(testString);
    }
    
    public String toAlphabeticOrder(String str)
    {
        char[] arr = str.toCharArray();
        for (int i = 1; i < arr.length; i ++)
        {
            int j = i-1;
            char num = arr[i];
            while (j >= 0 && arr[j] > num)
            {
                arr[j+1] = arr[j];
                j --;
            }
            arr[j+1] = num;
        }
        return new String(arr);
    }
    
    
}
