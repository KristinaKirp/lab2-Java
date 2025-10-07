public class KaordinatePoint {
    private int x;
    private int y;


    public int getX() {
        return x;
    }
    public int getY(){
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    public KaordinatePoint(){
        this.x = x;
        this.y = y;
    }
    public KaordinatePoint (int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString(){
        return "{" + x + ";" + y + "}";
    }

}
