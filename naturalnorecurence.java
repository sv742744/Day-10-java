class naturalnorecurence{
    int sum(int n){
        if(n==0) return 0;
        return n+sum(n-1);
    }
    public static void main (String arg[]) {
        naturalnorecurence a=new naturalnorecurence();
        int res=a.sum(10);
        System.out.println(res);
    }
} 