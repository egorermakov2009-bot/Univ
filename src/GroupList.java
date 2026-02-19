public class GroupList {

    private Group[] groups;
    private int groupCount;

    public GroupList(int size) {
        groups = new Group[size];
        groupCount = 0;
    }

    public int getGroupCount() {
        return groupCount;
    }

    public Group[] getGroups() {
        return groups;
    }

    public void decreaseCount() {
        groupCount--;
    }


    public void addGroup(Group group) {
        if  (groupCount >= groups.length) {
            System.out.println("not enough space");
            return;
        }
        groups[groupCount] = group;
        groupCount++;
    }
}
