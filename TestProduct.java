
class Product{
    String pcode;
    String pname;
    double price;

    public Product(String pcode,String pname,double price) 
    {
        this.pcode=pcode;
        this.pname=pname;
        this.price=price;
    }
    
}
public class TestProduct{
    public static void main(String[] args) {
        Product p1 = new Product("P001","keyboard",750.00);
        Product p2 = new Product("p002","ps5",560.00);
        Product p3 = new Product("P003","nvidia GTX 5090",200000.00);

        Product lowest =p1;
        if(p2.price<lowest.price){
            lowest=p2;
        }
        if(p3.price < lowest.price){
            lowest =p3;
        }
         
        System.out.println("product with lowest price");
        System.out.println("code :"+lowest.pcode);
       System.out.println("NAME:"+ lowest.pname);
       System.out.println("price :"+lowest.price);

        
    }
}