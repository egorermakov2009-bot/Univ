public class GroupList {

    private Group[] groups;
    private int size;

    public GroupList(int size) {
        groups = new Group[size];
        this.size = 0;
    }

    public int getSize() {
        return size;
    }

    public Group[] getGroups() {
        return groups;
    }


    public void add(Group group) {
        if (size == groups.length) {
            Group[] newArray = new Group[groups.length * 2];

            for (int i = 0; i < size; i++) {
                newArray[i] = groups[i];
            }
            groups = newArray;
        }
        groups[size] = group;
        size++;
    }

    public int indexOf (Group group) {
        for (int i = 0; i < size; i++) {
            if (groups[i].equals(group)) {
                return i;
            }
        }
        return -1;
    }

    public void removeBy(int index) {

        if (index < 0 || index >= size) {
            return;
        }
        for (int i = index; i < size; i++) {
            groups[i] = groups[i + 1];
        }
        groups[size-1] = null;
        size--;
    }

    public void removeBy(Group group) {
        int idex = indexOf(group);
        if (idex != -1) {
            removeBy(idex);
        }
    }

}
