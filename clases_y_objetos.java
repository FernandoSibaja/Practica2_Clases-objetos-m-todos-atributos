import java.util.Scanner;

import javax.tools.OptionChecker;

class clases_y_objetos{
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opc,opc2;

        while(!salir){
            System.out.println("1. Clase Carro");
            System.out.println("2. Clase Celular");
            System.out.println("3. Clase Consola");
            System.out.println("4. Clase Estudiante");
            System.out.println("5. Clase Bicicleta");
            System.out.println("6. Salir");

            System.out.println("Seleccione alguna opcion");
            opc= sn.nextInt();

            switch(opc){
                case 1:
                    System.out.println("1. Capturar atributos");
                    System.out.println("2. Imprimir Objetos");
                    System.out.println("Seleccione alguna opcion");
                    opc2= sn.nextInt();
                    switch(opc2){
                        case 1:
                            Carro atributo = new Carro("","","");
                            System.out.println("Ingresa el primer atributo");
                            Scanner inatr = new Scanner(System.in);
                            atributo.setatr(inatr.next());
                    
                            System.out.println("Ingresa el Segundo atributo");
                            Scanner inatr2 = new Scanner(System.in);
                            atributo.setatr2(inatr2.next());
                    
                            System.out.println("Ingresa el tercero atributo");
                            Scanner inatr3 = new Scanner(System.in);
                            atributo.setatr3(inatr3.next());
                            System.out.println("Atributos: ");
                            System.out.println(atributo.getatr()+","+atributo.getatr2()+", "+atributo.getatr3());
                           
                            
                            break;
                        case 2:
                            System.out.println("Objetos: ");
                            

                            Carro carro1 = new Carro("Nissan","Sentra","Azul","893-tvz",2015);
                            Carro carro2 = new Carro("Ford","Mustang","Gris","A00-AAA",2006);
                            Carro carro3 = new Carro("Honda","Civic","Blanco","FBF-84-14",2016);
                            System.out.println(carro1.getMarca()+", "+carro1.getModelo()+", "+carro1.getColor()+", "+carro1.getMatricula()+", "+carro1.getAño());
                            System.out.println(carro2.getMarca()+", "+carro2.getModelo()+", "+carro2.getColor()+", "+carro2.getMatricula()+", "+carro2.getAño());
                            System.out.println(carro3.getMarca()+", "+carro3.getModelo()+", "+carro3.getColor()+", "+carro3.getMatricula()+", "+carro3.getAño()); 
                            break;
                    }
                
                    break;
                case 2:
                System.out.println("1. Capturar atributos");
                System.out.println("2. Imprimir Objetos");
                System.out.println("Seleccione alguna opcion");
                opc2= sn.nextInt();
                switch(opc2){
                    case 1:
                        Celular atributo = new Celular("","","");
                        System.out.println("Ingresa el primer atributo");
                        Scanner inatr = new Scanner(System.in);
                        atributo.setatr(inatr.next());
                
                        System.out.println("Ingresa el Segundo atributo");
                        Scanner inatr2 = new Scanner(System.in);
                        atributo.setatr2(inatr2.next());
                
                        System.out.println("Ingresa el tercero atributo");
                        Scanner inatr3 = new Scanner(System.in);
                        atributo.setatr3(inatr3.next());
                        System.out.println("Atributos: ");
                        System.out.println(atributo.getatr()+","+atributo.getatr2()+", "+atributo.getatr3());
                       
                        
                        break;
                    case 2:
                        System.out.println("Objetos: ");
                        

                        Celular celular1 = new Celular("POCO X3","Azul","6GB","4.520mAh","20MP");
                        Celular celular2 = new Celular("Redmi Note 10 pro","Negro","6GB","5.020mAh","16Mp");
                        Celular celular3 = new Celular("Oppo A91","Azul","8GB","4.025mAh","16MP");
                        System.out.println(celular1.getNombre()+", "+celular1.getColor()+", "+celular1.getRAM()+", "+celular1.getBateria()+", "+celular1.getCamara());
                        System.out.println(celular2.getNombre()+", "+celular2.getColor()+", "+celular2.getRAM()+", "+celular2.getBateria()+", "+celular2.getCamara());
                        System.out.println(celular3.getNombre()+", "+celular3.getColor()+", "+celular3.getRAM()+", "+celular3.getBateria()+", "+celular3.getCamara()); 
                        break;
                }
                    
                    break;
                case 3:
                System.out.println("1. Capturar atributos");
                System.out.println("2. Imprimir Objetos");
                System.out.println("Seleccione alguna opcion");
                opc2= sn.nextInt();
                switch(opc2){
                    case 1:
                        Consola atributo = new Consola("","","");
                        System.out.println("Ingresa el primer atributo");
                        Scanner inatr = new Scanner(System.in);
                        atributo.setatr(inatr.next());
                
                        System.out.println("Ingresa el Segundo atributo");
                        Scanner inatr2 = new Scanner(System.in);
                        atributo.setatr2(inatr2.next());
                
                        System.out.println("Ingresa el tercero atributo");
                        Scanner inatr3 = new Scanner(System.in);
                        atributo.setatr3(inatr3.next());
                        System.out.println("Atributos: ");
                        System.out.println(atributo.getatr()+","+atributo.getatr2()+", "+atributo.getatr3());
                       
                        
                        break;
                    case 2:
                        System.out.println("Objetos: ");
                        

                        Consola consola1 = new Consola("Sony","Playstation 5","16GB GDDR6","500 dolares","390x104x260mm");
                        Consola consola2 = new Consola("Microsoft","XBOX SERIES S","10HB GDDR6","300 dolares","65x151x275mm");
                        Consola consola3 = new Consola("Microsoft","XBOX ONE X","12GB GDDR5","434 dolares","300x240x60mm");
                        System.out.println(consola1.getMarca()+", "+consola1.getModelo()+", "+consola1.getMemoria()+", "+consola1.getPrecio()+", "+consola1.getDimensiones());
                        System.out.println(consola2.getMarca()+", "+consola2.getModelo()+", "+consola2.getMemoria()+", "+consola2.getPrecio()+", "+consola2.getDimensiones());
                        System.out.println(consola3.getMarca()+", "+consola3.getModelo()+", "+consola3.getMemoria()+", "+consola3.getPrecio()+", "+consola3.getDimensiones()); 
                        break;
                }
                     break;
                case 4:
                System.out.println("1. Capturar atributos");
                System.out.println("2. Imprimir Objetos");
                System.out.println("Seleccione alguna opcion");
                opc2= sn.nextInt();
                switch(opc2){
                    case 1:
                        Estudiante atributo = new Estudiante("","","");
                        System.out.println("Ingresa el primer atributo");
                        Scanner inatr = new Scanner(System.in);
                        atributo.setatr(inatr.next());
                
                        System.out.println("Ingresa el Segundo atributo");
                        Scanner inatr2 = new Scanner(System.in);
                        atributo.setatr2(inatr2.next());
                
                        System.out.println("Ingresa el tercero atributo");
                        Scanner inatr3 = new Scanner(System.in);
                        atributo.setatr3(inatr3.next());
                        System.out.println("Atributos: ");
                        System.out.println(atributo.getatr()+","+atributo.getatr2()+", "+atributo.getatr3());
                       
                        
                        break;
                    case 2:
                        System.out.println("Objetos: ");
                        

                        Estudiante estudiante1 = new Estudiante("154236","Fernando","19","541","4");
                        Estudiante estudiante2 = new Estudiante("781246","Mayerli","21","206","7");
                        Estudiante estudiante3 = new Estudiante("913782","Luis","20","520","2");
                        System.out.println(estudiante1.getID()+", "+estudiante1.getNombre()+", "+estudiante1.getEdad()+", "+estudiante1.getGrupo()+", "+estudiante1.getAño());
                        System.out.println(estudiante2.getID()+", "+estudiante2.getNombre()+", "+estudiante2.getEdad()+", "+estudiante2.getGrupo()+", "+estudiante2.getAño());
                        System.out.println(estudiante3.getID()+", "+estudiante3.getNombre()+", "+estudiante3.getEdad()+", "+estudiante3.getGrupo()+", "+estudiante3.getAño()); 
                        break;
                }
                    
                    break;
                case 5:
                System.out.println("1. Capturar atributos");
                System.out.println("2. Imprimir Objetos");
                System.out.println("Seleccione alguna opcion");
                opc2= sn.nextInt();
                switch(opc2){
                    case 1:
                        Bicicleta atributo = new Bicicleta("","","");
                        System.out.println("Ingresa el primer atributo");
                        Scanner inatr = new Scanner(System.in);
                        atributo.setatr(inatr.next());
                
                        System.out.println("Ingresa el Segundo atributo");
                        Scanner inatr2 = new Scanner(System.in);
                        atributo.setatr2(inatr2.next());
                
                        System.out.println("Ingresa el tercero atributo");
                        Scanner inatr3 = new Scanner(System.in);
                        atributo.setatr3(inatr3.next());
                        System.out.println("Atributos: ");
                        System.out.println(atributo.getatr()+","+atributo.getatr2()+", "+atributo.getatr3());
                       
                        
                        break;
                    case 2:
                        System.out.println("Objetos: ");
                        

                        Bicicleta bicicleta1 = new Bicicleta("Bicicleta de montaña","Turbo","Adulto","Gris","Parte delantera");
                        Bicicleta bicicleta2 = new Bicicleta("Bicicleta de ciudad","CENTURFIT","Adulto","Blanco","Parte delantera");
                        Bicicleta bicicleta3 = new Bicicleta("Bicicleta de montaña","Mercurio","Adulto","Gris","Parte delantera");
                        System.out.println(bicicleta1.getTipo()+", "+bicicleta1.getMarca()+", "+bicicleta1.getMedidas()+", "+bicicleta1.getColor()+", "+bicicleta1.getSuspension());
                        System.out.println(bicicleta2.getTipo()+", "+bicicleta2.getMarca()+", "+bicicleta2.getMedidas()+", "+bicicleta2.getColor()+", "+bicicleta2.getSuspension());
                        System.out.println(bicicleta3.getTipo()+", "+bicicleta3.getMarca()+", "+bicicleta3.getMedidas()+", "+bicicleta3.getColor()+", "+bicicleta3.getSuspension());  
                        break;
                }
                     break;
                case 6:
                    salir=true;
            }
        } 
    }
}

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







