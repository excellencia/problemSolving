package Collections;

import java.util.LinkedList;

/*void add(key) Inserts the value key into the HashSet.
        bool contains(key) Returns whether the value key exists in the HashSet or not.
        void remove(key) Removes the value key in the HashSet. If key does not exist in the HashSet, do nothing.*/

public class Bucket {
    LinkedList<Integer> container;

    public Bucket(){
        this.container = new LinkedList<>();
    }

    public void insert(Integer key){
        int index = container.indexOf(key);
        if(index == -1) {
            container.addFirst(key);
        }
    }

    public void delete(Integer key){
        container.remove(key);
    }

    public boolean exists(Integer key){
        int index = container.indexOf(key);
        return (index != -1);
    }


}
