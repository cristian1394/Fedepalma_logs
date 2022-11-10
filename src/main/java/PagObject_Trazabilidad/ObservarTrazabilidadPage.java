package PagObject_Trazabilidad;

import java.io.File;

import org.openqa.selenium.WebDriver;
import MapObject_Trazabilidad.ObservarTrazabilidadMap;
import io.qameta.allure.Step;

public class ObservarTrazabilidadPage extends ObservarTrazabilidadMap {


	
	public ObservarTrazabilidadPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Step("Observar Trazabilidad")
    public ObservarTrazabilidadPage VerTrazabilidad(File folderPath, String Evidencia) throws Exception {

		time(1);
		click(btnVer,folderPath, "click xpath" , Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
        time(10);
        
        return this;
    }
	
}
