import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

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
        File file = new File(path);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        ArrayList<String> actors = new ArrayList<String>();

        String line = br.readLine();
        while(line!=null)
        {
            String[] actorList = line.split("[/]+");
        }
    }

}
