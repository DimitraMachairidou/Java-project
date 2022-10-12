//Dimitra Machairidou 4108

class Fox extends Animal
{
	private int efage;
	
	public boolean isRabbit(){
		return false;
	}
	
	public boolean timeToBreed(){
		if(getVimata()%8==0){
			return true;
		}else{
			return false;
		}
	}
	
	public Animal giveBirth(){
		Fox animal=new Fox();
		return animal;
	}
	
	public void move(){
		for(int i=0; i<=getKeli().getNeighbors().size(); i++){
			if(getKeli().getNeighbors().get(i).getAnimal().isRabbit()==true){
				Cell y = getKeli();
				y=getKeli().getNeighbors().get(i);
				survived();
				efage=i;
			}else{
				randomMove();
				survived();
				efage=efage+1;
			}
		}
	}
	
	public boolean starve(){
		if(efage==3){
			getKeli().removeAnimal();
			return true;
		}else{
			return false;
		}
	}
	
	public String toString(){
		return "X";
	}
}
	
	