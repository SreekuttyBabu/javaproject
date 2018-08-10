package first;

/**
 * Created by expertzlab12 on 6/26/18.
 */
public class Product {
    int productid;
    String productname;
    float price;
    Product( int productid,String productname,float price)
    {
        this.productid=productid;
        this.productname=productname;
        this.price=price;
    }
    Product()
    {}
    public void displaydetails(Product product[])
    {
for(Product pr:product)
{
    if(pr.price<100)
    {
        System.out.println(" productid:"+pr.productid+" productname:"+pr.productname+" price:"+pr.price);
    }
}
    }
    public static void main(String[] args)
    {
        Product p =new Product(12,"pen",199);
        Product p1=new Product(13,"pen",59);
        Product parray[]={p,p1};
        Product p3=new Product();
        p3.displaydetails(parray);

    }

}
