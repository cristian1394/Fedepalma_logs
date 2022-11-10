package PagObject_ConsultaDCD;

import static org.testng.Assert.assertTrue;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import MapObject_ConsultaDCD.ExepcionCMDCDMap;
import io.qameta.allure.Step;

public class ExepcionCMDCDPage extends ExepcionCMDCDMap {

	public ExepcionCMDCDPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Step("Carga Masiva DCD")
	public ExepcionCMDCDPage CargaDCD(String DocACM, File folderPath, String Evidencia) throws Exception {
		time(1);

		ByPixel();
		time(1);
		click(btnCarga,folderPath, "click xpath" , Evidencia);
		time(3);
		File file = new File(DocACM);
		time(2);
		WebElement ruta = driver.findElement(btnArchivo);
		ruta.sendKeys(file.getAbsolutePath());
		time(2);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(5);
		click(btnOk,folderPath, "click xpath" , Evidencia);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(8);

		return this;
	}

	@Step("Resultado de la carga masiva del DCD")
	public ExepcionCMDCDPage ValidarResultadoCargaDCD(String resultado, File folderPath, String Evidencia) throws Exception {
 
		
	  	ValidacionObjeto(validarElemento(lblResultadoCargaArchivo, 6), "Validacion del objecto", folderPath, Evidencia, lblResultadoCargaArchivo);
		assertTrue(validarElemento(lblResultadoCargaArchivo, 6), "Caso fallo no logro comprobarlo");
		Assert.assertEquals(getElement(lblResultadoCargaArchivo).getText(), resultado);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(6);
		click(btnOkey,folderPath, "click xpath" , Evidencia);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(2);
		

		return this;
	}
}
