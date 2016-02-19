/**
 * Created by dan.forrestal on 2/10/16.
 */

import java.io.BufferedReader;
import java.util.HashSet;

/**
 *
 * @author Michael Levet
 * @date June 09, 2015
 */
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
                HashSet<String> actors = new HashSet<>();

                //start at 1 because the first element is the movie title
                for (int i = 1; i < linebits.length; i++) {

                    //make sure all the actors have vertices in the graph
                    Vertex vertex = new Vertex(linebits[i]);
                    //addVertex method ensures vertex isnt overwritten
                    graph.addVertex(vertex, false);

                    //add the actor to a hashset (edges between all actors in a movie need to be created)
                    actors.add(linebits[i]);

                }

                //add edges
                for (String str1: actors) {
                    Vertex actor1 = graph.getVertex(str1);

                    for (String str2: actors) {
                        //make sure not same actor
                        if (!str1.equals(str2)) {

                            Vertex actor2 = graph.getVertex(str2);

                            //this method already makes sure an edge doesnt exist, so dont have to check for it
                            graph.addEdge(actor1, actor2, 1);

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
