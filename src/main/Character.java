package main;

public class Character {
	
	String name, dialog;
	int hp, mp, lvl;
	
	//	Constructor  
	Character(String name, String dialog, int hp, int mp, int lvl) { 
		this.name = name;
		this.dialog = dialog;
		this.hp = hp;
		this.mp = mp;
		this.lvl = lvl;
	}

	//	Object Methods
	void introduce() {
		System.out.println("I am " + name);
	}
	
	void sayDialog() {
		System.out.println(dialog);
	}
	
	void talkTo(String name) {
		System.out.println("Greetings from " + name + " and hello to you " + this.name);
	}
	void talkCha(Character c) {
		System.out.println(c.dialog);
	}

}
