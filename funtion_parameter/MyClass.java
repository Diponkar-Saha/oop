package funtion_parameter;

public class MyClass {
    public void myFunction( int num1,int num2) {
        //local variable
//        int num1=10;
//        int num2=10;
//        int result=num1+num2;
//        System.out.println("Result : "+result);

        int result=num1+num2;
        System.out.println("Result : "+result);
    }
    public void minusFunction( int num1,int num2) {

        int result=num1-num2;
        System.out.println("Minus Result : "+result);
    }
    public void multipleFunction( int num1,int num2) {

        int result=num1*num2;
        System.out.println("Multiple Result : "+result);
    }
    public void divideFunction( int num1,int num2) {

        int result=num1/num2;
        System.out.println("Divide Result : "+result);
    }

}
