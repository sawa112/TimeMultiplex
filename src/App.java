import station.datasource.DataSourceReader;

/**
 * Created by Alex on 09.01.2015.
 */
public class App {
    public static void main(String[] args){
        System.out.println("Hello");
        DataSourceReader dataSourceReader = new DataSourceReader();
        dataSourceReader.start();
    }
}