package LinearAlgebra;

public class Matrix {
    private int[][] entries;
    private int rows;
    private int cols;
    
    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        entries = new int[rows][cols];
    }
    
    public Matrix(int[][] entries) {
        this.rows = entries.length;
        this.cols = entries.length;
        this.entries = entries;
    }
    
    public int ij(int i, int j) {
        return entries[i][j];
    }
    
    public int getRows() { return rows; }
    public int getCols() { return cols; }
    
    public Matrix add(Matrix m) {
        if(this.rows==m.rows&&this.cols==m.cols) {
            for(int i=0;i<this.entries.length;i++)
                for(int j=0;j<this.entries[i].length;j++)
                    this.entries[i][j]+=m.entries[i][j];
            return this;
        }
        throw new ArithmeticException("Matrix size is different");
    }
    
    public Matrix subtract(Matrix m) {
        for(int i=0;i<this.entries.length;i++)
            for(int j=0;j<this.entries[i].length;j++)
                this.entries[i][j]-=m.entries[i][j];
        return this;
    }
    
    public Matrix multiply(int c) {
        for(int i=0;i<this.entries.length;i++)
            for(int j=0;j<this.entries[i].length;j++)
                this.entries[i][j]*=c;
        return this;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<rows;i++) {
            for (int j=0;j<cols;j++)
                sb.append(entries[i][j]).append(" ");
            if(i<rows-1) sb.append("\n");
        }
        return sb.toString();
    }
}

class MatrixTest {
    public static void main(String[] args) {
        Matrix a = new Matrix(new int[][]{{1,2}, {3,4}});
        
        System.out.println(a.multiply(5));
    }
}