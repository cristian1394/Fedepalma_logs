package PagObject_SecretariaTecnica;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import MapObject_SecretariaTecnica.RevicionSTecnicaMap;
import io.qameta.allure.Step;

public class RevicionSTecnicaPage extends RevicionSTecnicaMap {

	public RevicionSTecnicaPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Step("Devolucion Secretaria Tecnica")
	public RevicionSTecnicaPage RevicionSTecnica(File folderPath, String Evidencia) throws Exception {

		time(1);
		ByPixel();
		scrollElementV(folderPath, btnlupa, "scroll " , Evidencia);
		time(1);
		ByPixelA();
		time(1);
		click(btnDevolver,folderPath, "click xpath" , Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(1);

		return this;
	}

	@Step("Revicion Secretaria Tecnica")
	public RevicionSTecnicaPage RevicionSTecnica1(File folderPath, String Evidencia) throws Exception {

		time(1);
		ByPixel();
		scrollElementV(folderPath, btnlupa, "scroll " , Evidencia);
		time(1);
		ByPixelA();
		time(1);
		click(btnRevisar,folderPath, "click xpath" , Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(1);

		return this;
	}

	@Step("Observar Secretaria Tecnica")
	public RevicionSTecnicaPage ObservarST(String Observacion,File folderPath, String Evidencia) throws Exception {

		time(1);
		click(btnObservacion,folderPath, "click xpath" , Evidencia);
		time(1);
		writeText(txtObservacion, Observacion, folderPath, Observacion, Evidencia);
		time(1);
		click(btnLupa,folderPath, "click xpath" , Evidencia);
		time(3);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(1);
		click(btnSalir,folderPath, "click xpath" , Evidencia);

		return this;
	}

	@Step("Guardar Revicion")
	public RevicionSTecnicaPage GuardarRevicion(File folderPath, String Evidencia) throws Exception {

		time(1);
		ByPixel();
		time(1);
		click(btnGuardar,folderPath, "click xpath" , Evidencia);
		time(4);

		return this;
	}

	@Step("Resultado de Guardar Revicion")
	public RevicionSTecnicaPage ValidarGuardarRevicion(String resultado,File folderPath, String Evidencia) throws Exception {

		time(1);
		Assert.assertEquals(getElement(lblResultadoGuardar).getText(), resultado);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(2);
		click(btnOk,folderPath, "click xpath" , Evidencia);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(3);

		return this;
	}

	@Step("Resultado de Guardar Revicion")
	public RevicionSTecnicaPage ValidarGuardarRevicion1(String resultado,File folderPath, String Evidencia) throws Exception {

		time(1);
		Assert.assertEquals(getElement(lblResultadoGuardar1).getText(), resultado);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(2);
		click(btnOk,folderPath, "click xpath" , Evidencia);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(3);

		return this;
	}
}
