import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>();


		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		while(n != 0){

			int operation = sc.nextInt();


			if(operation == 1){

				int x = sc.nextInt();
				a.add(x);

				System.out.println();

				System.out.println("Your operation is: " + operation + "\n"+ "X is: " +x);

				System.out.println();

				System.out.println("list after Addition operation: " +a);
			}

			if(operation == 2){
				int y = sc.nextInt();

				while(a.contains(y)){
					a.remove((Object) y);
			}
				System.out.println();

				System.out.println("Your operation is: " + operation + "\n"+ "Y is: " +y);

				System.out.println();

				System.out.println("list after Removal operation: " +a);
			}

			if(operation == 3 ){
				System.out.println();

				System.out.println("The size of the ArrayList is: "+ a.size());

				System.out.println();

				System.out.println("list after size() operation:" +a);
			}


			n--;
		}
		sc.close();
	}

}

