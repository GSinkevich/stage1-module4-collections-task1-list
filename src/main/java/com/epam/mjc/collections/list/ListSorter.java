package com.epam.mjc.collections.list;

import java.awt.*;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class ListSorter {
    public void sort(List<String> sourceList) {
     ListComparator MyList = new ListComparator();
     sourceList.sort(MyList);
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        Integer A = Integer.valueOf(a);
        Integer B = Integer.valueOf(b);

        if (CalcFunction(A) > CalcFunction(B)){
            return  1;
        }
        if (CalcFunction(A) < CalcFunction(B)){
            return  -1;
        }
        else {
            return A > B ?  1 :  -1;
        }
    }

    public int CalcFunction (Integer a){
        return    (int) (5 * Math.pow(a,2)+3);
    }

}
