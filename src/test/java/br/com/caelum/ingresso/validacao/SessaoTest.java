package br.com.caelum.ingresso.validacao;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalTime;

import org.junit.Assert;
import org.junit.Test;

import br.com.caelum.ingresso.model.Filme;
import br.com.caelum.ingresso.model.Sala;
import br.com.caelum.ingresso.model.Sessao;

public class SessaoTest {

	@Test
	public void oPrecoDaSessaoDeveSerIgualASomaDoPrecoDaSalaMaisOPrecoDoFilme(){
		
		Sala sala = new Sala("el dorado", new BigDecimal("22.5"));
		Filme filme = new Filme("roger oni", Duration.ofMinutes(120), "KJVIKD", new BigDecimal("12.0"));
		
		BigDecimal somaDosPrecosSalaEFilme = sala.getPreco().add(filme.getPreco());
		
		Sessao sessao = new Sessao(LocalTime.now(), filme, sala);
		
		Assert.assertEquals(somaDosPrecosSalaEFilme, sessao.getPreco());
	}
}
