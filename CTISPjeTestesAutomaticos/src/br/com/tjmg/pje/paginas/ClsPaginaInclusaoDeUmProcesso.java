package br.com.tjmg.pje.paginas;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ClsPaginaInclusaoDeUmProcesso 
{
	@FindBy(how = How.ID, using = "_1010_j_id81j_id82") 
	private WebElement usuarioLogado;

	public WebElement getUsuarioLogado()
	{
		return usuarioLogado;
	}

	public void setUsuarioLogado(WebElement usuarioLogado)
	{
		this.usuarioLogado = usuarioLogado;
	}

	public ClsPaginaInclusaoDeUmProcesso(WebElement usuarioLogado)
	{
		super();
		this.usuarioLogado = usuarioLogado;
	}

	public ClsPaginaInclusaoDeUmProcesso() {
		// TODO Auto-generated constructor stub
	}

	public void ClsPaginaInclusaoDeUmProcesso()
	{
		
	}
	
	
	
	

}
