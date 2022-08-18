import java.util.Scanner;
public class GroupIdentification {//This class will identify the group of the student by their rollno.

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); // Creating Reader 
	    System.out.print("Enter Your Roll No."); // Asking the user to enter the value
	    int rollno = scan.nextInt();
	    
	    if(rollno==1||(rollno-1)%4==0) {
	    	System.out.println("Sapphire Group");
	    }
	    else if(rollno==2||(rollno-2)%4==0) {
	    	System.out.println("Pearl Group");
	    }
	    else if(rollno==3||(rollno-3)%4==0) {
	    	System.out.println("Ruby Group");
	    }
	    else if(rollno==4||(rollno%4==0)){
	    	System.out.println("Emerald Group");
	    }
	    scan.close();

	}
}
