/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4.pkg1.ejercicioherenciadeposito;

/**
 *
 * @author alex
 */
public class DepositoEstructurado extends Deposito{
    protected double tipo_interes_ampliado;
    protected double capital_ampliado;
    
    public DepositoEstructurado(){}
    
    public DepositoEstructurado(String titular, double capital, int dias, double tipo, double capitalAmpliado){
        super(titular, capital, dias, tipo);
        this.tipo_interes_ampliado = 100 - tipo;
        this.capital_ampliado = capitalAmpliado;
    }
    //setters
    public void setTipoInteresAmpliado(double interes){
        this.tipo_interes_ampliado = interes;
    }
    public void setCapitalAmpliado(double capital){
        this. capital_ampliado = capital;
    }
    
    //getters
    public double get_tipo_interes_ampliado(){
        return this.tipo_interes_ampliado;
    }
    public double get_capital_ampliado(){
        return this.capital_ampliado;
    }
    
    //metodos
    @Override
    public double liquidar(){
        return super.liquidar() + capital_ampliado + obtener_intereses_ampliado();
    }
    
    public double obtener_intereses_ampliado(){
        return (get_dias_plazo() * tipo_interes_ampliado * capital_ampliado)/365;
    }
}
