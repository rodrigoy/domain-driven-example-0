package hotel.domain;

import java.util.List;

import javax.persistence.EntityManager;

import com.google.inject.Inject;
import com.google.inject.Provider;


public class TodosQuartosImpl implements TodosQuartos {

	@Inject Provider<EntityManager> provider;
	
	@SuppressWarnings("unchecked")
	public List<Quarto> list() {
		return provider.get().createQuery("from Quarto").getResultList();
	}

	public Quarto get(Long quartoId) {
		return provider.get().find(Quarto.class, quartoId);
	}

	public void add(Quarto quartoNew) {
		provider.get().persist(quartoNew);
	}
	
	public void remove (Quarto quarto) {
		provider.get().remove(quarto);
	}

}
