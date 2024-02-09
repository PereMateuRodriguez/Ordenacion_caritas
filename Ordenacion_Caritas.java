public class Main {
  public static void main(String[] args) {
    String[] emotions = {":D", ":D", ":(", "T_T"};
    boolean order = false;
    //Orden de lvl de la lista 
    int[] b = new int[emotions.length];
    //Classificar por lvl
    for (int i = 0; i < emotions.length; i++){
    	if(emotions[i] == ":D"){
        	b[i] = 1;
        }
        else if(emotions[i] == ":)"){
        	b[i] = 2;
        }
        else if(emotions[i] == ":|"){
        	b[i] = 3;
        }
        else if(emotions[i] == ":("){
        	b[i] = 4;
        }
        else if(emotions[i] == "T_T"){
        	b[i] = 5;
        }
    }
    if (order == true){
    for (int i = 0; i < emotions.length ; i++){
      for (int j = 0; j < emotions.length ; j++){
                  if (b[i] < b[j]){
                  	//LISTA ENTEROS
                      int temp = b[i];
                      b[i] = b[j];
                      b[j] = temp;
                      //LISTA STRING
                      String tempo = emotions[i];
                      emotions[i] = emotions[j];
                      emotions[j] = tempo;
                  }
              }
    }
    
    }
    //Invertido
    else{
    for (int i = 0; i < emotions.length ; i++){
      for (int j = 0; j < emotions.length ; j++){
                  if (b[i] > b[j]){
                  	//LISTA ENTEROS
                      int temp = b[i];
                      b[i] = b[j];
                      b[j] = temp;
                      //LISTA STRING
                      String tempo = emotions[i];
                      emotions[i] = emotions[j];
                      emotions[j] = tempo;
                  }
              }
    	}
    }
    
    //comprobacion
    
    for (int i= 0; i < emotions.length; i++ ){
    	System.out.println(emotions[i]);
    }
    
    
    
    
  }
}
