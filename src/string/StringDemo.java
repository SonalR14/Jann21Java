package string;
//strings are immutable


public class StringDemo {
    public static void main(String[] args) {
        String str="welcome";//1st way-non-primitive datatype
        String str2="to codekul";
        String str3 = str+" "+str2+" pune";
        char [] str1={'w','e','l','c','o','m','e'};//2nd-way-charactor array
        String str4=new String("abc");//3rd way-creating object of class string
        System.out.println(str);
        System.out.println(str1);

        System.out.println(str.substring(0,4));
        System.out.println(str.substring(3));

        System.out.println(str.concat(str2));
        System.out.println(str3);

        Boolean check=str.contains("c");
        System.out.println(check);

        Boolean b1=str.equals(str2);
        System.out.println(b1);

        System.out.println(str.charAt(3));
        System.out.println(str.length());
    }
}
