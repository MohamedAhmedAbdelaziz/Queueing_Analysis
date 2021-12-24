
package queueing_analysis;

import javax.swing.JTextField;


public class DD1K extends Starts{
    JTextField T6,T7 ; 
       public double Tcase1(){  //For A > S finding the exact value of Ti
   K = C + 1 ;
   Ti = (K - (S / A))/ (A - S );
  for (int i = 0 ; i < Ti; i ++){
  int a = (int) (A * i);
  int b = (int) ((S * i) - (S / A) ) ;
  int u = a - b ;
  if (u == K){
  Ti = i;
  }
  }
   return Ti;
   }
   
   public int NumCase1(int t){//Finding n(t) for case 1 A > S
   
   At = 1 / A ;
   Ti = Tcase1();
   if (t <At){
   L =0;
   
  }else if (t >= At && t < Ti){
   int f = (int) (A * t);
   int v = (int) ((S*t)-(S / A));
   L = (int) f - v ;
  
  }else if (t >= Ti){
  L = K - 1;
  }
   
   return (int) L ;
   }
   public double WaitingTime1(){// Calculating Wq(n) for A > S
   At = 1 / A ;
   St = 1 / S ;
   Ti = Tcase1();
   L = NumCase1(T);
   if (L == 0){
   Wq = 0;
   }else if (L < (A * Ti)){
   Wq = (St - At)*(L-1);
  }else if (L >= (A * Ti)){
  Wq = (St - At)*((A * Ti) - 2);
  
  }
  return Wq; 
   
   }
   public int Tcase2(){
       
   Ti = (M)/( S - A );
   for (int i = 0; i <= Ti ; i ++){
   int v = (int) (A * i);
   int f = (int) (S * i);
   int u = v - f ;
   
   if (u ==  M){ 
   Ti = i ; 
   break;
   }
   
   }        
    return (int) Ti ; 
      
   }
   
   
   
   public int NumCase2(int t){
   Ti = Tcase2(); 
   if (t < Ti){
    int v = (int) (A * t);
    int f = (int)(S * t);
    L = M + v - f ;
    
    }else if (t >= Ti){
    if (t < (Ti + 2)){
    L = 0;
    }else if (Ti +2 <= t && t < Ti +3 ){
    L = 1 ;
    }
    }
   return (int) L;
   }
   
   
   public double WaitingTime2(){
   At = 1 / A  ; 
   St = 1 / S ;
   Ti = Tcase2() ;
   L = NumCase2(T); 
   int q = (int) (A * Ti);
   if (L == 0){
   Wq = (M-1) / (2 * S );
    }else if (L  <= q ){
    Wq = ((M - 1 + L) * St)-(L * At);
    }else if (L > q ){
    Wq = 0;
    }else if (A == S){
    Wq = (M - 1 )* (1 / S) ;
    }else if (L > q){
    Wq = 0;
    }
   
   return Wq ;
   }
           
   public void Case1(){
   NumCase1(T);
   WaitingTime1();
   
   }
   public void Case2(){
   NumCase2(T);
   WaitingTime2();
   }
   


        
}
