package br.com.tjmg.pje.TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import br.com.tjmg.pje.paginas.ClsPaginaInclusaoDeUmProcesso;
import br.com.tjmg.pje.paginas.ClsPaginaValidaLoginPJE;

public class ClsTestaOpcaoDoMenuProcesso
{		 
	protected String recebeCPFCNPJAdvogado   = "62163250350"; 
	protected String recebeSenha="tjmg";
	protected String recebeSite = "http://pjetreina.tjmg.jus.br/pje/login.seam?loginComCertificado=true";
	protected String retornaMensagem = "";
	private WebDriver driver;
	ClsTestaPaginaDeLoginPJE login;
	
	
	
  @Test
  public void mTestaProcessoRotinaDeIncluirUmNovoProcesso()
  {
		
	ClsPaginaInclusaoDeUmProcesso IncluirProcesso = new ClsPaginaInclusaoDeUmProcesso();
	
	IncluirProcesso.ClsPaginaInclusaoDeUmProcesso();
	
		/*	
		//Entrada de dados para teste
		String msg = paginaDeLogin.getSelectUsuarioLogado();
		paginaDeLogin.setRecebeCPFCNPJ(recebeCPFCNPJAssessor);
		paginaDeLogin.setRecebeSenha(recebeSenha);
		paginaDeLogin.setRecebeSite(recebeSite);
		*/
		
		

  }  
  
  @Test
  public void mTestaProcessoRotinaDeIncluirUmNovoProcessoIncidental()
  {

  }
  

  @Test
  public void mTestaProcessoRotinaDeProcessoNaoProtocolado()
  {

  }
  
  
}
