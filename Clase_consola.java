package practica2;
class Consola {

    private String Marca;
    private String Modelo;
    private String Memoria;
    private String Precio;
    private String atr;
    private String atr2;
    private String atr3;
    private String Dimensiones;

    public Consola(String Marca, String Modelo, String Memoria,String Precio,String Dimensiones) {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Memoria = Memoria;
        this.Precio = Precio;
        this.Dimensiones = Dimensiones;
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
    public String getMemoria(){
        return Memoria;
    }
    public void setMemoria(String Memoria){
        this.Memoria = Memoria;
    }
    public String getPrecio(){
        return Precio;
    }
    public void setPrecio(String Precio){
        this.Precio = Precio;
    }
    public String getDimensiones(){
        return Dimensiones;
    }
    public void setDimensiones(String Dimensiones){
        this.Dimensiones = Dimensiones;
    }


    public Consola(String atr,String atr2,String atr3) {
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