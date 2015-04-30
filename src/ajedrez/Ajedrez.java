
package ajedrez;

public class Ajedrez {

//constructor
    public Ajedrez(){
        
    }
    private boolean contains(int [][] tablero, int num){
        int x=0, y=0;
        boolean resp=true;
        while(y<tablero.length && tablero[x][y]!=num)
            y++;
        if(y==tablero.length){
            y=0;
            x++;
        }
        if(x==tablero.length-1 && y==tablero.length-1)
            resp=false;
        return resp;
    }
    
public void imprimeMatriz(int [][] matriz){
for (int x=0; x < matriz.length; x++) {
  //System.out.print("|");
  for (int y=0; y < matriz[x].length; y++) {
    System.out.print (matriz[x][y]);
    if (y!=matriz[x].length-1) 
        System.out.print(" ");
     }
 System.out.println(" ");
}
}
    
    public boolean RecorrerCaballo(int [][] tablero, int x, int y, int val){
       
        if(contains(tablero,0)){
            imprimeMatriz(tablero);
            return true;
        }
        if(val==tablero.length-1*tablero.length-1)
            return true;
         if(x>=tablero.length || y>=tablero.length)
             return false;
        if(tablero[x][y]!=0)
             return false;
   
        tablero[x][y]=val;
        
  
        if(RecorrerCaballo(tablero,x-2,y+1,val+1))//arriba-derecha
            return true;
        if(RecorrerCaballo(tablero,x-2,y-1,val+1))//arriba-izquierda
            return true;
        if(RecorrerCaballo(tablero,x+2,y+1,val+1))//abajo-derecha
            return true;
        if(RecorrerCaballo(tablero,x+2,y-1,val+1))//abajo-izquierda
            return true;
        if(RecorrerCaballo(tablero,x-1,y+2,val+1))//derecha-arriba
            return true;
        if(RecorrerCaballo(tablero,x+1,y+2,val+1))//derecha-abajo
            return true;
        if(RecorrerCaballo(tablero,x-1,y-2,val+1))//izquierda-arriba
            return true;
        if(RecorrerCaballo(tablero,x+1,y-2,val+1))//izquierda-abajo
            return true;
            
        tablero[x][y]=0;
             return false;
            
                      
    }
    
    
    public static void main(String[] args) {
       Ajedrez a=new Ajedrez();
       int [][]tablero=new int[5][5];
   
       a.RecorrerCaballo(tablero, 2, 2, 1);
       //a.imprimeMatriz(tablero);
    }
    
}
