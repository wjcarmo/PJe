package tjmg.pje.Integracao.RegraDeNegocio.JUnit;

import static org.testng.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.junit.Ignore;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
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
	 
	  private String baseUrl;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();

	
	
	@BeforeClass 
	public void inicializarDriver() throws Exception 
	{  
		 driver = new FirefoxDriver();
		    baseUrl = "http://pjetreina.tjmg.jus.br/pje/login.seam?loginComCertificado=true";
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    
	}
	
	@AfterClass
	public void fecharDriver() 
	{
		if (null != driver) 
		     { 
			     driver.quit(); 
			 }
		}
	 
	@AfterClass(alwaysRun = true)
     public void tearDown() throws Exception {

	    driver.quit();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
	  }
	
	 private boolean isElementPresent(By by) {
		    try {
		      driver.findElement(by);
		      return true;
		    } catch (NoSuchElementException e) {
		      return false;
		    }
		  }

		  private boolean isAlertPresent() {
		    try {
		      driver.switchTo().alert();
		      return true;
		    } catch (NoAlertPresentException e) {
		      return false;
		    }
		  }

		  private String closeAlertAndGetItsText() {
		    try {
		      Alert alert = driver.switchTo().alert();
		      String alertText = alert.getText();
		      if (acceptNextAlert) {
		        alert.accept();
		      } else {
		        alert.dismiss();
		      }
		      return alertText;
		    } finally {
		      acceptNextAlert = true;
		    }
		  }
		  
	
  @Test
  public void mTestaProcessoRotinaDeIncluirUmNovoProcesso() throws InterruptedException
  {
		
	    driver.get(baseUrl + "/pje/login.seam?loginComCertificado=false");
	    driver.findElement(By.id("username")).clear();
	    driver.findElement(By.id("username")).sendKeys("25555553072");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("tjmg");
	    driver.findElement(By.id("btnEntrar")).click();
	    driver.findElement(By.id("_1010_j_id83j_id84")).click();
	    driver.findElement(By.id("_1011_j_id83j_id85")).click();
	    
	    
	    driver.findElement(By.id("processoTrfForm:classeJudicial:classeJudicialjurisdicaoComboDecoration:classeJudicialjurisdicaoCombo")).click();
	    new Select(driver.findElement(By.id("processoTrfForm:classeJudicial:classeJudicialjurisdicaoComboDecoration:classeJudicialjurisdicaoCombo"))).selectByVisibleText("Belo Horizonte");
	    driver.findElement(By.cssSelector("option[value=\"7\"]")).click();
	    driver.findElement(By.id("processoTrfForm:classeJudicial:classeJudicialComboClasseJudicialDecoration:classeJudicialComboClasseJudicial")).click();
	    new Select(driver.findElement(By.id("processoTrfForm:classeJudicial:classeJudicialComboClasseJudicialDecoration:classeJudicialComboClasseJudicial"))).selectByVisibleText("DESPEJO (92)");
	    driver.findElement(By.cssSelector("option[value=\"9\"]")).click();	    
	    driver.findElement(By.id("processoTrfForm:save")).click();
	    for (int second = 0;; second++) {
	    	if (second >= 60) fail("timeout");
	    	try { if (isElementPresent(By.cssSelector("img[title=\"Adicionar\"]"))) break; } catch (Exception e) {}
	    	Thread.sleep(10000);
	    }
	    
	    driver.findElement(By.id("processoTrfForm:save")).click();
	     
	    	    
	    driver.findElement(By.cssSelector("img[title=\"Adicionar\"]")).click();
	    driver.findElement(By.cssSelector("img[title=\"Adicionar\"]")).click();
	    driver.findElement(By.cssSelector("#titleabaAssuntoMsg > img")).click();
	    driver.findElement(By.id("tabPartes_lbl")).click();
	    driver.findElement(By.id("formVincularPoloAtivo:oplAddParteA")).click();
	    driver.findElement(By.id("preCadastroPessoaFisicaForm:pesquisarDocumentoPrincipal")).click();
	    driver.findElement(By.id("preCadastroPessoaFisicaForm:btnConfirmarCadastro")).click();
	    driver.findElement(By.id("formInserirParteProcesso:enderecoUsuario_lbl")).click();
	    driver.findElement(By.xpath("//a[@id='formInserirParteProcesso:cadastroPartePessoaEnderecoenderecoGridTabList:4:j_id4356:j_id4358:j_id4359']/img")).click();
	    driver.findElement(By.id("formInserirParteProcesso:btnInserirParteProcesso")).click();
	    driver.findElement(By.xpath("(//td[@onclick=\"showLoading();A4J.AJAX.Submit('formVincularPoloPassivo',event,{'oncomplete':function(request,event,data){mostrarModalVinculacaoParteProcesso();},'similarityGroupingId':'formVincularPoloPassivo:supResetarVincPartePP','parameters':{'formVincularPoloPassivo:supResetarVincPartePP':'formVincularPoloPassivo:supResetarVincPartePP'} ,'containerId':'regionPartes'} )\"])[2]")).click();
	    driver.findElement(By.id("preCadastroPessoaFisicaForm:pesquisarDocumentoPrincipal")).click();
	    driver.findElement(By.id("preCadastroPessoaFisicaForm:btnConfirmarCadastro")).click();
	    driver.findElement(By.id("formInserirParteProcesso:enderecoUsuario_lbl")).click();
	    driver.findElement(By.xpath("//a[@id='formInserirParteProcesso:cadastroPartePessoaEnderecoenderecoGridTabList:4:j_id11557:j_id11559:j_id11560']/img")).click();
	    driver.findElement(By.id("formInserirParteProcesso:btnInserirParteProcesso")).click();
	    driver.findElement(By.id("novoAnexo_lbl")).click();
	    driver.findElement(By.id("j_id822")).click();
	    driver.findElement(By.id("informativo_lbl")).click();
	    driver.findElement(By.id("formBotoesAcao:btnProtocolar")).click();
	    
	    
	  /*
	  
	  ClsPaginaValidaLoginPJE login = new ClsPaginaValidaLoginPJE(driver); 
	
	login.setSiteParamentro(recebeSite);
	login.preencherCPFCNPJ(recebeCPFCNPJAdvogado);
	login.preencherSenha(recebeSenha);
	login.clickBotaoEntrar();
	
	ClsPaginaInclusaoDeUmProcesso IncluirProcesso = new ClsPaginaInclusaoDeUmProcesso(driver);
	
	Thread.sleep(5000);
	
	//IncluirProcesso.pagina();
	 //driver.get(baseUrl + "/pje/login.seam?loginComCertificado=false");
	IncluirProcesso.BotaoMenuIncluirProcesso();
	IncluirProcesso.BotaoMenuIncluirNovoProcesso();
	IncluirProcesso.SelectSecao("Belo Horizonte");
	IncluirProcesso.SelectClasseJudicial("DESPEJO (92)");
	IncluirProcesso.BotaoSalvarNovoProcesso();
	*/
		

  }  
  
  @Ignore
  public void mTestaProcessoRotinaDeIncluirUmNovoProcessoIncidental()
  {

  }
  

  @Ignore
  public void mTestaProcessoRotinaDeProcessoNaoProtocolado()
  {

  }
  
  
}
