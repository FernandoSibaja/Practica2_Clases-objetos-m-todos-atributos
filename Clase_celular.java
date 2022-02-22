package practica2;
class Celular {

    private String Nombre;
    private String Color;
    private String RAM;
    private String Bateria;
    private String atr;
    private String atr2;
    private String atr3;
    private String Camara;

    public Celular(String Nombre, String Color, String RAM,String Bateria,String Camara) {
        this.Nombre = Nombre;
        this.Color = Color;
        this.RAM = RAM;
        this.Bateria = Bateria;
        this.Camara = Camara;
    }
    public String getNombre(){
        return Nombre;
    }
    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }
    public String getColor(){
        return Color;
    }
    public void setColor(String Color){
        this.Color = Color;
    }
    public String getRAM(){
        return RAM;
    }
    public void setRAM(String RAM){
        this.RAM = RAM;
    }
    public String getBateria(){
        return Bateria;
    }
    public void setBateria(String Bateria){
        this.Bateria = Bateria;
    }
    public String getCamara(){
        return Camara;
    }
    public void setAño(String Camara){
        this.Camara = Camara;
    }


    public Celular(String atr,String atr2,String atr3) {
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