package Programa;

import Archivos.EscritorArchivosBinarios;
import Archivos.LectorArchivosBinarios;
import Controladores.ControladorCompraBoletos;
import Controladores.ControladorLogin;
import GUI.CompraBoletosGUI;
import GUI.Login;
import GUI.PrincipalGUI;
import GUI.VuelosGUI;
import GUI.LlenadoPasaporte;
import GUI.PedirTarjeta;
import Objetos.Aereopuerto;
import Objetos.Avión;
import Objetos.Pasaporte;
import Objetos.Tarjeta;
import Objetos.Vuelo;
import Usuarios.OperadorVuelo;
import Usuarios.Pasajero;
import Usuarios.Usuario;
import java.io.IOException;
import java.time.LocalDate;

/**
 *
 * @author Alexs
 */
public class Principal {
//mientras

    EscritorArchivosBinarios<Vuelo> escri;
    EscritorArchivosBinarios<Pasaporte> escriA;
    //Objetos
    //Controladores
    private ControladorCompraBoletos controlCBoletos;
    private ControladorLogin controlLogin;
    //Lectores de Archivos
    private LectorArchivosBinarios<Avión> lectorAviones;
    private LectorArchivosBinarios<Pasaporte> lecturaPasaportes;
    private LectorArchivosBinarios<Vuelo> lecturaVuelos;
    private LectorArchivosBinarios<OperadorVuelo> lecturaPersonal;
    private LectorArchivosBinarios<Pasajero> lecturaPasajeros;
    private LectorArchivosBinarios<Aereopuerto> lecturaAereopuertos;
    private LectorArchivosBinarios<Tarjeta> lecturaTarjetas;
    //GUI
    private PrincipalGUI ventanaPrincipal;
    private CompraBoletosGUI ventanaCompraBoletos;
    private VuelosGUI verificarDatosBoletos;
    private Login login;
    private VuelosGUI tablaVuelos;
    private LlenadoPasaporte llenado;
    private PedirTarjeta pedirTarjeta;

    public Principal() throws IOException {
        lectorAviones = new LectorArchivosBinarios<>("Aviones");
        lecturaPasaportes = new LectorArchivosBinarios<>("Pasaportes");
        lecturaVuelos = new LectorArchivosBinarios<>("Vuelos");
        lecturaPersonal = new LectorArchivosBinarios<>("Personal");
        lecturaPasajeros = new LectorArchivosBinarios<>("Usuarios");
        lecturaAereopuertos = new LectorArchivosBinarios<>("Aereopuertos");
        lecturaTarjetas = new LectorArchivosBinarios<>("Tarjetas");

        //mientras 
        escri = new EscritorArchivosBinarios("Vuelos");
        escriA = new EscritorArchivosBinarios("Pasaportes");
        escri.guardarObjeto(new Vuelo("sdfa", "fds", "Aereopuerto1", "Aereopuerto777", 60, LocalDate.MIN), "vuelo2");
        escriA.guardarObjeto(new Pasaporte(32535, "", LocalDate.MIN, "Puerto rico", "", "", "", "", LocalDate.MIN, LocalDate.MIN, "", 20), "Pasaporte1");
    }

    public void iniciar() {
        ventanaPrincipal = new PrincipalGUI(this);
        ventanaPrincipal.setVisible(true);
    }

    public void comprarBoletos() {
        controlCBoletos = new ControladorCompraBoletos(this);
        ventanaCompraBoletos = new CompraBoletosGUI(this);
        tablaVuelos = new VuelosGUI(this);
        llenado = new LlenadoPasaporte(this);
        pedirTarjeta = new PedirTarjeta(this);

        ventanaPrincipal.setEnabled(false);
        ventanaCompraBoletos.setVisible(true);
        //desbloquearPantallaPrincipal
    }

    public void ingresoPersonal() {
        controlLogin = new ControladorLogin(this);
        login = new Login(this);
        ventanaPrincipal.setEnabled(false);
//      ventanaCompraBoletos.setVisible(false);
        login.setVisible(true);
    }

    public void concederAcceso(Usuario user) {

    }

    public ControladorCompraBoletos getControlCBoletos() {
        return controlCBoletos;
    }

    public ControladorLogin getControlLogin() {
        return controlLogin;
    }

    public LectorArchivosBinarios<Pasaporte> getLecturaPasaportes() {
        return lecturaPasaportes;
    }

    public LectorArchivosBinarios<Vuelo> getLecturaVuelos() {
        return lecturaVuelos;
    }

    public LectorArchivosBinarios<Avión> getLectorAviones() {
        return lectorAviones;
    }

    public LectorArchivosBinarios<OperadorVuelo> getLecturaPersonal() {
        return lecturaPersonal;
    }

    public LectorArchivosBinarios<Tarjeta> getLecturaTarjetas() {
        return lecturaTarjetas;
    }

    public LectorArchivosBinarios<Pasajero> getLecturaPasajeros() {
        return lecturaPasajeros;
    }

    public LectorArchivosBinarios<Aereopuerto> getLecturaAereopuertos() {
        return lecturaAereopuertos;
    }

    public VuelosGUI getTablaVuelos() {
        return tablaVuelos;
    }

    public LlenadoPasaporte getLlenado() {
        return llenado;
    }

    public PedirTarjeta getPedirTarjeta() {
        return pedirTarjeta;
    }

    public CompraBoletosGUI getVentanaCompraBoletos() {
        return ventanaCompraBoletos;
    }

}
