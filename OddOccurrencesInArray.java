// https://app.codility.com/programmers/lessons/2-arrays/odd_occurrences_in_array/
// Find value that occurs in odd number of elements.
import java.util.*;
class OddOccurrencesInArray {
    public static void main(String[] args) {
         int a[] =   {1,2,3 ,5,4 ,1,2, 7, 3,4,5};
        int x = OddOccurrencesInArray(a);
        System.out.println(x);         
    }

    public static int OddOccurrencesInArray(int a[]){  

        int i = 0;
        for( int k : a) {
            i = i^k;
        }

     return i;        
    }
    
   
}
