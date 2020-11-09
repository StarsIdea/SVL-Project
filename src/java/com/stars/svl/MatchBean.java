/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stars.svl;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author Director Stars
 */
@Named(value = "matchBean")
@SessionScoped
public class MatchBean implements Serializable {

    /**
     * Creates a new instance of MatchBean
     */
    public MatchBean() {
    }
    
}
