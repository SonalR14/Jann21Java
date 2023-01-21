package thiddemo;
//this initializes current instance of class
public class ThisDemo {
    int id;
    String name;
    String address;    //instance variable

    public void setValues(int id1,String name1,String address1){
        this.id=id1;
        this.name=name1;
        this.address=address1;

    }
    public ThisDemo(){ //method implementation
        System.out.println("in default constructor");
    }
    public ThisDemo( int i){
        this(3,5);
        System.out.println("in parameter constructor");
    }
    public ThisDemo( int i ,int j){
        this();
        System.out.println("in 2  parameter constructor");
    }

    public static void main(String[] args) {
        ThisDemo obj= new ThisDemo(6);
        obj.setValues(11,"abc","pune");
        System.out.println("id:"+obj.id+"name:"+obj.name+"address"+obj.address);
    }
}
