package yqcustom;
public class Yq{
    public static void main(String[] args) {
        try{
            YAML yamlFile = new YAML(args[0]);
            yamlFile.printFile();
        }catch(Exception exception){
            System.out.println(String.format("Exception occurred in parsing the file: %s",exception.getMessage()));
        }
    }
}