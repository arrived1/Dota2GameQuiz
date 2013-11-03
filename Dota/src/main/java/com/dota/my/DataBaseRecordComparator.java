package com.dota.my;

import java.util.Comparator;

public class DataBaseRecordComparator implements Comparator<DataBaseRecord> {
    @Override
    public int compare(DataBaseRecord o1, DataBaseRecord o2) {
        return compareScore(o1, o2);
    }

    private int compareScore(DataBaseRecord o1, DataBaseRecord o2) {
        Integer i1 = Integer.parseInt(o1.getScore());
        Integer i2 = Integer.parseInt(o2.getScore());
        int res = i1.compareTo(i2);
        if (res == 0)
            return compareTime(o1, o2);
        else
            return res;
    }

    private int compareTime(DataBaseRecord o1, DataBaseRecord o2) {
        Integer m1 = Integer.parseInt(o1.getTime().substring(0, 1));
        Integer s1 = Integer.parseInt(o1.getTime().substring(3, 4));

        Integer m2 = Integer.parseInt(o2.getTime().substring(0, 1));
        Integer s2 = Integer.parseInt(o2.getTime().substring(3, 4));

        Integer resMinute = m1.compareTo(m2);
        if (resMinute == 0)
            return resMinute;
        else
            return s1.compareTo(s2);
    }
}
