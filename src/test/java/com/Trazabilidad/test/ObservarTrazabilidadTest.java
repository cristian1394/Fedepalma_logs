package com.Trazabilidad.test;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import io.qameta.allure.*;
import utilities.GenerarReportePdf;
import utilities.MyScreenRecorder;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.demoautomatizacion.test.BaseTest;
import com.demoautomatizacion.test.utils.Listeners.TestListener;

import PagObject_demoautomatizacion.BasePage;



@Listeners({ TestListener.class })
@Epic("Ver Trazabilidad")
@Feature("Ver Trazabilidad Test")

public class ObservarTrazabilidadTest extends BaseTest{
	
	public Properties fileprops = new Properties();
		
	public Properties getProperties() throws Exception {
        fileprops.load(new FileInputStream(new File("src/test/resources/test.properties").getAbsolutePath()));
        return fileprops;
    }
	
	public void Logeo(String nameTest, File folderPath) throws Exception {

		GenerarReportePdf.setRutaImagen(getProperties().getProperty("routeImageReport"));
	
		GenerarReportePdf.createTemplate(folderPath, nameTest, getProperties().getProperty("analista"),
				getProperties().getProperty("url"), getProperties().getProperty("Evidencia"));

		GenerarReportePdf.setImgContador(0);
	}
		
	@Test(priority=0, description="Ver Trazabilidad Portal Fedepalma")
    @Severity(SeverityLevel.NORMAL)
    @Description("Ver Trazabilidad Portal Fedepalma")
    @Story("Ver Trazabilidad")
    @TmsLink("XRPRJ-1")
    public void ObservarTrazavilidadPortalFedepalma () throws Exception {
		
		// OBTENER EL NOMBRE DEL METODO A EJECUTAR
		String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();

		File folderPath = BasePage.createFolder(nomTest, getProperties().getProperty("path"), getProperties().getProperty("Evidencia"));
		MyScreenRecorder.startRecording(nomTest, folderPath,getProperties().getProperty("Video"));

		Logeo(nomTest, folderPath);
		
		home.irPortal(getProperties().getProperty("url"));
		login.ingresarCredenciales(getProperties().getProperty("usuario"),getProperties().getProperty("password"), folderPath, getProperties().getProperty("Evidencia"));
        Trazabilidad.Trazabilidad(folderPath, getProperties().getProperty("Evidencia"));      
        VerTrazabilidad.VerTrazabilidad(folderPath, getProperties().getProperty("Evidencia"));
        
        MyScreenRecorder.stopRecording(getProperties().getProperty("Video"));
     	GenerarReportePdf.closeTemplate("",getProperties().getProperty("Evidencia"));
    }
	
}
