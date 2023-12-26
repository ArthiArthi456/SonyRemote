import java.util.Scanner;
class SonyRemote
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args)throws Exception 
	{   System.out.println("\t\t\t Sony");
		System.out.println("Select The Input");
		System.out.println("1.Power On \n2.Power Off");
		int button = sc.nextInt();
	    System.out.println("\t\t\t Processing......");
		Thread.sleep(4000);
		if(button ==1){
			System.out.println("Television is On");}
        if (button>2){
			System.out.println("Television is Off"); }
        if (button > 2 || button<1) { 
	       System.out.println("leeeee testuuuuuu");
		   System.out.println("Invalid Input") ;}
        if (button>2) { 
			System.out.println("Input Mismatch"); }  
        if (button==2 && button > 1){
			System.out.println("Hi Aarthi ,Your Are Great......Keep Going...............");}
		System.out.println("****************************************************");
	}
}
