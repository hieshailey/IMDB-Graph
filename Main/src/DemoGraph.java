/**
 * Created by dan.forrestal on 2/10/16.
 */

import java.io.BufferedReader;
import java.io.IOException;
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

            try {
                FileManager.getInstance().readLines("/sample.txt");
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
