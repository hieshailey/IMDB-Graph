/**
 * Created by dan.forrestal on 2/10/16.
 */

import java.io.BufferedReader;
import java.util.ArrayList;

/**
 *
 * @author Michael Levet
 * @date June 09, 2015
 */
//public class DemoGraph
    //{
//        public static void main(String[] args)
//        {
//
//            //Get the buffered reader for the text file
//            BufferedReader br = FileManager.getInstance().getFile("/IMDB MPAA 21861 Movies sample.txt");
//
//            Graph graph = new Graph();
//
//            //initialize some vertices and add them to the graph
//            ArrayList  <Vertex> vertices = new ArrayList <Vertex>();              // feed inputs into an ArrayList
//            String line = br.readLine();
//            int i=0;
//            while(line!=null)
//            {
//                 String[] arrayName= line.split("[/]+");
//                vertices.add( new Vertex("" + i));           // make a label from the counter
//                graph.addVertex(vertices[i], true);
//                i++;
//
//            }
//
//
//
//













//
//            //illustrate the fact that duplicate edges aren't added
//            for(int i = 0; i < vertices.length() - 1; i++){
//                for(int j = i + 1; j < vertices.length; j++){
//                    graph.addEdge(vertices[i], vertices[j]);
//                    graph.addEdge(vertices[i], vertices[j]);
//                    graph.addEdge(vertices[j], vertices[i]);
//                }
//            }
//
//            //display the initial setup- all vertices adjacent to each other
//            for(int i = 0; i < vertices.length; i++){
//                System.out.println(vertices[i]);
//
//                for(int j = 0; j < vertices[i].getNeighborCount(); j++){
//                    System.out.println(vertices[i].getNeighbor(j));
//                }
//
//                System.out.println();
//            }
//
//            //overwrite Vertex 3
//            graph.addVertex(new Vertex("3"), true);
//            for(int i = 0; i < vertices.length; i++){
//                System.out.println(vertices[i]);
//
//                for(int j = 0; j < vertices[i].getNeighborCount(); j++){
//                    System.out.println(vertices[i].getNeighbor(j));
//                }
//
//                System.out.println();
//            }
//
//
//            System.out.println("Vertex 5: " + graph.getVertex("5")); //null
//            System.out.println("Vertex 3: " + graph.getVertex("3")); //Vertex 3
//
//            //true
//            System.out.println("Graph Contains {1, 2}: " +
//                    graph.containsEdge(new Edge(graph.getVertex("1"), graph.getVertex("2"))));
//
//            //true
//            System.out.println(graph.removeEdge(new Edge(graph.getVertex("1"), graph.getVertex("2"))));
//
//            //false
//            System.out.println("Graph Contains {1, 2}: " + graph.containsEdge(new Edge(graph.getVertex("1"), graph.getVertex("2"))));
//
//            //false
//            System.out.println("Graph Contains {2, 3} " + graph.containsEdge(new Edge(graph.getVertex("2"), graph.getVertex("3"))));
//
//            System.out.println(graph.containsVertex(new Vertex("1"))); //true
//            System.out.println(graph.containsVertex(new Vertex("6"))); //false
//            System.out.println(graph.removeVertex("2")); //Vertex 2
//            System.out.println(graph.vertexKeys()); //[3, 1, 0, 4]
//
//        }
//    }
