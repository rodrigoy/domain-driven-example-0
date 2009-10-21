package hotel.infra;

import hotel.application.CadastrarQuartoFacade;
import hotel.application.CadastrarQuartoFacadeImpl;
import hotel.domain.TodosQuartos;
import hotel.domain.TodosQuartosImpl;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;
import com.wideplay.warp.jpa.JpaUnit;
import com.wideplay.warp.persist.PersistenceService;
import com.wideplay.warp.persist.UnitOfWork;

/**
 * Classe para obter referências e configurar o injetor de dependências
 * @author rodrigoy
 *
 */
public class TestModule extends AbstractModule {

	static Injector inj;

	@Override
	protected void configure() {
		bindConstant().annotatedWith(JpaUnit.class).to("default");
		bind(CadastrarQuartoFacade.class).to(CadastrarQuartoFacadeImpl.class);
		bind(TodosQuartos.class).to(TodosQuartosImpl.class);
		
		//TODO: Ative a linha abaixo para injetar o repositório
		//bind(TodosHospedes.class).to(TodosHospedesImpl.class);
	}

	public static Injector getInjector() {

		if (inj == null) {
			inj = Guice.createInjector(new Module[] {
					new TestModule(),
					PersistenceService.usingJpa()
							.across(UnitOfWork.TRANSACTION).buildModule() });
			inj.getInstance(JpaInitializer.class);
		}

		return inj;
	}

}
