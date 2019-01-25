package vampire;

import java.util.*;
public class Vampire{

    public static void main(String[] args) {
        List<Long> vampireList = new ArrayList<Long>(); // store vampire numbers in array list
        for (long num = 1000; vampireList.size() <= 100; num++) {
            if ((length(num) % 2) != 0) {
                num = num * 10;
                continue;
            }
            for (long factor1 = 2; factor1 <= Math.sqrt(num) + 1; factor1++) {
                if (num % factor1 == 0) {
                    long factor2 = num / factor1;
                    if (Check(num, factor1, factor2) && factor1 <= factor2) {
                        vampireList.add(num);

                    }
                }
            }
        }

        //print vampire numbers
        for(long i:vampireList){
            System.out.println(i);
        }
    }

    //calculate length of the number
    private static int length(long n){
        return Long.toString(n).length();
    }

     /**
      *Method to check whether the number is vampire or not.
      *
      * @param   vampire
      *          The number to be checked whether vampire or not
      *@param    fang1
      *          The factor1
      * @param   fang2
      *          The factor2
      *
      * If both the factors with trailing zeros then return false.
      * If any one of the factors length not equal to half the length of a number then return false.
      * If sorted VampireArray and FangsArray are equal then return true.
      */
    private static boolean Check(long vampire, long fang1, long fang2){
        if(Long.toString(fang1).endsWith("0") && Long.toString(fang2).endsWith("0"))
            return false;

        int Len = length(vampire);
        if(length(fang1) != Len / 2 || length(fang2) != Len / 2)
            return false;

        char[]VampireArray = Long.toString(vampire).toCharArray();
        char[]FangsArray = (Long.toString(fang1) + Long.toString(fang2)).toCharArray();

        Arrays.sort(VampireArray);
        Arrays.sort(FangsArray);
        return Arrays.equals(VampireArray, FangsArray);
    }


}
