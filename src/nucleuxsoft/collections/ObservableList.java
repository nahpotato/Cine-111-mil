package nucleuxsoft.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ObservableList<T> implements List<T>, NotifyCollectionChanged {

    private final List<T> items;
    private final List<CollectionListener> collectionListeners;
    
    public ObservableList() {
        items = new ArrayList<>();
        collectionListeners = new ArrayList<>();
    }
    
    @Override
    public int size() {
        return items.size();
    }

    @Override
    public boolean isEmpty() {
        return items.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return items.contains(o);
    }

    @Override
    public Iterator<T> iterator() {
        return items.iterator();
    }

    @Override
    public Object[] toArray() {
        return items.toArray();
    }

    @Override
    public <T> T[] toArray(T[] ts) {
        return items.toArray(ts);
    }

    @Override
    public boolean add(T e) {
        if (items.add(e)) {
            for (CollectionListener cl : collectionListeners) {
                cl.collectionChanged(new CollectionEvent(CollectionAction.ADD, e, 
                        items.indexOf(e)));
            }
            return true;
        }
        
        return false;
    }

    @Override
    public boolean remove(Object o) {
        int index = items.indexOf(o);
        
        if (items.remove(o)) {
            for (CollectionListener cl : collectionListeners) {
                cl.collectionChanged(new CollectionEvent(CollectionAction.REMOVE, o, 
                        index));
            }
            return true;
        }
        
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> clctn) {
        return items.containsAll(clctn);
    }

    @Override
    public boolean addAll(Collection<? extends T> clctn) {
        List<T> addedItems = new ArrayList<>(clctn);
        
        if (items.addAll(clctn)) {
            int index = items.indexOf(addedItems.get(0));
            
            for (CollectionListener cl : collectionListeners) {
                cl.collectionChanged(new CollectionEvent(CollectionAction.ADD, 
                        addedItems, index));
            }
            return true;
        }
        
        return false;
    }

    @Override
    public boolean addAll(int i, Collection<? extends T> clctn) {
        List<T> addedItems = new ArrayList<>(clctn);
        
        if (items.addAll(i, clctn)) {
            for (CollectionListener cl : collectionListeners) {
                cl.collectionChanged(new CollectionEvent(CollectionAction.ADD, 
                        addedItems, i));
            }
            return true;
        }
        
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> clctn) {
        List removedItems = new ArrayList(clctn);
        int index = items.indexOf(clctn.toArray()[0]);
        
        if (items.removeAll(clctn)) {
            for (CollectionListener cl : collectionListeners) {
                cl.collectionChanged(new CollectionEvent(CollectionAction.REMOVE, 
                        removedItems, index));
            }
            return true;
        }
        
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> clctn) {
        List<T> removedItems = new ArrayList<>(items);
        removedItems.removeAll(clctn);
        int index = items.indexOf(removedItems.get(0));
        
        if (items.retainAll(clctn)) {
            for (CollectionListener cl : collectionListeners) {
                cl.collectionChanged(new CollectionEvent(CollectionAction.REMOVE, 
                        removedItems, index));
            }
            return true;
        }
        
        return false;
    }

    @Override
    public void clear() {
        items.clear();
        
        for (CollectionListener cl : collectionListeners) {
            cl.collectionChanged(new CollectionEvent(CollectionAction.RESET));
        }
    }

    @Override
    public T get(int i) {
        return items.get(i);
    }

    @Override
    public T set(int i, T e) {
        T object = items.set(i, e);
        
        for (CollectionListener cl : collectionListeners) {
            cl.collectionChanged(new CollectionEvent(CollectionAction.REPLACE, e, 
                    object, i));
        }
        
        return object;
    }

    @Override
    public void add(int i, T e) {
        items.add(i, e);
        
        for (CollectionListener cl : collectionListeners) {
            cl.collectionChanged(new CollectionEvent(CollectionAction.ADD, e, i));
        }
    }

    @Override
    public T remove(int i) {
        T object = items.remove(i);
        
        for (CollectionListener cl : collectionListeners) {
            cl.collectionChanged(new CollectionEvent(CollectionAction.REMOVE, 
                    object, i));
        }
        
        return object;
    }

    @Override
    public int indexOf(Object o) {
        return items.indexOf(o);
    }

    @Override
    public int lastIndexOf(Object o) {
        return items.lastIndexOf(o);
    }

    @Override
    public ListIterator<T> listIterator() {
        return items.listIterator();
    }

    @Override
    public ListIterator<T> listIterator(int i) {
        return items.listIterator(i);
    }

    @Override
    public List<T> subList(int i, int i1) {
        return items.subList(i, i1);
    }

    @Override
    public void addCollectionListener(CollectionListener listener) {
        this.collectionListeners.add(listener);
    }
}
