/*=============================================
  class Mage -- protagonist of Ye Olde RPG  
  =============================================*/
 
public class Mage extends Character {

    // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~
    // inherited from superclass
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    /*=============================================
      default constructor
      pre:  instance vars are declared
      post: initializes instance vars.
      =============================================*/
    public Mage() {
	super();
	_hitPts = 100;
	_strength = 70;
	_defense = 20;
	_attack = .8;
    }


    /*=============================================
      overloaded constructor
      pre:  instance vars are declared
      post: initializes instance vars. _name is set to input String.
      =============================================*/
    public Mage( String name ) {
        this();
	if (!name.equals("")) {
	    _name = name;
	}
    }
    
    /*=============================================
      void specialize() -- prepares character for special attack
      pre:  
      post: Attack of character is increased, defense is decreased
      =============================================*/
    public void specialize() {
	_attack = 1;
	_defense = 15;
    }

    /*=============================================
      void normalize() -- revert stats back to normal
      pre:  
      post: Attack and defense of character is de-specialized
      =============================================*/
    public void normalize() {
	_attack = .8;
	_defense = 20;
    }

    /*=============================================
      String about() -- returns descriptions character type
      pre:  
      post: Info is returned
      =============================================*/
    public String about() {
	return "Mages are cunning and smart magicians, but aren't very strong.";
    }
	
    /*==========================
      String heroSpecial()
      pre:
      post: executes a character's special move, for example, a priest would heal itself, and
      returns a string summarizing what happened.
      ========================*/
    public String heroSpecial(){
	if (((int) (Math.random()*99)) >= 50){
	    this._defense+=20;
	    return "your mage casts a magic barrier, raising defence to " + this._defense;
	}
	else {
	    if (this._defense > 0){
		this._defense-=5;
	    }
	    return "your mage fails to cast magic barrier, lowering defence to: " + this._defense;
	}
    }
	

}//end class Mage
