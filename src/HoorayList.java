/*
    E is just a placeholder for element (Needs to be a reference type)
    HashMaps K = key
             V = value
    T = type

    // ourNames.remove("Paulding");
 */
public class HoorayList <E>{

    private static final int DEFAULT_CAPACITY = 10;
    private int mCapacity;
    private int mSize;

    private E[] mData;

    //DEFAULT CONTRUCTOR

    public HoorayList() {
        this(DEFAULT_CAPACITY);
    }

    public HoorayList(int capacity) {
        mCapacity = DEFAULT_CAPACITY;
        mSize = 0;
        // Initialize our (mData) array w/ length 10
        // Object is a real class, EXTENDS
        // Downcasted in E forcibly
        mData = (E[]) new Object[mCapacity];
    }

    @Override
    public String toString() {

        String output = "[";
        // Loop through array, concatenate all data:
        for (int i = 0; i < mSize; i++) {
            output += mData[i] + ", ";
        }
        output += "Hooray!]";
        return output;
    }

    public E get(int index) {
        if (index < 0 || index >= mSize)
            throw new IndexOutOfBoundsException("Index must be >= 0 & < " + mSize);
        return mData[index];
    }

    public E set(int index, E element) {
        //E temp = mData[index]; // old value
        E temp = this.get(index);
        mData[index] = element; // Replace with new value
        return temp;
    }

    public boolean add(E element) {

        // Check if it's full
        if(mSize >= mCapacity) {
            // Double the capacity // using already maxed capacity, double it
            E[] newData = (E[]) new Object[mCapacity * 2];

            // Copy all old values to new array
            for (int i = 0; i < mSize; i++) {

                newData[i] = mData[i];
            }

            // Update mDate to new Data
            mData = newData;

            // update our capacity
            mCapacity *= 2;
        }
        // add to end of HoorayList
        mData[mSize++] = element;
        return true;
    }

    public E remove (int index) {
        // Make a copy of old value
        E temp = mData[index];

        for (int i = index; i < mSize; i++) {
            mData[i] = mData [i + 1];
        }

        // Make size for down by 1
        mSize--;
        return temp;
    }

    public void clear() {
        // Start a new array
        mData = (E[]) new Object[mCapacity];
    }

}
