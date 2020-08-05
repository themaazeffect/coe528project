/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.S2020.project;

/**
 *@author Mohammad Maaz Khan
 * OVERVIEW: this class represents a mutable object that represents a user in the parking system.
 * 
 * Rep Invariant: name cannot be empty/null
 * 
 */

public class Person {
    private String name;//name of Person
   private String user;//username of Person
   private String pass;//password of Person

    /**
     //constructor
     * @param name name of Person
     * @param user username of Person(manager specific)
     * @param password password for Person(manager specific)
     */
    public Person(String name, String user, String password){
        /**
         * //REQUIRES: name field cannot be null
         * //EFFECTS:Initializes this with the provided strings
         * //MODIFIES: this
         */
    this.name=name;
    this.user=user;
    this.pass=password;

}

    /**
     //constructor
     * 
     */
    public Person(){
        /**
         * //EFFECTS: Initializes this with fixed values
         * //MODIFIES: this
         */
    this.name="customer";
    this.user=null;
    this.pass=null;
    
}

    /**
     * //observer
     * @return name of person(customer or manager)
     */
    public String getName() {
        /**
         * //EFFECTS: returns the String in "name" field
         */
        return name;
    }

    /**
     * //method
     * @param name 
     */
    public void setName(String name) {
        /**
         * //REQUIRES: Name of Person not be null
         * //EFFECTS: assigns name of this Person to specified value
         * //MODIFIES: this
        */
        this.name = name;
    }

    /**
     * //observer
     * @return username of person
     */
    public String getUser() {
        /**
         * //EFFECTS: returns the username of the Person
         */
        return user;
    }

    /**
     * //method
     * @param user
     */
    public void setUser(String user) {
        /**
         * //EFFECTS: assigns username of Person to specified value
         * MODIFIES: this
         */
        this.user = user;
    }

    /**
     * //observer
     * @return User password String
     */
    public String getPass() {
     /**
      * // EFFECTS: returns the specified string
      * 
      */
        
        return pass;
    }

    /**
     *
     * @param pass
     */
    public void setPass(String pass) {
        /**
         * //EFFECTS: sets class attribute "pass" to provided String
         * MODIFIES: this
         * 
         */
        this.pass = pass;
    }
    
   @Override 
   public String toString(){
   /**
    * //EFFECTS: returns a String containing attribute data
    * //MODIFIES: none
    * //REQUIRES: name field for this Person not be null
    */
       return "User: "+getUser()+" Password: "+getPass()+" name: "+getName();
   
   }
   /**
    * //Check that the rep invariant is true
    * 
   */
   public boolean RepOk(){
       //EF: Returns false if the rep invariant for this - if the string is null and void
       if((name.isEmpty()&&name==null)){
       return false;
       }
       else{
       return true;
       }
   
   }
   
}
