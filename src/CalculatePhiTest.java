
public class CalculatePhiTest {
    public static void main(String[] args) {
        int p = 123;
        int q = 456;
        int n = p * q;
        int phiOfN = totient(n);
        int e;
        int i = 2;
        System.out.println("P: " +  p + "\nQ: " + q + "\nN: " + n + "\nPhi of N: " + totient(n));
        System.out.println("E: "  + Integer.toString(GetGCDByModulus(i,n)));
    }

    public static int totient(int num){ //euler's totient function calculator. returns totient
        int count=0;
        for(int a=1;a<num;a++){ //definition of totient: the amount of numbers less than num coprime to it
            if(GCD(num,a)==1){ //coprime
                count++;
            }
        }
        return(count);
    }
    public static int GCD(int a, int b){ //faster euclidean algorithm-see GCD for explanation
        int temp;
        if(a<b){
            temp=a;
            a=b;
            b=temp;
        }
        if(a%b==0){
            return(b);
        }
        return(GCD(a%b,b));
    }

    public static int GetGCDByModulus(int n, int phiOfN) {

        while (n != 0 && phiOfN != 0)
        {
            if (n > phiOfN)
                n %= phiOfN;
            else
                phiOfN %= n;
        }
        return Math.max(n, phiOfN);
    }

    /*
    TODO: Fix Eulers Totient
    TODO: Find e (Coprime with n & phiOfN)
     */
}
