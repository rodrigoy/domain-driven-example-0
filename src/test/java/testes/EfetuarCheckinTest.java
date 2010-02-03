package testes;

import hotel.application.EfetuarCheckinFacade;
import hotel.domain.Reserva;
import hotel.infra.TestModule;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.google.inject.Injector;

public class EfetuarCheckinTest {
	
	EfetuarCheckinFacade facade;
	
	@Before
	public void setUp() throws Exception {
		Injector inj = TestModule.getInjector();
		facade = inj.getInstance(EfetuarCheckinFacade.class);
	}
	
	@Test
	public void deveExibirUmaListaReservaDadoNome() {
		
		String parteNome = "%Nils%";
		List<Reserva> lista = facade.getListaReservas(parteNome);
		Assert.assertEquals(2L, lista.size());
		
	}

}
