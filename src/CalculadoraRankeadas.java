import java.util.Scanner;

public class CalculadoraRankeadas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("digite o número de vitórias:");
        int vitorias = sc.nextInt(); //
        System.out.println("digite o número de derrotas:");
        int derrotas = sc.nextInt(); //

        String nivel = calcularNivelRankeadas(vitorias, derrotas);

        System.out.println("O Herói tem saldo de " + (vitorias - derrotas) + " e está no Rank " + nivel);
    }

    public static String calcularNivelRankeadas(int vitorias, int derrotas) {
        int saldo = vitorias - derrotas;

        String[] niveis = {"Ferro", "Bronze", "Prata", "Ouro", "Diamante", "Lendário", "Imortal"};
        int[] inicio = {0, 11, 21, 51, 81, 91, 101};
        int[] fim = {10, 20, 50, 80, 90, 100, Integer.MAX_VALUE};

        for (int i = 0; i < niveis.length; i++) {
            if (saldo >= inicio[i] && saldo <= fim[i]) {
                return niveis[i];
            }
        }

        return "Imortal"; // Se o saldo for maior ou igual a 101
    }
}
