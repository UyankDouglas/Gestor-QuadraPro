import java.time.YearMonth;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Grupo {
    private String nome;
    private String semana;
    private String horario;
    private int valorDaMensalidade;

    private Map<YearMonth, Integer> saldoExcedentePorMes = new HashMap<>();
    private ArrayList<Pagamentos> pagamentos = new ArrayList<>();

    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSemana() {
        return semana;
    }

    public void setSemana(String semana) {
        this.semana = semana;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getValorDaMensalidade() {
        return valorDaMensalidade;
    }

    public void setValorDaMensalidade(int valorDaMensalidade) {
        this.valorDaMensalidade = valorDaMensalidade;
    }

    // Adiciona um pagamento ao grupo
    public void adicionarPagamento(Pagamentos pagamento) {
        this.pagamentos.add(pagamento);

        YearMonth mesAtual = YearMonth.now();
        int totalPagoNoMesAtual = getTotalPagoNoMes(mesAtual);

        int saldoAnterior = saldoExcedentePorMes.getOrDefault(mesAtual.minusMonths(1),0);
        totalPagoNoMesAtual += saldoAnterior;

        if (totalPagoNoMesAtual > valorDaMensalidade){
            int excedente = totalPagoNoMesAtual - valorDaMensalidade;
            saldoExcedentePorMes.put(mesAtual.plusMonths(1), excedente);
        }else {
            saldoExcedentePorMes.remove(mesAtual.plusMonths(1));
        }
    }

    // Calcula o total pago no mês vigente
    public int getTotalPagoNoMes(YearMonth mesConsulta) {
        int total = 0;
        for (Pagamentos pagamento : pagamentos) {
            YearMonth mesPagamento = YearMonth.from(pagamento.getData());
            if (mesPagamento.equals(mesConsulta)) {
                total += pagamento.getValorRecebido();
            }
        }
        return total;
    }

    public boolean isMesVigentePago(){
        YearMonth mesAtual = YearMonth.now();
        int totalPagoNoMesAtual = getTotalPagoNoMes(mesAtual);

        return totalPagoNoMesAtual >= valorDaMensalidade;
    }

    public int getValorFaltanteNoMesVigente(){
        YearMonth mesAtual = YearMonth.now();
        int totalPagoNoMesAtual = getTotalPagoNoMes(mesAtual);

        int saldoAnterior = saldoExcedentePorMes.getOrDefault(mesAtual.minusMonths(1),0);
        totalPagoNoMesAtual += saldoAnterior;

        return Math.max(0, valorDaMensalidade - totalPagoNoMesAtual);
    }

  public int getSaldoExcedenteNoMes(YearMonth mes){
        return saldoExcedentePorMes.getOrDefault(mes, 0);
  }
}
