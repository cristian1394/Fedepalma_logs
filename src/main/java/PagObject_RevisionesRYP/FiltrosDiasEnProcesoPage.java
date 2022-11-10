package PagObject_RevisionesRYP;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import MapObject_RevisionesRYP.FiltrosDiasEnProcesoMap;
import io.qameta.allure.Step;

public class FiltrosDiasEnProcesoPage extends FiltrosDiasEnProcesoMap {

	public FiltrosDiasEnProcesoPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Step("Observar Validaciones de Filtro Dias en Proceso")
	public FiltrosDiasEnProcesoPage ValidarFiltroDiasP(String Kg, File folderPath, String Evidencia) throws Exception {

		time(2);
		ByPixel();
		time(4);
		scrollElementV(folderPath, btnlupa, "scroll " , Evidencia);
		time(4);
		ByPixelA();
		time(4);
		click(btnDiasP,folderPath, "click xpath" , Evidencia);
		time(1);
		click(btnDespliege,folderPath, "click xpath" , Evidencia);
		time(1);
		Select select = new Select(driver.findElement(By.cssSelector("body > div.k-animation-container > form > div.k-filter-menu-container > span > select > option:nth-child(5)")));        
		select.selectByVisibleText("HIGH");
		
		//selectElementList3(btnComienza , Evidencia);
		//click(btnComienza,folderPath, "click xpath" , Evidencia);
		time(1);
		writeText(txtDiasP, Kg, folderPath, Kg, Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(1);
		click(btnFiltrar,folderPath, "click xpath" , Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(3);

		return this;
	}

}
