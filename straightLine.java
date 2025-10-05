public class straightLine {
    private kaordinatePoint start;
    private kaordinatePoint end;

    public straightLine(kaordinatePoint start, kaordinatePoint end){
        this.start = start;
        this.end = end;
    }

    public straightLine(int X1, int Y1, int X2, int Y2){
        this.start = new kaordinatePoint(X1,Y1);
        this.end = new kaordinatePoint(X2,Y2);
    }

    public kaordinatePoint getStart(){
        return start;
    }

    public kaordinatePoint getEnd() {
        return end;
    }

    public void setStart(kaordinatePoint start) {
        this.start = start;
    }

    public void setEnd(kaordinatePoint end) {
        this.end = end;
    }
    @Override
    public String toString(){
        return "Линия от "+ start+ " до " + end;
    }
}
