import java.util.ArrayList;
import java.util.LinkedList;

public class Vertex {
    private int level;
    private int row;
    private int columh;
    private String name;
    private int timeFromStart;
    private ArrayList<String> nextVerteces;

    public Vertex(int level, int row, int columh) {
        this.level = level;
        this.row = row;
        this.columh = columh;
        this.name = Utils.getVertexName(level, row, columh);
        this.timeFromStart = Integer.MAX_VALUE;
        this.nextVerteces = new ArrayList<>();
    }

    public int getLevel() {
        return level;
    }

    public int getRow() {
        return row;
    }

    public int getColumh() {
        return columh;
    }

     public String getName() {
        return name;
    }

    public int getTimeFromStart() {
        return timeFromStart;
    }

    public void setTimeFromStart(int timeFromStart) {
        this.timeFromStart = timeFromStart;
    }

    public ArrayList<String> getNextVerteces() {
        return nextVerteces;
    }

    public void setNextVerteces(String nextVertex) {
        this.nextVerteces.add(nextVertex);
    }
}
