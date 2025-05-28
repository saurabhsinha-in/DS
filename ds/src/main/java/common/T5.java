package common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T5 {

    public static void main(String[] args) {
        T5 a = new T5();

        ;
        System.out.println(a.a());
    }

    public List<Integer> a(){
        Integer k[] = {3, 1, 2, 3, 2, 4, 1, 5};
        List<Integer> list = Arrays.asList(k);
        List<Integer> l = new ArrayList<>();

        for(int i=0;i<list.size();i++){
            if(!l.contains(k[i])){
                l.add(k[i]);
            }
        }
        return l;
    }
}
