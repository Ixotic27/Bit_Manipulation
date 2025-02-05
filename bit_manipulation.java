public class bit_manipulation {
    public static void main(String[] args) {
        System.out.println(getithbit(5,2));
        System.out.println(evenodd(5));
        setithbit(10,2);
        System.out.println(clearithbit(10,1));
        System.out.println(updateithbit(10,2,1));
        System.out.println(clearlastithbit(15,2));
        System.out.println(clearrangeithbit(10,2,4));
    }
    public static int getithbit(int n,int i){
        int bitmask = 1<<i;
        if((n & bitmask) == 0) return 0;
        else return 1;
    }
    public static String evenodd(int n){
        int bitmask =1;
        if((n & bitmask) == 1) return "Odd no.";
        else return "Even no.";
    }
    public static void setithbit(int n,int i){
        int bitmask = 1<<i;
        n = n | bitmask;
        System.out.println(n);
    }
    public static int clearithbit(int n,int i){
        int bitmask = ~(1<<i);
        n = n & bitmask;
        return n;
    }
    public static int updateithbit(int n,int i,int newbit){
        n=clearithbit(n,i);           //if(newbit==0) return clearithbit(n,i);
        int bitmask = newbit<<i;      //else return setithbit(n,i);
        return n | bitmask;
    }
    public static int clearlastithbit(int n,int i){
        int bitmask = (-1<<i); // int bitmask= ~0<<i;
        return n & bitmask;
    }
    public static int clearrangeithbit(int n,int i,int j){
        int a = ~0<<(j+1);
        int b = (1<<i)-1;
        int bitmask = a|b;
        return n & bitmask;
    }
}