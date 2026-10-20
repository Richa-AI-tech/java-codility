//https://app.codility.com/programmers/lessons/1-iterations/binary_gap/
//Find longest sequence of zeros in binary representation of an integer.

class BinaryGap {
    public static void main(String[] args) {
       System.out.println(binaryGap(529));
    }
    public static int binaryGap(int n){
        String s = Integer.toBinaryString(n);
        int maxGap= 0 ; int gap =0; 
       
        for(char c : s.toCharArray()) {
             if ( c == '1') {
                maxGap = maxGap > gap ? maxGap : gap;
                gap = 0;
            }
            else {
                gap++;
            }           
        }
        return maxGap;
     }
}
