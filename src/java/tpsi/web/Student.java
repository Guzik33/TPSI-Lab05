/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpsi.web;

public class Student  {
    String firstName;
    String lastName;
    String email;
    
    
    public String getFirstName()
    {
        return firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
    public String getEmail()
    {
        return email;
    }
    @Override
    public String toString()
    {
        return firstName + " " + lastName + " " + email;
    }
}
