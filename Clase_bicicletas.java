package practica2;

class Bicicleta {

    private String Tipo;
    private String Marca;
    private String Medidas;
    private String Color;
    private String atr;
    private String atr2;
    private String atr3;
    private String Suspension;

    public Bicicleta(String Tipo, String Marca, String Medidas,String Color,String Suspension) {
        this.Tipo = Tipo;
        this.Marca = Marca;
        this.Medidas = Medidas;
        this.Color = Color;
        this.Suspension = Suspension;
    }
    public String getTipo(){
        return Tipo;
    }
    public void setTipo(String Tipo){
        this.Tipo = Tipo;
    }
    public String getMarca(){
        return Marca;
    }
    public void setMarca(String Marca){
        this.Marca = Marca;
    }
    public String getMedidas(){
        return Medidas;
    }
    public void setMedidas(String Medidas){
        this.Medidas = Medidas;
    }
    public String getColor(){
        return Color;
    }
    public void setColor(String Color){
        this.Color = Color;
    }
    public String getSuspension(){
        return Suspension;
    }
    public void setSuspension(String Suspension){
        this.Suspension = Suspension;
    }


    public Bicicleta(String atr,String atr2,String atr3) {
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
