package MapObject_FormularioFDC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import PagObject_demoautomatizacion.BasePage;

public class Cargar_DEXMap extends BasePage {

	protected By btnCargas=By.xpath("/html/body/div[1]/main/div/div/div[2]/section[12]/div");
	
	protected By btnCargaDEX=By.id("fileElementCargarDex");
	protected By btnOk=By.xpath("/html/body/div[18]/div[7]/div/button");
	
	protected By btnCargaFMM=By.id("fileElementCargarFmm");
	
	protected By btnCargaCD=By.id("fileElementCargarPoliza");
	
	protected By btnCargaPoliza=By.id("fileElementCargarCP");
	
	protected By btnCargaIncumplimiento=By.id("fileElementCargarIncumplimiento");
	protected By btnRevisar=By.xpath("//*[@id=\"btnRevisarFdc\"]");
	protected By btnSalir=By.id("btnSalirFdc");
	protected By lblResultadoAdicionar=By.xpath("//div[17]/p");
	
	public Cargar_DEXMap(WebDriver driver) {
		super(driver);
		
	}
	
	
}
