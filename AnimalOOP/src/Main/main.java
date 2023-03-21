
package Main;

import classes.*;

public class main {

	public static void main(String[] args) {
		Cachorro myDog = new Cachorro();
		myDog.setName("Abelhinha");
		myDog.setIdade("11");
		myDog.setTipoPele("Pelo brilhoso");
		
		
		System.out.println(myDog.toString());
		myDog.somAnimal();
		
		
		Gato myCat = new Gato();
		myCat.setName("Kyara");
		myCat.setIdade("2");
		myCat.setTipoPele("Branco Brilhoso");
		
		System.out.println(myCat);
		myCat.somAnimal();
	}

}
