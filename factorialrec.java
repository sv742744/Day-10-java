/*
120
*/
class factorialrec{
    int sum(int n){
        if(n==0) return 1;
        return n*sum(n-1);
    }
    public static void main (String arg[]) {
        factorialrec a=new factorialrec();
        int res=a.sum(5);
        System.out.println(res);
    }
} 