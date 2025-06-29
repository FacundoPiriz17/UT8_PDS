public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      // cargar grafo con casas y distancias
        TGrafoRedElectrica laRed =  (TGrafoRedElectrica) UtilGrafos.cargarGrafo(
                "src/barrio1.txt",
                "src/distancias1.txt",
                false, TGrafoRedElectrica.class);
        TAristas tAristas = laRed.mejorRedElectrica();
        String resultado = tAristas.imprimirEtiquetas();
        System.out.println(resultado);
        String[] lista = resultado.split("\n");
        ManejadorArchivosGenerico.escribirArchivo("redelectrica.txt", lista);
        /*
           
        calcular la mejor red electrica\
        listar en el archivo "redelectrica.txt" el costo total del cableado
        y las conexiones establecidas, una por linea (origen, destino, costo)
        
        */
    }
}
