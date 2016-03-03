/**
 * Created by dan.forrestal on 2/10/16.
 */

import java.io.BufferedReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author Michael Levet
 * @date June 09, 2015
 */
public class DemoGraph {



    public static void main(String[] args) {

        //Get the buffered reader for the text file
        BufferedReader br = FileManager.getInstance().getFile("1995.txt");

        Graph graph = new Graph();

        //populate the graph
        try {

            System.out.println("Populating graph...");

            int counter = 0;
            String line = br.readLine();
            String[] linebits;

            while (line != null) {

                linebits = line.split("/");

                //start at 1 because the first element is the movie title
                for (int i = 1; i < linebits.length; i++) {

                    //make sure all the actors have vertices in the graph
                    Vertex vertex = new Vertex(linebits[i]);
                    //addVertex method ensures vertex isnt overwritten
                    graph.addVertex(vertex, false);

                }

                //add edges
                for (int i = 1; i < linebits.length; i++) {
                    Vertex actor1 = graph.getVertex(linebits[i]);

                    for (int j = 1; j < linebits.length; j++) {
                        //make sure not same actor
                        if (!linebits[i].equals(linebits[j])) {

                            Vertex actor2 = graph.getVertex(linebits[j]);

                            //this method already makes sure an edge doesnt exist, so dont have to check for it
                            graph.addEdge(actor1, actor2);

                        }
                    }
                }

                counter ++;

                if (counter % 10000 == 0)
                    System.out.print("- ");

                line = br.readLine();

            }
            System.out.println("\nNUM LINES : " + counter + ".");

            System.out.println("Done.\n");

        } catch (Exception e){
            e.printStackTrace();
        }

        //pathing
        int counter = 0;

        //init flag
        HashMap<Vertex, Boolean> flag = new HashMap<Vertex, Boolean>();
        for (Vertex v: graph.getVertices())
            flag.put(v, false);

        Queue<Vertex> queue = new LinkedList<Vertex>();
        queue.add(graph.getVertex("Bacon, Kevin")); //start

        Scanner scanner = new Scanner(System.in);

        //noinspection InfiniteLoopStatement
        while (true) {

            System.out.println("Who do you want to search for?");

            String search = scanner.nextLine();
            Vertex final_vert = graph.getVertex(search); //looking for

            System.out.println("\nSearching...");

            //queue searching
            outer:
            while (queue.size() != 0) {
                Vertex currentVertex = queue.remove();
                counter++;

                //add all neighbors to queue
                for (Edge e : currentVertex.getNeighbors()) {
                    Vertex neighbor = e.getNeighbor(currentVertex);

                    //in case final vert
                    if (neighbor == final_vert) {
                        break outer;
                    }

                    //flag true
                    if (!flag.get(neighbor)) {

                        queue.add(neighbor);

                        flag.remove(neighbor);
                        flag.put(neighbor, true);

                    }
                }
            }

            System.out.println("COUNTER : " + counter);

            System.out.println("Done.\n\n");

        }

    }
}
