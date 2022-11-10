package MapObject_FormularioFSC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import PagObject_demoautomatizacion.BasePage;

public class ExepcionCrearFSCMap extends BasePage {

	protected By btnCrear=By.id("btnCrear");
	protected By btnOK=By.xpath("//div[7]/div[7]/div/button");//Seleccione el año y el mes
	protected By lblResultadoCrear=By.xpath("//div[7]/p");
	 
	public ExepcionCrearFSCMap(WebDriver driver) {
		super(driver);
		
	}
	

}
