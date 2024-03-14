
package eliminacion.gaussiana;

public class EliminacionGaussiana {
    
    public static void printMatrix(double[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Función para realizar la eliminación gaussiana
    public static double[] gaussianElimination(double[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            // Buscar el máximo elemento en la columna actual
            int maxRowIndex = i;
            for (int k = i + 1; k < n; k++) {
                if (Math.abs(matrix[k][i]) > Math.abs(matrix[maxRowIndex][i])) {
                    maxRowIndex = k;
                }
            }
            // Intercambiar filas si es necesario
            double[] temp = matrix[i];
            matrix[i] = matrix[maxRowIndex];
            matrix[maxRowIndex] = temp;
            // Hacer ceros por debajo del pivote en la columna actual
            for (int k = i + 1; k < n; k++) {
                double factor = matrix[k][i] / matrix[i][i];
                for (int j = i; j < n + 1; j++) {
                    matrix[k][j] -= factor * matrix[i][j];
                }
            }
        }
        // Resolver el sistema triangular superior
        double[] solution = new double[n];
        for (int i = n - 1; i >= 0; i--) {
            solution[i] = matrix[i][n] / matrix[i][i];
            for (int k = i - 1; k >= 0; k--) {
                matrix[k][n] -= matrix[k][i] * solution[i];
            }
        }
        return solution;
    }

    public static void main(String[] args) {
        // Definir la matriz aumentada del sistema de ecuaciones
        double[][] augmentedMatrix = {
            {2, 1, -1, 4},
            {-3, -1, 2, -11},
            {-2, 1, 2, -3}
        };

        // Resolver el sistema de ecuaciones
        double[] solution = gaussianElimination(augmentedMatrix);

        // Imprimir la solución
        System.out.println("La solucion del sistema de ecuaciones es:");
        for (int i = 0; i < solution.length; i++) {
            System.out.println("x" + (i+1) + " = " + solution[i]);
        }
    }
    
}
