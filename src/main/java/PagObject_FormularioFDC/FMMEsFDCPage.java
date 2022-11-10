package PagObject_FormularioFDC;

import java.io.File;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import MapObject_FormularioFDC.FMMEsFDCMap;
import io.qameta.allure.Step;

public class FMMEsFDCPage extends FMMEsFDCMap {
	
	
	
   	public FMMEsFDCPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Step("Ingresar a creacion FDC")
    public FMMEsFDCPage CrearFDC(File folderPath, String Evidencia) throws Exception {
	
	time(2);
    click(btnCrear,folderPath, "click xpath" , Evidencia);
    time(1);
    captureScreen(folderPath, "Capture screen" , Evidencia);
    time(4);
    
    return this;
}
	
	@Step("Crear FMM")
    public FMMEsFDCPage CrearFMM(String resultado, File folderPath, String Evidencia) throws Exception {
        
        click(btnTipoDemo,folderPath, "click xpath" , Evidencia);
        time(1);
        click(btnFMM,folderPath, "click xpath" , Evidencia);
        time(2);
        String [] FMM = {"733012",  "2037413",  "1234567",  "18000200"};
        Random aleatorio = new Random();            
        int FMM2 = aleatorio.nextInt(FMM.length);
        System.out.println(FMM[FMM2]);
        String txtFMM = String.valueOf(FMM[FMM2]);
        
        time(1);
        writeText(txtFmm, txtFMM, folderPath, txtFMM, Evidencia);
        time(2);
        click(btnConsultar,folderPath, "click xpath" , Evidencia);
        time(2);
        click(btnFiltro,folderPath, "click xpath" , Evidencia);
        time(5);
        click(btnSelect,folderPath, "click xpath" , Evidencia);
        time(1);
        String Total = getElement(lblTotal).getText();
        time(2);
        writeText(txtAsociar, Total, folderPath, Total, Evidencia);
        time(2);
        click(btnSeleccionar,folderPath, "click xpath" , Evidencia);
        time(1);
        String Totals = getElement(lblTotals).getText();
        time(2);
        writeText(txtasociar, Totals, folderPath, Totals, Evidencia);
        time(3);
        click(btnAdi,folderPath, "click xpath" , Evidencia);
        time(18);
		Assert.assertEquals(getElement(lblResultadoAdicionar).getText(),resultado);
		captureScreen(folderPath, "Capture screen" , Evidencia);
        time(2);
        click(btnOk,folderPath, "click xpath" , Evidencia);
        time(2);
    	ByPixel();
        time(1);
        captureScreen(folderPath, "Capture screen" , Evidencia);
        time(4);
        
        return this;
    }

	
}
