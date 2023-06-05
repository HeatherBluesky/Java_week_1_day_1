
public class Calculator {
    private int result;


    public Calculator(){
//        this.result= result;
    }
//    public void getResult(int number1, int number2){
//        this.result= number1 ;
//
//    };

    public int addNumbers(int number1, int number2) {
        return this.result =  number1 + number2;
    }

    public int minusNumbers(int number1, int number2) {
        return this.result = number1 - number2;
    }
    public int multiply(int number1, int number2) {
        return this.result = number1 * number2;
    }
    public double Divide(int number1, int number2) {
        return this.result = number1 / number2;
    }


}

