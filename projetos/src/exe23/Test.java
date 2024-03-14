package exe23;

import java.util.AbstractList;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        SCross scross1 = new SCross("Suzuki", 2025);
        SCross scross2 = new SCross("Suzuki", 2024);
        SCross scross3 = new SCross("Suzuki", 2023);

        ArrayList<Motor> carros = new ArrayList<>();
        ArrayList<Veiculo> carros2 = new ArrayList<>();

        carros.add(scross1);
        carros2.add(scross2);
    }
}
