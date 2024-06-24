import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class FileGeneration {

    public void saveFile(Address address) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter reader = new FileWriter(address.cep() + ".json");
        reader.write(gson.toJson(address));
        reader.close();
    }
}
