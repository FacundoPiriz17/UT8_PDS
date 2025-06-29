import javax.annotation.processing.SupportedSourceVersion;
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
        UtilGrafos.imprimirMatrizMejorado(primMatriz, primGrafo.getVertices(), "Matriz luego de PRIM");

        List<TVertice> vertices1 = Arrays.asList(
                new TVertice("A"),
                new TVertice("B"),
                new TVertice("C"),
                new TVertice("D"),
                new TVertice("E"),
                new TVertice("F"),
                new TVertice("G")
        );

        List<TArista> aristas1 = Arrays.asList(
                new TArista("A", "B", 1),
                new TArista("A", "E", 1),
                new TArista("B", "E", 1),
                new TArista("B", "D", 1),
                new TArista("E", "C", 1),
                new TArista("C", "F", 1),
                new TArista("C", "G", 1)
        );

        TGrafoNoDirigido gnd2 = new TGrafoNoDirigido(vertices1, aristas1);
        System.out.println(gnd2.bea("C"));
    }
}