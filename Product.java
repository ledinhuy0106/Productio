public class Product {
    String name, Type,Code ,Unit;
    Double price  ;
    private static final String FILENAME = "Main.java";
    public Product() {}

    public Product(String name, String code, String Type, Double price, String Unit) {
        this.name = name;
        this.Code = code;
        this.Type = Type;
        this.price = price;
        this.Unit = Unit;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getcode() {
        return Code;
    }
    public void setcode(String code) {
        this.Code = code;
    }
    public String getType() {
        return Type;
    }
    public void setType(String Type) {
        this.Type = Type;
    }
    public Double getprice() {
        return price;
    }
    public void setprice(Double price) {
        this.price = price;
    }
    public String getUnit() {
        return Unit;
    }
    public void setUnit(String Unit) {
        this.Unit = Unit;
    }
    @Override
    public String toString() {
        return "Product{" +
                "code=" + Code +
                ", name='" + name + '\'' +
                ", type='" + Type + '\'' +
                ", usd=" + price +
                ", unit='" + Unit + '\'' +
                '}';
    }
}