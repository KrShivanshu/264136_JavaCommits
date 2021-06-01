import java.util.Scanner;

class Employee{
    private String name;
    private String address;
    private String mobile;

    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getMobile() {
        return mobile;
    }
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}

public class EmployeeMain extends Employee{

    public static void main(String[] args){
        EmployeeMain e=new EmployeeMain();
        System.out.println("Enter the name: ");
        Scanner myVar = new Scanner(System.in);
        e.setName(myVar.nextLine());
        System.out.println("Enter the address: ");
        e.setAddress(myVar.nextLine());
        System.out.println("Enter the mobile: ");
        e.setMobile(myVar.nextLine());
        
        System.out.println("Employee Details ");
        System.out.println(e.getName());
        System.out.println(e.getAddress());
        System.out.println(e.getMobile());
        myVar.close();
    }
}
