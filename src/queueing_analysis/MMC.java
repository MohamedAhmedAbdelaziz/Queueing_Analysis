
package queueing_analysis;
public class MMC extends Starts{
    
double R , r , P0 , Pn;
public double P0(){
double u ;
r = A / S ;
R = r / X ; 
double a = Summation (); 
double b = Power(r, X);
double v = Fact(X);
if (R < 1 ){
u = a + (((X * b) /(v * (X - r)))); 
P0 = 1 / u ; 

}else if (R >=1){
u = a + (((1/v)*b)*((X * S)/ ((X * S)- A)));
P0 = 1 / u ;
}
return P0;
}
public double Number_of_customers_in_the_queue(){
r = A / S ;
R = r / X ;
double b = Power (r , X ); 
double a = P0();
double d = Fact((X - 1));
double x = ((X * S) - (A) ); 
double y = Power(x , 2);
double u = b * A * S ;
double f = d * y ;
Lq = (u / f )* (a ); 
return Lq;
}
public double Number_of_customers_in_the_system(){
 r = A / S ;
 R = r / X ; 
 double u = Number_of_customers_in_the_queue();
 L = u + r ; 
 return L;
}
public double Waiting_time_in_the_queue(){
 r = A / S ;
 R = r / X ; 
 double u = Number_of_customers_in_the_queue(); 
  Wq = u / A ;
  
return Wq ;
}
public double Waiting_time_in_the_System(){
 r = A / S ;
 R = r / X ; 
 double u = Waiting_time_in_the_queue();
 W = u + (1 / S ) ;
return W;
}



 public double Power (double a , double b){
 if (b == 0){
 return 1 ;
 }else {
 return a * Power (a , (b-1));
 }
 
 }
 
 public double Summation (){
 r = A / S ;
 R = r / X ; 
 double sum = 0 ;
 for (int i = 0; i<= X; i ++ ){
  double f = Fact(i) ;
  double u = Math.pow(r, i);
  double v = u / f ;
  sum = sum + v ;
 }
return sum ;
 }
 
public static int Fact(int num ){
 if (num == 0){
  return 1 ;
 }else {
 return num * Fact((num-1));
 }

}
}
