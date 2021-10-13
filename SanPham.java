import java.util.*;

public class SanPham {

    String name, Type,Code ,Unit;
    Double price  ;

    public SanPham() {
    }

    public SanPham(String name, String code, String Type, Double price, String Unit) {
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

    public void input() {
        Scanner input = new Scanner(System.in);
        System.out.println("Tên sp: ");
        name = input.nextLine();
        System.out.println("Code ");
        Code= input.nextLine();
        System.out.println("Type ");
        Type = input.nextLine();
        System.out.println("Gía : ");
        price = Double.parseDouble(input.nextLine());
        System.out.println("Nhập Đơn Vị Tiền : ");
        Unit =input.nextLine();
    }

    public void output() {
        System.out.println("Name : " + name);
        System.out.println("Code : " + Code);
        System.out.println("Type : " + Type);
        System.out.println("Gía sp : " + price);
        System.out.println("Đơn vị Tiền : " + Unit);
    }
}
class displaySanPham {
    public static void main(String[] args) {
        SanPham emp2 = new SanPham();
        emp2.input();
        emp2.output();
    }
}