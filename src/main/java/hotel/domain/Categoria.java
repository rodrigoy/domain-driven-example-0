package hotel.domain;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Categoria {
	
	@Id @GeneratedValue
	Long id;
	
	@Column (length=30, nullable=false, unique=true)
	String nome;
	
	@Column (nullable=false)
	BigDecimal precoDiaria;

	public String getNome() {
		return nome;
	}

	public BigDecimal getPrecoDiaria() {
		return precoDiaria;
	}

}
