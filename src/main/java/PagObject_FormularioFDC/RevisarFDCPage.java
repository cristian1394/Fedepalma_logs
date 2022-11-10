package PagObject_FormularioFDC;

import java.io.File;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import MapObject_FormularioFDC.RevisarFDCMap;
import io.qameta.allure.Step;

public class RevisarFDCPage extends RevisarFDCMap  {

	
	
	public RevisarFDCPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Step("Crear FDC")
    public RevisarFDCPage CrearFDC(File folderPath, String Evidencia) throws Exception {
		
        time(2);
        click(btnCrear,folderPath, "click xpath" , Evidencia);
		time(1);
        captureScreen(folderPath, "Capture screen" , Evidencia);
        time(1);
        
        return this;
    }

@Step("Revisar FDC")
public RevisarFDCPage RevisarFDC(String resultado, File folderPath, String Evidencia) throws Exception {
	
	time(1);
	ByPixel();
	time(1);
	click(btnRevisar,folderPath, "click xpath" , Evidencia);
	time(4);
    captureScreen(folderPath, "Capture screen" , Evidencia);
    time(1);
	Assert.assertEquals(getElement(lblResultadoRevisar).getText(),resultado);
	captureScreen(folderPath, "Capture screen" , Evidencia);
    time(6);
    click(btnOk,folderPath, "click xpath" , Evidencia);
    captureScreen(folderPath, "Capture screen" , Evidencia);
    time(2);
	
	return this;
}

@Step("Salir FDC")
public RevisarFDCPage SalirFDC(File folderPath, String Evidencia) throws Exception {
	
	time(1);
	captureScreen(folderPath, "Capture screen" , Evidencia);
	time(1);
	click(btnSalir,folderPath, "click xpath" , Evidencia);
	time(8);
	
	return this;
}

	
}
