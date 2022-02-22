package practica2;
class Estudiante {

    private String ID;
    private String Nombre;
    private String Edad;
    private String Grupo;
    private String atr;
    private String atr2;
    private String atr3;
    private String Año;

    public Estudiante(String ID, String Nombre, String Edad,String Grupo,String Año) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Grupo = Grupo;
        this.Año = Año;
    }
    public String getID(){
        return ID;
    }
    public void setID(String ID){
        this.ID = ID;
    }
    public String getNombre(){
        return Nombre;
    }
    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }
    public String getEdad(){
        return Edad;
    }
    public void setEdad(String Edad){
        this.Edad = Edad;
    }
    public String getGrupo(){
        return Grupo;
    }
    public void setPrecio(String Grupo){
        this.Grupo = Grupo;
    }
    public String getAño(){
        return Año;
    }
    public void setAño(String Año){
        this.Año = Año;
    }


    public Estudiante(String atr,String atr2,String atr3) {
        this.atr = atr;
        this.atr2 = atr3;
        this.atr3 = atr3;
        
    }
    public String getatr(){
        return atr;
    }
    public void setatr(String atr){
        this.atr = atr;
    }
    public String getatr2(){
        return atr2;
    }
    public void setatr2(String atr2){
        this.atr2 = atr2;
    }
    public String getatr3(){
        return atr3;
    }
    public void setatr3(String atr3){
        this.atr3 = atr3;
    }
}