import java.util.Scanner;

/**
 * Gather user input for the Euclidean algorithm.
 * 
 * @author Matthew Staehely
 * @version Autumn 2015
 */

class Input{
    private Scanner reader;
    private int x, y;
    String gcd;
    
    /**
     * Constructor for class Input.
     */
    public Input(){
        reader = new Scanner(System.in);
        x = y = 0;
        gcd = "";
    }
    
    public void gatherInput(){
        System.out.print("Please enter an x value: ");
        x= reader.nextInt();
        System.out.print("Please enter a y value: ");
        y = reader.nextInt();
        System.out.println();
    }
    
    public void produceOutput(){
        setGCD();
        System.out.println(getGCD());
    }
    
    private void setX(int x){
        this.x = x;
    }
    
    private int getX(){
        return this.x;
    }
    
    private void setY(int y){
        this.y = y;
    }
    
    private int getY(){
        return this.y;
    }
    
    private void setGCD(){
        if(getY() >= getX()){
            int temp = getX();
            setX(getY());
            setY(temp);
        }
        EuclidAlgo ea = new EuclidAlgo(getX(), getY());
        this.gcd = ea.getGCD();
    }
    
    private String getGCD(){
        return this.gcd;
    }
    
    public static void main(String[] args){
        Input input = new Input();
        input.gatherInput();
        input.produceOutput();
    }
}
        