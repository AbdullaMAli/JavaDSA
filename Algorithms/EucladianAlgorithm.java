//EUCLIDIAN ALGORITHM

//The GCD of a,b such that a>b is the GCD of (a-b),b.Till one become zero.
                     //OR
//The GCD of a,b such that a>b is the GCD of (a%b),b.Till one become zero.
/







public class EucladianAlgorithm{
    static int Max(int n, int m){
        if(n>m){
            return n;
        }else{
            return m;
        }
    }
    
    
    static int Min(int n, int m){
        if(n>m){
            return m;
        }else{
            return n;
        }
    }
    
    // static int gcd(int a, int b){
    //     if(a == b){
    //         return a;
    //     }else{
    //         return gcd(Max(a,b)-Min(a,b),Min(a,b));
    //     }
    // }
    
    static int gcd(int a, int b){
        if(a == 0 || b == 0){
            return Max(a,b);
        }else{
            return gcd(Max(a,b)%Min(a,b),Min(a,b));
        }
    }
    public static void main(String[] args){
        int a = 10;
        int b = 5;
        
        int ans = gcd(a,b);
        System.out.println(ans);
    }
}
