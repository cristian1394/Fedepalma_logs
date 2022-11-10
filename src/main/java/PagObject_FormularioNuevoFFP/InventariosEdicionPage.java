package PagObject_FormularioNuevoFFP;

import java.io.File;
import org.openqa.selenium.WebDriver;
import MapObject_FormularioNuevoFFP.InventariosEdicionMap;
import io.qameta.allure.Step;

public class InventariosEdicionPage extends InventariosEdicionMap {

	public InventariosEdicionPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Step("Aceite Palma Crudo")
	public InventariosEdicionPage AceitePalma(String Palma, String PalmaA, String PalmaB, String PalmaC,
			String PalmaD, File folderPath, String Evidencia) throws Exception {

		time(2);
		scrollElementV(folderPath, txtPalma, "scroll " , Evidencia);
		time(1);
		clear(txtPalma);
		time(1);
		writeText(txtPalma, Palma, folderPath, PalmaD, Evidencia);
		time(2);
		clear(txtPalmaA);
		time(1);
		writeText(txtPalmaA, PalmaA, folderPath, PalmaD, Evidencia);
		time(1);
		clear(txtPalmaB);
		time(1);
		writeText(txtPalmaB, PalmaB, folderPath, PalmaD, Evidencia);
		time(1);
		clear(txtPalmaC);
		time(1);
		writeText(txtPalmaC, PalmaC, folderPath, PalmaD, Evidencia);
		time(1);
		clear(txtPalmaD);
		time(1);
		writeText(txtPalmaD, PalmaD, folderPath, PalmaD, Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);

		return this;
	}

	@Step("Aceite Palma o Palmiste Crudo")
	public InventariosEdicionPage AceitePalmaOPalmiste(String PalmaoPalmiste, String PalmaoPalmisteA,
			String PalmaoPalmisteB, String PalmaoPalmisteC, String PalmaoPalmisteD, File folderPath, String Evidencia) throws Exception {

		time(1);
		clear(txtPalmaoPalmiste);
		time(1);
		writeText(txtPalmaoPalmiste, PalmaoPalmiste, folderPath, PalmaoPalmisteD, Evidencia);
		time(1);
		clear(txtPalmaoPalmisteA);
		time(1);
		writeText(txtPalmaoPalmisteA, PalmaoPalmisteA, folderPath, PalmaoPalmisteD, Evidencia);
		time(1);
		clear(txtPalmaoPalmisteB);
		time(1);
		writeText(txtPalmaoPalmisteB, PalmaoPalmisteB, folderPath, PalmaoPalmisteD, Evidencia);
		time(1);
		clear(txtPalmaoPalmisteC);
		time(1);
		writeText(txtPalmaoPalmisteC, PalmaoPalmisteC, folderPath, PalmaoPalmisteD, Evidencia);
		time(1);
		clear(txtPalmaoPalmisteD);
		time(1);
		writeText(txtPalmaoPalmisteD, PalmaoPalmisteD, folderPath, PalmaoPalmisteD, Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);

		return this;
	}

	@Step("Aceite Palmiste Crudo")
	public InventariosEdicionPage AceitePalmiste(String Palmiste, String PalmisteA, String PalmisteB, String PalmisteC,
			String PalmisteD, File folderPath, String Evidencia) throws Exception {

		time(1);
		clear(txtPalmiste);
		time(1);
		writeText(txtPalmiste, Palmiste, folderPath, PalmisteD, Evidencia);
		time(1);
		clear(txtPalmisteA);
		time(1);
		writeText(txtPalmisteA, PalmisteA, folderPath, PalmisteD, Evidencia);
		time(1);
		clear(txtPalmisteB);
		time(1);
		writeText(txtPalmisteB, PalmisteB, folderPath, PalmisteD, Evidencia);
		time(1);
		clear(txtPalmisteC);
		time(1);
		writeText(txtPalmisteC, PalmisteC, folderPath, PalmisteD, Evidencia);
		time(1);
		clear(txtPalmisteD);
		time(1);
		writeText(txtPalmisteD, PalmisteD, folderPath, PalmisteD, Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);

		return this;
	}

	@Step("Presentar Declaracion")
	public InventariosEdicionPage PresentarDeclaracion(File folderPath, String Evidencia) throws Exception {

		time(1);
		click(btnPresentar,folderPath, "click xpath" , Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(4);
		click(btnOk,folderPath, "click xpath" , Evidencia);
		time(3);

		return this;
	}

	@Step("Total Plama Crudo")
	public InventariosEdicionPage GuardarEdicion(File folderPath, String Evidencia) throws Exception {

		time(1);
		click(btnGuardar,folderPath, "click xpath" , Evidencia);
		time(5);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(1);
		click(btnOk,folderPath, "click xpath" , Evidencia);
		time(3);
		click(btnOK,folderPath, "click xpath" , Evidencia);
		time(8);

		return this;
	}
}
