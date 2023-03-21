package classes;

abstract class Animal {
	
	private String name;
	private String idade;
	private String tipoPele;
	
	public abstract void somAnimal();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String getTipoPele() {
		return tipoPele;
	}

	public void setTipoPele(String tipoPele) {
		this.tipoPele = tipoPele;
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", idade=" + idade + ", tipoPele=" + tipoPele + "]";
	}

	

	
	
	
	
	
}
	
	
	
	
	
	

