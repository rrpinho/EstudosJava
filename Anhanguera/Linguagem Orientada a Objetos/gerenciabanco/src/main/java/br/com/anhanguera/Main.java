package br.com.anhanguera;
//Aluno: Rafael Pinho de Sousa Ribeiro
//Portifólio de Linguagem Orientada a Objetos

public class Main {
    public static void main(String[] args) {
        // Classe para armazenar dados pessoais e operações bancárias
        class ContaBancaria {
            private String nome;
            private String sobrenome;
            private String cpf;
            private double saldo;

            // Construtor
            public ContaBancaria(String nome, String sobrenome, String cpf) {
                this.nome = nome;
                this.sobrenome = sobrenome;
                this.cpf = cpf;
                this.saldo = 0.0; // Inicializa o saldo como zero
            }

            // Método para exibir o saldo atual
            public void consultarSaldo() {
                System.out.println("Saldo atual: R$" + saldo);
            }

            // Método para realizar um depósito
            public void depositar(double valor) {
                if (valor > 0) {
                    saldo += valor;
                    System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
                    consultarSaldo(); // Exibe o saldo após o depósito
                } else {
                    System.out.println("Valor inválido para depósito.");
                }
            }

            // Método para realizar um saque
            public void sacar(double valor) {
                if (valor > 0 && saldo >= valor) {
                    saldo -= valor;
                    System.out.println("Saque de R$" + valor + " realizado com sucesso.");
                    consultarSaldo(); // Exibe o saldo após o saque
                } else {
                    System.out.println("Saldo insuficiente para realizar o saque.");
                }
            }
        }

        public class GerenciaBanco {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.println("Bem-vindo ao Gerenciador Bancário!");

                // Solicita informações pessoais ao usuário
                System.out.print("Informe seu nome: ");
                String nome = scanner.nextLine();
                System.out.print("Informe seu sobrenome: ");
                String sobrenome = scanner.nextLine();
                System.out.print("Informe seu CPF: ");
                String cpf = scanner.nextLine();

                // Cria uma nova conta bancária com os dados fornecidos
                ContaBancaria conta = new ContaBancaria(nome, sobrenome, cpf);

                int opcao;
                do {
                    // Exibe o menu de opções
                    exibirMenu();
                    System.out.print("Escolha uma opção: ");
                    opcao = scanner.nextInt();

                    switch (opcao) {
                        case 1:
                            conta.consultarSaldo();
                            break;
                        case 2:
                            System.out.print("Digite o valor do depósito: ");
                            double valorDeposito = scanner.nextDouble();
                            conta.depositar(valorDeposito);
                            break;
                        case 3:
                            System.out.print("Digite o valor do saque: ");
                            double valorSaque = scanner.nextDouble();
                            conta.sacar(valorSaque);
                            break;
                        case 4:
                            System.out.println("Encerrando o Gerenciador Bancário. Obrigado!");
                            break;
                        default:
                            System.out.println("Opção inválida. Tente novamente.");
                            break;
                    }
                } while (opcao != 4);

                scanner.close();
            }

            // Método para exibir o menu de opções
            private static void exibirMenu() {
                System.out.println("\n---- Menu ----");
                System.out.println("1. Consultar Saldo");
                System.out.println("2. Realizar Depósito");
                System.out.println("3. Realizar Saque");
                System.out.println("4. Encerrar");
            }
        }
    }
}