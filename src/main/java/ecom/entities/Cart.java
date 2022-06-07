
package ecom.entities;


public class Cart {
  private Product product;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Cart(Product product) {
        this.product = product;
    }

    public Cart() {
    }

    @Override
    public String toString() {
        return "Cart{" + "product=" + product + '}';
    }

 
  
}
