import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.*;


public class FileManager {

    private static FileManager fileManager;

    public static FileManager getInstance(){
        if (fileManager == null)
            fileManager = new FileManager();

        return fileManager;
    }

    public BufferedReader getFile(String path){
        try {

            File file = new File(getClass().getResource(path).getPath());
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            return br;

        } catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }


    public void readLines(String path){
        File file = new File(getClass().getResource(path).getPath());
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        ArrayList<String> actorArrayList = new ArrayList<String>();
        HashMap<String,ArrayList<String>> actorMap = new HashMap<String,String>();

        String line = br.readLine();
        while(line!=null)
        {
            String[] actorArray= line.split("[/]+");
            actorArrayList.clear();
            for(int i=1; i<actorArray.length; i++){
                actorArrayList.add(actorArray[i]);
            }
            for(int j=0; j<actorArrayList.size(); j++){
                String k = actorArrayList.get(j);
                if(!actorMap.containsKey(k))
                {
                    //arraylist stuff
                    actorMap.put(k,actorArray[0]);
                }
                else
                {
                    String location = actorMap.get(k);
                    //arraylist stuff
                }
            }



        }
}}
