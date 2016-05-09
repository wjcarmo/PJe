package tjmg.pje.Integracao.RegraDeNegocio.JUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import tjmg.pje.Interface.Usuario.WebDriver.ClsPaginaInclusaoDeUmProcesso;
import tjmg.pje.Interface.Usuario.WebDriver.ClsPaginaValidaLoginPJE;

public class ClsTestaOpcaoDoMenuProcesso
{		 
	protected String recebeCPFCNPJAdvogado   = "62163250350"; 
	protected String recebeSenha="tjmg";
	protected String recebeSite = "http://pjetreina.tjmg.jus.br/pje/login.seam?loginComCertificado=true";
	protected String retornaMensagem = "";
	private WebDriver driver;
	ClsTestaPaginaDeLoginPJE login;
	
	
	@BeforeClass 
	public void inicializarDriver() throws Exception 
	{ 
		 driver = new  FirefoxDriver();  
	}
	
	@AfterClass 
	public void fecharDriver() 
	{
		if (null != driver) 
		     { 
			     driver.quit(); 
			 }
		}
	
  @Test
  public void mTestaProcessoRotinaDeIncluirUmNovoProcesso() throws InterruptedException
  {
		
	ClsPaginaValidaLoginPJE login = new ClsPaginaValidaLoginPJE(driver); 
	login.setSiteParamentro(recebeSite);
	login.preencherCPFCNPJ(recebeCPFCNPJAdvogado);
	login.preencherSenha(recebeSenha);
	login.clickBotaoEntrar();
	
	ClsPaginaInclusaoDeUmProcesso IncluirProcesso = new ClsPaginaInclusaoDeUmProcesso();
	
	Thread.sleep(5000);
		
	IncluirProcesso.BotaoMenuIncluirProcesso();
	IncluirProcesso.BotaoMenuIncluirNovoProcesso();
	IncluirProcesso.SelectSecao("Belo Horizonte");
	IncluirProcesso.SelectClasseJudicial("DESPEJO (92)");
	IncluirProcesso.BotaoSalvarNovoProcesso();
		

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
