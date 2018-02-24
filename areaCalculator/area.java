import java.lang.Math.*;

public class area{

public double calcArea(int r){
double a = Math.PI*(Math.pow(r, 2));

System.out.println("Complete area of the circle with radius " + r +" is: ");

System.out.printf("%.2f", a);

System.out.println(" ");

double half = a /2;
System.out.println("Half area of the circle with radius " + r +" is: ");

System.out.printf("%.2f", half);

System.out.println(" ");


return a;

}


}
