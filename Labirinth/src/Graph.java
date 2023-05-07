import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Graph {
    private Map<String, Vertex> graphVertices;
    private String nameOfStartVertex;
    private String nameOfFinishVertex;
    private int numberOfLevels;
    private int numberOfRows;
    private int numberOfColumns;

    public Graph(char[][][] labirinth) {
        this.graphVertices = new HashMap<>();
        this.numberOfLevels = labirinth.length;
        this.numberOfRows = labirinth[0].length;
        this.numberOfColumns = labirinth[0][0].length;
        for (int h = 0; h < this.numberOfLevels; h++) {
            for (int i = 0; i < this.numberOfRows; i++) {
                for (int j = 0; j < this.numberOfColumns; j++) {
                    if (labirinth[h][i][j] != 'o') {
                        this.graphVertices.put(Utils.getVertexName(h, i, j), new Vertex(h, i, j));
                        if (h < this.numberOfLevels - 1 && labirinth[h + 1][i][j] != 'o') {
                            this.graphVertices.get(Utils.getVertexName(h, i, j))
                                    .setNextVerteces(Utils.getVertexName(h + 1, i, j));
                        }
                        if (i != 0 && labirinth[h][i - 1][j] != 'o') {
                            this.graphVertices.get(Utils.getVertexName(h, i, j))
                                    .setNextVerteces(Utils.getVertexName(h, i - 1, j));
                        }
                        if (i < this.numberOfRows - 1 && labirinth[h][i + 1][j] != 'o') {
                            this.graphVertices.get(Utils.getVertexName(h, i, j))
                                    .setNextVerteces(Utils.getVertexName(h, i + 1, j));
                        }
                        if (j != 0 && labirinth[h][i][j - 1] != 'o') {
                            this.graphVertices.get(Utils.getVertexName(h, i, j))
                                    .setNextVerteces(Utils.getVertexName(h, i, j - 1));
                        }
                        if (j < this.numberOfColumns - 1 && labirinth[h][i][j + 1] != 'o') {
                            this.graphVertices.get(Utils.getVertexName(h, i, j))
                                    .setNextVerteces(Utils.getVertexName(h, i, j + 1));
                        }
                        if (labirinth[h][i][j] == '1') {
                            this.nameOfStartVertex = Utils.getVertexName(h, i, j);
                            this.graphVertices.get(Utils.getVertexName(h, i, j)).setTimeFromStart(0);
                        }
                        if (labirinth[h][i][j] == '2') {
                            this.nameOfFinishVertex = Utils.getVertexName(h, i, j);
                        }
                    }
                }
            }
        }
    }

    public int findShortestTimeFromStartToFinish(int stepTime) {
        ArrayList<Vertex> checkedVerteces = new ArrayList<>();
        checkedVerteces.add(this.graphVertices.get(nameOfStartVertex));
        for (int i = 0; i < checkedVerteces.size(); i++) {
            for (int j = 0; j < checkedVerteces.get(i).getNextVerteces().size(); j++) {
                String nameOfVertex = checkedVerteces.get(i).getNextVerteces().get(j);
                if (this.graphVertices.get(nameOfVertex).getTimeFromStart() == Integer.MAX_VALUE) {
                    checkedVerteces.add(this.graphVertices.get(nameOfVertex));
                    this.graphVertices.get(nameOfVertex)
                            .setTimeFromStart(checkedVerteces.get(i).getTimeFromStart() + stepTime);
                }
            }
        }
        return this.graphVertices.get(nameOfFinishVertex).getTimeFromStart();
    }
}
