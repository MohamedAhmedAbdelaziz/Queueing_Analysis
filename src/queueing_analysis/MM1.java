
package queueing_analysis;
public class MM1 extends Starts{
      double Number_of_Customers_in_the_System (){
    L = (A/(S-A));
    return L;
    }
    double Number_of_the_customers_in_the_queue(){

     Lq = (A*A)/(S*(S-A));
     return Lq;
    }
    double Waiting_time_in_the_system(){
     W =  1/(S-A);
     return W;
    }
    double Waiting_time_in_the_queue(){
     Wq =  A/(S*(S-A)); 
     return Wq;
    }
}
