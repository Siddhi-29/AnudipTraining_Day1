import java.util.Arrays;
public class Sort_fruits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] fruits= {"Mango","Apple","Grapes","Banana","Cherry"};//initialization and declaration
		   Arrays.sort(fruits);//sort the array
		   for(String x: fruits) 
		     { 
			    System.out.println(x);//print fruits name
		      }
	}

}
