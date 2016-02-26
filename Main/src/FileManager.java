import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by mccloskeybr on 2/16/16.
 */
public class FileManager {

    private static FileManager fileManager;

    public static FileManager getInstance(){
        if (fileManager == null)
            fileManager = new FileManager();

        return fileManager;
    }

    public BufferedReader getFile(String path){
        try {

            File file = new File(path);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            return br;

        } catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }

    public void readLines(String path) throws IOException
    {
        File file = new File(getClass().getResource(path).getPath());
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);

        Graph movies = new Graph();

        String line = br.readLine();
        int count = 1;
        while(line!=null)
        {
            String[] actorList = line.split("[/]+");
            line = br.readLine();

            HashSet<String> actors = new HashSet<String>();
            for(int i = 1; i < actorList.length; i++)
            {
                movies.addVertex(new Vertex(actorList[i]), false);
                actors.add(actorList[i]);
            }

            for(String str: actors) {
                for (String str2 : actors) {
                    if (str != str2) {
                        movies.addEdge(movies.getVertex(str), movies.getVertex(str2));
                    }
                }
            }
            System.out.println(count);
            count++;
        }


    }

}
