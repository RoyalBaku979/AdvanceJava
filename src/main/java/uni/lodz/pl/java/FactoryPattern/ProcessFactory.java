package uni.lodz.pl.java.FactoryPattern;

public class ProcessFactory {
    public Process GetProcess(String nameProcess){
        if(nameProcess.equals("Database"))
               return new Database();
        else
            if(nameProcess.equals("Xml"))
                   return new Xml();
            else if(nameProcess.equals("Text"))
                   return new Text();

    return null;

    }
}
