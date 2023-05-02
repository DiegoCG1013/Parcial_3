public class Grafo {

    private int[][] adjacencyMatrix;
    private int numVertices;

    public Grafo(int numVertices) {
        this.numVertices = numVertices;
        this.adjacencyMatrix = new int[numVertices][numVertices];
    }

    public void addEdge(int i, int j, int weight) {
        if (i != j) {
            adjacencyMatrix[i][j] = weight;
            adjacencyMatrix[j][i] = weight;
        } else System.out.println("No se puede hacer un camino al mismo sitio");
    }

    public void removeEdge(int i, int j) {
        adjacencyMatrix[i][j] = 0;
        adjacencyMatrix[j][i] = 0;
    }

    public boolean hasEdge(int i, int j) {
        return adjacencyMatrix[i][j] != 0;
    }

    public int getWeight(int i, int j) {
        return adjacencyMatrix[i][j];
    }

    public static void main(String[] args) {

    }
}
