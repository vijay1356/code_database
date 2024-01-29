
package L_reccursion.B_reccursion_med_level;

public class tower {
    public static void tow(int n,String source,String helper,String destination) {
        if(n==1){
            System.out.println("transfer disk "+ n+ " from "+helper+" to "+destination );
            return;
        }
        tow(n-1, source,destination, helper);
        System.out.println("transfer disk "+ n + " from "+ source + " to "+ helper);
        tow(n-1, helper,source , destination);
    }
    public static void main(String[] args) {
        int n=3;
        tow(n, "source", "helper", "destination");
    }
}
