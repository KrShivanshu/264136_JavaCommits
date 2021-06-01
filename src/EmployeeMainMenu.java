import java.util.Scanner;

public class EmployeeMainMenu extends Employee{

    public void displayMenu(){
        System.out.println("Menu");
        System.out.println("1. Update Employee name");
        System.out.println("2. Update Employee Address");
        System.out.println("3. Update Employee mobile");
        System.out.println("4. All information correct/Exit");
        
    }
    public void displayDetails(EmployeeMainMenu e){
        System.out.println("Name: "+e.getName());
        System.out.println("Address: "+e.getAddress());
        System.out.println("Mobile: "+e.getMobile());
    }
    public static void main(String[] args){
        EmployeeMainMenu e = new EmployeeMainMenu();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name: ");
        e.setName(sc.nextLine());
        System.out.println("Enter Address: ");
        e.setAddress(sc.nextLine());
        System.out.println("Enter the mobile: ");
        e.setMobile(sc.nextLine());
        
        System.out.println("Employee Details ");
        e.displayDetails(e);

        System.out.println("Verify and Update details:");
        while(true){
            
            e.displayMenu();
            String op = sc.nextLine();
            
            if(op.equals("1")){
                System.out.println("Current name is: "+e.getName());
                System.out.println("Enter the name:");
                //sc = new Scanner(System.in);
                e.setName(sc.nextLine());
            }
            else if(op.equals("2")){
                System.out.println("Current address is: "+e.getAddress());
                System.out.println("Enter the address:");
                e.setAddress(sc.nextLine());
            }
            else if(op.equals("3")){
                System.out.println("Current mobile is: "+e.getMobile());
                System.out.println("Enter the mobile:");
                e.setMobile(sc.nextLine());
            }
            else if(op.equals("4")){
                break;
            }
            
        }
        System.out.println("The details are:");
        e.displayDetails(e);
        sc.close();
    }
}
