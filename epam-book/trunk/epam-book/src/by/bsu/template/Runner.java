package by.bsu.template;

/**
 * Created by A.Aplevich on 05.03.2015.
 */
public class Runner {
    public static void main(String[] args) {
        Message<Integer> ob1 = new Message<Integer>();
        ob1.setValue(1);
        int v1 = ob1.getValue();
        System.out.println(v1);
        Message<String> ob2 = new Message<String>("Java");
        String v2 = ob2.getValue();
        System.out.println(v2);
        Message ob3 = new Message();
        //ob3 = ob1;
        System.out.println(ob3.getValue());
        ob3 = ob1;
        ob3.setValue(new Byte((byte)1));
        ob3.setValue("Java 7");
        System.out.println(ob3);
        ob3.setValue(71);
        System.out.println(ob3);
        ob3.setValue(null);
     }
}
