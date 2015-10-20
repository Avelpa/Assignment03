/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dmitry
 */
public class A3Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A3Q6 test = new A3Q6();
        
        int[] testArray = {101,9,8,7,6,5,4,3,2,1,1,1,1,1,1,0};
        test.bucketSort(testArray);
        for (Integer i: testArray)
        {
            System.out.print(i + " ");
        }
    }
    
    /**
     * Sorts an array using the buck sort algorithm
     * @param arr an array to be sorted, containing numbers between 0 and 100 inclusive, of length less than or equal to 101
     */
    public void bucketSort(int[] arr)
    {
        // for every value in the bucket, increment it by 1 for every ocurrence of that value in the passed in array
        int[] bucket = new int[101];
        for (Integer i: arr)
        {
            bucket[i] ++;
        }
        
        // iterate through bucket and repopulate the array based on the number of times that value ocurrs in the bucket
        int index = 0;
        for (int i = 0; i < bucket.length; i ++)
        {
            for (int j = 1; j <= bucket[i]; j ++) // j = 1 because there's no point in adding a number which has never occured
            {
                arr[index] = i;
                index ++;
            }
        }
    }
    
}
