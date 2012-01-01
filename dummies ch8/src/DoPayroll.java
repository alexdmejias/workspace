import java.util.Scanner;
import java.io.File;
import java.io.IOException;

class DoPayroll {
	public static void main(String args[]) throws IOException{
		Scanner diskScanner =  new Scanner (new File("s.txt"));
		
		for (int empNum =1;empNum<=3;empNum++){
			payOneEmployee(diskScanner);
		}
		
	}
	
	static void payOneEmployee(Scanner aScanner){
		Employee emp = new Employee();
		
		emp.setName(aScanner.nextLine());
		emp.setJobTitle(aScanner.nextLine());
		emp.cutCheck(aScanner.nextDouble());
		aScanner.nextLine();
	}
}
