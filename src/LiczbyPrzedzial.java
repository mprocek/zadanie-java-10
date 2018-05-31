
public class LiczbyPrzedzial {
    public static void main(String[] args){

        double i = 0;
        while(i<3.1){
            System.out.printf("%.1f ", i);
            i+=0.1;
        }

        System.out.println();

        double ii=0;
        do {
            System.out.printf("%.1f ", ii);
            ii+=0.1;
        } while(ii<3.1);

    }



}
