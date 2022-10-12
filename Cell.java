//Dimitra Machairidou 4108

import java.util.ArrayList;
import java.util.Random;

class Cell
{
	private ArrayList<Cell> neighbors=new ArrayList<Cell>();
	private Animal animal;
	
	public ArrayList<Cell> getNeighbors(){
		return neighbors;
	}
	
	public void addNeighbor(Cell newcell){
		neighbors.add(newcell);
	}
	
	public Cell getRandomNeighbor(){
		Random random=new Random();
		int x=random.nextInt(4);
		if (neighbors.size()<=x){
			return null;
		}else{
			return neighbors.get(x);
		}
	}
	
	public void setAnimal(Animal animal){
		animal=animal;
	}
	
	public Animal getAnimal(){
		return animal;
	}
	
	public void removeAnimal(){
		animal=null;
	}
	
	public boolean isEmpty(){
		if(animal==null){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean containsRabbit(){ 
		if(animal!=null && animal.isRabbit()==true){
			return true;
		}else{
			return false;
		}
	}
}
	