package arrayofobjects;

public class Solution4 {

    Solution4(String item)
    {

        System.out.println(item);
    }
    public static void main(String args[])
    {
        Solution4 obj[]=new Solution4[3];
        for(int i=0;i<obj.length;i++)
            obj[i]=new Solution4("hai");


    }


}
