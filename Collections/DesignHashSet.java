package Collections;


public class DesignHashSet {
    private Bucket[] bucketArray;
    private int keyRange;

    public DesignHashSet() {
        this.keyRange = 769;
        this.bucketArray = new Bucket[this.keyRange];
        for(int i = 0; i < this.keyRange; ++i){
            this.bucketArray[i] = new Bucket();
        }

    }

    protected int hash(int key){
        return key % keyRange;
    }


    public void add(int key) {
        int bucketIndex = this.hash(key);
        bucketArray[bucketIndex].insert(key);

    }

    public void remove(int key) {
        int bucketIndex = this.hash(key);
        bucketArray[bucketIndex].delete(key);
    }

    public boolean contains(int key) {
        int bucketIndex = this.hash(key);
        return bucketArray[bucketIndex].exists(key);

    }

    public static void main(String[] args) {
        DesignHashSet myHashSet = new DesignHashSet();
        myHashSet.add(1);      // set = [1]
        myHashSet.add(2);      // set = [1, 2]
        myHashSet.contains(1); // return True
        myHashSet.contains(3); // return False, (not found)
        myHashSet.add(2);      // set = [1, 2]
        myHashSet.contains(2); // return True
        myHashSet.remove(2);   // set = [1]
        myHashSet.contains(2); // return False, (already removed)
    }
}
