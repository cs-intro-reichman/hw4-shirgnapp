public class Primes {
    public static void main(String[] args) {
        int n= Integer.parseInt(args[0]);
        boolean[] Prime = new boolean[n];
        for(int j=2; j<Prime.length; j++ )
        {
            Prime[j] = true;
        }
        int i=2;
        while (i <= Math.sqrt(n) ){ 
            for(int s=0; s<n; s++){
                if (s % i == 0 &&  s > i ) {
                    Prime[s] = false;
                }
            }
                if (i == 2) 
                    i++;
                else
                     i+=2;
            }
            Prime[2] = true;
            int total = 0;
            Prime[n-1] = true;
            for(int j=2; j<n; j++){
                if ( n % j == 0 ) {
                    Prime[n-1] = false;
                }
            }
            System.out.println("Prime numbers up to " + n + ":");
            for(int t = 0; t<n; t++) {
                if (Prime[t] == true) {
                    if (t == n-1) {
                        System.out.println(n);
                        total++;
                    }
                    else {
                    System.out.println(t);
                    total++;
                    }
                }
            }
            int p = 0 ;
            p = (total * 100) / n;
            System.out.println("There are " + total + " primes between 2 and " + n + " (" + p + "% are primes)");
        }
        
    }

