
public class CalculatePhiTest {
    public static void main(String[] args) {
        int p = 123;
        int q = 456;
        int n = p * q;
        int phiOfN = (p - 1) * (q - 1);
        System.out.println("Phi of N: " + phiOfN + "\nN: " + n);
        System.out.println("\n" + totient(n));
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

    /*
    TODO: Fix Eulers Totient
     */
}
