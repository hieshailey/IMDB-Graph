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
public class DemoGraph
    {
        public static void main(String[] args)
        {

            //Get the buffered reader for the text file
            BufferedReader br = FileManager.getInstance().getFile("/IMDB MPAA 21861 Movies sample.txt");

            Graph graph = new Graph();

            //initialize some vertices and add them to the graph
            ArrayList <Vertex> vertices = new ArrayList<Vertex>();


        }
    }
