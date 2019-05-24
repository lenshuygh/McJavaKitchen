package be.mcjava.model;


import java.util.List;

public class CookingOrders {
    private Long id;
    private List<CookingOrders> ordersToCook;
    private boolean finished;
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public List<CookingOrders> getOrdersToCook() {
        return ordersToCook;
    }
    
    public void setOrdersToCook(List<CookingOrders> ordersToCook) {
        this.ordersToCook = ordersToCook;
    }
    
    public boolean isFinished() {
        return finished;
    }
    
    public void setFinished(boolean finished) {
        this.finished = finished;
    }
    
    public void addOrder(CustomerOrder order) {
    }
    
}
