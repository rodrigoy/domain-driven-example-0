package testes;

import hotel.application.CadastrarHospedeFacade;
import hotel.domain.Hospede;
import hotel.infra.TestModule;
import hotel.util.CalendarUtils;

import java.util.Calendar;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.google.inject.Injector;


public class CadastrarHospedeTest {
	
	CadastrarHospedeFacade facade;
	
	@Before
	public void setUp() throws Exception {
		Injector inj = TestModule.getInjector();
		facade = inj.getInstance(CadastrarHospedeFacade.class);
	}
	
	@Test
	public void deveBuscarHospedePorParteNome() {
		//TODO: Buscar Hospede!
		Assert.assertEquals(2, hospedes.size());
	}
	
	@Test
	public void deveRetornarUmUnicoHospede() {
		//TODO: Retornar um único Hospede!
		Assert.assertEquals("Martin Fowler", hospede.getNome());
	}
	
	@Test 
	public void deveEditarUmHospede() {
		//TODO: Deve editar Hospede!
		Assert.assertEquals("Martin R. Fowler", hospedeUpd.getNome());
	}
	
	@Test
	public void deveCriarUmHospede() {
		//TODO: Deve criar um Hospede!
		Assert.assertEquals("Grady Booch", hospedeNew.getNome());
	}
}
