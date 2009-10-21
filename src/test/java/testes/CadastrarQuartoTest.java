package testes;

import hotel.application.CadastrarQuartoFacade;
import hotel.domain.Quarto;
import hotel.infra.TestModule;

import java.math.BigDecimal;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.google.inject.Injector;

/**
 * Esta é uma implementação exemplo do caso de uso CadastrarQuarto
 * Veja: import.sql
 * 
 * Os testes do sistema exemplo serão todos de integração, concentrados na Façade.
 * @author rodrigoy
 *
 */
public class CadastrarQuartoTest {
	
	CadastrarQuartoFacade facade;
	
	@Before
	public void setUp() throws Exception {
		Injector inj = TestModule.getInjector();
		facade = inj.getInstance(CadastrarQuartoFacade.class);
	}
	
	@Test
	public void deveExibirUmaListaComTodosOsQuartos () {
		List<Quarto> quartos = facade.listar();
		Assert.assertEquals(10, quartos.size());
		Assert.assertEquals(new BigDecimal(90D), quartos.get(0).getCategoria().getPrecoDiaria());
	}
	
	@Test
	public void deveRetornarUmUnicoQuarto () {
		Quarto quarto = facade.get(8L);
		Assert.assertEquals("2D", quarto.getNumero());
		Assert.assertEquals(new BigDecimal(140D), quarto.getCategoria().getPrecoDiaria());
	}
	
	@Test
	public void deveAlterarUmQuarto () {
		Quarto quartoUpd = facade.update(8L, "2D_", 1L);
		Assert.assertEquals("2D_", quartoUpd.getNumero());
		Assert.assertEquals(new BigDecimal(90D), quartoUpd.getCategoria().getPrecoDiaria());
	}
	
	@Test
	public void deveCriarUmQuarto() {
		Quarto quarto = facade.create("PRES3", 3L);
		Assert.assertNotNull(quarto.getId());
		Assert.assertEquals(new BigDecimal(340D), quarto.getCategoria().getPrecoDiaria());
	}
	
	@Test
	public void deveRemoverUmQuarto() {
		Long id = new Long(11);
		facade.delete(id);
	}

}
