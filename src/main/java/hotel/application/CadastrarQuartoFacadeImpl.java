package hotel.application;

import hotel.domain.Categoria;
import hotel.domain.Quarto;
import hotel.domain.TodosQuartos;

import java.util.List;

import javax.persistence.EntityManager;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.wideplay.warp.persist.Transactional;

public class CadastrarQuartoFacadeImpl implements CadastrarQuartoFacade {

	@Inject Provider<EntityManager> provider;
	@Inject TodosQuartos todosQuartos; 
	
	@Transactional
	public List<Quarto> listar() {
		return todosQuartos.list();
	}

	@Transactional
	public Quarto get(Long id) {
		return todosQuartos.get(id);
	}

	@Transactional
	public Quarto update(Long id, String numero, Long categoriaId) {
		Quarto quarto = todosQuartos.get(id);
		
		//Este é um exemplo da camada de aplicação dependendo da camada de acesso a dados
		Categoria categoria = provider.get().find(Categoria.class, categoriaId);
		
		quarto.setNumero(numero);
		quarto.setCategoria(categoria);
		return quarto;
	}

	@Transactional
	public Quarto create(String numero, Long categoriaId) {
		
		Quarto quartoNew = new Quarto();
		Categoria categoria = provider.get().find(Categoria.class, categoriaId);
		quartoNew.setNumero(numero);
		quartoNew.setCategoria(categoria);
		
		todosQuartos.add(quartoNew);
		
		return quartoNew;
	}
	
	@Transactional
	public void delete (Long id) {
		Quarto quarto = todosQuartos.get(id);
		todosQuartos.remove(quarto);
	}

}
