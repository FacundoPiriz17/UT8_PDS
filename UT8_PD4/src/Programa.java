public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //3)
        TGrafoRedElectrica laRed =  UtilGrafos.cargarGrafo(
                "src/barrio1.txt",
                "src/distancias1.txt",
                false, TGrafoRedElectrica.class);
        TAristas tAristas = laRed.mejorRedElectrica();
        String resultado = tAristas.imprimirEtiquetas();
        System.out.println(resultado);
        String[] lista = resultado.split("\n");
        //ManejadorArchivosGenerico.escribirArchivo("redelectrica.txt", lista);
        System.out.println(laRed.conectados(laRed.buscarVertice("CC1"),laRed.buscarVertice("CC5")));
    }
}
