public class University {

    private GroupList groupList;

    public University(int size) {
        groupList = new GroupList(size);
    }

    public void addGroup(Group group) {
        groupList.addGroup(group);
    }



    public int getGroupCount() {
        return groupList.getGroupCount();
    }


    public void removeGroupByName(String groupName) {
        Group[] groups = groupList.getGroups();
        int count = groupList.getGroupCount();
        for (int i = 0; i < count; i++) {
            if(groups[i].getGroupName().equals(groupName)) {
                for (int j = i; j < count; j++) {
                    groups[j] =  groups[j + 1];
                }
                groups[count - 1] = null;
                groupList.decreaseCount();

                return;
            }
        }


    }

}
