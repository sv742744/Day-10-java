// 89//
class fibonaccirecrence{
    public static int fib(int n){
        if(n==0 || n==1) {
            return 1;
        }return fib(n-1)+fib(n-2);
    }
    public static void main (String args[]) {
        fibonaccirecrence a=new fibonaccirecrence();
        int res=a.fib(10);
        System.out.println(res);
    }
} 