import java.text.DecimalFormat;

public class Polygon {
    private int num;
    private double length;
    private String type;
    private double area;
    public Polygon(int theNum, double theLength, String theType){
        if(theNum < 3){
            num = 3;
            length = 1.0;
            type = "Triangle";
        }else if(theLength <= 0){
            length = 1.0;
            num = theNum;
            type = theType;
        }else{
            num = theNum;
            type = theType;
            length = theLength;
        }
    }
    public Polygon(){
        num = 3;
        length = 1.0;
        type = "Triangle";
    }
    public String getShapeType(){
        return type;
    }
    public double getSideLength(){
        return length;
    }
    public int getNumSides(){
        return num;
    }
    public void setSideLength(double theLength){
        if(theLength > 0){length = theLength;}
    }
    public void setNumSides(int theNum){
        if(theNum > 2){num = theNum;}
    }
    public void setShapeName(String theType){
        type = theType;
    }
    public double calculatePerimeter(){
        double perimeterT = num*length*1000;
        return (double)(int)perimeterT/1000;
    }
    public String toString(){
        DecimalFormat formatter = new DecimalFormat("#0.000");
        return type + " with " + num + " sides and a perimeter of: "+calculatePerimeter();
    }
    public double calculateArea(){
        double airea = Math.round((((length*length)*num)/(4*Math.tan(Math.PI/num)))*1000);
        return (double)(int)airea/1000;
    }
}