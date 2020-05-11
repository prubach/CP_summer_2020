package pl.waw.sgh;

public class TestPrimes {
        public static void primes(int n) {
            int liczbaPierwsza = 1;
            //System.out.println("Pierwsze"+ n+" liczb pierwszych to: ");
            String output = "";
            for (int k=1;k<=n;k++) {
                liczbaPierwsza = nastepnaLiczbaPierwsza(liczbaPierwsza);
                //System.out.println(k+" liczba pierwsza to: "+liczbaPierwsza);
                output += liczbaPierwsza + ", ";
                //System.out.print(liczbaPierwsza + ", ");
            }
            String outtext = output.substring(0, output.lastIndexOf(","));
            System.out.println(outtext);
        }

        public static void main(String[] args) {
            primes(9);
        }
        public static int nastepnaLiczbaPierwsza(int liczba){
            int wynik = liczba+1;
            int dzielnik = 2;
            while(dzielnik < wynik){
                if(wynik % dzielnik == 0){
                    wynik ++;
                    dzielnik = 2;
                }
                else {
                    dzielnik ++;
                }
            }
            return wynik;
        }
    }
