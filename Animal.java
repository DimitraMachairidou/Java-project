//Dimitra Machairidou 4108

import java.util.Random;
import java.util.ArrayList;

abstract class Animal
{
	private Cell keli;
	private int vimata;
	
	public abstract boolean isRabbit();	
	public abstract boolean timeToBreed();	
	public abstract Animal giveBirth();	
	public abstract void move();
	
	public void setKeli(Cell keli){
		keli=keli;
	}
	
	public void setVimata(int vimata){
		vimata=vimata;
	}
	
	public Cell getKeli(){
		return keli;
	}
	
	public int getVimata(){
		return vimata;
	}
	
	public void survived(){
		vimata=vimata+1;
	}
	
	public void randomMove(){
		Random random=new Random();
		int x=random.nextInt(4);
		if (keli.getNeighbors().size()>x && keli.getNeighbors().get(x)==null){	
			keli=keli.getNeighbors().get(x);
			vimata=vimata+1;
		}
	}
	
	public Animal breed(){
		Animal z=null;
		for(int i=0; i<=keli.getNeighbors().size(); i++){
			if(keli.getNeighbors().get(i)==null){
				if(keli.getAnimal().isRabbit()==true && keli.getAnimal().timeToBreed()==true){
					Animal x=keli.getAnimal().giveBirth();
					Cell y = x.getKeli();
					y=keli.getNeighbors().get(i);
					z=x;
				}else if(keli.getAnimal().isRabbit()==false && keli.getAnimal().timeToBreed()==true){
					Animal x=keli.getAnimal().giveBirth();
					Cell y = x.getKeli();
					y=keli.getNeighbors().get(i);
					z=x;
				}else{
					z=null;
				}
			}else{
				z=null;
			}
		}
		return z;
	}
}