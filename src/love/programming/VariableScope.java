package love.programming;

public class VariableScope {

    static int myGlobalint = 5;
    static int myMainLocalint = 10;

    public static void main(String[] args) {


        System.out.println(myMainLocalint);
        System.out.println(myGlobalint);

        {
            int myCodeblockInt = 100;
            System.out.println(myCodeblockInt);
        }


        VariableScope vs = new VariableScope();
        vs.myMethod();

    }

    void myMethod(){
        int myLocalInt = 10;

        System.out.println(myMainLocalint );

        System.out.println(myGlobalint);
    }


}
