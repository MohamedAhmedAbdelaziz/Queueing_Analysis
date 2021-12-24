
package queueing_analysis;
public class MM1K extends Starts{
        double R , Pk, P0;
  
    public double P0(){
    R = A/S;
    K = C ;
    double u = Math.pow(R, (K+1));
    if (R != 1 ){
    P0 = (1-R) / (1-u) ;
    
    }else if (R == 1){
    P0 = 1/(K+1);
    }
    return P0;
    }
    
    public double Pk(){
    R = A / S ;
    K = C ;
    double f = P0();
    double u = Math.pow(R, K);
    if (R == 1){
    Pk = 1/ (K+1);
    }else if (R != 1){
    Pk = u*f ;
    
    }
   
    return Pk;
    }
    double Number_of_customers_in_the_system(){
    R = A /S ;
    K = C ;
    if (R != 1){
    double u = Math.pow(R, K);
    double v = Math.pow(R , (K+1));
    double a = 1-((K+1)*u)+(K * (v));
    double b = (1 - R)*(1-v);
    L = ((a/b) * R);
    }else if (R == 1){
    L = K/2 ;
    }
    
    return L;
    }
    double Number_of_customers_in_the_queue(){
    double u = Pk();
    double Ad = A*(1-u);
    double v = Number_of_customers_in_the_system();
    Lq = v - (Ad / S);
    return Lq;
    }
    double Waiting_time_in_the_system(){
    double v = Number_of_customers_in_the_system();
    double u = Pk();
    W = v / (A * (1 - u)) ;
    return W;
    }
    double Waiting_time_in_the_queue(){
    double u = Waiting_time_in_the_system();
    Wq = u - (1 / S);
    return Wq;
    }
}
