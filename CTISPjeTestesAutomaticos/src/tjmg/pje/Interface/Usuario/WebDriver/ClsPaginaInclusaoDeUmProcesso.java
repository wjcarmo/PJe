package tjmg.pje.Interface.Usuario.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class ClsPaginaInclusaoDeUmProcesso 
{
	
	@FindBy(how = How.ID, using = "j_id69:j_id71") private WebElement mProcesso;
	@FindBy(how = How.LINK_TEXT, using = "http://pjetreina.tjmg.jus.br/pje/QuadroAviso/listViewQuadroAvisoMensagem.seam?cid=224915#") private WebElement mNovoProcesso;
	@FindBy(how = How.ID, using = "processoTrfForm:classeJudicial:classeJudicialjurisdicaoComboDecoration:classeJudicialjurisdicaoCombo") private WebElement selectSecao;
	@FindBy(how = How.ID, using = "processoTrfForm:classeJudicial:classeJudicialComboClasseJudicialDecoration:classeJudicialComboClasseJudicial") private WebElement selectClasseJudical;
	@FindBy(how = How.ID, using = "processoTrfForm:save") private WebElement btnIncluir;
	@FindBy(how = How.ID, using = "r_processoAssuntoListList:2:j_id443") private WebElement listaDeAssuntos;
	@FindBy(how = How.ID, using = "Adicionar") private WebElement btnAdicionarAssunto;
	
	
	
	private WebElement pagina;
	private String retornaMensagem;
	private String recebeCPFCNPJ;
	private String recebeSenha;
	private WebDriver driver;
	protected String siteParamentro;;
	
	
	
		public void pagina()
		{
		   driver.getCurrentUrl();
		   driver.navigate().to("http://pjetreina.tjmg.jus.br/pje/Processo/cadastrar.seam?newInstance=true");
		}
		
		
	public void BotaoMenuIncluirProcesso() 
	{
		mProcesso.click(); 
	}
	
	public void BotaoMenuIncluirNovoProcesso() 
		{
		mNovoProcesso.click(); 
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
