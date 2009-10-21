package testes;


import java.math.BigDecimal;
import java.util.Calendar;

import hotel.domain.Hospede;
import hotel.domain.Quarto;
import hotel.domain.Reserva;
import hotel.infra.TestModule;

import javax.persistence.EntityManager;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.google.inject.Provider;

public class ReservaTest {

	Provider<EntityManager> provider;
	
	@Before
	public void setUp() throws Exception {
		provider = TestModule.getInjector().getProvider(EntityManager.class);
	}
	
	@Test
	public void deveCalcularValorDiarias() {
		Quarto quarto = provider.get().find(Quarto.class, 1L);
		Hospede hospede = provider.get().find(Hospede.class, 1L);
		
		Calendar checkin = Calendar.getInstance();
		Calendar checkout = Calendar.getInstance();
		checkout.add(Calendar.DAY_OF_MONTH, 2);
		
		Reserva reserva = new Reserva(hospede, quarto, checkin, checkout);
		
		Assert.assertEquals(new Long(2), reserva.getQuantDiarias());
		
		Assert.assertEquals(new BigDecimal(180D), reserva.getValorDiarias());
		
	}

}
