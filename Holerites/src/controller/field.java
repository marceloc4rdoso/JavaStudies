package controller;

import java.util.HashMap;
import java.util.Map;

public class field {


    private static final Map<String, Map<String, Integer>> payslipFields = new HashMap<>();

    static {
        payslipFields.put("header_company", Map.of("linha", 0, "coluna_inicio", 0, "coluna_fim", 60));
        payslipFields.put("header_local", Map.of("linha", 1, "coluna_inicio", 0, "coluna_fim", 60));
        payslipFields.put("header_cnpj", Map.of("linha", 2, "coluna_inicio", 0, "coluna_fim", 20));
        payslipFields.put("header_competence", Map.of("linha", 2, "coluna_inicio", 45, "coluna_fim", 100));
        // ... adicione os demais campos aqui ...
    }

}
