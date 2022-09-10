package Matrix;

public class SnakePattern {
    public static void main(String[] args) {
        int[][] mat = {{1}, {2}, {3}, {4}};
        printPatt(mat);
    }

    static void printPatt(int[][] mat) {
        for(int j = 0; j < mat[0].length; j++) {
            System.out.print(mat[0][j] + " ");
        }
        if(mat.length == 1) return;
        for(int i = 1; i < mat.length; i++) {
            System.out.print(mat[i][mat[i].length - 1] + " ");
        }
        for(int j = mat[mat.length - 1].length - 2; j >= 0; j--) {
            System.out.print(mat[mat.length - 1][j] + " ");
        }
        if(mat[0].length == 1) return;
        for(int i = mat.length - 2; i > 0; i--) {
            System.out.print(mat[i][0] + " ");
        }
    }
}
