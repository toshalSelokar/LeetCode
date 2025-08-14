package leetCode.Array;


import java.util.ArrayList;
import java.util.List;

public class GetTheUniqueNum {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,5,6,4,4,5,6};
        System.out.println(uniqueNum(arr));
    }

    private static int uniqueNum(int[] arr) {
        List<Integer> list = new ArrayList<>();

        for(int n: arr){
            if(list.contains(n)){
                list.remove((Integer)n);
            } else
                list.add(n);
        }

        if(list.size()==1){
            return list.getFirst();
        } else
            return -1;
    }


}
