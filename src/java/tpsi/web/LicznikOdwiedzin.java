/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpsi.web;

import javax.servlet.http.HttpServlet;

/**
 *
 * @author komp
 */
public class LicznikOdwiedzin extends HttpServlet
{
    int licznik = 0;
    
    public void licznikUp()
    {
        licznik++;
        //System.out.println("licznik = " + licznik);
    }
    public void zerujLicznik()
    {
        licznik = 0;
    }
    public int getLicznik()
    {
        return licznik;
    }
}