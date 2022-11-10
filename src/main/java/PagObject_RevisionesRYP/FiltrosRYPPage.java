package PagObject_RevisionesRYP;

import java.io.File;

import org.openqa.selenium.WebDriver;
import MapObject_RevisionesRYP.FiltrosRYPMap;
import io.qameta.allure.Step;

public class FiltrosRYPPage extends FiltrosRYPMap {
	
	
	public FiltrosRYPPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Step("Verificacion de Filtros RYP")
    public FiltrosRYPPage ValidarFiltrosRYP(String Año, String inicial, String producto, String Grupo, File folderPath, String Evidencia) throws Exception {
		
        time(2);
        click(btnAño,folderPath, "click xpath" , Evidencia);
        time(1);
        writeText(txtAño, Año, folderPath, Grupo, Evidencia);
        time(1);
        click(btnFiltrar,folderPath, "click xpath" , Evidencia);
        time(1);
        captureScreen(folderPath, "Capture screen" , Evidencia);
        
        String Mes = getElement(lblMes).getText();
        time(1);
        click(btnMes,folderPath, "click xpath" , Evidencia);
        time(1);
        click(btnFiltra,folderPath, "click xpath" , Evidencia);
        time(1);
        click(btnContiene,folderPath, "click xpath" , Evidencia);
        time(1);
        writeText(txtMes, Mes, folderPath, Mes, Evidencia);
        time(1);
        click(btnfiltrar,folderPath, "click xpath" , Evidencia);
        time(1);
        captureScreen(folderPath, "Capture screen" , Evidencia);
		
        click(btnDeclarante,folderPath, "click xpath" , Evidencia);
        time(1);
        click(btnFiltro,folderPath, "click xpath" , Evidencia);
        time(1);
        click(btnComienza,folderPath, "click xpath" , Evidencia);
        time(1);
        writeText(txtInicial, inicial, folderPath, Mes, Evidencia);
        time(1);
        click(btnFiltrarD,folderPath, "click xpath" , Evidencia);
        time(1);
        captureScreen(folderPath, "Capture screen" , Evidencia);
        
        click(btnProducto,folderPath, "click xpath" , Evidencia);
        time(1);
        click(btnLista,folderPath, "click xpath" , Evidencia);
        time(1);
        click(btnNoContiene,folderPath, "click xpath" , Evidencia);
        time(1);
        writeText(txtProducto, producto, folderPath, Mes, Evidencia);
        time(1);
        click(btnFiltrarP,folderPath, "click xpath" , Evidencia);
        time(1);
        captureScreen(folderPath, "Capture screen" , Evidencia);
        
        
        time(1);
        click(btnGrupoMercado,folderPath, "click xpath" , Evidencia);
        time(1);
        writeText(txtTexto, Grupo, folderPath, Mes, Evidencia);
        time(1);
        click(btnfiltro,folderPath, "click xpath" , Evidencia);
        time(1);
        captureScreen(folderPath, "Capture screen" , Evidencia);
        
        return this;
    }
	
	@Step("Verificacion de Exportacion")
    public FiltrosRYPPage ExportacionExcel(File folderPath, String Evidencia) throws Exception {
        
		time(1);
		click(btnExportar,folderPath, "click xpath" , Evidencia);
		time(1);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(3);
		
        return this;
    }
	
}
