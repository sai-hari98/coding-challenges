package yqcustom;

import java.io.*;

public class YAML{

    private String path;
    private File file;
    public YAML(String path) throws Exception{
        this.file = new File(path);
        if(!this.file.exists()){
            throw new Exception("File not found");
        }
        this.path = path;
    }

    public void printFile() throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        while(bufferedReader.ready()){
            System.out.println(bufferedReader.readLine());
        }
    }
}