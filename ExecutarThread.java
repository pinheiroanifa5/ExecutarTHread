public class ExecutarThread {
    public static  void main (String[] args ){
        new Thread(t1).start();   //assincrona executar de forma alternada
        new  Thread(t2).start();
        new  Thread(t3).start();
        new  Thread(t4).start();
        new  Thread(t5).start();
    }

        
private static Runnable t1= new Runnable(){ //instancia 
    public void run(){
        for(int a=0;a<50;a++){
            System.out.println("Thread 1: "+a);
        }

    }
}; 

private static Runnable t2= new Runnable(){
    public void run(){
        for(int b=0;b<50;b++){
            System.out.println("Thread 2: "+b);
        }

    }
}; 

private static Runnable t3= new Runnable(){
    public void run(){
        for(int c=0;c<50;c++){
            System.out.println("Thread 3: "+c);
        }

    }
}; 

private static Runnable t4= new Runnable(){
    public void run(){
        for(int d=0;d<50;d++){
            System.out.println("Thread 4: "+d);
        }

    }
};   

private static Runnable t5= new Runnable(){
    public void run(){
        for(int e=0;e<50;e++){
                System.out.println("Thread 5: "+e);
         }
    
     }
 }; 
    
    
}







