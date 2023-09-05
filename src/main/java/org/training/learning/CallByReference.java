package org.training.learning;

public class CallByReference {

    public static void main(String[] args) {

        String sRef1= new String("Test");
        String sRef3 ="Test";

        System.out.println(sRef1==sRef3);
        System.out.println(sRef1.equals(sRef3));

        String sRef2= sRef1;

callByRef(sRef1);
        System.out.println("after call by ref s ");

        System.out.println(sRef1);
        System.out.println(sRef2);

        sRef1=sRef1+"1";
        System.out.println(sRef2);
        System.out.println(sRef1);

        Student s1 = new Student();
        s1.setAge(12);
        s1.setName("Bharathi");
        System.out.println(s1);;
Student s2 = s1;
        System.out.println(s2);
        s1.setAge(13);
        System.out.println(s2);
        System.out.println(s2);
        s2.setAge(14);
        System.out.println(s1);;

StringBuilder sb = new StringBuilder("test");

        StringBuilder sb1= sb;
        System.out.println(sb1);
        sb.append("1");
        System.out.println(sb1);

    }

    public static void callByRef(String s1 ){
        s1=s1+"addeFromRef";
    }
}
