package tjmg.pje.Interface.Usuario.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class ClsPaginaInclusaoDeUmProcesso 
{
	
	@FindBy(how = How.ID, using = "_1010_j_id83j_id84") private WebElement mProcesso;
	@FindBy(how = How.ID, using = "_1011_j_id83j_id85") private WebElement mNovoProcesso;
	
	@FindBy(how = How.ID, using = "processoTrfForm:classeJudicial:classeJudicialjurisdicaoComboDecoration:classeJudicialjurisdicaoCombo") private WebElement selectSecao;
	@FindBy(how = How.ID, using = "processoTrfForm:classeJudicial:classeJudicialComboClasseJudicialDecoration:classeJudicialComboClasseJudicial") private WebElement selectClasseJudical;
	@FindBy(how = How.ID, using = "processoTrfForm:save") private WebElement btnIncluir;
	@FindBy(how = How.ID, using = "r_processoAssuntoListList:2:j_id443") private WebElement listaDeAssuntos;
	@FindBy(how = How.ID, using = "Adicionar") private WebElement btnAdicionarAssunto;
	
	
	private String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();
	private WebElement pagina;
	private String retornaMensagem;
	private String recebeCPFCNPJ;
	private String recebeSenha;
	private WebDriver driver;
	protected String siteParamentro;;
	
	
	
		public void pagina()
		{
			driver.get(baseUrl + "/pje/login.seam?loginComCertificado=true");
		  
		}
		
		
	public void BotaoMenuIncluirProcesso() 
	{
		//mProcesso.click(); 
		 driver.findElement(By.id("_1010_j_id83j_id84")).click();
		 
	}
	
	public void BotaoMenuIncluirNovoProcesso() 
		{
		driver.findElement(By.id("_1011_j_id83j_id85")).click();
		//mNovoProcesso.click(); 
	}
	
	public void SelectSecao(String sessao) 
	{
		Select selOpcaoSecao = new Select(selectSecao); 
		selOpcaoSecao.selectByVisibleText(sessao); 
	}
	
	public void SelectClasseJudicial(String classeJudical) 
	{
		Select selOpcaoClasseJudicial = new Select(selectClasseJudical); 
		selOpcaoClasseJudicial.selectByVisibleText(classeJudical); 
	}
	
	public void BotaoSalvarNovoProcesso() 
	{
		btnIncluir.click(); 
	}
	
	
	
	public ClsPaginaInclusaoDeUmProcesso(WebElement usuarioLogado)
	{
		super();
		
	}

	
	public ClsPaginaInclusaoDeUmProcesso(WebDriver driver) throws InterruptedException {
		super();
		this.driver = driver;
		
		}
	
	
	
	

}
