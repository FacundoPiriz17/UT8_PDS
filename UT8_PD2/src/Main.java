import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<TVertice> vertices = Arrays.asList(
                new TVertice("1"),
                new TVertice("2"),
                new TVertice("3"),
                new TVertice("4"),
                new TVertice("5"),
                new TVertice("6")
        );

        List<TArista> aristas = Arrays.asList(
                new TArista("1", "2", 6),
                new TArista("1", "3", 1),
                new TArista("1", "4", 5),
                new TArista("2", "3", 5),
                new TArista("2", "5", 3),
                new TArista("3", "5", 6),
                new TArista("3", "6", 4),
                new TArista("3", "4", 5),
                new TArista("4", "6", 2),
                new TArista("5", "6", 6)
        );

        TGrafoNoDirigido gnd = new TGrafoNoDirigido(vertices, aristas);
        TGrafoNoDirigido primGrafo = gnd.Prim();
        Double[][] primMatriz = UtilGrafos.obtenerMatrizCostos(primGrafo.getVertices());
        UtilGrafos.imprimirMatrizMejorado(primMatriz, primGrafo.getVertices(), "Matriz PRIM");

        TGrafoNoDirigido kruskalGrafo = gnd.Kruskal();
        Double[][] kruskalMatriz = UtilGrafos.obtenerMatrizCostos(kruskalGrafo.getVertices());
        UtilGrafos.imprimirMatrizMejorado(kruskalMatriz, kruskalGrafo.getVertices(), "Matriz PRIM");

        //3) Las matrices son idénticas
        //4) El orden del tiempo de ejecución es de O(n elevado a la 2)
        //5) Se podrían utilizar operaciones de conjuntos para los conjuntos de componentes conexos, tales como: Combina, encuentra, inicial, estas se podrían aplicar en un TDA_Combina_Y_Encuentra.
        //6) El método tiene un alto consumo de memoria, por lo tanto para conjuntos de datos muy grandes se tendría que optimizar si o si.

    }
}