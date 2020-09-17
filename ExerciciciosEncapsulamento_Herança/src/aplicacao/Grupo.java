package aplicacao;

import entidades.Administrador;
import entidades.Empregado;
import entidades.Fornecedor;
import entidades.Operario;
import entidades.Pessoa;
import entidades.Vendedor;

public class Grupo {

	public static void main(String[] args) {
		
				
		Pessoa integrantePessoa = new Pessoa("MARIA", "RUA XV", (981710081L));
		Fornecedor fornecedorLider = new Fornecedor("CARLOS", "Rua XV", (987655543L), 500, 100, 50);
		Empregado empregado = new Empregado("NOME", (987655900L), 9876);
		Administrador administrador = new Administrador("BRUNO", "RUA SETE", (872625527), 2000);
		Operario operario = new Operario ("RODRIGO", "RUA ALBA", (987654321), 5000, 1.8);
		Vendedor vendedora = new Vendedor ("DEBORAH", "RUA GOMES", (999821743), 200, 0.8);
		
		System.out.println("Seguem os dados de nossa integrante do grupo: ");
		System.out.println("Nome: " + integrantePessoa.getNome());
		System.out.println("Endereço: " + integrantePessoa.getEndereço());
		System.out.println("Telefone: " + integrantePessoa.getTelefone());
		
		System.out.println("");
		System.out.println("----------------------------------------------------------------------------");
		
				
		System.out.println("Seguem os dados de nosso fornecedor: \n");
		System.out.println("Nome: " + fornecedorLider.getNome());
		System.out.println("Endereço: " + fornecedorLider.getEndereço());
		System.out.println("Telefone: " + fornecedorLider.getTelefone());
		System.out.println("Saldo positivo: ");
		fornecedorLider.MostraSaldo();
		
		System.out.println("-----------------------------------------------------------------------------");
		
		System.out.println("Seguem os dados de nosso empregado: \n");
		empregado.setSalarioBase(1600);
		empregado.setImposto(250);
		System.out.println("Nome: " + empregado.getNome());
		System.out.println("Código: "+empregado.getCodigoSetor());
		System.out.println("Salário líquido: R$"+empregado.calcularSalario());
		
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("Seguem os dados de nosso administrador: \n");
		System.out.println("Nome: " + administrador.getNome());
		System.out.println("Endereço: "+ administrador.getEndereço());
		System.out.println("Telefone para contato: " + administrador.getTelefone());
		System.out.println("Valor de ajuda de custo restante: "+ administrador.getAjudaDeCusto());
		
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("Seguem os dados de nosso operario: \n");
		System.out.println("Nome: " + operario.getNome());
		System.out.println("Endereço: "+ operario.getEndereço());
		System.out.println("Telefone para contato: " + operario.getTelefone());
		System.out.println("Salário: "+ operario.calcularSalario());
		
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("Seguem os dados de nossa vendedora: \n");
		System.out.println("Nome: " + vendedora.getNome());
		System.out.println("Endereço: "+ vendedora.getEndereço());
		System.out.println("Telefone para contato: " + vendedora.getTelefone());
		System.out.println("Salário: "+ vendedora.calcularSalario());
	}

}
