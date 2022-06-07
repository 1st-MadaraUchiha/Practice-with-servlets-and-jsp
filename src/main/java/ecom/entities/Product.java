package ecom.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Product {
	@Id
	@Column(name="product_Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pId;
	
	@Column(name="product_Name")
	private String pName;

	@Column(name="product_Desc",length=9999)
	private String pDesc;
        
        @Column(name="product_Cat")
        private String pCategory;

	@Column(name="product_Photo")
	private String pPhoto;

	@Column(name="product_Price")
	private int pPrice;

	@Column(name="product_Discount")
	private int pDiscount;

	@Column(name="product_Quantity")
	private int pQuantity;
	
	@ManyToOne
	private Category category = new Category();

    public Product(int pId, String pName, String pDesc, String pCategory, String pPhoto, int pPrice, int pDiscount, int pQuantity) {
        this.pId = pId;
        this.pName = pName;
        this.pDesc = pDesc;
        this.pCategory = pCategory;
        this.pPhoto = pPhoto;
        this.pPrice = pPrice;
        this.pDiscount = pDiscount;
        this.pQuantity = pQuantity;
    }

    public Product(String pName, String pDesc, String pCategory, String pPhoto, int pPrice, int pDiscount, int pQuantity) {
        this.pName = pName;
        this.pDesc = pDesc;
        this.pCategory = pCategory;
        this.pPhoto = pPhoto;
        this.pPrice = pPrice;
        this.pDiscount = pDiscount;
        this.pQuantity = pQuantity;
    }

    public Product() {
    }

    public int getpId() {
        return pId;
    }

    public String getpName() {
        return pName;
    }

    public String getpDesc() {
        return pDesc;
    }

    public String getpCategory() {
        return pCategory;
    }

    public String getpPhoto() {
        return pPhoto;
    }

    public int getpPrice() {
        return pPrice;
    }

    public int getpDiscount() {
        return pDiscount;
    }

    public int getpQuantity() {
        return pQuantity;
    }

    public Category getCategory() {
        return category;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public void setpDesc(String pDesc) {
        this.pDesc = pDesc;
    }

    public void setpCategory(String pCategory) {
        this.pCategory = pCategory;
    }

    public void setpPhoto(String pPhoto) {
        this.pPhoto = pPhoto;
    }

    public void setpPrice(int pPrice) {
        this.pPrice = pPrice;
    }

    public void setpDiscount(int pDiscount) {
        this.pDiscount = pDiscount;
    }

    public void setpQuantity(int pQuantity) {
        this.pQuantity = pQuantity;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{" + "pId=" + pId + ", pName=" + pName + ", pDesc=" + pDesc + ", pCategory=" + pCategory + ", pPhoto=" + pPhoto + ", pPrice=" + pPrice + ", pDiscount=" + pDiscount + ", pQuantity=" + pQuantity + ", category=" + category + '}';
    }

   
   

}