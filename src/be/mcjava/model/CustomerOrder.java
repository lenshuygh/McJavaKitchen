package be.mcjava.model;


import java.util.List;

/**
 * Contains all data related to the order of a customer
 */
public class CustomerOrder {
    private Long id;
    private List<OrderItem> itemsToOrder;
    private boolean finished;
    
    public CustomerOrder(List<OrderItem> itemsToOrder) {
        this(null, itemsToOrder);
    }
    
    public CustomerOrder(Long id, List<OrderItem> itemsToOrder) {
        setId(id);
        setItemsToOrder(itemsToOrder);
    }
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public List<OrderItem> getItemsToOrder() {
        return itemsToOrder;
    }
    
    public void setItemsToOrder(List<OrderItem> itemsToOrder) {
        this.itemsToOrder = itemsToOrder;
    }
    
    public boolean isFinished() {
        return finished;
    }
    
    public void setFinished(boolean finished) {
        boolean actuallyFinished = getItemsToOrder().stream()
                .allMatch(OrderItem::isFinished);
        this.finished = actuallyFinished && finished;
    }
    
    public void addItem(OrderItem orderItem) {
        if (itemsToOrder.contains(orderItem)) {
            int positionOfOrderItem = itemsToOrder.indexOf(orderItem);
            OrderItem existingOrder = itemsToOrder.get(positionOfOrderItem);
            existingOrder.setAmount(existingOrder.getAmount() + orderItem.getAmount());
            return;
        }
        itemsToOrder.add(orderItem);
    }
}
