import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.List;

public class Persistencia {
    private static final String ARQUIVO_GRUPOS = "grupos.json";

    //Metodo para salvar os dados em um arquivo JSON
    public void salvarDados(List<Grupo> grupos) {

        try (FileWriter writer = new FileWriter(ARQUIVO_GRUPOS)) {
            Gson gson = new GsonBuilder()
                    .registerTypeAdapter(YearMonth.class, new YearMonthAdapter())
                    .registerTypeAdapter(LocalDate.class, new LocalDateAdapter())
                    .setPrettyPrinting()
                    .create();
            gson.toJson(grupos, writer);
            System.out.println("Dados salvos com sucesso.");
        } catch (IOException e) {
            System.out.println("Erro ao salvar os dados: " + e.getMessage());
        }
    }

    // Metodo para carregar os dados de um arquivo JSON
    public List<Grupo> carregarDados() {
        Gson gson = new GsonBuilder()
                .registerTypeAdapter(YearMonth.class, new YearMonthAdapter())
                .registerTypeAdapter(LocalDate.class, new LocalDateAdapter())
                .create();

        File arquivo = new File(ARQUIVO_GRUPOS);

        if (!arquivo.exists() || arquivo.length() == 0) {
            // se o arquivo não existir ou estiver vazio, retorna uma lista nova
            return new ArrayList<>();
        }

        try (Reader reader = new FileReader(ARQUIVO_GRUPOS)){
            return gson.fromJson(reader, new TypeToken<List<Grupo>>(){}.getType());
        } catch (IOException e) {
            System.out.println("Erro ao carregar os dados: " + e.getMessage());
        }
            return new ArrayList<>(); // Retorna uma lista vazia em caso de erro
    }
}
