package com.example.adila.e_wed;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adila on 31-May-18.
 */

public class ExpandableAdapter extends BaseExpandableListAdapter {

    private Context context;
    private List<GroupInfo> groupList;

    public ExpandableAdapter(Context context, List<GroupInfo> groupList) {
        this.context = context;
        this.groupList = groupList;
    }

    @Override
    public int getGroupCount() {
        return groupList.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        ArrayList<ChildInfo> childList = groupList.get(groupPosition).getList();
        return childList.size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return groupList.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        ArrayList<ChildInfo> childList = groupList.get(groupPosition).getList();
        return childList.get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return true;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isLastChild, View view, ViewGroup viewGroup) {
        GroupInfo groupInfo = (GroupInfo) getGroup(groupPosition);
        if (view == null){
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = layoutInflater.inflate(R.layout.list_group, null);
        }

        TextView groupHelp = view.findViewById(R.id.group_help);
        groupHelp.setText(groupInfo.getName().trim());
        return view;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean b, View view, ViewGroup viewGroup) {
        ChildInfo childInfo = (ChildInfo) getChild(groupPosition,childPosition);
        if (view == null){
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = layoutInflater.inflate(R.layout.list_child, null);
        }

//        TextView sequenceHelp = view.findViewById(R.id.sequence_help);
//        sequenceHelp.setText(childInfo.getSequence().trim() + ". ");
        TextView childHelp = view.findViewById(R.id.child_help);
        childHelp.setText(childInfo.getName().trim());

        return view;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}
