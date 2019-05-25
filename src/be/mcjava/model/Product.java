package be.mcjava.model;

import java.math.BigDecimal;
import java.util.Map;

/**
 * Contains all the data related to a single product (e.g. BigMac).
 * <p>
 * This class represents the default value for a product, which can later be changed.
 */
public class Product {
    private Long id;
    private Map<Ingredient, Integer> ingredients;
    private BigDecimal price;
    
    public Product(Map<Ingredient, Integer> ingredients, BigDecimal price) {
        this(null, ingredients, price);
    }
    
    public Product(Long id, Map<Ingredient, Integer> ingredients, BigDecimal price) {
        setId(id);
        setIngredients(ingredients);
        setPrice(price);
    }
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public Map<Ingredient, Integer> getIngredients() {
        return ingredients;
    }
    
    public void setIngredients(Map<Ingredient, Integer> ingredients) {
        this.ingredients = ingredients;
    }
    
    public BigDecimal getPrice() {
        return price;
    }
    
    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    
    public boolean isAvailable() {
        return ingredients.keySet()
                .stream()
                .allMatch(Ingredient::isAvailable);
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        
        Product product = (Product) o;
        
        return getIngredients().equals(product.getIngredients());
    }
    
    @Override
    public int hashCode() {
        return 29 * ingredients.hashCode();
    }
}
