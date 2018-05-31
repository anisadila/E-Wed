package com.example.adila.e_wed;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class TermsConditions extends AppCompatActivity {

    private LinkedHashMap<String, GroupInfo> subjects = new LinkedHashMap<>();
    private ArrayList<GroupInfo> groupList = new ArrayList<>();
    private ExpandableAdapter listAdapter;
    private ExpandableListView mExpandableTerm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terms_conditions);
        initView();
        loadData();
    }

    private void initView() {
        mExpandableTerm = findViewById(R.id.expandable_term);

        listAdapter = new ExpandableAdapter(getApplicationContext(), groupList);
        mExpandableTerm.setAdapter(listAdapter);

        mExpandableTerm.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView expandableListView, View view, int groupPosition, int childPosition, long id) {
                GroupInfo groupInfo = groupList.get(groupPosition);
//                ChildInfo childInfo = groupInfo.getList().get(childPosition);
                return false;
            }
        });

        mExpandableTerm.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {
            @Override
            public boolean onGroupClick(ExpandableListView expandableListView, View view, int groupPosition, long id) {
                GroupInfo groupInfo = groupList.get(groupPosition);
                return false;
            }
        });
    }

    private void collapseAll() {
        int count = listAdapter.getGroupCount();
        for (int i = 0; i < count; i++){
            mExpandableTerm.collapseGroup(i);
        }
    }

    private void loadData() {
        addList(getString(R.string.term_questions_infoumum), getString(R.string.term_answer_infoumum));
        addList(getString(R.string.term_questions_pengguna),getString(R.string.term_answer_pengguna));
        addList(getString(R.string.term_questions_vendor), getString(R.string.term_answer_vendor));
        addList(getString(R.string.term_questions_pembatasan),getString(R.string.term_answer_pembatasan));
    }

    private int addList(String group, String child){
        int groupPosition = 0;

        GroupInfo groupInfo = subjects.get(group);
        if (groupInfo == null){
            groupInfo = new GroupInfo();
            groupInfo.setName(group);
            subjects.put(group, groupInfo);
            groupList.add(groupInfo);
        }

        ArrayList<ChildInfo> childList = groupInfo.getList();
        int listSize = childList.size();
        listSize++;

        ChildInfo childInfo = new ChildInfo();
//        childInfo.setSequence(String.valueOf(listSize));
        childInfo.setName(child);
        childList.add(childInfo);
        groupInfo.setList(childList);

        groupPosition = childList.indexOf(groupInfo);
        return groupPosition;
    }
}
