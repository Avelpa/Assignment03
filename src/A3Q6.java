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
    
    public void bucketSort(int[] arr)
    {
        int[] nums = new int[101];
        for (Integer i: arr)
        {
            nums[i] ++;
        }
        int index = 0;
        for (int i = 0; i < nums.length; i ++)
        {
            for (int j = 1; j <= nums[i]; j ++)
            {
                arr[index] = i;
                index ++;
            }
        }
    }
    
}
