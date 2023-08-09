import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Matrix {

    private String[]rows;

    Matrix(String matrixAsString) {
        rows = matrixAsString.split("\n");
    }

    int[] getRow(int rowNumber) {

        String [] row = rows[rowNumber-1].split(" ");
        return Stream.of(row).mapToInt(Integer::parseInt).toArray();
    }

    int[] getColumn(int columnNumber) {

        //String[] columns =  Stream.of(rows).map(row_info -> Arrays.toString(new String[]{row_info.split(" ")[columnNumber - 1]})).toArray(String[]::new);
        String[] columns = Stream.of(rows).map(col -> col.split(" ")[columnNumber-1]).toArray(String[]::new);
        return Stream.of(columns).mapToInt(Integer::parseInt).toArray();
    }
}
