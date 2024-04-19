public class MethodOverloadTest {
    public static void main (String args []) {
        Overloading Obj = new Overloading();
        double result;
        Obj.demo(10);
        Obj.demo(30, 20);
        result = Obj.demo(5.5);
        System.out.println("O/P : " + result);
    }
}
