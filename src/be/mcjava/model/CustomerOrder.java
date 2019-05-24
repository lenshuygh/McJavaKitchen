package be.mcjava.model;


import java.util.List;

/**
 * Contains all data related to the order of a customer
 */
public class CustomerOrder {
    private Long id;
    private List<OrderItem> orderedItems;
    private boolean finished;
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public List<OrderItem> getOrderedItems() {
        return orderedItems;
    }
    
    public void setOrderedItems(List<OrderItem> orderedItems) {
        this.orderedItems = orderedItems;
    }
    
    public boolean isFinished() {
        return finished;
    }
    
    public void setFinished(boolean finished) {
        this.finished = finished;
    }
}
