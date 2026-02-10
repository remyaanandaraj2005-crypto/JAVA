import java.util.*;
public class employee {

    int id;
    String name;
    float salary;
    public void get()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ID:");
        id = sc.nextInt();
        System.out.print("Enter Name:");
        name = sc.next();
        System.out.println("Enter monthly salary:");
        salary = sc.nextFloat();
    }

    public void display(){
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
        System.out.println("Salary: "+salary);
    }
    public static void main(String[] args) {
        employee e1 = new employee();
        e1.get();
        e1.display();
        employee e2 = new employee();
        e2.get();
        e2.display();
        employee e3 = new employee();
        e3.get();
        e3.display();
}
}

