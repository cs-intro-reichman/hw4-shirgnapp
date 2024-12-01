public class Primes {
    public static void main(String[] args) {
        int n= Integer.parseInt(args[0]);
        boolean[] Prime = new boolean[n];
        for(int j=2; j<Prime.length; j++ )
        {
            Prime[j] = true;
        }
        int i=2;
        while (i < Math.sqrt(n)){ 
            for(int s=0; s<n; s++){
                if (s % i == 0 && i != s ) {
                    Prime[s] = false;
                }
            }
                if (i ==2 ) 
                    i++;
                else
                     i+=2;
            }
            Prime[2] = true;
            Prime[3] = true;
            int total = 1;
            for(int t = 0; t<n; t++) {
                if (Prime[t] == true) {
                    System.out.println(t);
                    total++;
                }
            }
            int p = 0;
            p = (total * 100) / n;
            System.out.println("There are " + total + " primes between 2 and " + n + " ( " + p + "% are primes)");
        }
        
    }
