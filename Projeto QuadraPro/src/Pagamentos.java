import java.time.LocalDate;

public class Pagamentos {
    private LocalDate dia;
    private int valorRecebido;

    public Pagamentos(int valorRecebido, LocalDate dia){
        this.dia = dia;
        this.valorRecebido = valorRecebido;
    }

    public LocalDate getData(){
        return dia;
    }

    public int getValorRecebido() {
        return valorRecebido;
    }
}
