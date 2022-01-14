package Logicas;

/**
 *
 * @author JDEAT
 */
public class Logica_usuarios {

    private int id_user;
    private String usuario;
    private String pass;
    private String nombre;
    private String Apellidop;
    private String ApellidoM;
    private String UIDS;
    private String activo;
    private String VDA;
    private String TDU;
    private String Nombre_tipo;

    public String getNombre_tipo() {
        return Nombre_tipo;
    }

    public void setNombre_tipo(String Nombre_tipo) {
        this.Nombre_tipo = Nombre_tipo;
    }

    public String getTDU() {
        return TDU;
    }

    public void setTDU(String TDU) {
        this.TDU = TDU;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidop() {
        return Apellidop;
    }

    public void setApellidop(String Apellidop) {
        this.Apellidop = Apellidop;
    }

    public String getApellidoM() {
        return ApellidoM;
    }

    public void setApellidoM(String ApellidoM) {
        this.ApellidoM = ApellidoM;
    }

    public String getUIDS() {
        return UIDS;
    }

    public void setUIDS(String UIDS) {
        this.UIDS = UIDS;
    }

    public String getActivo() {
        return activo;
    }

    public void setActivo(String activo) {
        this.activo = activo;
    }

    public String getVDA() {
        return VDA;
    }

    public void setVDA(String VDA) {
        this.VDA = VDA;
    }

}
