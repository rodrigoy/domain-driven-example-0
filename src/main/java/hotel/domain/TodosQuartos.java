package hotel.domain;

import java.util.List;

public interface TodosQuartos {

	List<Quarto> list();

	Quarto get(Long id);

	void add(Quarto quartoNew);

	public void remove (Quarto quarto);
}
