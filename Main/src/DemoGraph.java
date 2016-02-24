/**
 * Created by dan.forrestal on 2/10/16.
 */

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.HashSet;

public class DemoGraph {



    public static void main(String[] args) {

        //Get the buffered reader for the text file
        BufferedReader br = FileManager.getInstance().getFile("real.txt");

        Graph graph = new Graph();

        //populate the graph
        try {

            int counter = 0;
            String line = br.readLine();

            while (line != null) {

                String[] linebits = line.split("/");

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

                if (counter % 1000 == 0)
                    System.out.println(counter);

                line = br.readLine();

            }

        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
