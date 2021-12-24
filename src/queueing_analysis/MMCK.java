
package queueing_analysis;

public class MMCK extends Starts{
        double  P0 , Pk; 

    double r = A / S ;
    double R = r / X ;
    int K = C ;
   public double P0(){
    double u ; 
    r = A / S ;
    R = r / X ;
    K = C ;
    
    double a = Summation (); 
    double c = Power(r, X );
    double d = Fact(X);
    double E = c / d ;
    if (R != 1 ){
    double g = Power (R , (K - X + 1));
    double f = (1-g) /(1 - R);
    u = a + (E * f);
    P0 = 1 / u ;
    }else if (R == 1 ){
    u = a + (E * (K - X + 1));
    P0 = 1 / u ;
    }
    return P0 ;
    }
   
    public double Pk (){
    r = A / S ;
    R = r / X ;
    K = C ;
    double a = P0(); 
    double b = Power (r, K ) ;
    double c = Fact(K);
    if (K >=0 && K < X){
    Pk = (b / c) * a ;
    
    }else if (K >= X){
    double u = Power(X , (K-X));
    Pk = (b/(u * c)) * a ;
    
    }
    
    return Pk;
    
    }
    public double Number_of_customers_in_the_queue(){
    r = A / S ;
    R = r / X ;
    K = C ;
    double a = Fact (X);
    double b = Power (r , X );
    double d = P0();
    double E =(1 - R) * (1 - R) ; 
    double Z = Power(R , (K - X + 1 ));
    double B = Power(R , (K - X));
    double u = (R * b * d) /(a * E);
    double v = (1 - (Z)-((1 - R) * (K - (X + 1 ) * (B))));
    Lq = u * v ;
    return Lq ;
    }
    public double Number_of_customers_in_the_system(){
    r = A / S ;
    R = r / X ;
    K = C ;
    double a = Summation2 ();
    double b = P0();
    double d = a * b ;
    double x = Number_of_customers_in_the_queue();
    L = x + X - d ;
    return L;
    }
    public double Waiting_time_in_the_queue(){
    r = A / S ;
    R = r / X ;
    K = C ;
    double x = Number_of_customers_in_the_queue();
    double b = Pk();
    double Ad = A * (1- b );
    Wq = x / Ad ; 
    return Wq;
    }
    double Waiting_time_in_the_system(){
    r = A / S ;
    R = r / X ;
    K = C ;
    double b = Pk();
    double Ad = A *(1-b);
    double y = Number_of_customers_in_the_system();
    W = y / Ad ;
    return W ;
    
    }
     public double Summation (){
    r = A / S ;
    R = r / X ;
    double sum = 0; 
    for (int i = 0 ;i <= (X-1) ; i++){
    double f = Fact(i);
    double u = Power(r , i);
    double v = u / f ;
    sum = sum + v ;
    }
    
    return sum;
    }
    public static int Fact(int num ){
    if (num == 0){
    return 1 ;
   }else {
    
    return num * Fact((num - 1));
    }
    }
    double Summation2 (){
    K = C ;
    r = A / S ;
    R = r / X ;
    double sum = 0 ; 
    for (int i=0 ; i < (X - 1 ); i ++){
    double a = Power (r , i) ; 
    double b = Fact(i);
    double d = X - i ;
    double u = d * (a / b ); 
    sum = sum + u ;
    
    }
    return sum ;
    }
    
    public double Power (double a , double b){
    if (b == 0) {
    return 1;
    }else{
    return a * Power(a , (b - 1 ));
    }
     }
}
