import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        final String PATH_TO_FILE = "D:\\Аляксей\\Java\\Праекты\\MyFirstPrograms\\Labirinth\\src\\input";

        try {
            var lines = Files.readAllLines(Paths.get(PATH_TO_FILE));
            var labirinthSizes = lines.get(0).split(" ");
            var numberOfLevels = Integer.parseInt(labirinthSizes[0]);
            Utils.checkSize(numberOfLevels);
            var numberOfRows = Integer.parseInt(labirinthSizes[1]);
            Utils.checkSize(numberOfRows);
            var numberOfColumns = Integer.parseInt(labirinthSizes[2]);
            Utils.checkSize(numberOfColumns);
            lines.remove(0);
            var labirinth = new char[numberOfLevels][numberOfRows][numberOfColumns];

            for (int h = 0; h < numberOfLevels; h++) {
                labirinth[h] = Utils.readMatrixFromList(numberOfRows, numberOfColumns,
                        lines.subList(h * numberOfRows, (h + 1) * numberOfRows));
                if (h < numberOfLevels - 1) {
                    lines.remove((h + 1) * numberOfRows);
                }
            }

            Graph graph = new Graph(labirinth);
            int shortestTime = graph.findShortestTimeFromStartToFinish(5);
            if (shortestTime < Integer.MAX_VALUE) {
                System.out.println("Shortest time of path from start to finish is " + shortestTime);
            } else {
                System.out.println("No path from start to finish");
            }

        } catch (IOException e) {
            System.err.println("Error: " + e);
        }
    }
}
