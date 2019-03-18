package vampire;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VampireNumber{
    public static void main(String[] args) {
        List<Long> vampireList = new ArrayList<Long>(); // store vampire numbers in array list
        for (long number = 1000; vampireList.size() <= 100; number++) {
            if ((length(number) % 2) != 0) {
                number = number * 10;
                continue;
            }
            for (long factor1 = 2; factor1 <= Math.sqrt(number) + 1; factor1++) {
                if (number % factor1 == 0) {
                    long factor2 = number / factor1;
                    if (CheckForVampireNumber(number, factor1, factor2) && factor1 <= factor2) {
                        vampireList.add(number);
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
    private static int length(long number){
        return Long.toString(number).length();
    }

     /**
      *Method to check whether the number is vampire or not.
      *
      * @param   vampireNumber
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
    private static boolean CheckForVampireNumber(long vampireNumber, long fang1, long fang2){
        if(Long.toString(fang1).endsWith("0") && Long.toString(fang2).endsWith("0"))
            return false;

        int Len = length(vampireNumber);
        if(length(fang1) != Len / 2 || length(fang2) != Len / 2)
            return false;

        char[]VampireArray = Long.toString(vampireNumber).toCharArray();
        char[]FangsArray = (Long.toString(fang1) + Long.toString(fang2)).toCharArray();

        Arrays.sort(VampireArray);
        Arrays.sort(FangsArray);
        return Arrays.equals(VampireArray, FangsArray);
    }


}

/*
-:Output:-
1260
1395
1435
1530
1827
2187
6880
102510
104260
105210
105264
105750
108135
110758
115672
116725
117067
118440
120600
123354
124483
125248
125433
125460
125460
125500
126027
126846
129640
129775
131242
132430
133245
134725
135828
135837
136525
136948
140350
145314
146137
146952
150300
152608
152685
153436
156240
156289
156915
162976
163944
172822
173250
174370
175329
180225
180297
182250
182650
186624
190260
192150
193257
193945
197725
201852
205785
211896
213466
215860
216733
217638
218488
226498
226872
229648
233896
241564
245182
251896
253750
254740
260338
262984
263074
284598
284760
286416
296320
304717
312475
312975
315594
315900
319059
319536
326452
329346
329656
336550
336960

 */