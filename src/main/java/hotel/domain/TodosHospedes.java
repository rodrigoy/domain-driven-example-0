package hotel.domain;

import java.util.List;

public interface TodosHospedes {

	List<Hospede> getPorParteNome(String parteNome);

	Hospede get(Long hospedeId);

	void add(Hospede hospede);

}
