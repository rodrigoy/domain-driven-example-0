package hotel.application;

import hotel.domain.Reserva;

import java.util.List;

public interface EfetuarCheckinFacade {

	List<Reserva> getListaReservas(String parteNome);

	Reserva efetuarCheckin(Long reservaId) throws Exception;

}
