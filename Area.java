//creating class AREA
public class Rectangle{
//declaring variables
int length,breadth;
//Taking variables for AREA        
Rectangle(int l, int b){
        length = l;
        breadth = b;
}
//Taking variables for Perimeter
Rectangle(int h, int w){
        length= h;
        breadth=b;
}
//Calculating the area of the rectangle       
public int setDim1(){
int arearesult = length * breadth;
return arearesults;
}
public int setDim2(){
 int preiresult= 2*(length+breadth);        
return periresult;
}
        
 public void getArea(){
System.out.println("Area = " +  setDim1());
}
public void getPeri(){
System.out.println("Peri = " +  setDim2());
}
public static void main(String []args){
Rectangle x =new Rectangle(6,5);
x.getArea();
x.getPeri();        
Rectangle x =new Rectangle(8,6);
x.getArea();
x.getPeri();        
Rectangle x =new Rectangle(2,6);
x.getArea();
x.getPeri();        
Rectangle x =new Rectangle(3,3);
x.getArea();
x.getPeri();        
Rectangle x =new Rectangle(10,18);
x.getArea();
x.getPeri();        
Rectangle x =new Rectangle(5,10);
x.getArea();
x.getPeri();        
    
}
}
