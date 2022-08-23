import java.util.Arrays;
public class Second_maximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Second_largest=0;
		  int arr[]= {78,12,96,56,23,45,65,98};//initialization and declaration
	       Arrays.sort(arr);          //sort array
	       for(int i=0;i<arr.length;i++)
	       {
	    	  if(arr[i]!=arr[arr.length-1]) //After sorting check array length -1 
	    	   {
	    		  Second_largest=arr[i];//assign the value in second_largest
	    	   }
	       }
	       System.out.println("The second largest number is: "+Second_largest);//print second largest number from array.
	}

}
