package nit.GitProject01;

/**
 * Hello world!
 */
public class App {
	public int sum(int x,int y) {
	return x+y;
	}
	
    public static void main(String[] args) {
        App ap =new App();
        
        System.out.println("The Sum Result is : "+ap.sum(10, 20));
        System.out.println("The Sum Amount is : "+ap.sum(10, 20));
        	// TL changed			// Dev changed
        System.out.println("So,Sum Result is : "+ap.sum(10, 20));        	
    }
}
