import java.util.Arrays;

public class ExpressionSplit {
	public static void main(String[] args) {
		
	
	
	String str = "ABCDE abcde 12356 @^%^*(_)|}{[]"; 
    String[] arrOfStr = str.split(" ",-2); 
    
    for (String a : arrOfStr) 
        System.out.println(a); 
	}

}


