public class kaordinatePoint {
    private int x;
    private int y;
    public kaordinatePoint(){
        this.x = 15;
        this.y = 16;
    }

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

    public kaordinatePoint (int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString(){
        return "{" + x + ";" + y + "}";
    }

}
