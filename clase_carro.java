package practica2;
class Carro {

    private String Marca;
    private String Modelo;
    private String Color;
    private String Matricula;
    private String atr;
    private String atr2;
    private String atr3;
    private int Año;

    public Carro(String Marca, String Modelo, String Color,String Matricula,int Año) {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Color = Color;
        this.Matricula = Matricula;
        this.Año = Año;
    }
    public String getMarca(){
        return Marca;
    }
    public void setMarca(String Marca){
        this.Marca = Marca;
    }
    public String getModelo(){
        return Modelo;
    }
    public void setModelo(String Modelo){
        this.Modelo = Modelo;
    }
    public String getColor(){
        return Color;
    }
    public void setColor(String Color){
        this.Color = Color;
    }
    public String getMatricula(){
        return Matricula;
    }
    public void setMatricula(String Matricula){
        this.Matricula = Matricula;
    }
    public int getAño(){
        return Año;
    }
    public void setAño(int Año){
        this.Año = Año;
    }


    public Carro(String atr,String atr2,String atr3) {
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