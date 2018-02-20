import java.lang.Math.*;

public class area{

public double calcArea(int r){
double a = Math.PI*(Math.pow(r, 2));
System.out.println("Area of the circle with radius " + r +" is: ");

System.out.printf("%.2f", a);

System.out.println(" ");
return a;

}


}
