import java.util.Arrays;

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

    public int[] dijkstra (int inicio) {
        int[] distancias = new int[numVertices];
        boolean[] visitados = new boolean[numVertices];

        Arrays.fill(visitados, false);
        visitados[inicio] = true;

        Arrays.fill(distancias, Integer.MAX_VALUE);
        distancias[inicio] = 0;

        for (int i = 0; i < numVertices - 1; i++){
            int caminoCorto = Integer.MAX_VALUE;
            int indexCorto = -1;

            for(int j = 0; j < numVertices; j++){
                if(hasEdge(inicio, j) && !visitados[j] && distancias[j] <= caminoCorto){
                    caminoCorto = distancias[j];
                    indexCorto = j;
                }
            }
            visitados[indexCorto] = true;

            for (int j = 0; j < numVertices; j++){
                if(hasEdge(indexCorto, j) && !visitados[j] && distancias[indexCorto] != Integer.MAX_VALUE && distancias[indexCorto] + getWeight(indexCorto, j) < distancias[j]){
                    distancias[j] = distancias[indexCorto] + getWeight(indexCorto, j);
                }
            }
        }
        return distancias;
    }


    public static void main(String[] args) {

    }
}
