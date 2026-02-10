import java.util.*;
public class emparray {

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
    public static void main(String []args){
        int i,n=3;
        int No;
        emparray emp[] = new emparray[n];
        for(i=0;i<n;i++)
        {
            emp[i] = new emparray();
            emp[i].get();
        }
        System.out.println("search");
        while(true)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter ID:");
            No =Integer.parseInt(sc.nextLine());
            for(i=0;i<n;i++)
            {
                if(emp[i].id==No)
                {
                    emp[i].display();
                    break;
                }
            }
            }
        }
    }
