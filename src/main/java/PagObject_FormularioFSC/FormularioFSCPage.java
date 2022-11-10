package PagObject_FormularioFSC;

import java.io.File;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import MapObject_FormularioFSC.FormularioFSCMap;
import io.qameta.allure.Step;

public class FormularioFSCPage extends FormularioFSCMap  {
	
	
	
	public FormularioFSCPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Step("Ingresar al formulario FSC")
    public FormularioFSCPage FormularioFSC1(File folderPath, String Evidencia) throws Exception { 
        time(2);
        scrollElementV(folderPath, btnDemostracion, "scroll " , Evidencia);
        time(1);
        click(btnDemostracion,folderPath, "click xpath" , Evidencia);
        time(2);
        scrollElementV(folderPath, btnFSC, "scroll " , Evidencia);
        click(btnFSC,folderPath, "click xpath" , Evidencia);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(1);
		
        return this;
    }
	
	@Step("Ingresar al formulario FSC")
    public FormularioFSCPage FormularioFSC(File folderPath, String Evidencia) throws Exception { 
        time(2);
        click(btnDemostracion1,folderPath, "click xpath" , Evidencia);
        time(1);
        click(btnFSC1,folderPath, "click xpath" , Evidencia);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(1);
		
        return this;
    }
	
	@Step("Consulta FSC")
    public FormularioFSCPage ConsultarFSC(File folderPath, String Evidencia) throws Exception { 
		
		time(1);
        click(btnSAno,folderPath, "click xpath" , Evidencia);
        time(1);
        click(btnAno,folderPath, "click xpath" , Evidencia);
        time(1);
        click(btnSMes,folderPath, "click xpath" , Evidencia);
        time(1);
        click(btnMes,folderPath, "click xpath" , Evidencia);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(1);
		
        return this;
    }
	
	@Step("Consulta FSC")
    public FormularioFSCPage ConsultarFSC1(File folderPath, String Evidencia) throws Exception { 
		
		time(1);
        click(btnSAno,folderPath, "click xpath" , Evidencia);
        time(1);
        click(btnAno,folderPath, "click xpath" , Evidencia);
        time(1);
        click(btnSMes,folderPath, "click xpath" , Evidencia);
        time(1);
        click(btnMesA,folderPath, "click xpath" , Evidencia);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(1);
		
        return this;
    }
	
	@Step("Consulta FSC")
    public FormularioFSCPage ConsultarFSC2(File folderPath, String Evidencia) throws Exception { 
		
		time(1);
        click(btnSAno,folderPath, "click xpath" , Evidencia);
        time(1);
        click(btnAno,folderPath, "click xpath" , Evidencia);
        time(1);
        click(btnSMes,folderPath, "click xpath" , Evidencia);
        time(1);
        click(btnMesB,folderPath, "click xpath" , Evidencia);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(1);
		
        return this;
    }
	
	@Step("Consulta FSC")
    public FormularioFSCPage ConsultarFSC3(File folderPath, String Evidencia) throws Exception { 
		
		time(1);
        click(btnSAno,folderPath, "click xpath" , Evidencia);
        time(1);
        click(btnAno,folderPath, "click xpath" , Evidencia);
        time(1);
        click(btnSMes,folderPath, "click xpath" , Evidencia);
        time(1);
        click(btnMesC,folderPath, "click xpath" , Evidencia);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(1);
		
        return this;
    }
	
	@Step("Consulta FSC")
    public FormularioFSCPage ConsultarFSC4(File folderPath, String Evidencia) throws Exception {
		
		time(1);
        click(btnSAno,folderPath, "click xpath" , Evidencia);
        time(1);
        click(btnAno,folderPath, "click xpath" , Evidencia);
        time(1);
        click(btnSMes,folderPath, "click xpath" , Evidencia);
        time(1);
        click(btnMesD,folderPath, "click xpath" , Evidencia);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(1);
		
        return this;
    }
	
	@Step("Consulta FSC")
    public FormularioFSCPage EConsultarFSC(File folderPath, String Evidencia) throws Exception {
		
		time(1);
        click(btnSAno,folderPath, "click xpath" , Evidencia);
        time(1);
        click(btnAno,folderPath, "click xpath" , Evidencia);
        time(1);
        click(btnSMes,folderPath, "click xpath" , Evidencia);
        time(1);
        click(btnMesE,folderPath, "click xpath" , Evidencia);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(1);
		
        return this;
    }
	
	@Step("Buscar Formularios")
    public FormularioFSCPage BuscarFSC(File folderPath, String Evidencia) throws Exception { 
		
		time(4);
		click(btnBuscar,folderPath, "click xpath" , Evidencia);
        time(5);
        captureScreen(folderPath, "Capture screen" , Evidencia);
		
        return this;
    }
	
	@Step("Crear FSC")
    public FormularioFSCPage CrearFSC(File folderPath, String Evidencia) throws Exception { 
		
        time(3);
		click(btnCrear,folderPath, "click xpath" , Evidencia);
		time(3);
        captureScreen(folderPath, "Capture screen" , Evidencia);
        time(2);
        
        return this;
    }
	
	@Step("Seleccionar el tipo de Documento")
    public FormularioFSCPage TD(File folderPath, String Evidencia) throws Exception { 
		
        time(2);
		click(TipoDocumento,folderPath, "click xpath" , Evidencia);
		time(1);
        captureScreen(folderPath, "Capture screen" , Evidencia);
        time(1);
        
        return this;
    }
	
	@Step("Seleccionar el Certificado de Facturacion al Mercado Interno")
    public FormularioFSCPage CFMI(File folderPath, String Evidencia) throws Exception { 
		
        time(2);
		click(CertificadoFMI,folderPath, "click xpath" , Evidencia);
		time(2);
        captureScreen(folderPath, "Capture screen" , Evidencia);
        time(1);
        
        return this;
    }
	
	@Step("Seleccionar el Certificado Incorporacion Propia")
    public FormularioFSCPage CIP(File folderPath, String Evidencia) throws Exception { 
		
        time(1);
		click(CertificadoIP,folderPath, "click xpath" , Evidencia);
		time(2);
        captureScreen(folderPath, "Capture screen" , Evidencia);
        time(1);
        
        return this;
    }
	
	@Step("Seleccionar el Certificado Contrato de Mandato")
    public FormularioFSCPage CCM(File folderPath, String Evidencia) throws Exception { 
		
        time(1);
		click(CertificadoCM,folderPath, "click xpath" , Evidencia);
		time(2);
        captureScreen(folderPath, "Capture screen" , Evidencia);
        time(1);
        
        return this;
    }
	
	@Step("Consultar DMI")
    public FormularioFSCPage ConsultarDMI(File folderPath, String Evidencia) throws Exception { 
        time(8);
		click(btnConsultarDMI,folderPath, "click xpath" , Evidencia);
		time(2);
        captureScreen(folderPath, "Capture screen" , Evidencia);
        time(2);
        
        return this;
    }
	
	@Step("Muestre Alerta DMI")
    public FormularioFSCPage AlertaDMI(String resultado, File folderPath, String Evidencia) throws Exception { 
        
		time(2);
		Assert.assertEquals(getElement(lblAdicionar).getText(),resultado);
		time(1);
        captureScreen(folderPath, "Capture screen" , Evidencia);
        time(1);
        click(btnOk,folderPath, "click xpath" , Evidencia);
		time(4);
        captureScreen(folderPath, "Capture screen" , Evidencia);
        time(1);
        
        return this;
    }
	
	@Step("Seleccionar el DMI")
    public FormularioFSCPage SeleccionarDMI(File folderPath, String Evidencia) throws Exception { 
        time(8);
		click(DMI,folderPath, "click xpath" , Evidencia);
		time(1);
	    String Total = getElement(lblTotal).getText();
	    time(1);
	    writeText(Asociar, Total, folderPath, Total, Evidencia);
		time(2);
        captureScreen(folderPath, "Capture screen" , Evidencia);
        time(1);
        
        return this;
    }
	
	@Step("Adiciona un DMI")
    public FormularioFSCPage AdicionarDMI(String resultado,File folderPath, String Evidencia) throws Exception { 
        time(3);
		click(btnAdicionar,folderPath, "click xpath" , Evidencia);
		time(10);
		Assert.assertEquals(getElement(lblAdicionar).getText(),resultado);
		time(1);
        captureScreen(folderPath, "Capture screen" , Evidencia);
        time(1);
        click(btnOk,folderPath, "click xpath" , Evidencia);
		time(4);
        captureScreen(folderPath, "Capture screen" , Evidencia);
        time(1);
        
        return this;
    }
	
	@Step("Cagar FMI")
    public FormularioFSCPage CargaFMI(String doc, String resultado, File folderPath, String Evidencia) throws Exception {
		
        time(2);
		ByPixel();
		time(1);
		scrollElementV(folderPath, CargaFMI, "scroll " , Evidencia);
        time(8);
		 File file = new File(doc);
		 time(3);
		 WebElement ruta = driver.findElement(CargaFMI);
		 ruta.sendKeys(file.getAbsolutePath()); 
		time(1);
		Assert.assertEquals(getElement(lblResultadoCargas).getText(),resultado);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(5);
		click(btnOk,folderPath, "click xpath" , Evidencia);
        captureScreen(folderPath, "Capture screen" , Evidencia);
        time(3);
        
        return this;
    }
	
	@Step("Cagar CCM")
    public FormularioFSCPage CargaCCM(String doc, String resultado,File folderPath, String Evidencia) throws Exception { 
		
        time(2);
        ByPixel();
		time(1);
		scrollElementV(folderPath, CargaCCM, "scroll " , Evidencia);
        time(8);
		 File file = new File(doc);
		 time(3);
		 WebElement ruta = driver.findElement(CargaCCM);
		 ruta.sendKeys(file.getAbsolutePath()); 
		time(1);
		Assert.assertEquals(getElement(lblResultadoCargas).getText(),resultado);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(5);
		click(btnOk,folderPath, "click xpath" , Evidencia);
        captureScreen(folderPath, "Capture screen" , Evidencia);
        time(3);
        
        return this;
    }
	
	@Step("Cagar CIP")
    public FormularioFSCPage CargaCIP(String doc, String resultado, File folderPath, String Evidencia) throws Exception { 
		
        time(2);
        ByPixel();
		time(1);
		scrollElementV(folderPath, CargaCIP, "scroll " , Evidencia);
        time(8);
		 File file = new File(doc);
		 time(3);
		 WebElement ruta = driver.findElement(CargaCIP);
		 ruta.sendKeys(file.getAbsolutePath()); 
		time(1);
		Assert.assertEquals(getElement(lblResultadoCargas).getText(),resultado);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(5);
		click(btnOk,folderPath, "click xpath" , Evidencia);
        captureScreen(folderPath, "Capture screen" , Evidencia);
        time(3);
        
        return this;
    }
	
	@Step("Cagar Incumplimento")
    public FormularioFSCPage CargaIncumplimiento(String doc, String resultado, File folderPath, String Evidencia) throws Exception { 
		
        time(2);
        ByPixel();
		time(1);
		scrollElementV(folderPath, CargaIncumplimiento, "scroll " , Evidencia);
        time(8);
		 File file = new File(doc);
		 time(3);
		 WebElement ruta = driver.findElement(CargaIncumplimiento);
		 ruta.sendKeys(file.getAbsolutePath()); 
		time(1);
		Assert.assertEquals(getElement(lblResultadoCargas).getText(),resultado);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(5);
		click(btnOk,folderPath, "click xpath" , Evidencia);
        captureScreen(folderPath, "Capture screen" , Evidencia);
        time(3);
        
        return this;
    }
	
	@Step("Revisar FSC")
    public FormularioFSCPage RevisarFSC(File folderPath, String Evidencia) throws Exception { 
        time(8);
		click(btnRevisar,folderPath, "click xpath" , Evidencia);
		time(2);
        captureScreen(folderPath, "Capture screen" , Evidencia);
        time(2);
        
        return this;
    }
	
	@Step("Validar Excepcion de Revisar")
    public FormularioFSCPage ERevisarFSC(String resultado, File folderPath, String Evidencia) throws Exception { 
		
        time(2);
		Assert.assertEquals(getElement(lblResultadoError).getText(),resultado);
		time(1);
        captureScreen(folderPath, "Capture screen" , Evidencia);
        time(1);
        click(btnOk,folderPath, "click xpath" , Evidencia);
		time(4);
        captureScreen(folderPath, "Capture screen" , Evidencia);
        time(1);
        
        return this;
    }
	
	@Step("Validar Excepcion de Revisar")
    public FormularioFSCPage ERevisarFSC1(File folderPath, String Evidencia) throws Exception { 
		
		time(2);
        click(btnOk,folderPath, "click xpath" , Evidencia);
		time(4);
        captureScreen(folderPath, "Capture screen" , Evidencia);
        time(1);
        
        return this;
    }
	
	@Step("Salir FSC")
    public FormularioFSCPage SalirFSC(File folderPath, String Evidencia) throws Exception { 
        time(5);
        ByPixel();
        ByPixel();
        time(1);
		click(btnSalir,folderPath, "click xpath" , Evidencia);
		time(3);
        captureScreen(folderPath, "Capture screen" , Evidencia);
        time(2);
        
        return this;
    }
	
	@Step("Salir FSC")
    public FormularioFSCPage SalirFSC1(File folderPath, String Evidencia) throws Exception { 
        time(5);
        ByPixel();
        ByPixel();
        time(1);
		click(btnSalir1,folderPath, "click xpath" , Evidencia);
		time(3);
        captureScreen(folderPath, "Capture screen" , Evidencia);
        time(2);
        
        return this;
    }
	
	@Step("Ver Historial")
    public FormularioFSCPage Historial(File folderPath, String Evidencia) throws Exception { 
        time(2);
		click(Historial,folderPath, "click xpath" , Evidencia);
		time(3);
        captureScreen(folderPath, "Capture screen" , Evidencia);
        time(4);
        
        return this;
    }
	
	@Step("Exportar a Excel el Historial")
    public FormularioFSCPage ExportarHistorial(File folderPath, String Evidencia) throws Exception { 
        time(2);
		click(ExportarH,folderPath, "click xpath" , Evidencia);
		time(3);
        captureScreen(folderPath, "Capture screen" , Evidencia);
        time(4);
        
        return this;
    }
	
	@Step("Cerrar Historial")
    public FormularioFSCPage CerrarHistorial(File folderPath, String Evidencia) throws Exception { 
        time(2);
		click(CerrarH,folderPath, "click xpath" , Evidencia);
		time(3);
        captureScreen(folderPath, "Capture screen" , Evidencia);
        time(4);
        
        return this;
    }
	
	@Step("Ver el FSC Creado")
    public FormularioFSCPage VerFSC(File folderPath, String Evidencia) throws Exception { 
        time(2);
		click(Lupa,folderPath, "click xpath" , Evidencia);
		time(5);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(1);
		ByPixel();
		time(1);
        captureScreen(folderPath, "Capture screen" , Evidencia);
        time(3);
        driver.findElement(Scape).sendKeys(Keys.ESCAPE); 
        time(2);
        captureScreen(folderPath, "Capture screen" , Evidencia);
        time(1);
        
        return this;
    }
	
	@Step("Editar FSC")
    public FormularioFSCPage EditarFSC(File folderPath, String Evidencia) throws Exception { 
        time(2);
		click(Editar,folderPath, "click xpath" , Evidencia);
		time(5);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(1);
        
        return this;
    }
	
	@Step("Eliminar FSC")
    public FormularioFSCPage EliminarFSC(File folderPath, String Evidencia) throws Exception {
        time(2);
		click(Eliminar,folderPath, "click xpath" , Evidencia);
		time(5);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(1);
        
        return this;
    }
	
	@Step("Aceptar Eliminacion FSC")
    public FormularioFSCPage AceptarEliminarFSC(File folderPath, String Evidencia) throws Exception { 
        time(2);
		click(btnOK,folderPath, "click xpath" , Evidencia);
		time(3);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(1);
        
        return this;
    }
	
	@Step("Resumen de Demostracion del formulario FSC")
    public FormularioFSCPage ResumenDemostracion(File folderPath, String Evidencia) throws Exception  {
        time(2);
		captureScreen(folderPath, "Capture screen" , Evidencia);
		time(1);
        
        return this;
    }
}
