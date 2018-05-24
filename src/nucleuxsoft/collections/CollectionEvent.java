package nucleuxsoft.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CollectionEvent {
    
    private final CollectionAction action;
    private final List newItems;
    private final int newStartingIndex;
    private final List oldItems;
    private final int oldStartingIndex;
    
    /**
     * Initializes a new instance of the CollectionEvent class that describes a
     * Reset change.
     * @param action The action that caused the event. This must be set to Reset.
     */
    public CollectionEvent(CollectionAction action) {
        this.action = action;
        
        this.newItems = null;
        this.oldItems = null;
        this.newStartingIndex = -1;
        this.oldStartingIndex = -1;
    }
    
    /**
     * Initializes a new instance of the CollectionEvent class that describes a
     * multi-item change.
     * @param action The action that caused the event. This can be set to Reset,
     * Add, or Remove.
     * @param changedItems The items that are affected by the change.
     */
    public CollectionEvent(CollectionAction action, List changedItems) {
        this.action = action;
        
        switch (action) {
            case ADD:
                this.newItems = changedItems;
                this.oldItems = null;
                break;
            case REMOVE:
                this.newItems = null;
                this.oldItems = changedItems;
                break;
            default:
                this.newItems = null;
                this.oldItems = null;
                break;
        }
        
        this.newStartingIndex = -1;
        this.oldStartingIndex = -1;
    }
    
    /**
     * Initializes a new instance of the CollectionEvent class that describes a
     * multi-item Replace change.
     * @param action The action that caused the event. This can only be set to
     * Replace.
     * @param newItems The new items that are replacing the original items.
     * @param oldItems The original items that are replaced.
     */
    public CollectionEvent(CollectionAction action, List newItems, List oldItems) {
        Objects.requireNonNull(newItems);
        Objects.requireNonNull(oldItems);
        
        if (action != CollectionAction.REPLACE) {
            throw new IllegalArgumentException("Param action must be set to REPLACE");
        }
        
        this.action = action;
        this.newItems = newItems;
        this.oldItems = oldItems;
        
        this.newStartingIndex = -1;
        this.oldStartingIndex = -1;
    }
    
    /**
     * Initializes a new instance of the CollectionEvent class that describes a
     * multi-item Replace change.
     * @param action The action that caused the event. This can only be set to
     * Replace.
     * @param newItems The new items that are replacing the original items.
     * @param oldItems The original items that are replaced.
     * @param startingIndex The index of the first item of the items that are
     * being replaced.
     */
    public CollectionEvent(CollectionAction action, List newItems, List oldItems, 
            int startingIndex) {
        Objects.requireNonNull(newItems);
        Objects.requireNonNull(oldItems);
        
        if (action != CollectionAction.REPLACE) {
            throw new IllegalArgumentException("Param action must be set to REPLACE");
        }
        
        this.action = action;
        this.newItems = newItems;
        this.oldItems = oldItems;
        this.newStartingIndex = -1;
        this.oldStartingIndex = startingIndex;
    }
    
    /**
     * Initializes a new instance of the CollectionEvent class that describes a
     * multi-item change or a Reset change.
     * @param action The action that caused the event. This can be set to Reset,
     * Add, or Remove.
     * @param changedItems The items affected by the change.
     * @param startingIndex The index the change occurred.
     */
    public CollectionEvent(CollectionAction action, List changedItems, 
            int startingIndex) {
        if ((action == CollectionAction.ADD) || (action == CollectionAction.REMOVE)) {
            Objects.requireNonNull(changedItems);
        }
        
        if ((action != CollectionAction.RESET) && (action != CollectionAction.ADD) && 
                (action != CollectionAction.REMOVE)) {
            throw new IllegalArgumentException("Param action must be set to RESET, "
                    + "ADD, or REMOVE");
        }
        
        if ((action == CollectionAction.RESET) && ((changedItems != null) || 
                (startingIndex != -1))) {
            throw new IllegalArgumentException("If action is RESET, changedItems "
                    + "must be null and startingIndex must be -1");
        }
        
        if (((action == CollectionAction.ADD) && (action == CollectionAction.REMOVE)) && 
                (startingIndex < -1)) {
            throw new IllegalArgumentException("If action is ADD or REMOVE, "
                    + "startingIndex must be greater or equal to -1");
        }
        
        this.action = action;
        
        switch (action) {
            case ADD:
                this.newItems = changedItems;
                this.oldItems = null;
                this.newStartingIndex = startingIndex;
                this.oldStartingIndex = -1;
                break;
            case REMOVE:
                this.newItems = null;
                this.oldItems = changedItems;
                this.newStartingIndex = -1;
                this.oldStartingIndex = startingIndex;
                break;
            default:
                this.newItems = null;
                this.oldItems = null;
                this.newStartingIndex = -1;
                this.oldStartingIndex = -1;
                break;
        }
    }
    
    /**
     * Initializes a new instance of the CollectionEvent class that describes a
     * multi-item Move change.
     * @param action The action that caused the event. This can only be set to
     * Move.
     * @param changedItems The items affected by the change.
     * @param index The new index for the changed items.
     * @param oldIndex The old index for the changed items.
     */
    public CollectionEvent(CollectionAction action, List changedItems, int index, 
            int oldIndex) {
        if (action != CollectionAction.MOVE) {
            throw new IllegalArgumentException("Param action must be MOVE.");
        }
        
        if (index < 0) {
            throw new IllegalArgumentException("Param index must be greater or equal"
                    + "to 0.");
        }
        
        this.action = action;
        this.newItems = null;
        this.oldItems = changedItems;
        this.newStartingIndex = index;
        this.oldStartingIndex = oldIndex;
    }
    
    /**
     * Initializes a new instance of the CollectionEvent class that describes a
     * one-item change.
     * @param action The action that caused the event. This can be set to Reset,
     * Add, or Remove.
     * @param changedItem The item that is affected by the change.
     */
    public CollectionEvent(CollectionAction action, Object changedItem) {
        if ((action != CollectionAction.RESET) && (action != CollectionAction.ADD) &&
                (action != CollectionAction.REMOVE)) {
            throw new IllegalArgumentException("Param action must be set to RESET, "
                    + "ADD, or REMOVE.");
        }
        
        if ((action == CollectionAction.RESET) && (changedItem != null)) {
            throw new IllegalArgumentException("If action is RESET, changedItem "
                    + "must be null.");
        }
        
        this.action = action;
        
        switch (action) {
            case ADD:
                this.newItems = new ArrayList();
                this.oldItems = null;
                
                this.newItems.add(changedItem);
                break;
            case REMOVE:
                this.newItems = null;
                this.oldItems = new ArrayList();
                
                this.oldItems.add(changedItem);
                break;
            default:
                this.newItems = null;
                this.oldItems = null;
                break;
        }
        
        this.newStartingIndex = -1;
        this.oldStartingIndex = -1;
    }
    
    /**
     * Initializes a new instance of the CollectionEvent class that describes a
     * one-item change.
     * @param action The action that caused the event. This can be set to Reset,
     * Add, or Remove.
     * @param changedItem The item that is affected by the change.
     * @param index The index where the change occurred.
     */
    public CollectionEvent(CollectionAction action, Object changedItem, int index) {
        if ((action != CollectionAction.RESET) && (action != CollectionAction.ADD) &&
                (action != CollectionAction.REMOVE)) {
            throw new IllegalArgumentException("Param action must be set to RESET, "
                    + "ADD, or REMOVE.");
        }
        
        if ((action == CollectionAction.RESET) && ((changedItem != null) || (index != -1))) {
            throw new IllegalArgumentException("If action is RESET, changedItem "
                    + "must be null and index must be -1.");
        }
        
        this.action = action;
        
        switch (action) {
            case ADD:
                this.newItems = new ArrayList<>();
                this.oldItems = null;
                
                this.newItems.add(changedItem);
                this.newStartingIndex = index;
                this.oldStartingIndex = -1;
                break;
            case REMOVE:
                this.newItems = null;
                this.oldItems = new ArrayList();
                
                this.oldItems.add(changedItem);
                this.newStartingIndex = -1;
                this.oldStartingIndex = index;
                break;
            default:
                this.newItems = null;
                this.oldItems = null;
                this.newStartingIndex = -1;
                this.oldStartingIndex = -1;
                break;
        }
    }
    
    /**
     * Initializes a new instance of the CollectionEvent class that describes a
     * one-item Move change.
     * @param action The action that caused the event. This can only be set to
     * Move.
     * @param changedItem The item affected by the change.
     * @param index The new index for the changed item.
     * @param oldIndex The old index for the changed item.
     */
    public CollectionEvent(CollectionAction action, Object changedItem, int index, 
            int oldIndex) {
        if (action != CollectionAction.MOVE) {
            throw new IllegalArgumentException("Param action must be set to MOVE.");
        }
        
        if (index < 0) {
            throw new IllegalArgumentException("Param index must be greater or equal"
                    + "to 0");
        }
        
        this.action = action;
        this.newItems = null;
        this.oldItems = new ArrayList();
        this.newStartingIndex = index;
        this.oldStartingIndex = oldIndex;
        
        this.oldItems.add(changedItem);
    }
    
    /**
     * Initializes a new instance of the CollectionEvent class that describes a
     * one-item Replace change.
     * @param action The action that caused the event. This can only be set to
     * Replace.
     * @param newItem The new item that is replacing the original item.
     * @param oldItem The original item that is replaced.
     */
    public CollectionEvent(CollectionAction action, Object newItem, 
            Object oldItem) {
        if (action != CollectionAction.REPLACE) {
            throw new IllegalArgumentException("Param action must be set to REPLACE.");
        }
        
        this.action = action;
        this.newItems = new ArrayList();
        this.oldItems = new ArrayList();
        this.newStartingIndex = -1;
        this.oldStartingIndex = -1;
        
        this.newItems.add(newItem);
        this.oldItems.add(oldItem);
    }
    
    /**
     * Initializes a new instance of the CollectionEvent class that describes a
     * one-item Replace change.
     * @param action The action that caused the event. This can be set to Replace.
     * @param newItem The new item that is replacing the original item.
     * @param oldItem The original item that is replaced.
     * @param index The index of the item being replaced.
     */
    public CollectionEvent(CollectionAction action, Object newItem, 
            Object oldItem, int index) {
        if (action != CollectionAction.REPLACE) {
            throw new IllegalArgumentException("Param action must be set to REPLACE.");
        }
        
        this.action = action;
        this.newItems = new ArrayList();
        this.oldItems = new ArrayList();
        this.newStartingIndex = -1;
        this.oldStartingIndex = index;
        
        this.newItems.add(newItem);
        this.newItems.add(oldItem);
    }

    /**
     * Gets the action that caused the event.
     * @return the action that caused the event.
     */
    public CollectionAction getAction() {
        return action;
    }

    /**
     * Gets the list of new items involved in the change.
     * @return the list of new items involved in the change.
     */
    public List getNewItems() {
        return newItems;
    }

    /**
     * Gets the index at which the change occurred.
     * @return the index at which the change ocurred.
     */
    public int getNewStartingIndex() {
        return newStartingIndex;
    }

    /**
     * Gets the list of items affected by a Replace, Remove, or Move action.
     * @return the list of items affected by a Replace, Remove, or Move action.
     */
    public List getOldItems() {
        return oldItems;
    }

    /**
     * Gets the index at which a Move, Remove, or Replace action occurred.
     * @return the index at which a Move, Remove, or Replace action occurred.
     */
    public int getOldStartingIndex() {
        return oldStartingIndex;
    }
}
