
public class SideEffects {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i;
        i=0;
        if(false & (++i < 100))
            System.out.println("this won't be displayed");
        System.out.println("if statement executed : " + i);
        if(false && (++i < 100))
            System.out.println("this won 't  be displayed");
        System.out.println("if statem executed:" + i);