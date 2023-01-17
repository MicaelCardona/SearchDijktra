/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo.edu.uagrm.ficct.inf310sb.grafos.pesados;

import bo.edu.uagrm.ficct.inf310sb.grafos.Grafo;
import bo.edu.uagrm.ficct.inf310sb.grafos.excepciones.AristaYaExisteExcepcion;
import bo.edu.uagrm.ficct.inf310sb.grafos.excepciones.NroVerticesInvalidoExcepcion;
import java.util.List;

/**
 *
 * @author 59178
 */
public class pruebasGrafosPesados {

    public static void main(String[] args) throws NroVerticesInvalidoExcepcion, AristaYaExisteExcepcion {
        GrafoPesado grafo1 = new GrafoPesado(5);
        grafo1.insertarArista2(0, 1, 20.0);
        grafo1.insertarArista2(1, 3, 30.0);
        grafo1.insertarArista2(0, 4, 15);
        grafo1.insertarArista2(0, 2, 5);
        grafo1.insertarArista2(2, 3, 10);
        System.out.println(grafo1);
        int origen = 4;
        int destino = 3;
        AlgDijkstra alg = new AlgDijkstra(grafo1, origen,
                destino);
        System.out.println("Vertice de origen: "+origen);
        System.out.println("Vertice de destino: "+destino);
        List<Integer> pred = alg.getPredecesores();
        List<Double> costo = alg.getCosto();
        List<Integer>verticesCamino=alg.verticesATomar(origen, destino);
        System.out.println("Predecesores: " + pred);
        System.out.println("Vertices a tomar: "+verticesCamino);
        System.out.println("Costo del camino minimo: " + costo.get(destino));
    }
}
