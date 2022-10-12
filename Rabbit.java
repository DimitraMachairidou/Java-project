//Dimitra Machairidou 4108

class Rabbit extends Animal
{
	private boolean eaten;
	
	public boolean isRabbit(){ 
			return true;
	}
	
	public boolean timeToBreed(){ 
		if(getVimata()%3==0){
			return true;
		}else{
			return false;
		}
	}
	
	public Animal giveBirth(){ 
		Rabbit animal=new Rabbit();
		return animal;
	}
	
	public void move(){ 
		survived();
	}
	
	public void becomeEaten(){
		eaten=true;
	}
	
	public boolean isEaten(){ 
		return eaten;
	}
	
	public String toString(){
		return "o";
	}
}