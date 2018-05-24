package nucleuxsoft.collections;

public enum CollectionAction {
    /**
     * An item was added to the collection.
     */
    ADD,
    
    /**
     * An item was moved within the collection.
     */
    MOVE,
    
    /**
     * An item was removed from the collection.
     */
    REMOVE,
    
    /**
     * An item was replaced in the collection.
     */
    REPLACE,
    
    /**
     * The content of the collection was cleared.
     */
    RESET
}
