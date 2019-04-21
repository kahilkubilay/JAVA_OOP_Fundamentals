package birgörselikodlamak;

public class Point {
    
    private int x, y;
    
    //default constructor
    public Point(){
        this.x = 0;
        this.y = 0;
    }
    
    //params constructor
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    //setter and getter method
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    
    //override toString() method
    @Override
    public String toString(){
        return "(" + getX() + ", " + getY() + ")";
    }
    
    //getXY():int[2] method
    public int[] getXY(){
        int[] pointArr = new int[2];
        pointArr[0] = getX();
        pointArr[1] = getY();
        return pointArr;
    }
    
    //setXY() methodu
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    //distance(x:int, y:int) methodu
    public double distance(int x, int y){
        int p1, p2, p3, p4;
        double result;
        
        p1 = getX(); //nesnenin x noktası
        p2 = x; // uzaklığı hesaplanacak olan mesafenin x noktası
        p3 = getY(); //nesnenin y noktası
        p4 = y;  // uzaklığı hesaplanacak olan mesafenin y noktası
        
        result = Math.sqrt( Math.pow( (p1-p2), 2 ) + Math.pow( (p3-p4), 2 ) );
        
        return result;
    }
    
    //distance(Point:another) methodu
    public double distance(Point another){
        int p1, p2, p3, p4;
        double result;
        
        p1 = getX(); //nesnenin x noktası
        p2 = another.getX(); // uzaklığı hesaplanacak olan mesafenin x noktası
        p3 = getY(); //nesnenin y noktası
        p4 = another.getY();  // uzaklığı hesaplanacak olan mesafenin y noktası
        
        result = Math.sqrt( Math.pow( (p1-p2), 2 ) + Math.pow( (p3-p4), 2 ) );

        return result;
    }
    
    //distance() methodu
    public double distance(){
        int p1, p2;
        double result;
        
        p1 = getX(); //nesnenin x noktası
        p2 = getY(); //nesnenin y noktası
        
        result = Math.sqrt( Math.pow( (p1-0), 2 ) + Math.pow( (p2-0), 2 ) );

        return result;
    }
    
}
