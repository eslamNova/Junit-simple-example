/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tddlec1;
import java.lang.Exception;
import java.lang.IllegalArgumentException;
/**
 *
 * @author islam
 */
public class mathFunc {
    int calls ; 
    public int getCalls(){
    return calls ;
    }
    
    public long factorial(int number){
    calls++;
    if(number<0)
    {
        throw new IllegalArgumentException();
    }
    long result = 1 ;
    if(number >1)
    {
        for(int i = 1 ; i <= number ; i++)
        {
            result = result * i ;
        }
    }
    return result ;
    }
    
    public long plus(int num1, int num2)
    {
        calls++;
        return num1+num2;
    }
    
}
