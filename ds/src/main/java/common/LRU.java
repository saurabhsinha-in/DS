package common;

import java.util.*;
import java.util.stream.Collectors;

public class LRU {
    /*"A" = 3

     */
    private static Map<String, Integer > map = new HashMap<>();


    public void add(String val){

    }
    private int getHighestCapacity(){
        int max= -1;
        int val;
        Integer[] s = {1,3,4,1,20,null};
        List<Integer> list = Arrays.asList(s);

        Optional<Integer> sa  = list.stream().filter(a-> a==a).findAny();





        return max;
    }


}
