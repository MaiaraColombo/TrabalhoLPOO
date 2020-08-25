
import java.util.Scanner;

public class MenuPrincipal {
	Scanner input = new Scanner(System.in);
	private Cliente cliente;
	private Fornecedor fornecedor;
	private Funcionario funcionario;
	private Pagar pagar;
	private Receber receber;
	int x, y;
	int z = 2;
	int i, j, k;

	public MenuPrincipal() {
		cliente = null;
		fornecedor = null;
		funcionario = null;
		pagar = null;
		receber = null;
	}

	public void menu() {
		cliente = new Cliente();
		fornecedor = new Fornecedor();
		funcionario = new Funcionario();
		pagar = new Pagar();
		receber = new Receber();

		do {
			System.out.println("-----------------------");
			System.out.println(" Bem vindo! ");
			System.out.println(" MENU ");
			System.out.println("-----------------------");
			System.out.println(" ");
			System.out.println("1 - Cliente");
			System.out.println(" ");
			System.out.println("2 - Fornecedor");
			System.out.println(" ");
			System.out.println("3 - Funcionário");
			System.out.println(" ");
			System.out.println("4 - Receber");
			System.out.println(" ");
			System.out.println("5 - Pagar");
			System.out.println(" ");
			System.out.println("6 - Fluxo de caixa");
			System.out.println(" ");
			System.out.println("7 - Sair");
			System.out.println(" ");
			System.out.println("-------------------------");
			System.out.printf(" Escolha uma opção: ");
			x = input.nextInt();
			System.out.println("-------------------------");
			System.out.println(" ");

			switch (x) {
			case 1:
				y = submenu();
				switch (y) {
				case 1:
					if (i == 1) {
						System.out.println("--------------------------------");
						System.out.println("Um cliente ja foi cadastrado!");
						System.out.println("--------------------------------");
					} else {
						cliente.entrar();
						System.out.println("    ");
						i++;
					}
					break;

				case 2:
					if (i == 0) {
						System.out.println("---------------------------------");
						System.out.println("Um cliente precisa ser cadastrado!");
						System.out.println("---------------------------------");
						continue;
					} else {
						cliente.entrar();
						System.out.println("    ");

					}
					break;

				case 3:
					if (i == 0) {
						System.out.println("---------------------------------");
						System.out.println("Um cliente precisa ser cadastrado!");
						System.out.println("---------------------------------");

					} else {
						cliente.imprimir();
					}
					System.out.println("    ");
					break;

				case 4:
					cliente.excluir();
					System.out.println("    ");
					i--;
					break;

				default:
					System.out.println("Opção inválida!");
					break;

				}

				break;

			case 2:

				y = submenu();
				switch (y) {
				case 1:
					if (j == 1) {
						System.out.println("---------------------------------");
						System.out.println("Fornecedor já foi cadastrado!");
						System.out.println("---------------------------------");
					} else {
						fornecedor.entrar();
						System.out.println("    ");
						j++;
					}
					break;

				case 2:
					if (j == 0) {
						System.out.println("---------------------------------");
						System.out.println("Fornecedor precisa ser cadastrado!");
						System.out.println("---------------------------------");
					} else {
						fornecedor.entrar();
						System.out.println("    ");
					}
					break;
				case 3:
					if (j == 0) {
						System.out.println("---------------------------------");
						System.out.println("Fornecedor precisa ser cadastrado!");
						System.out.println("---------------------------------");
					}

					else {
						fornecedor.imprimir();
					}
					System.out.println("    ");
					break;

				case 4:
					fornecedor.excluir();
					System.out.println("    ");
					j--;
					break;

				default:
					System.out.println("Opção inválida!");
					break;
				}
				break;

			case 3:
				y = submenu();
				switch (y) {
				case 1:
					if (k == 1) {
						System.out.println("---------------------------------");
						System.out.println("Algum funcionário já foi cadastrado!");
						System.out.println("---------------------------------");
					} else {
						funcionario.entrar();
						System.out.println("    ");
						k++;
					}
					break;

				case 2:
					if (k == 0) {
						System.out.println("---------------------------------");
						System.out.println("Algum funcionário precisa ser cadastrado!");
						System.out.println("---------------------------------");
					} else {
						funcionario.entrar();
						System.out.println("    ");
					}

				case 3:
					if (k == 0) {
						System.out.println("---------------------------------");
						System.out.println("Algum funcionário precisa ser cadastrado!");
						System.out.println("---------------------------------");
					}

					else {
						funcionario.imprimir();
					}
					System.out.println("    ");
					break;

				case 4:
					funcionario.excluir();
					System.out.println("    ");
					k--;
					break;

				default:
					System.out.println("Opção Inválida!");
					break;
				}
				break;

			case 4:
				y = submenu();
				switch (y) {
				case 1:

					receber.entrar();
					System.out.println("    ");
					break;

				case 2:
					receber.entrar();
					System.out.println("    ");
					break;

				case 3:
					receber.imprimir();
					System.out.println("    ");
					break;

				case 4:
					receber.excluir();
					System.out.println("    ");
					break;

				default:
					System.out.println("Opção inválida!");
					break;

				}
				break;

			case 5:
				y = submenu();
				switch (y) {
				case 1:

					pagar.entrar();
					System.out.println("    ");
					break;

				case 2:
					pagar.entrar();
					System.out.println("    ");
					break;

				case 3:
					pagar.imprimir();
					System.out.println("    ");
					break;

				case 4:
					pagar.excluir();
					System.out.println("    ");
					break;

				default:
					System.out.println("Opção inválida!");
					break;

				}
				break;

			case 6:
				if (receber.getTotal() != 0 || pagar.getTotal() != 0) {
					fluxodecaixa();

					break;
				} else {
					System.out.println("Fluxo de caixa indisponivel  ");
					break;
				}

			case 7:
				i = 0;
				break;

			default:
				i = 0;
				break;

			}
		} while (z > 1);
	}

	public int submenu() {
		System.out.println("    ");
		System.out.println("-------------------------");
		System.out.println("  O que deseja fazer?:");
		System.out.println("-------------------------");
		System.out.println(" ");
		System.out.println("1-Incluir");
		System.out.println(" ");
		System.out.println("2-Alterar");
		System.out.println(" ");
		System.out.println("3-Exibir");
		System.out.println(" ");
		System.out.println("4-Excluir");
		System.out.println(" ");

		System.out.print("Escolha uma opção:  ");
		y = input.nextInt();
		System.out.println(" ");

		return y;
	}

	public void fluxodecaixa() {
		System.out.println("Tipo do financeiro              Vencimento         Valor          Saldo ");
		System.out.println(" ");
		System.out.println("Receber                         " + receber.getVencimento() + "            "
				+ receber.calcular() + "         " + receber.calcular());
		System.out.println(" ");
		System.out.println("Pagar                           " + pagar.getVencimento() + "              "
				+ pagar.calcular() + "         " + (receber.calcular() - pagar.calcular()));
		System.out.println(" ");
		System.out.println(
				"                                          Saldo total:  " + (receber.calcular() - pagar.calcular()));
	}

	public static void main(String[] args) {

		MenuPrincipal obj = new MenuPrincipal();
		obj.menu();
	}

}
