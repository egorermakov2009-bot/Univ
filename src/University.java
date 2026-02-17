public class University {

    Group[] groups = new Group[5];
    int GroupCount = 0;

    public void addGroup(Group group) {
        if (GroupCount < groups.length) {
            groups[GroupCount] = group;
            GroupCount++;
        }
    }

    public Group getGroupByName(String groupName) {
        for (int i = 0; i < GroupCount; i++) {
            if (groups[i].getGroupName().equals(groupName));
            return groups[i];
        }
        return null;
    }




}
