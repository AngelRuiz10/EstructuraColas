class colagenerica
 {
    //variables para implementacion de la cola
    public int max;
    protected Object dret;
    public Object c[];
    public int fre = -1;
    public int fin = -1;
    
    public colagenerica()
     {
        max=20;
        c=new Object [max];
     }
    //constructor colagenerica 
    public colagenerica(int n)
       { max=n;
        c=new Object [max];
       } 
    //Constructor para verificar si esta llena la cola
    public boolean colallena(int fin,int max)
    {
      //Declaracion de la variable
      boolean llena;
      //Si la cola esta llena returna true
      if (fin==max-1)
        llena=true;
        else
          //De lo contrario es false
          llena=false;
      return llena;
     }
    //constructor cola vacia
    public boolean colavacia(int fre)
    {
      //si el principio de la cola esta vacia
      //retornara verdadero
      boolean vacia;
      if (fre==-1)
        vacia=true;
        else
          vacia=false;
      return vacia;
     }   
    //constructor para insertar un nodo en la cola
    public boolean inscola(Object dato)
     {
         //Si fin es -1 retorna false
        if (fin==max-1)
           return false;
        //varible fin incrementara
        fin++;
        c[fin] = dato;
        if (fin==0)
           fre=0;
        return true;
     }
   //constructor retorna cola
    public boolean retcola()
      {
        if (fre ==-1)
           return false;
        dret=c[fre];
        if (fre==fin)
          {
            fre=-1;
            fin=-1;
          }
         else
           fre++;
        return true;
      }
 }