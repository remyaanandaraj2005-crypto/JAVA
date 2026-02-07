class Product {
    int id;
    String name;
    float price;

    void get(int id1, String name1, float price1) {
        id = id1;
        name = name1;
        price = price1;
    }

    void show() {
        System.out.println("Product id: " + id);
        System.out.println("Product name: " + name);
        System.out.println("Product price: " + price);
    }

    public static void main(String[] args) {
        Product p1 = new Product();
        p1.get(13, "apple", 200);
        p1.show();
        Product p2 = new Product();
        p2.get(14, "rose", 100);
        p2.show();
        Product p3 = new Product();
        p3.get(15, "rice", 500);
        p3.show();
        if(p1.price>p2.price && p1.price>p3.price)
        {
            System.out.println("p1 is the most l
            owest");
        } 
        else if(p2.price>p1.price&&p2.price>p3.price)
        {
            System.out.println("p2 is the most hightest");
        }
        else
        {
            System.out.println("p3 is the most lowest");
        }
         


        
        
    }
}
 