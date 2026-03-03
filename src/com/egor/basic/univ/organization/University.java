package com.egor.basic.univ.organization;

import com.egor.basic.univ.List;
import com.egor.basic.univ.group.Group;

public class University {

    private List<Group> groups;

    public List<Group> getGroupList() {
        return groups;
    }
    public void removeGroupBy(int index) {
        groups.removeBy(index);
    }
    public University(int size) {
        groups = new List<>(size);
    }
    public void addGroup(Group group) {
        groups.add(group);
    }
    public void removeGroup(Group group) {
        groups.remove(group);
    }
    public int getSize() {
        return groups.getSize();
    }
    public int indexOf(Group group) {
        return groups.indexOf(group);
    }
    public Group getGroupBy(int index) {
        return groups.getBy(index);
    }
    public Group getGroupBy(String name) {
        for (int i = 0; i < groups.getSize(); i++) {
            Group g  = groups.getBy(i);
            if (g.getGroupName().equals(name)) {
                return g;
            }
        }
        return null;
    }
    public void removeGroupBy (String name) {
        Group g = getGroupBy(name);
        if (g != null) {
            groups.remove(g);
        }
    }
}
