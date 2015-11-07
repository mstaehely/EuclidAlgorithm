/**
 * Euclid's algorithm, based on the idea that GCD(x, y) = GCD(y, y mod x)
 * 
 * @author Matthew Staehely
 * @version Autumn 2015
 */

class EuclidAlgo{
    private int x, y, gcd;
    
    /**
     * Constructor for class EuclidAlgo.
     * 
     * @param x an integer
     * @param y an integer
     */
    public EuclidAlgo(int x, int y){
        this.setX(x);
        this.setY(y);
        this.setGCD(x, y);
    }
    
    private void setX(int x){
        this.x = x;
    }
    
    private void setY(int y){
        this.y = y;
    }
    
    private void setGCD(int x, int y){
        this.gcd = GCDCrank(x, y);
    }
    
    private int GCDCrank(int x, int y){
        setX(x);
        setY(y);
        System.out.println("Current value of x: " + this.getX());
        System.out.println("Current value of y: " + this.getY() + "\n");
        if(y == 0){
            return x;
        } else {
            return GCDCrank(y, x % y);
        }        
    }
    
    /**
     * Accessor method to retrieve current value of 'x'.
     * 
     * @return x the current value of x.
     */
    public int getX(){
        return this.x;
    }
    
    /**
     * Accessor method to retrieve the current value of 'y'.
     * 
     * @return y the current value of y.
     */
    public int getY(){
        return this.y;
    }
    
    /**
     * Accessor method to retrieve the value of the GCD.
     * 
     * @return GCD the greatest common divisor.
     */
    public String getGCD(){
        return "The greatest common divisor is: " + this.gcd;
    }
}