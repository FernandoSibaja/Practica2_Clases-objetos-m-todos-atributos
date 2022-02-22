package practica2;
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







