package challenges;

public class Silnia {
    public long factorial(int n){
        int factorial = 1;
        for(int i=1;i<=n;i++){
            factorial = factorial*i;
        }

        return factorial;
    }
}
