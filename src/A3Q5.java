/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dmitry
 */
public class A3Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        A3Q5 test = new A3Q5();
        int[] testArray = {1,2,3,4,5,6,7,8,9,10, -5};
        test.sortDescending(testArray);
        for (Integer i: testArray)
        {
            System.out.print(i + " ");
        }
        
    }
    
    /*
        uses insertion sort to arrange the numbers in an array in descending order
        @param array to be sorted
        @return void
    */
    public void sortDescending(int[] arr)
    {
        for (int i = 1; i < arr.length; i ++)
        {
            int j = i-1;
            int num = arr[i];
            while (j >= 0 && arr[j] < num)
            {
                arr[j+1] = arr[j];
                j --;
            }
            arr[j+1] = num;
        }
    }
    
}
