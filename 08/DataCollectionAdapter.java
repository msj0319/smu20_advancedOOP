import java.util.ArrayList;
import java.util.Iterator;

public class DataCollectionAdapter<T> implements DataCollection<T> {
    ArrayList<T> arrayList;
    public DataCollectionAdapter() {
        arrayList = new ArrayList<T>();
    }

    @Override
    public boolean put(T t) {       //add
        arrayList.add(t);
        return true;
    }

    @Override
    public T elemAt(int index) {   //get
        if (index >= 0 && index < length()) {
            return arrayList.get(index);
        }
        return null;
    }

    @Override
    public int length() {
        return arrayList.size();
    }

    @Override
    public Iterator<T> createIterator() {
        return arrayList.iterator();
    }
}
