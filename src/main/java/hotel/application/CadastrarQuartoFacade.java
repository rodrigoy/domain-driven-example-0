package hotel.application;

import hotel.domain.Quarto;

import java.util.List;

public interface CadastrarQuartoFacade {

	List<Quarto> listar();

	Quarto get(Long id);

	Quarto update(Long id, String numero, Long categoriaId);

	public Quarto create(String numero, Long categoriaId);

	void delete(Long id);
	
}
