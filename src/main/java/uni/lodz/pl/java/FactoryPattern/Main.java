package uni.lodz.pl.java.FactoryPattern;

public class Main {
    public static void main(String[] args) {
        ProcessFactory processFactory=new ProcessFactory();
        Process process=processFactory.GetProcess("Xml");
        process.Upload();

    }
}
