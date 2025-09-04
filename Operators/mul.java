package Operators;

public class mul {
    public static void main(String[] args) {
        int a = 5, b = 10;
        System.out.println(a * b);
        System.out.println("Without using operator: " );
        int res = 0 ;
        for(int i = 0 ; i < b ; i ++ ){
            res += a;
        }
        System.out.println(res);
    }
}
