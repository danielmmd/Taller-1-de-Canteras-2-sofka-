/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author danie
 */
public class BankAccount {
    
    private int accountNumber;
    protected boolean activate;
    
    
    //Metodo Constructor

    public BankAccount(int accountNumber, boolean activate) {
        this.accountNumber = accountNumber;
        this.activate = activate;
    }

    
    //Metodos de acceso Getters y Setters
    
    //Getters
    public int getAccountNumber() {
        return accountNumber;
    }

    public boolean isActivate() {
        return activate;
    }

    
    
    
    //Setters
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setActivate(boolean activate) {
        this.activate = activate;
    }
    
    
    
    
}

    
