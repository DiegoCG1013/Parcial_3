import static org.junit.jupiter.api.Assertions.*;

class GrafoTest {

    @org.junit.jupiter.api.Test
    void addEdge_hasEdge() {
        //test
        Grafo grafo = new Grafo(5);
        grafo.addEdge(0, 1, 1);
        grafo.addEdge(0, 2, 1);
        grafo.addEdge(0, 3, 1);
        assertTrue(grafo.hasEdge(0, 1));
        assertTrue(grafo.hasEdge(0, 2));
        assertTrue(grafo.hasEdge(0, 3));
        assertFalse(grafo.hasEdge(0, 4));

    }

    @org.junit.jupiter.api.Test
    void removeEdge() {
        Grafo grafo = new Grafo(5);
        grafo.addEdge(0, 1, 1);
        grafo.addEdge(0, 2, 1);
        assertTrue(grafo.hasEdge(0, 1));
        grafo.removeEdge(0, 1);
        assertFalse(grafo.hasEdge(0, 1));
    }
}