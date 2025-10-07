public class StraightLine {
    private KaordinatePoint start;
    private KaordinatePoint end;

    public StraightLine(KaordinatePoint start, KaordinatePoint end){
        this.start = start;
        this.end = end;
    }

    public StraightLine(int X1, int Y1, int X2, int Y2){
        this.start = new KaordinatePoint(X1,Y1);
        this.end = new KaordinatePoint(X2,Y2);
    }

    public KaordinatePoint getStart(){
        return start;
    }

    public KaordinatePoint getEnd() {
        return end;
    }

    public void setStart(KaordinatePoint start) {
        this.start = start;
    }

    public void setEnd(KaordinatePoint end) {
        this.end = end;
    }
    @Override
    public String toString(){
        return "Линия от "+ start+ " до " + end;
    }
}
