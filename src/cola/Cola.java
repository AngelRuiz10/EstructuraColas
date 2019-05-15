import java.util.*;
//Autor Angel Ruiz
//0901-16-17865
public class Cola {
    //Constructor que contine el main principal
    public static void main( String args[] ){
       //Crea el metodo scanner 
       Scanner leer = new Scanner(System.in);
       //Crea el metodo colagenerica
       colagenerica obj = new colagenerica();
       //Declaracion de las variables 
       int op;  //opcion
       int num; //Numero
       //ciclo do-while
       do{
          menu();
          //Llamada para leer en consola
          op = leer.nextInt(); 
          //Estructura de control swith
          switch(op){
              case 1://Inserta los numeros deseados
                     System.out.println( "Numero a insertar" );
                     num = leer.nextInt();
                     if(obj.inscola(num)){
                        System.out.println( "fre"+obj.fre+"fin"+obj.fin+"aux"+obj.max );
                        System.out.println( "El numero "+num+" se inserto en la cola ["+obj.dret+"]" );
                        System.out.println();
                     }
                     else{
                         //Si la cola esta llena retorna un mensaje
                          System.out.println( "Cola llena" );
                     }
                     break;
              case 2: //Eliminar
                    if(obj.retcola()){
                       System.out.println( "El dato retirado fue: "+obj.dret );
                    }
                    else{
                        //Si no dispone de un nodo, mostrara un mensaje
                        System.out.println( "Cola vacia" );
                    }
                    break;
              case 3://Estado de la cola
                    if(obj.fre==-1 && obj.fin==-1){
                       System.out.println( "Cola vacia" );
                    }
                    else{
                         System.out.println( "Estado de la cola:" );
                         for(int i=obj.fre; i<=obj.fin; i++){
                            System.out.print(obj.c[i]+" \t");
                         }
                         break;
                    }
          }
       }
       while(op != 4);
    }
    //constructor que llama el metodo menu
    public static void menu(){
       System.out.println( "\n\t Menu para colas \n" );
       System.out.println( "1.- Insertar" );
       System.out.println( "2.- Retirar" );
       System.out.println( "3.- Estado" );
       System.out.println( "4.- Fin" );
       System.out.println( "\n Selecciona" );
    }
}