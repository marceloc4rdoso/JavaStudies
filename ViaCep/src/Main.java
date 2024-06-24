import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        CepQuery search = new CepQuery();
        try {
            Address address = search.cepSearch();
            System.out.println(address);
            FileGeneration fn = new FileGeneration();
            fn.saveFile(address);
        }catch (RuntimeException | IOException e){
            System.out.println(e.getMessage());
            System.out.println("Finanlizando a aplicação");
        }



    }


}
