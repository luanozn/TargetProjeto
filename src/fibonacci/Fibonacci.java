package fibonacci;

public class Fibonacci {

    public static boolean containsInFibonacci(int number){
        StringBuilder str = new StringBuilder("");
        int counter = 0;
        while(!str.toString().contains(String.valueOf(number))){
            str.append(fibonacci(counter)).append(" ");
            counter++;
            if(Integer.parseInt(str.toString().split(" ")[counter-1]) > number)
                return false;
        }
        return true;
    }
    public static Integer fibonacci(int n){
        return(n < 2)? n : fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args) {

        System.out.println(Fibonacci.containsInFibonacci(12));

    }
}
