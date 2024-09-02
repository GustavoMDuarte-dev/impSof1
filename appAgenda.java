import java.util.Scanner;

public class appAgenda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do usuario");
        String usuario = scanner.nextLine();
        System.out.println("Digite o ano da agenda");
        int ano = scanner.nextInt();
        scanner.nextLine();

        Agenda agenda = new Agenda(usuario, ano);

        while (true) {
            System.out.println("Digite o dia do compromisso (ou 0 para terminar): ");
            int dia = scanner.nextInt();
            if (dia == 0) {
                break;
            }

            System.out.println("Digite o mes do compromisso: ");
            int mes = scanner.nextInt();
            System.out.println("Digite a hora do compromisso: ");
            int hora = scanner.nextInt();
            scanner.nextLine(); 
            System.out.println("Digite a descricao do compromisso: ");
            String descricao = scanner.nextLine();

            Compromisso comp = new Compromisso(dia, mes, hora, descricao);
            agenda.addCompromisso(comp);
        }

        mostrarRelatorio(agenda);

        System.out.println("Digite o dia do compromisso a excluir:");
        int dia = scanner.nextInt();
        System.out.println("Digite o mes do compromisso a excluir:");
        int mes = scanner.nextInt();
        System.out.println("Digite a hora do compromisso a excluir:");
        int hora = scanner.nextInt();

        try {
            Compromisso compromisso = agenda.getCompromisso(dia, mes, hora);
            if (compromisso == null) {
                throw new CompromissoInexistente(dia, mes, ano);
            }
            agenda.delCompromisso(compromisso);
            System.out.println("Compromisso excluido com sucesso.");
        } catch (CompromissoInexistente e) {
            System.out.println(e);
        }

        mostrarRelatorio(agenda);

        scanner.close();
    }

    private static void mostrarRelatorio(Agenda agenda) {
        System.out.println("Agenda de compromissos\t\t\tAno: " + agenda.getAno());
        System.out.println("-----------------------------------------------------------");
        System.out.println("Data\t\tHora\t\tDescricao");
        System.out.println("-----------------------------------------------------------");
        for (Compromisso compromisso : agenda.getCompromissos()) {
            System.out.println(compromisso.getDia() + "/" + compromisso.getMes() + "\t\t" + compromisso.getHora() + "h\t\t" + compromisso.getDescricao());
        }
        System.out.println("-----------------------------------------------------------");
    }
}
