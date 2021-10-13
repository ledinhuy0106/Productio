import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.omg.CORBA.PUBLIC_MEMBER;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter size : ");
        int size=scanner.nextInt();
        Product [] lis = new Product[size];
        input(lis);
        check(lis);
        System.out.println("total : "+total(lis));
        set(lis);
        output(lis);

    }
    public static void input(Product[] lis){
        for (int i = 0; i< lis.length; i++){
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter code "+ i+ " : ");
            int code=scanner.nextInt();
            System.out.println("Enter name "+ i+ " : ");
            scanner.nextLine();
            String name=scanner.nextLine();
            System.out.println("Enter type "+ i+ " : ");
            String type =scanner.nextLine();
            System.out.println("Enter unit "+ i+ " : ");
            String unit=scanner.nextLine();
            System.out.println("Enter money "+ i+ " : ");
            int usd=scanner.nextInt();
            Product newProduct=new Product();
            lis[i]=newProduct;

        }
    }
    public static void check(Product[] lis){
        Scanner scanner=new Scanner(System.in);
        System.out.println(" Enter the product you want to find : ");
        String check=scanner.nextLine();
        int index=0;
        boolean Check=false;
        for (int i=0;i<lis.length;i++){
            if(lis[i].name.equals(check)){
                Check=true;
                index=i;
            }
        }
        if(Check){
            System.out.println(lis[index]);
        }else {
            System.out.println(" not found : ");
        }
    }
    public static int total(Product[] lis){
        int total=0;
        for (Product li : lis) {
            total += li.price;
        }
        return total;

    }
    public static void set(Product[] lis){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the code you want to edit : ");
        int coder=scanner.nextInt();
        boolean Check2=false;
        int index2=0;
        for(int i=0;i< lis.length;i++){
            if(coder==lis[i].price){
                Check2=true;
                index2=i;
            }
        }
        if(Check2){
            System.out.println("set code :");
            int code2=scanner.nextInt();
            System.out.println("Set name :");
            scanner.nextLine();
            String name2=scanner.nextLine();
            System.out.println("set type : ");
            String type2=scanner.nextLine();
            System.out.println("set unit :");
            String unit=scanner.nextLine();
            System.out.println("set money : ");
            int usd2=scanner.nextInt();
            Product new2Product=new Product();
            lis[index2]=new2Product;

        }else {
            System.out.println("ko tìm thấy : ");
        }

    }
    public static void output(Product[] lis){
        for(int i=0;i< lis.length;i++){
            System.out.println(lis[i]);
        }
    }
    public static void delete(Product[] lis){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the code you want to delete : ");
        int delete=scanner.nextInt();
        boolean Check2=false;
        int index2=0;
    }
}