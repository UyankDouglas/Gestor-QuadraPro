import java.time.LocalDate;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Persistencia persistencia = new Persistencia();
        ArrayList<Grupo> listaDePeladas = new ArrayList<>(persistencia.carregarDados());

        if (listaDePeladas.isEmpty()){

            Grupo segunda1 = new Grupo();
            segunda1.setNome("segunda1");
            segunda1.setSemana("Segunda");
            segunda1.setHorario("");
            segunda1.setValorDaMensalidade(0);

            Grupo segunda2 = new Grupo();
            segunda2.setNome("segunda2");
            segunda2.setSemana("Segunda");
            segunda2.setHorario("19:30 as 21:30");
            segunda2.setValorDaMensalidade(0);

            Grupo segunda3 = new Grupo();
            segunda3.setNome("segunda3");
            segunda3.setSemana("Segunda");
            segunda3.setHorario("21:30 as 23:00");
            segunda3.setValorDaMensalidade(0);

            //Grupo segunda4 = não existe

            //Grupo terça1 = não existe

            Grupo terca2 = new Grupo();
            terca2.setNome("terca2");
            terca2.setSemana("Terça");
            terca2.setHorario("19:00 as 21:00");
            terca2.setValorDaMensalidade(0);

            Grupo terca3 = new Grupo();
            terca3.setNome("terca3");
            terca3.setSemana("Terça");
            terca3.setHorario("21:00 as 22:30");
            terca3.setValorDaMensalidade(0);

            Grupo terca4 = new Grupo();
            terca4.setNome("terca4");
            terca4.setSemana("Terça");
            terca4.setHorario("22:30 as 00:00");
            terca4.setValorDaMensalidade(0);

            //Grupo quarta1 = não existe

            Grupo quarta2 = new Grupo();
            quarta2.setNome("quarta2");
            quarta2.setSemana("Quarta");
            quarta2.setHorario("19:30 as 21:00");
            quarta2.setValorDaMensalidade(0);

            Grupo quarta3 = new Grupo();
            quarta3.setNome("quarta3");
            quarta3.setSemana("Quarta");
            quarta3.setHorario("21:00 as 22:30");
            quarta3.setValorDaMensalidade(0);

            Grupo quarta4 = new Grupo();
            quarta4.setNome("quarta4");
            quarta4.setSemana("Quarta");
            quarta4.setHorario("22:30 as 00:00");
            quarta4.setValorDaMensalidade(0);

            Grupo quinta1 = new Grupo();
            quinta1.setNome("quinta1");
            quinta1.setSemana("Quinta");
            quinta1.setHorario("18:30 as 20:30");
            quinta1.setValorDaMensalidade(0);

            Grupo quinta2 = new Grupo();
            quinta2.setNome("quinta2");
            quinta2.setSemana("Quinta");
            quinta2.setHorario("20:30 as 22:00");
            quinta2.setValorDaMensalidade(0);

            Grupo quinta3 = new Grupo();
            quinta3.setNome("quinta3");
            quinta3.setSemana("Quinta");
            quinta3.setHorario("22:00 as 00:00");
            quinta3.setValorDaMensalidade(0);

            //Grupo quinta4 = não existe

            Grupo sexta1 = new Grupo();
            sexta1.setNome("sexta1");
            sexta1.setSemana("Sexta");
            sexta1.setHorario("18:30 as 20:30");
            sexta1.setValorDaMensalidade(0);

            Grupo sexta2 = new Grupo();
            sexta2.setNome("sexta2");
            sexta2.setSemana("Sexta");
            sexta2.setHorario("20:30 as 22:00");
            sexta2.setValorDaMensalidade(0);

            Grupo sexta3 = new Grupo();
            sexta3.setNome("sexta3");
            sexta3.setSemana("Sexta");
            sexta3.setHorario("22:00 as 00:00");
            sexta3.setValorDaMensalidade(0);

            //Grupo sexta4 = não existe

            Grupo sabado1 = new Grupo();
            sabado1.setNome("sabado1");
            sabado1.setSemana("Sabado");
            sabado1.setHorario("7:00 as 9:00");
            sabado1.setValorDaMensalidade(0);

            Grupo sabado2 = new Grupo();
            sabado2.setNome("sabado2");
            sabado2.setSemana("Sabado");
            sabado2.setHorario("15:30 as 17:30");
            sabado2.setValorDaMensalidade(0);

            Grupo sabado3 = new Grupo();
            sabado3.setNome("sabado3");
            sabado3.setSemana("Sabado");
            sabado3.setHorario("17:30 as 19:30");
            sabado3.setValorDaMensalidade(0);

            Grupo sabado4 = new Grupo();
            sabado4.setNome("sabado4");
            sabado4.setSemana("Sabado");
            sabado4.setHorario("19:30 as 21:30");
            sabado4.setValorDaMensalidade(0);

            Grupo sabado5 = new Grupo();
            sabado5.setNome("sabado5");
            sabado5.setSemana("Sabado");
            sabado5.setHorario("21:30 as 23:30");
            sabado5.setValorDaMensalidade(0);

            Grupo domingo1 = new Grupo();
            domingo1.setNome("domingo1");
            domingo1.setSemana("Domingo");
            domingo1.setHorario("7:00 as 9:00");
            domingo1.setValorDaMensalidade(0);

            Grupo domingo2 = new Grupo();
            domingo2.setNome("domingo2");
            domingo2.setSemana("Domingo");
            domingo2.setHorario("15:30 as 17:30");
            domingo2.setValorDaMensalidade(0);

            Grupo domingo3 = new Grupo();
            domingo3.setNome("domingo3");
            domingo3.setSemana("Domingo");
            domingo3.setHorario("15:30 as 17:30");
            domingo3.setValorDaMensalidade(0);

            Grupo domingo4 = new Grupo();
            domingo4.setNome("domingo4");
            domingo4.setSemana("Domingo");
            domingo4.setHorario("19:30 as 21:30");
            domingo4.setValorDaMensalidade(0);

            //segunda1 não existe
            listaDePeladas.add(segunda2);
            listaDePeladas.add(segunda3);
            //segunda4 não existe
            //terça1 = não existe
            listaDePeladas.add(terca2);
            listaDePeladas.add(terca3);
            listaDePeladas.add(terca4);
            //quarta1 nao existe
            listaDePeladas.add(quarta2);
            listaDePeladas.add(quarta3);
            listaDePeladas.add(quarta4);
            listaDePeladas.add(quinta1);
            listaDePeladas.add(quinta2);
            listaDePeladas.add(quinta3);
            //quinta4 = não existe
            listaDePeladas.add(sexta1);
            listaDePeladas.add(sexta2);
            listaDePeladas.add(sexta3);
            //sexta4 não existe
            listaDePeladas.add(sabado1);
            listaDePeladas.add(sabado2);
            listaDePeladas.add(sabado3);
            listaDePeladas.add(sabado4);
            listaDePeladas.add(sabado5);
            listaDePeladas.add(domingo1);
            listaDePeladas.add(domingo2);
            listaDePeladas.add(domingo3);
            listaDePeladas.add(domingo4);
        }

        Grupo timeDaBanca = new Grupo();
        timeDaBanca.setNome("Time da banca");
        timeDaBanca.setSemana("Terça e Quinta");
        timeDaBanca.setHorario("14:00 as 15:30");
        timeDaBanca.setValorDaMensalidade(800);

        Grupo escolinha = new Grupo();
        escolinha.setValorDaMensalidade(2200);

        int somaDasPeladas = 0;
        int aluguel = 3250;
        int salario = 1500;
        int energia = 200;
        int contador = 300;
        int internet = 65;
        int compraBola = 40;
        int gastoExtra = 0;
        int somaDosGastosMensal = (aluguel + salario + energia + contador + internet + compraBola + gastoExtra);

        for (Grupo listaDePelada : listaDePeladas) {
            somaDasPeladas += listaDePelada.getValorDaMensalidade();
        }

        boolean continuar = true;
        while (continuar){
            System.out.println("Escolha uma opção: ");
            System.out.println("1 - Lançar pagamento");
            System.out.println("2 - Consultar valor pago em um determinado mês");
            System.out.println("3 - Resumo financeiro");
            System.out.println("4 - Editar grupo");
            System.out.println("5 - Salvar e Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    // Lançar pagamento
                    System.out.println("Selecione um grupo para lançar o pagamento:");

                    for (int i = 0; i < listaDePeladas.size(); i++) {
                        System.out.println((i + 1) + ". " + listaDePeladas.get(i).getNome());
                    }

                    int grupoEscolhido = scanner.nextInt();
                    scanner.nextLine();

                    if (grupoEscolhido < 1 || grupoEscolhido > listaDePeladas.size()){
                        System.out.println("Opção invalida. Selecione um grupo válido.");
                        break;
                    }

                    Grupo grupoSelecionado = listaDePeladas.get(grupoEscolhido - 1);

                    System.out.print("Digite o valor recebido: ");
                    int valorRecebido = scanner.nextInt();
                    scanner.nextLine();

                    // Adicionar pagamento ao grupo com a data de hoje
                    Pagamentos pagamento = new Pagamentos(valorRecebido, LocalDate.now());
                    grupoSelecionado.adicionarPagamento(pagamento);

                    //Verificar se o mes vingente esta pago

                    if (grupoSelecionado.isMesVigentePago()) {
                        System.out.println("O grupo " + grupoSelecionado.getNome() + " pagou o mês vigente!");

                    }else {
                        System.out.println("Ainda faltam R$ " + grupoSelecionado.getValorFaltanteNoMesVigente() + " para o grupo " + grupoSelecionado.getNome() + " completar o pagamento do mês.");
                    }
                    System.out.println();
                    break;

                case 2:
                    // Consultar valor pago em um determinado mês
                    System.out.println("Selecione um grupo para consultar:");
                    for (int i = 0; i < listaDePeladas.size(); i++) {
                        System.out.println((i + 1) + ". " + listaDePeladas.get(i).getNome());
                    }

                    int grupoConsulta = scanner.nextInt();
                    Grupo grupoConsultado = listaDePeladas.get(grupoConsulta - 1);

                    // Solicitar mês e ano para consulta
                    System.out.print("Digite o ano (ex: 2024): ");
                    int ano = scanner.nextInt();
                    System.out.print("Digite o mês (ex: 9 para setembro): ");
                    int mes = scanner.nextInt();

                    // Criar o YearMonth correspondente
                    YearMonth mesConsulta = YearMonth.of(ano, mes);

                    // Obter o valor total pago no mês consultado
                    int totalPagoNoMes = grupoConsultado.getTotalPagoNoMes(mesConsulta);
                    System.out.println("O valor total pago no mês " + mesConsulta + " é: " + totalPagoNoMes);

                    //verificar saldo excedente para o mês
                    int saldoExcedente = grupoConsultado.getSaldoExcedenteNoMes(mesConsulta);
                    if (saldoExcedente > 0){
                        System.out.println("Há um saldo excedente de " + saldoExcedente + " que será usado no proximo mês.");
                    }

                    // Verificar se o mês foi completamente pago
                    if (totalPagoNoMes >= grupoConsultado.getValorDaMensalidade()) {
                        System.out.println("O grupo " + grupoConsultado.getNome() + " já pagou o mês " + mesConsulta + "!");
                    } else {
                        System.out.println("Ainda faltam " + (grupoConsultado.getValorDaMensalidade() - (totalPagoNoMes + saldoExcedente)) + " para completar o pagamento do mês " + mesConsulta + ".");
                    }
                    System.out.println();
                    break;

                case 3:
                    System.out.println("Total do valor das peladas R$ " + somaDasPeladas);
                    System.out.println();
                    System.out.println("Valor da escolinha R$ " + escolinha.getValorDaMensalidade());
                    System.out.println();
                    System.out.println("Valor do time da banca R$ " + timeDaBanca.getValorDaMensalidade());
                    System.out.println();
                    System.out.println("Total de valor a receber R$ " + (somaDasPeladas + escolinha.getValorDaMensalidade() + timeDaBanca.getValorDaMensalidade()));
                    System.out.println();
                    System.out.println("Total dos gastos R$ " + somaDosGastosMensal);
                    System.out.println();
                    System.out.println("Lucro liquido R$ " + ((somaDasPeladas + escolinha.getValorDaMensalidade() + timeDaBanca.getValorDaMensalidade()) - somaDosGastosMensal));
                    System.out.println();
                    break;

                case 4:
                    // Editar grupo
                    System.out.println("Selecione o grupo para editar");

                    // Exibe a lista de grupos
                    for (int i = 0; i < listaDePeladas.size(); i++) {
                        System.out.println((i + 1) + ", " + listaDePeladas.get(i).getNome());
                    }

                    int grupoParaEdicao = scanner.nextInt();
                    scanner.nextLine();

                    // Verificar se a escolha é valida
                    if (grupoParaEdicao < 1 || grupoParaEdicao > listaDePeladas.size()){
                        System.out.println("Opção invalida. Selecione um grupo válido.");
                        break;
                    }

                    // Localiza o grupo selecionado
                    //Grupo grupoParaEditar = listaDePeladas.get(grupoParaEdicao - 1);
                    Grupo grupoEditado = listaDePeladas.get(grupoParaEdicao - 1);

                    // Modificar o nome e o valor da mensalidade
                    System.out.println("Digite o novo nome do grupo");
                    String novoNome = scanner.nextLine();
                    grupoEditado.setNome(novoNome);

                    System.out.println("Digite o novo valor da mensalidade");
                    int novoValorDaMensalidade = scanner.nextInt();
                    grupoEditado.setValorDaMensalidade(novoValorDaMensalidade);
                    scanner.nextLine();

                    System.out.println("Grupo atualizado: " + grupoEditado.getNome() + " com mensalidade de: " + grupoEditado.getValorDaMensalidade());

                    // Persistir as alterações no banco de dados (opcional, mas importante)
                    persistencia.salvarDados(listaDePeladas);

                    // Recarregar a lista a partir do banco de dados
                    listaDePeladas = new ArrayList<>(persistencia.carregarDados());

                    System.out.println("Dados recarregados e sincronizados com o banco de dados.");

                    break;

                case 5:
                    //para salvar os dados ao sair
                    persistencia.salvarDados(listaDePeladas);
                    continuar = false;
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}