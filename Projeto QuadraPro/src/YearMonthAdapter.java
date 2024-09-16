import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.YearMonth;

public class YearMonthAdapter extends TypeAdapter<YearMonth> {

    // Metodo para serializar (salvar) o objeto YearMonth como uma string "YYYY-MM"
    @Override
    public void write(JsonWriter jsonWriter, YearMonth yearMonth) throws IOException {
        jsonWriter.value(yearMonth.toString()); // Converte YearMonth para string "YYYY-MM"
    }

    // Metodo para desserializar (ler) a string "YYYY-MM" de volta para um objeto YearMonth
    @Override
    public YearMonth read(JsonReader jsonReader) throws IOException {
        return YearMonth.parse(jsonReader.nextString()); // Converte string "YYYY-MM" para YearMonth
    }
}

