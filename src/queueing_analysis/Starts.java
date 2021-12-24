
package queueing_analysis;


import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Starts {
    JTextField T1,T2,T3,T4;
    double A,S , At, St;
    int C, X , T ,  K , M ;
    double L , Lq, W, Wq, Ti;
    
    
    
    public void IN(JTextField T1 , JTextField T2){
        A = EvaluatDouble(T1.getText().trim());
        S = EvaluatDouble(T2.getText().trim()); 
        //M/M/1 input method       
    }
    
    public void IN(JTextField T1, JTextField T2, JTextField T3){
   //M/M/C and M/M/1/K input method

    A = EvaluatDouble(T1.getText().trim());
    S = EvaluatDouble(T2.getText().trim());
    C = EvaluatInt(T3.getText().trim());
    X = EvaluatInt(T3.getText().trim()); 
          
    }
    public void IN (JTextField T1 , JTextField T2 , JTextField T3 , JTextField T4 ){
    //M/M/C/K Input method 
    A = EvaluatDouble(T1.getText().trim());
    S = EvaluatDouble(T2.getText().trim());
    C = EvaluatInt(T3.getText().trim());
    X = EvaluatInt(T4.getText().trim());      
    }
public void IN (JTextField T1, JTextField T2, JTextField T3, JTextField T5 , JTextField T6){
 
 //D/D/1/K input method

    A = EvaluatDouble(T1.getText());
    S = EvaluatDouble(T2.getText());    
    C = EvaluatInt(T3.getText().trim());
    T = EvaluatInt(T5.getText().trim());
    M = EvaluatInt(T6.getText().trim()); }
    
    
public boolean Validation(String input)
    {  
        String R_Ex = "[0-9]+([\\+|-|\\*|/|.][0-9]+)*" ;
        return Pattern.matches(R_Ex, input);
    }
public double EvaluatDouble (String Input)
    {   try{
          try { 
          boolean IsValidAr_rate = Validation(Input) ;
          if(IsValidAr_rate == true)
         {ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
          ScriptEngine scriptEngine = scriptEngineManager.getEngineByName("JavaScript");
          double Evaluated = (double) scriptEngine.eval(Input);
          return Evaluated ; }
      
              } catch (ScriptException ex) {
                Logger.getLogger(Starts.class.getName()).log(Level.SEVERE, null, ex);}
            }catch(Exception e)
             {
              JOptionPane.showMessageDialog(null,"pls, Enter a Valid Number");
             }
            return 0;
    }
          
public int EvaluatInt (String Input)
    {  try{     
        try { 
        boolean IsValidAr_rate = Validation(Input) ;
        if(IsValidAr_rate == true)
        {    ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
             ScriptEngine scriptEngine = scriptEngineManager.getEngineByName("JavaScript");
             int Evaluated = (Integer) scriptEngine.eval(Input);
             return Evaluated ;} 
            } catch (ScriptException ex) {
             Logger.getLogger(Starts.class.getName()).log(Level.SEVERE, null, ex);
        }
          } catch(Exception e) 
                { JOptionPane.showMessageDialog(null,"pls, Enter a Valid Number");} 
    
    
    
            return 0;
    }


}
