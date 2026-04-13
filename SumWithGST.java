import java.util.*;
public class SumWithGST {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter pencil cost: ");
        int pencil = sc.nextInt();

        System.out.println("Enter a pen cost: ");
        int pen = sc.nextInt();
        
        System.out.println("Enter a eraser cost: ");
        int eraser = sc.nextInt();

        int Total = pencil+pen+ eraser;

        System.out.println("Total cost: "+Total);
        
        double  GST = Total * 0.18;
        System.out.println("GST: "+ GST);
        
        double WithGST = Total + GST;
        System.out.println("With GST: "+WithGST);

        sc.close();

    }
    
}
