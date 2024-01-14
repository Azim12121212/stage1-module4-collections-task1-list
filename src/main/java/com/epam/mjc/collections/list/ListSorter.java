package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        ListComparator lc = new ListComparator();

        for (int i=0; i<sourceList.size()-1; i++) {
            for (int j=i+1; j<sourceList.size(); j++) {
                if (lc.compare(sourceList.get(i), sourceList.get(j))>0) {
                    String temp = sourceList.get(i);
                    sourceList.set(i, sourceList.get(j));
                    sourceList.set(j, temp);
                }
                System.out.println(sourceList);
            }
        }
    }
    public static void main(String[] args) {
        String[] arr = new String[]{"-5", "-12", "0", "20", "9", "-20", "37"};
        List<String> list = new ArrayList<>(Arrays.asList(arr));

        ListSorter ls = new ListSorter();
        ls.sort(list);
        //System.out.println(list);
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int aPar = Integer.parseInt(a);
        int bPar = Integer.parseInt(b);

        if (aPar<0 && bPar>=0) {
            aPar *= -1;
        } else if (aPar>=0 && bPar<0) {
            bPar *= -1;
        } else if (aPar<0 && bPar<0) {
            aPar *= -1;
            bPar *= -1;
        }

        return aPar-bPar;
    }
}
