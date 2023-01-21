package aggregation;

public class Employee {
    int empNo;
    String name;
    Address address;
}
class Address{
    String flatNo;
    String buildingName;
    String area;

    @Override
    public String toString() {
        return "Address{" +
                "flatNo='" + flatNo + '\'' +
                ", buildingName='" + buildingName + '\'' +
                ", area='" + area + '\'' +
                ", landmark='" + landmark + '\'' +
                ", city='" + city + '\'' +
                ", pincode=" + pincode +
                '}';
    }

    String landmark;
    String city;

    int pincode;
}

class EmployeeImpl{
    public static void main(String[] args) {
        Employee emp1=new Employee();
        emp1.empNo=101;
        emp1.name="abc";

        Address workaddress=new Address();
        workaddress.flatNo="A-101";
        workaddress.buildingName="Bandal Capital";
        workaddress.area="Kothrud";
        workaddress.landmark="Near kothrud bus depot";
        workaddress.city ="Pune";
        workaddress.pincode=411038;

        emp1.address=workaddress;
        System.out.println("employee no:"+emp1.empNo);
        System.out.println("employee name:"+emp1.name);
        System.out.println("employee address:"+emp1.address);//emp1.workaddress
    }
}



