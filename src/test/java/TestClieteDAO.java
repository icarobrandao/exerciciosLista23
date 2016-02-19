import br.com.fabricadeprogramador.dao.ClienteDAO;
import br.com.fabricadeprogramador.entidade.Cliente;

public class TestClieteDAO {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setNome("maria");
		cliente.setCpf("777.777.777-77");
		cliente.setRg("777.777.777-77");
		
		ClienteDAO clienteDAO= new ClienteDAO();
		clienteDAO.excluir(cliente);
		System.out.println("Salvo com sucesso!");
	}

	
	public static void salvar(){
		Cliente cliente = new Cliente();
		cliente.setNome("maria");
		cliente.setCpf("777.777.777-77");
		cliente.setRg("777.777.777-77");
		
		ClienteDAO clienteDAO= new ClienteDAO();
		clienteDAO.salvar(cliente);
		System.out.println("Salvo com sucesso!");
	}
}
