package model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ConversorHolerite {

    private static final String INPUT_FILE = "I:\\Alura-One\\Backend\\Holerites\\src\\data\\ABR-2024 - Copia.txt";
    private static final String OUTPUT_FILE = "I:\\Alura-One\\Backend\\Holerites\\src\\data\\output.csv";
    private static final String MARCADOR = "ANDRES ROMANO";

    private static final Map<String, Map<String, Integer>> payslipFields = new HashMap<>();

    static {

        payslipFields.put("header_company", Map.of("linha", 0, "coluna_inicio", 0, "coluna_fim", 60));
        payslipFields.put("header_local", Map.of("linha", 1, "coluna_inicio", 0, "coluna_fim", 60));
        payslipFields.put("header_cnpj", Map.of("linha", 2, "coluna_inicio", 0, "coluna_fim", 20));
        payslipFields.put("header_competence", Map.of("linha", 2, "coluna_inicio", 45, "coluna_fim", 100));
        payslipFields.put("header_id_employee", Map.of("linha", 4, "coluna_inicio", 0, "coluna_fim", 4));
        payslipFields.put("header_employee", Map.of("linha", 4, "coluna_inicio", 5, "coluna_fim", 36));
        payslipFields.put("header_cbo", Map.of("linha", 4, "coluna_inicio", 37, "coluna_fim", 44));
        payslipFields.put("header_department", Map.of("linha", 4, "coluna_inicio", 48, "coluna_fim", 66));
        payslipFields.put("header_page", Map.of("linha", 4, "coluna_inicio", 67, "coluna_fim", 70));
        payslipFields.put("header_post", Map.of("linha", 5, "coluna_inicio", 0, "coluna_fim", 24));
        payslipFields.put("header_admission", Map.of("linha", 5, "coluna_inicio", 34, "coluna_fim", 45));
        payslipFields.put("header_doc_employee", Map.of("linha", 5, "coluna_inicio", 55, "coluna_fim", 70));
        payslipFields.put("detail_cod1", Map.of("linha", 8, "coluna_inicio", 0, "coluna_fim", 4));
        payslipFields.put("detail_description1", Map.of("linha", 8, "coluna_inicio", 6, "coluna_fim", 34));
        payslipFields.put("detail_ref1", Map.of("linha", 8, "coluna_inicio", 35, "coluna_fim", 43));
        payslipFields.put("detail_credit1", Map.of("linha", 8, "coluna_inicio", 45, "coluna_fim", 55));
        payslipFields.put("detail_debit1", Map.of("linha", 8, "coluna_inicio", 57, "coluna_fim", 67));
        payslipFields.put("detail_cod2", Map.of("linha", 9, "coluna_inicio", 0, "coluna_fim", 4));
        payslipFields.put("detail_description2", Map.of("linha", 9, "coluna_inicio", 6, "coluna_fim", 34));
        payslipFields.put("detail_ref2", Map.of("linha", 9, "coluna_inicio", 35, "coluna_fim", 43));
        payslipFields.put("detail_credit2", Map.of("linha", 9, "coluna_inicio", 45, "coluna_fim", 55));
        payslipFields.put("detail_debit2", Map.of("linha", 9, "coluna_inicio", 57, "coluna_fim", 67));
        payslipFields.put("detail_cod3", Map.of("linha", 10, "coluna_inicio", 0, "coluna_fim", 4));
        payslipFields.put("detail_description3", Map.of("linha", 10, "coluna_inicio", 6, "coluna_fim", 34));
        payslipFields.put("detail_ref3", Map.of("linha", 10, "coluna_inicio", 35, "coluna_fim", 43));
        payslipFields.put("detail_credit3", Map.of("linha", 10, "coluna_inicio", 45, "coluna_fim", 55));
        payslipFields.put("detail_debit3", Map.of("linha", 10, "coluna_inicio", 57, "coluna_fim", 67));
        payslipFields.put("detail_cod4", Map.of("linha", 11, "coluna_inicio", 0, "coluna_fim", 4));
        payslipFields.put("detail_description4", Map.of("linha", 11, "coluna_inicio", 6, "coluna_fim", 34));
        payslipFields.put("detail_ref4", Map.of("linha", 11, "coluna_inicio", 35, "coluna_fim", 43));
        payslipFields.put("detail_credit4", Map.of("linha", 11, "coluna_inicio", 45, "coluna_fim", 55));
        payslipFields.put("detail_debit4", Map.of("linha", 11, "coluna_inicio", 57, "coluna_fim", 67));
        payslipFields.put("detail_cod5", Map.of("linha", 12, "coluna_inicio", 0, "coluna_fim", 4));
        payslipFields.put("detail_description5", Map.of("linha", 12, "coluna_inicio", 6, "coluna_fim", 34));
        payslipFields.put("detail_ref5", Map.of("linha", 12, "coluna_inicio", 35, "coluna_fim", 43));
        payslipFields.put("detail_credit5", Map.of("linha", 12, "coluna_inicio", 45, "coluna_fim", 55));
        payslipFields.put("detail_debit5", Map.of("linha", 12, "coluna_inicio", 57, "coluna_fim", 67));
        payslipFields.put("detail_cod6", Map.of("linha", 13, "coluna_inicio", 0, "coluna_fim", 4));
        payslipFields.put("detail_description6", Map.of("linha", 13, "coluna_inicio", 6, "coluna_fim", 34));
        payslipFields.put("detail_ref6", Map.of("linha", 13, "coluna_inicio", 35, "coluna_fim", 43));
        payslipFields.put("detail_credit6", Map.of("linha", 13, "coluna_inicio", 45, "coluna_fim", 55));
        payslipFields.put("detail_debit6", Map.of("linha", 13, "coluna_inicio", 57, "coluna_fim", 67));
        payslipFields.put("detail_cod7", Map.of("linha", 14, "coluna_inicio", 0, "coluna_fim", 4));
        payslipFields.put("detail_description7", Map.of("linha", 14, "coluna_inicio", 6, "coluna_fim", 35));
        payslipFields.put("detail_ref7", Map.of("linha", 14, "coluna_inicio", 35, "coluna_fim", 43));
        payslipFields.put("detail_credit7", Map.of("linha", 14, "coluna_inicio", 45, "coluna_fim", 55));
        payslipFields.put("detail_debit7", Map.of("linha", 14, "coluna_inicio", 57, "coluna_fim", 67));
        payslipFields.put("detail_cod8", Map.of("linha", 15, "coluna_inicio", 0, "coluna_fim", 4));
        payslipFields.put("detail_description8", Map.of("linha", 15, "coluna_inicio", 6, "coluna_fim", 34));
        payslipFields.put("detail_ref8", Map.of("linha", 15, "coluna_inicio", 35, "coluna_fim", 43));
        payslipFields.put("detail_credit8", Map.of("linha", 15, "coluna_inicio", 45, "coluna_fim", 55));
        payslipFields.put("detail_debit8", Map.of("linha", 15, "coluna_inicio", 57, "coluna_fim", 67));
        payslipFields.put("detail_cod9", Map.of("linha", 16, "coluna_inicio", 0, "coluna_fim", 4));
        payslipFields.put("detail_description9", Map.of("linha", 16, "coluna_inicio", 6, "coluna_fim", 34));
        payslipFields.put("detail_ref9", Map.of("linha", 16, "coluna_inicio", 35, "coluna_fim", 43));
        payslipFields.put("detail_credit9", Map.of("linha", 16, "coluna_inicio", 45, "coluna_fim", 55));
        payslipFields.put("detail_debit9", Map.of("linha", 16, "coluna_inicio", 57, "coluna_fim", 67));
        payslipFields.put("detail_cod10", Map.of("linha", 17, "coluna_inicio", 0, "coluna_fim", 4));
        payslipFields.put("detail_description10", Map.of("linha", 17, "coluna_inicio", 6, "coluna_fim", 34));
        payslipFields.put("detail_ref10", Map.of("linha", 17, "coluna_inicio", 35, "coluna_fim", 43));
        payslipFields.put("detail_credit10", Map.of("linha", 17, "coluna_inicio", 45, "coluna_fim", 55));
        payslipFields.put("detail_debit10", Map.of("linha", 17, "coluna_inicio", 57, "coluna_fim", 67));
        payslipFields.put("detail_cod11", Map.of("linha", 18, "coluna_inicio", 0, "coluna_fim", 4));
        payslipFields.put("detail_description11", Map.of("linha", 18, "coluna_inicio", 6, "coluna_fim", 34));
        payslipFields.put("detail_ref11", Map.of("linha", 18, "coluna_inicio", 35, "coluna_fim", 43));
        payslipFields.put("detail_credit11", Map.of("linha", 18, "coluna_inicio", 45, "coluna_fim", 55));
        payslipFields.put("detail_debit11", Map.of("linha", 18, "coluna_inicio", 57, "coluna_fim", 67));
        payslipFields.put("detail_cod12", Map.of("linha", 19, "coluna_inicio", 0, "coluna_fim", 4));
        payslipFields.put("detail_description12", Map.of("linha", 19, "coluna_inicio", 6, "coluna_fim", 34));
        payslipFields.put("detail_ref12", Map.of("linha", 19, "coluna_inicio", 35, "coluna_fim", 43));
        payslipFields.put("detail_credit12", Map.of("linha", 19, "coluna_inicio", 45, "coluna_fim", 55));
        payslipFields.put("detail_debit12", Map.of("linha", 19, "coluna_inicio", 57, "coluna_fim", 67));
        payslipFields.put("detail_cod13", Map.of("linha", 20, "coluna_inicio", 0, "coluna_fim", 4));
        payslipFields.put("detail_description13", Map.of("linha", 20, "coluna_inicio", 6, "coluna_fim", 34));
        payslipFields.put("detail_ref13", Map.of("linha", 20, "coluna_inicio", 35, "coluna_fim", 43));
        payslipFields.put("detail_credit13", Map.of("linha", 20, "coluna_inicio", 45, "coluna_fim", 55));
        payslipFields.put("detail_debit13", Map.of("linha", 20, "coluna_inicio", 57, "coluna_fim", 67));
        payslipFields.put("detail_cod14", Map.of("linha", 21, "coluna_inicio", 0, "coluna_fim", 4));
        payslipFields.put("detail_description14", Map.of("linha", 21, "coluna_inicio", 6, "coluna_fim", 34));
        payslipFields.put("detail_ref14", Map.of("linha", 21, "coluna_inicio", 35, "coluna_fim", 43));
        payslipFields.put("detail_credit14", Map.of("linha", 21, "coluna_inicio", 45, "coluna_fim", 55));
        payslipFields.put("detail_debit14", Map.of("linha", 21, "coluna_inicio", 57, "coluna_fim", 67));
        payslipFields.put("detail_cod15", Map.of("linha", 22, "coluna_inicio", 0, "coluna_fim", 4));
        payslipFields.put("detail_description15", Map.of("linha", 22, "coluna_inicio", 6, "coluna_fim", 34));
        payslipFields.put("detail_ref15", Map.of("linha", 22, "coluna_inicio", 35, "coluna_fim", 43));
        payslipFields.put("detail_credit15", Map.of("linha", 22, "coluna_inicio", 45, "coluna_fim", 55));
        payslipFields.put("detail_debit15", Map.of("linha", 22, "coluna_inicio", 57, "coluna_fim", 67));
        payslipFields.put("bottom_credit", Map.of("linha", 24, "coluna_inicio", 45, "coluna_fim", 54));
        payslipFields.put("bottom_debit", Map.of("linha", 24, "coluna_inicio", 57, "coluna_fim", 67));
        payslipFields.put("bottom_liquid", Map.of("linha", 26, "coluna_inicio", 57, "coluna_fim", 67));
        payslipFields.put("bottom_message", Map.of("linha", 24, "coluna_inicio", 0, "coluna_fim", 35));
        payslipFields.put("bottom_base_salary", Map.of("linha", 28, "coluna_inicio", 0, "coluna_fim", 11));
        payslipFields.put("bottom_base_inss", Map.of("linha", 28, "coluna_inicio", 13, "coluna_fim", 22));
        payslipFields.put("bottom_base_fgts", Map.of("linha", 28, "coluna_inicio", 27, "coluna_fim", 36));
        payslipFields.put("bottom_fgts_month", Map.of("linha", 28, "coluna_inicio", 37, "coluna_fim", 46));
        payslipFields.put("bottom_base_ir", Map.of("linha", 28, "coluna_inicio", 52, "coluna_fim", 61));
        payslipFields.put("bottom_band_ir", Map.of("linha", 28, "coluna_inicio", 62, "coluna_fim", 67));
        payslipFields.put("bottom_dependents_ir", Map.of("linha", 28, "coluna_inicio", 70, "coluna_fim", 71));

    }

    public static void main(String[] args) throws IOException {
        int accountantPayslips = 0;

        // Ler o arquivo e contar os holerites
        try (BufferedReader reader = new BufferedReader(new FileReader(INPUT_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains(MARCADOR)) {
                    accountantPayslips++;
                }
            }
        }

        System.out.println("O arquivo contém " + accountantPayslips + " holerites.");

        // Escrever o arquivo CSV
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(OUTPUT_FILE))) {
            // Escrever o cabeçalho
            writer.write(String.join(";", payslipFields.keySet()));
            writer.newLine();

            // Iterar sobre as linhas do arquivo de entrada
            try (BufferedReader reader = new BufferedReader(new FileReader(INPUT_FILE))) {
                String line;
                int lineIndex = 0;
                while ((line = reader.readLine()) != null) {
                    if (line.contains(MARCADOR)) {
                        // Extrair os dados do holerite
                        Map<String, String> payslipData = new HashMap<>();
                        for (Map.Entry<String, Map<String, Integer>> entry : payslipFields.entrySet()) {
                            String field = entry.getKey();
                            Map<String, Integer> info = entry.getValue();
                            String value = reader.readLine(); // Lê a linha correspondente
                            if (value != null) {
                                payslipData.put(field, value.substring(info.get("coluna_inicio"), info.get("coluna_fim")).trim());
                            }
                            lineIndex++;
                        }

                        // Escrever os dados no arquivo CSV
                        writer.write(String.join(";", payslipData.values()));
                        writer.newLine();
                    }
                    lineIndex++;
                }
            }
        }
    }
}