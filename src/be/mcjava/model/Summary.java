package be.mcjava.model;

import java.math.BigDecimal;
import java.util.Map;

public class Summary {
    private Map<Product, Integer> madeProducts;
    private BigDecimal dailyTotal;
    
    public Map<Product, Integer> getMadeProducts() {
        return madeProducts;
    }
    
    public void setMadeProducts(Map<Product, Integer> madeProducts) {
        this.madeProducts = madeProducts;
    }
    
    public BigDecimal getDailyTotal() {
        return dailyTotal;
    }
    
    public void setDailyTotal(BigDecimal dailyTotal) {
        this.dailyTotal = dailyTotal;
    }
}
