// 89//
class fibonaccirecrenceloop{
    public static int fib(int n){
        if(n==0 || n==1) {
            return 1;
        }return fib(n-1)+fib(n-2);
    }
    public static void main (String args[]) {
        fibonaccirecrenceloop a=new fibonaccirecrenceloop();
        for(int i=0;i<10;i++){
        int res=fib(i);
        System.out.println(i+"->"+res);
        }
    }
} 