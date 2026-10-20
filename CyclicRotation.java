 //https://app.codility.com/programmers/lessons/2-arrays/cyclic_rotation/
//Rotate an array to the right by a given number of steps.
//Rotate an array to the left by a given number of steps.

import java.util.*;
class CyclicRotation {
    public static void main(String[] args) {

         int a[] =   {1,2,3,4,5};
          cyclicRightRotation(a , 1);
         cyclicLeftRotation(a , 6);
         
    }

    public static void cyclicLeftRotation(int a[] , int k){    

        System.out.println("cyclicLeftRotation");

        if (a.length == 0) {
            return;
        }

          k = k%a.length ;
        
         int n = a.length;
        
        int a1[] = Arrays.copyOfRange(a, 0, k);
         int a2[] = Arrays.copyOfRange(a, k, n);

      //  Arrays.stream(a1).forEach(System.out::print);
       // System.out.println("-----------");
       //  Arrays.stream(a2).forEach(System.out::print);

         int newL = a1.length + a2.length;
       int[] a3 = new int[newL];  

        for(int i = 0 ; i < a2.length; i++) {
            a3[i] = a2[i];
            
        }
         for(int i = 0 ; i < a1.length; i++) {
            a3[a2.length + i] = a1[i];
        }

        System.out.println("Original");
  Arrays.stream(a).forEach(System.out::print);   
         System.out.println("After rotation");
 Arrays.stream(a3).forEach(System.out::print);
        
        
    }
    
   
    public static void cyclicRightRotation(int a[] , int k){ 

        System.out.println("cyclicRightRotation");

        if (a.length == 0) {
            return;
        }

            k = k%a.length ;
       int n = a.length;
       int a1[] = Arrays.copyOfRange(a, 0, n-k);
       int a2[] = Arrays.copyOfRange(a, n-k, n); 

     // Arrays.stream(a1).forEach(System.out::print);
     //  System.out.println("---------------");
      //   Arrays.stream(a2).forEach(System.out::print);
        //  System.out.println("---------------");

        int newL = a1.length + a2.length;
       int[] a3 = new int[newL];  

        for(int i = 0 ; i < a2.length; i++) {
            a3[i] = a2[i];
            
        }
         for(int i = 0 ; i < a1.length; i++) {
            a3[a2.length + i] = a1[i];
        }
         System.out.println("Original");
    Arrays.stream(a).forEach(System.out::print);
         System.out.println("After rotation");
        Arrays.stream(a3).forEach(System.out::print);
        
    }
}
