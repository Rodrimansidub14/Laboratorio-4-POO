import java.util.Scanner;
public class principal{
    public void cambioModo(Radio radio,String modo){
        radio.setModo(modo);        
    }
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        Radio radio=new Radio("Pionner", "xc-32");
        Boolean estadoRadio=radio.getEstado();
        String seleccion;
        System.out.println("Desea encender el radio? y/n");
        seleccion=teclado.next();
        if(seleccion.equalsIgnoreCase("y")){
            radio.setEstado(true);
        }
        String seleccionModo;
        String modo;
        while(radio.getEstado()!=false){
            if(radio.getModo().equalsIgnoreCase("radio")){
                System.out.println("\n-------------------------");
                System.out.println("Modo: Radio");
                System.out.println("1. Cambiar modo");
                System.out.println("2. Apagar radio");
                System.out.println("3. Cambiar volumen");
                System.out.println("4. Cambiar fm/am");
                System.out.println("5. Cambiar emisora");
                System.out.println("6. Guardar emisora");
                System.out.println("7. Cargar emisora");
                seleccionModo=teclado.next();
                if(seleccionModo.equalsIgnoreCase("1")){
                    System.out.println("1. Telefono");
                    System.out.println("2. Reproduccion");
                    System.out.println("3. Productividad");
                    modo=teclado.next();
                    if(modo.equalsIgnoreCase("1")){
                        modo="telefono";
                    }else if(modo.equalsIgnoreCase("2")){
                        modo="reproduccion";
                    }else if(modo.equalsIgnoreCase("3")){
                        modo="productividad";
                    }else{
                        modo="radio";
                        System.out.println("Modo no cambiado");
                    }
                    radio.setModo(modo);
                }else if(seleccionModo.equalsIgnoreCase("2")){
                    radio.setEstado(false);
                }else if(seleccionModo.equalsIgnoreCase("3")){
                    String operador;
                    System.out.println("Ingrese si desea subir (+) o bajar ()-");
                    operador=teclado.next();
                    if(operador.equalsIgnoreCase("+")){

                        radio.setVolumen(radio.getVolumen()+1);
                    }else if(operador.equalsIgnoreCase("-")){
                        radio.setVolumen(radio.getVolumen()-1);

                    }
                    System.out.println("Volumen: "+radio.getVolumen());
                }else if(seleccionModo.equalsIgnoreCase("4")){
                    radio.cambiarFmAm();
                    System.out.println(radio.getFrecuencia());
                }else if(seleccionModo.equalsIgnoreCase("5")){
                    String operador;
                    System.out.println("Ingrese si desea subir (+) o bajar (-) la emisora");
                    operador=teclado.next();
                    if(operador.equalsIgnoreCase("+")){

                        radio.cambiarEmisora(operador);
                        System.out.println(radio.getEmisora());
                    }else if(operador.equalsIgnoreCase("-")){
                        radio.cambiarEmisora(operador);
                        System.out.println(radio.getEmisora());

                    }
                }else if(seleccionModo.equalsIgnoreCase("6")){
                    radio.guardarEmisora(radio.getEmisora());
                    System.out.println("Emisora guardada");
                }else if(seleccionModo.equalsIgnoreCase("7")){
                    int posicion=0;
                    System.out.println("Ingresa la posicion de la emisora que quieres reproducir ");
                    posicion=teclado.nextInt();
                    radio.cargarEmisora(posicion);
                }else{
                    System.out.println("Seleccion incorrecta");
                }
            }else if(radio.getModo().equalsIgnoreCase("telefono")){
                System.out.println("\n-------------------------");
                System.out.println("Modo: Telefono");
                System.out.println("1. Cambiar modo");
                System.out.println("2. Apagar modo");
                System.out.println("3. Cambiar volumen");
                System.out.println("4. Mostrar contacto");
                System.out.println("5. Llamar contacto");
                System.out.println("6. Llamar ultimo contacto");
                seleccionModo=teclado.next();
                if(seleccionModo.equalsIgnoreCase("1")){
                    System.out.println("1. radio");
                    System.out.println("2. Reproduccion");
                    System.out.println("3. Productividad");
                    modo=teclado.next();
                    if(modo.equalsIgnoreCase("1")){
                        modo="radio";
                    }else if(modo.equalsIgnoreCase("2")){
                        modo="reproduccion";
                    }else if(modo.equalsIgnoreCase("3")){
                        modo="productividad";
                    }else{
                        modo="telefono";
                        System.out.println("Modo no cambiado");
                    }
                    radio.setModo(modo);
                }else if(seleccionModo.equalsIgnoreCase("2")){
                    radio.setEstado(false);
                }else if(seleccionModo.equalsIgnoreCase("3")){

                }else if(seleccionModo.equalsIgnoreCase("4")){
                    
                }else if(seleccionModo.equalsIgnoreCase("5")){
                    
                }else if(seleccionModo.equalsIgnoreCase("6")){
                    
                }else{
                    System.out.println("Opcion incorrecta");
                }
                
            }else if(radio.getModo().equalsIgnoreCase("reproduccion")){
                System.out.println("\n-------------------------");
                System.out.println("Modo: Reproduccion");
                System.out.println("1. Cambiar modo");
                System.out.println("2. Apagar radio");
                System.out.println("3. Seleccionar lista");
                System.out.println("4. Cambiar cancion");
                System.out.println("5. Escuchar cancion");
                seleccionModo=teclado.next();
                if(seleccionModo.equalsIgnoreCase("1")){
                    System.out.println("1. Telefono");
                    System.out.println("2. Radio");
                    System.out.println("3. Productividad");
                    modo=teclado.next();
                    if(modo.equalsIgnoreCase("1")){
                        modo="telefono";
                    }else if(modo.equalsIgnoreCase("2")){
                        modo="radio";
                    }else if(modo.equalsIgnoreCase("3")){
                        modo="productividad";
                    }else{
                        modo="reproduccion";
                        System.out.println("Modo no cambiado");
                    }
                    radio.setModo(modo);
                
                }else if(seleccionModo.equalsIgnoreCase("2")){
                    radio.setEstado(false);
                }else if(seleccionModo.equalsIgnoreCase("3")){

                }else if(seleccionModo.equalsIgnoreCase("4")){
                    
                }else if(seleccionModo.equalsIgnoreCase("5")){
                    
                }else{
                    System.out.println("Opcion incorrecta");
                }
            }else if(radio.getModo().equalsIgnoreCase("productividad")){
                System.out.println("\n-------------------------");
                System.out.println("Modo: productividad");
                System.out.println("1. Cambiar modo");
                System.out.println("2. Apagar radio");
                System.out.println("3. Ver tarjetas de presentacion");
                seleccionModo=teclado.next();
                if(seleccionModo.equalsIgnoreCase("1")){
                    System.out.println("1. Telefono");
                    System.out.println("2. Reproduccion");
                    System.out.println("3. radio");
                    modo=teclado.next();
                    if(modo.equalsIgnoreCase("1")){
                        modo="telefono";
                    }else if(modo.equalsIgnoreCase("2")){
                        modo="reproduccion";
                    }else if(modo.equalsIgnoreCase("3")){
                        modo="radio";
                    }else{
                        modo="productividad";
                        System.out.println("Modo no cambiado");
                    }
                    radio.setModo(modo);
                
                }else if(seleccionModo.equalsIgnoreCase("2")){
                    radio.setEstado(false);
                }else if(seleccionModo.equalsIgnoreCase("3")){

                }else{
                    System.out.println("Opcion incorrecta");
                }
            }
        }
        System.out.println("Feliz dia");
    }
}