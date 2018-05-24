package nucleuxsoft.collections;

import java.util.EventListener;

public interface CollectionListener extends EventListener {
    void collectionChanged(CollectionEvent ce);
}
