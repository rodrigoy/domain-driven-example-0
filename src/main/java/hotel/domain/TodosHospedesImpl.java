package hotel.domain;

import java.util.List;

import javax.persistence.EntityManager;

import com.google.inject.Inject;
import com.google.inject.Provider;

public class TodosHospedesImpl implements TodosHospedes {

	@Inject
	Provider<EntityManager> provider;
	
	@SuppressWarnings("unchecked")
	public List<Hospede> getPorParteNome(String parteNome) {
		return provider.get()
			.createQuery("from Hospede where upper(nome) like :parteNome")
			.setParameter("parteNome", parteNome.toUpperCase())
			.getResultList();
	}

	public Hospede get(Long id) {
		return provider.get().find(Hospede.class, id);
	}

	public void add(Hospede hospede) {
		provider.get().persist(hospede);		
	}

}
