import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

public class Utils {
    private static final String NULL_SIZE = "Matrix size can not be null.";
    private static final String NOT_VALID_SIZE = "Matrix sizes must be >= 2 and <= 50";
    private static final String INVALID_CHARACTER = "Not valid character.";
    private static final char[] ALLOWED_SYMBOLS = {'o', '.', '1', '2'};

    private static boolean allowedSymbol(char symbol) {
        for (var allowedSymbol : ALLOWED_SYMBOLS) {
            if (symbol == allowedSymbol) {
                return true;
            }
        }
        return false;
    }

    public static char[][] readMatrixFromList(int m, int n, List<String> lines) throws IOException {
        if (m <= 0 || n <= 0) {
            throw new IllegalArgumentException(NOT_VALID_SIZE);
        }
        var matrix = new char[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (!allowedSymbol(lines.get(i).charAt(j))) {
                    throw new IllegalArgumentException(INVALID_CHARACTER);
                }
                matrix[i][j] = lines.get(i).charAt(j);
            }
        }
        return matrix;
    }

    public static boolean checkSize(int size) {
        if (size < 2 || size > 50) {
            throw new IllegalArgumentException(NOT_VALID_SIZE);
        }
        return true;
    }

    public static String getVertexName(int level, int row, int column) {
        return level + "." + row + "." + column;
    }
}
