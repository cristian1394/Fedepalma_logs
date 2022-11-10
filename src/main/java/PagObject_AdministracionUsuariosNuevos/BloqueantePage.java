package PagObject_AdministracionUsuariosNuevos;

import java.io.File;

import org.openqa.selenium.WebDriver;

import MapObject_AdministracionUsuariosNuevos.BloqueanteMaps;
import io.qameta.allure.Step;


public class BloqueantePage extends BloqueanteMaps {

	




	public BloqueantePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Step("Selecionar menu")
    public BloqueantePage SelecionarMenu(File folderPath, String Evidencia) throws Exception {
		
        time(2);
        click(Seguridad, folderPath, "texto prueba" , Evidencia);
        time(2);
        captureScreen(folderPath, "captura Evidencia" , Evidencia);
        time(3);
        click(PUsuarios, folderPath, "texto prueba" , Evidencia);
        time(2);
        captureScreen(folderPath, "captura Evidencia" , Evidencia);
        time(5);
        
        return this;
    }
	
	@Step("Selecionar el formulario y el perfil de la lista a bloquear")
    public BloqueantePage EscojerTabla(File folderPath, String Evidencia) throws Exception {
        
         time(2);
        click(Formulario, folderPath, "texto prueba" , Evidencia);
        time(1);
        click(SIFF, folderPath, "texto prueba" , Evidencia);
        time(2);
        captureScreen(folderPath, "captura Evidencia" , Evidencia);
        time(3);
        click(Perfil, folderPath, "texto prueba" , Evidencia);
        time(1);
        click(Administrador, folderPath, "texto prueba" , Evidencia);
        time(2);
        captureScreen(folderPath, "captura Evidencia" , Evidencia);
        time(1);
        
        return this;
    }
	
	@Step("Bloquear Email")
    public BloqueantePage BloquearEmail(File folderPath, String Evidencia) throws Exception {
        
        time(5);
        click(btnBloquearEmail, folderPath, "texto prueba" , Evidencia);
        time(2);
        captureScreen(folderPath, "captura Evidencia" , Evidencia);
        time(3);
        
        return this;
    }
	
	@Step("Bloquear Firma")
    public BloqueantePage BloquearFirma(File folderPath, String Evidencia) throws Exception {
        
        time(5);
        click(btnBloquearFirma, folderPath, "texto prueba" , Evidencia);
        time(2);
        captureScreen(folderPath, "captura Evidencia" , Evidencia);
        time(3);
        
        return this;
    }
	
	@Step("Bloquear Perfil")
    public BloqueantePage BloquearPerfil(File folderPath, String Evidencia) throws Exception {
        
        time(5);
        click(btnBloquearPerfil, folderPath, "texto prueba" , Evidencia);
        time(2);
        captureScreen(folderPath, "captura Evidencia" , Evidencia);
        time(3);
        
        return this;
    }
	
	@Step("Bloquear Usuario")
    public BloqueantePage BloquearUsuario(File folderPath, String Evidencia) throws Exception {
        
        time(5);
        click(btnBloquearUsuario, folderPath, "texto prueba" , Evidencia);
        time(2);
        captureScreen(folderPath, "captura Evidencia" , Evidencia);
        time(3);
        
        return this;
    }
	
	@Step("Selecionar menu")
    public BloqueantePage SelecionarMenu1(File folderPath, String Evidencia) throws Exception {
        
        time(1);
        click(btnMenu, folderPath, "texto prueba" , Evidencia);
        time(1);
        click(Seguridad, folderPath, "texto prueba" , Evidencia);
        time(2);
        captureScreen(folderPath, "captura Evidencia" , Evidencia);
        time(3);
        click(AUsuariosN, folderPath, "texto prueba" , Evidencia);
        time(1);
        captureScreen(folderPath, "captura Evidencia" , Evidencia);
        time(5);
        
        return this;
    }
	
	@Step("Seleccionar Enviar")
    public BloqueantePage Email(File folderPath, String Evidencia) throws Exception {
        
        time(5);
        click(btnEnviar, folderPath, "texto prueba" , Evidencia);
        time(2);
        captureScreen(folderPath, "captura Evidencia" , Evidencia);
        time(3);
        
        return this;
    }
	
	@Step("Seleccionar Perfil")
    public BloqueantePage Perfil(File folderPath, String Evidencia) throws Exception {
        
        time(5);
        click(btnPerfil, folderPath, "texto prueba" , Evidencia);
        time(2);
        captureScreen(folderPath, "captura Evidencia" , Evidencia);
        time(3);
        
        return this;
    }
	
	@Step("Seleccionar Firma")
    public BloqueantePage Firma(File folderPath, String Evidencia) throws Exception {
        
        time(5);
        click(btnFirmar, folderPath, "texto prueba" , Evidencia);
        time(2);
        captureScreen(folderPath, "captura Evidencia" , Evidencia);
        time(3);
        
        return this;
    }
	
	@Step("Seleccionar Bloquear Usuario")
    public BloqueantePage BUsuario(File folderPath, String Evidencia) throws Exception {
        
        time(5);
        click(btnBloqueo, folderPath, "texto prueba" , Evidencia);
        time(2);
        captureScreen(folderPath, "captura Evidencia" , Evidencia);
        time(3);
        
        return this;
    }
	
	@Step("Selecionar menu")
    public BloqueantePage SelecionarMenu2(File folderPath, String Evidencia) throws Exception {
        
        time(1);
        click(btnMenu, folderPath, "texto prueba" , Evidencia);
        time(1);
        click(Seguridad, folderPath, "texto prueba" , Evidencia);
        time(2);
        captureScreen(folderPath, "captura Evidencia" , Evidencia);
        time(3);
        click(PUsuarios, folderPath, "texto prueba" , Evidencia);
        time(1);
        captureScreen(folderPath, "captura Evidencia" , Evidencia);
        time(3);
        
        return this;
    }
	
	@Step("Quitar Bloqueo Email")
    public BloqueantePage QuitarBloqueoEmail(File folderPath, String Evidencia) throws Exception {
        
        time(2);
        click(btnBloquearEmail, folderPath, "texto prueba" , Evidencia);
        time(2);
        captureScreen(folderPath, "captura Evidencia" , Evidencia);
        time(3);
        
        return this;
    }
	
	@Step("Quitar Bloqueo Firma")
    public BloqueantePage QuitarBloqueoFirma(File folderPath, String Evidencia) throws Exception {
        
        time(2);
        click(btnBloquearFirma, folderPath, "texto prueba" , Evidencia);
        time(2);
        captureScreen(folderPath, "captura Evidencia" , Evidencia);
        time(3);
        
        return this;
    }
	
	@Step("Quitar Bloqueo Perfil")
    public BloqueantePage QuitarBloqueoPerfil(File folderPath, String Evidencia) throws Exception {
        
        time(2);
        click(btnBloquearPerfil, folderPath, "texto prueba" , Evidencia);
        time(2);
        captureScreen(folderPath, "captura Evidencia" , Evidencia);
        time(3);
        
        return this;
    }
	
	@Step("Quitar Bloqueo Usuario")
    public BloqueantePage QuitarBloqueoUsuario(File folderPath, String Evidencia) throws Exception {
        
        time(2);
        click(btnBloquearUsuario, folderPath, "texto prueba" , Evidencia);
        time(2);
        captureScreen(folderPath, "captura Evidencia" , Evidencia);
        time(3);
        
        return this;
    }
	
	@Step("Enviar Correo")
    public BloqueantePage Enviar(File folderPath, String Evidencia) throws Exception {
		
	        time(5);
	        click(btnEnviar, folderPath, "texto prueba" , Evidencia);
	        time(2);
	        captureScreen(folderPath, "captura Evidencia" , Evidencia);
	        time(8);
	        click(btnAceptar, folderPath, "texto prueba" , Evidencia);
	        time(28);
	        click(btnOk, folderPath, "texto prueba" , Evidencia);
	        time(1);
        
        return this;
    }
	
	@Step("Firmar Usuario")
    public BloqueantePage Firmar(File folderPath, String Evidencia) throws Exception {
		
	        time(5);
	        click(btnFirmar, folderPath, "texto prueba" , Evidencia);
	        time(2);
	        captureScreen(folderPath, "captura Evidencia" , Evidencia);
	        time(8);
        
        return this;
    }
	
	@Step("Bloquear Usuario")
    public BloqueantePage BloquearUsuario1(File folderPath, String Evidencia) throws Exception {
		
	        time(5);
	        click(btnBloqueo1, folderPath, "texto prueba" , Evidencia);
	        time(2);
	        captureScreen(folderPath, "captura Evidencia" , Evidencia);
	        time(8);
	        click(btnAceptar, folderPath, "texto prueba" , Evidencia);
	        time(5);
	        click(btnOk, folderPath, "texto prueba" , Evidencia);
	        time(1);
        
        return this;
    }
	
	@Step("Desasociar Usuario")
    public BloqueantePage Desasociar(File folderPath, String Evidencia) throws Exception {
		
	        time(1);
	        click(btnDesasociar, folderPath, "texto prueba" , Evidencia);
	        time(1);

	        time(1);
	        click(btnAceptar, folderPath, "texto prueba" , Evidencia);
	        time(28);
	        click(btnOk, folderPath, "texto prueba" , Evidencia);
	        time(1);
	        
	        time(6);
        
        return this;
    }
	

	
	@Step("Editar Perfil")
    public BloqueantePage EditarPerfil(File folderPath, String Evidencia) throws Exception {
		
	        time(5);
	        click(btnPerfil, folderPath, "texto prueba" , Evidencia);
	        time(1);
	        click(btnlista, folderPath, "texto prueba" , Evidencia);
	        time(8);
	        captureScreen(folderPath, "captura Evidencia" , Evidencia);
	        time(5);
	        click(btnAceptar, folderPath, "texto prueba" , Evidencia);
	        time(18);
	        click(btnOk, folderPath, "texto prueba" , Evidencia);
	        time(1);
        
        return this;
    }
	@Step("Editar Perfil")
    public BloqueantePage EditarPerfil1(File folderPath, String Evidencia) throws Exception {
		
	        time(5);
	        click(btnPerfil, folderPath, "texto prueba" , Evidencia);
	        time(2);
	        click(btnlista1, folderPath, "texto prueba" , Evidencia);
	        time(2);
	        captureScreen(folderPath, "captura Evidencia" , Evidencia);
	        time(8);
	        click(btnAceptar, folderPath, "texto prueba" , Evidencia);
	        time(10);
	        click(btnOk, folderPath, "texto prueba" , Evidencia);
	        time(1);
        
        return this;
    }
	
	
}