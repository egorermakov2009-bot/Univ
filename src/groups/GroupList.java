package groups;

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


    public Group getBy(int index) {
        if(index >= size || index < 0){
            return null;
        }
        return groups[index];
    }

    public Group[] getGroups() {
        Group[] copy = new Group[size];
        for (int i = 0; i < size; i++) {
            copy[i] = groups[i];
        }
        return copy;
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
        for (int i = index; i < size - 1; i++) {
            groups[i] = groups[i + 1];
        }
        groups[size-1] = null;
        size--;
    }

    public void removeBy(Group group) {
        int index = indexOf(group);
        if (index != -1) {
            removeBy(index);
        }
    }

    public void removeBy(String groupName) {
        for (int i = 0; i < size; i++) {
            if (groups[i].getGroupName().equals(groupName)) {
                removeBy(i);
                i--;
            }
        }
    }

}
