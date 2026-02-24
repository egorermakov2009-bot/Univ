public class University {

    private GroupList groupList;

    public University(int size) {
        groupList = new GroupList(size);
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


}
