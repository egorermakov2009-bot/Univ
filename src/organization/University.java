package organization;

import groups.Group;
import groups.GroupList;

public class University {

    private GroupList groupList;

    public University(int size) {
        groupList = new GroupList(size);
    }

    public GroupList getGroupList() {
        return groupList;
    }


    public void addGroup(Group group) {
        groupList.add(group);
    }

    public void removeBy(Group group) {
        groupList.removeBy(group);
    }
    public void removeBy(int index) {
        groupList.removeBy(index);
    }
    public int indexOf(Group group) {
        return groupList.indexOf(group);
    }

    public int getSize() {
        return groupList.getSize();
    }

    public Group getGroupBy(String name) {
        for (int i = 0; i < groupList.getSize(); i++) {
            Group g = groupList.getBy(i);
            if (g.getGroupName().equals(name)) {
                return g;
            }
        }
        return null;
    }



    public void removeBy(String Name) {
        groupList.removeBy(Name);
    }


}
