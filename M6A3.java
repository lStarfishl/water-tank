package m6a3;
import java.util.*;

public class M6A3 {

//function to calculate area of triangle 
public static int area(int x1,int y1,int x2,int y2,int x3,int y3){
//this return area of triangle, which coordinates are passed
return Math.abs((x1*(y2-y3) + x2*(y3-y1)+ x3*(y1-y2))/ 2 );
}
   public static void main(String[] args) {
   //Scanner to get user input
   Scanner sc = new Scanner(System.in);
   //initialize coordinates of points A, B AND C with their x and position each
   int AX = 0;
   int AY = 0;
   int BX = 200;
   int BY = 0;
   int CX = 0;
   int CY = 100;
   //ask user to enter coordinates of new points
   System.out.println("Enter a point's x and y coordinates: ");
   int PX = sc.nextInt();
   int PY = sc.nextInt();
   //get area of ABC
   int area1 = area(AX,AY,BX,BY,CX,CY);
   //get area of PBC
   int area2 = area(PX,PY,BX,BY,CX,CY);
   //get area of PAC
   int area3 = area(PX,PY,AX,AY,CX,CY);
   //get area of PAB
   int area4 = area(PX,PY,AX,AY,BX,BY);
//Check if sum of PBC, PAC and PAB is same as ABC then point lies inside the triangle
   if((area4+area3+area2) == area1){
   System.out.println("The point is in the triangle");
   }
   //else print point doesnt lies inside triangle
   else{
   System.out.println("The point is NOT in the triangle");
   }
   }

}
