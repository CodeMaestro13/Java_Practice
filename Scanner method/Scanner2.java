import java.util.Scanner;
class Scanner2
{
	public static void main(String[] args){
		String str ="this is the example of scanner class";
		// scanner cha object create kraycha ahe 
		Scanner sc = new Scanner(str); // string input taken
		// logic for printing it 
		while(sc.hasNext()){
			System.out.println(sc.next());
		}
	}
}