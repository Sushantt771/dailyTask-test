import java.util.*;



public class FACTORIAL {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int result = Fact(10);
        System.out.println("Factorial of given Number is : "+ result);
    }

    static int Fact(int i) {
        if (i==1)

            // TODO Auto-generated method stub
            return 1;

        else
            return i*Fact(i-1);

    }

}

