public class Main {
    public static void main(String[] args) {
        int number = 45;
        int numberFib01 = 0;
        int numberFib02 = 1;
        int numberFib03;
        boolean belongs = false;

        while(numberFib02 <= number){
            if(numberFib02 == number){
                belongs = true;

            }
            numberFib03 = numberFib01 + numberFib02;
            numberFib01 = numberFib02;
            numberFib02 = numberFib03;
        }
        if(belongs){
            System.out.println(number + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(number + " não pertence à sequência de Fibonacci.");
        }

    }
}