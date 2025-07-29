
public class WordSearchin2DMatrix {

    public static  boolean  wordSearch(char[][] matrix, String word) {
        int rows = matrix.length;
        int cols = matrix[0].length;

      //Check each row
        for (int i = 0; i < rows; i++) {
            StringBuilder rowString = new StringBuilder();
            for (int j = 0; j < cols; j++) {
                rowString.append(matrix[i][j]);  // Join characters from left to right
            }
            if (rowString.toString().contains(word)) {// if any subarrays contains
                return true;  // Word found in a row
            }
        }

        // Step 2: Check each column
        for (int j = 0; j < cols; j++) {
            StringBuilder colString = new StringBuilder();
            for (int i = 0; i < rows; i++) {
                colString.append(matrix[i][j]);  // Join characters from top to bottom
            }
            if (colString.toString().contains(word)) {
                return true;  // Word found in a column
            }
        }

        return false;
    }

    public static void main(String[] args) {

        char[][] matrix = {
            {'F', 'A', 'C', 'I'},
            {'O', 'B', 'Q', 'P'},
            {'A', 'N', 'O', 'B'},
            {'M', 'A', 'S', 'S'}
        };
// check for three test cases
        System.out.println(wordSearch(matrix, "FOAM"));  
        System.out.println(wordSearch(matrix, "MASS"));  
        System.out.println(wordSearch(matrix, "FACE")); 
    }
}
