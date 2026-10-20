//https://app.codility.com/programmers/lessons/3-time_complexity/perm_missing_elem/
// PermMissingElem

// Online Java Compiler (Editor)
// Write and run Java online using this editor.
import java.util.*;
class PermMissingElem {
    public static void main(String[] args) {
         Integer a[] =   {1,2,3,5,4,7 };
        int x = permMissingElem(a);
        System.out.println(x);
         
    }
//remember keep Integer[] not int[] - Arrays.asList(a); will not work
    public static int permMissingElem(Integer a[]){  

        int n = a.length;

        List list = Arrays.asList(a);

        for(int i = 1; i <= n ; i++) {
            if(!list.contains(i)) {
                return i;
            }
        }

     return 0;         
    }
    
   
}
