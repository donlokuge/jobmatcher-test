package com.swipejobs.findjob.objects;

import java.util.ArrayList;

public class ThreeItemList<E> extends ArrayList<E> {
    @Override
    public boolean add(E e) {
        if (this.size() < 3) {
            return super.add(e);
        }
        return false;
    }
}
