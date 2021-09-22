public class MenuItem {
    private String name;
    private String description;
    private Double price;
    private String category;
    private Boolean isNew;

    public menuItem(String name, String decsiption, Double price){
this.name = name;
this.description =decsiption;
this.price = price;

this.category = "Not Categorised";
this.isNew=false;

    }
    public menuItem(String name, String description, Double price, String category, Boolean isNew){
        this.name = name;
        this.description =decsiption;
        this.price = price;
this.category= category;
this.isNew= isNew;
    }
    public String getName(){return this.name; }
    public void setName(String name) {this.name=name; }
    public String getDescription(){return this.description; }
    public void setDescription(String description){this.description= description; }
    public Double getPrice(){return this.price; }
    public void setPrice(Double price){this.price = price; }
    public String getCategory(){return this.category; }
    public void setCategory(String category){this.category=category; }
    public Boolean getIsNew(){return this.isNew; }
    public void setIsNew(Boolean isNew){this.isNew= isNew; }
}
