import java.util.List;

import br.com.fabricadeprogramador.dao.ClienteDAO;
import br.com.fabricadeprogramador.entidade.Cliente;

public class TestClieteDAO {

	static ClienteDAO clienteDAO = new ClienteDAO();

	public static void main(String[] args) {

		testSalvar();
		//testBuscarPorId();
		//testAlterar();
		//testBuscarTodos();
		//testBuscarTodos2();

	}

	public static void testSalvar() {

		clienteDAO.salvar(new Cliente("romeu", "777.777.77-77", "3232.626."));
		System.out.println("Salvo com sucesso!");

	}

	public static void testBuscarPorId() {

		Cliente cliBuscado = clienteDAO.buscarPorId(1);
		System.out.println(cliBuscado.getId() + " " + cliBuscado.getNome());

	}

	public static void testAlterar() {
		Cliente cliBuscado = clienteDAO.buscarPorId(1);
		cliBuscado.setNome("Zé");
		clienteDAO.salvar(cliBuscado);
	}

	public static void testBuscarTodos(){
		List<Cliente> buscarTodos = clienteDAO.buscarTodos();
		for(Cliente c: buscarTodos){
			System.out.println(c.getId()+ " " + c.getNome());
		}
	}
	
	public static void testBuscarTodos2(){
		List<Object[]> buscarTodos = clienteDAO.buscarTodos2();
		for(Object[] c: buscarTodos){
			System.out.println(c[0]+ " " + c[1]);
		}
	}
	
	
	public static void testExcluir() {
		Cliente cliBuscado = clienteDAO.buscarPorId(1);
		clienteDAO.excluir(cliBuscado);
	}
}