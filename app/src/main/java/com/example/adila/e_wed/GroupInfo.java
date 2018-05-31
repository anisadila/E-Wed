package com.example.adila.e_wed;

import java.util.ArrayList;

/**
 * Created by Adila on 31-May-18.
 */

public class GroupInfo {
    private String name;
    private ArrayList<ChildInfo> list = new ArrayList<ChildInfo>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<ChildInfo> getList() {
        return list;
    }

    public void setList(ArrayList<ChildInfo> list) {
        this.list = list;
    }
}
