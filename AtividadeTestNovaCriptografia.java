import java.util.Scanner;

public class Main {

    public static void lerCpf(int[] c) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nInsira os 3 primeiros digitos do seu CPF: ");
        c[0] = scanner.nextInt();
        System.out.print("Próximos 3: ");
        c[1] = scanner.nextInt();
        System.out.print("Próximos 3: ");
        c[2] = scanner.nextInt();
        System.out.print("Últimos 2: ");
        c[3] = scanner.nextInt();
        scanner.nextLine(); // 
    }

    public static void lerRg(int[] c) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nInsira os 2 primeiros digitos do seu RG: ");
        c[0] = scanner.nextInt();
        System.out.print("Próximos 3: ");
        c[1] = scanner.nextInt();
        System.out.print("Próximos 3: ");
        c[2] = scanner.nextInt();
        System.out.print("Último: ");
        c[3] = scanner.nextInt();
        scanner.nextLine();
    }

    public static void lerData(int[] c) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nInsira o dia de seu nascimento: ");
        c[0] = scanner.nextInt();
        System.out.print("Insira o mês (em número): ");
        c[1] = scanner.nextInt();
        System.out.print("Insira os dois primeiros digitos do ano: ");
        c[2] = scanner.nextInt();
        System.out.print("Insira os últimos 2: ");
        c[3] = scanner.nextInt();
        scanner.nextLine(); 
    }

    public static void lerNome(int[] c) {
        Scanner scanner = new Scanner(System.in);
        char[] alfabeto = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        System.out.print("\nEscreva as 4 primeiras letras de seu nome: ");
        String nome = scanner.nextLine().toUpperCase();
        for (int i = 0; i < nome.length() && i < 4; i++) {
            for (int j = 0; j < alfabeto.length; j++) {
                if (nome.charAt(i) == alfabeto[j]) {
                    c[i] = j + 1;
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] c = new int[4];
        int[][] matriz = new int[4][4];

        for (int i = 0; i < 4; i++) {
            if (i == 0) lerCpf(c);
            if (i == 1) lerRg(c);
            if (i == 2) lerData(c);
            if (i == 3) lerNome(c);

            matriz[i][0] = c[0];
            matriz[i][1] = c[1];
            matriz[i][2] = c[2];
            matriz[i][3] = c[3];
        }

        System.out.println("\nMatriz 4x4 inserida:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEscolha a operação (soma ou subtracao): ");
        String operacao = scanner.nextLine();
        System.out.print("Escolha a direção (horizontal ou vertical): ");
        String direcao = scanner.nextLine();

        int resultado = 1; 

  
        if (operacao.equalsIgnoreCase("soma")) {
            if (direcao.equalsIgnoreCase("horizontal")) {
          
                for (int i = 0; i < 4; i++) {
                    int soma = 0;
                    for (int j = 0; j < 4; j++) {
                        soma += matriz[i][j]; 
                    }
                    resultado *= soma; 
                }
            } else if (direcao.equalsIgnoreCase("vertical")) {
               
                for (int j = 0; j < 4; j++) {
                    int soma = 0;
                    for (int i = 0; i < 4; i++) {
                        soma += matriz[i][j]; 
                    }
                    resultado *= soma; 
                }
            }
        } else if (operacao.equalsIgnoreCase("subtracao")) {
            if (direcao.equalsIgnoreCase("horizontal")) {
               
                for (int i = 0; i < 4; i++) {
                    int sub = matriz[i][0];
                    for (int j = 1; j < 4; j++) {
                        sub -= matriz[i][j]; 
                    }
                    resultado *= sub; 
                }
            } else if (direcao.equalsIgnoreCase("vertical")) {
                
                for (int j = 0; j < 4; j++) {
                    int sub = matriz[0][j];
                    for (int i = 1; i < 4; i++) {
                        sub -= matriz[i][j]; 
                    }
                    resultado *= sub; 
                }
            }
        }

        
        System.out.println("\nResultado final (senha): " + resultado);
    }
}