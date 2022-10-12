//Dimitra Machairidou 4108

import java.util.HashSet;
import java.util.ArrayList;
import java.util.Scanner;

class PopulationSimulator 
{
	private Grid plegma;
	private HashSet<Rabbit> kounelia=new HashSet<Rabbit>();
	private HashSet<Fox> alepoudes=new HashSet<Fox>();
	private final int NUM_OF_FOXES=5;
	private final int NUM_OF_RABBITS=100;
	
	private void populateGrid(){
		for(int i=0; i<5; i++){
			Fox animal=new Fox();
			plegma.addRandomly(animal);
			alepoudes.add(animal);
		}
		for(int i=0; i<100; i++){
			Rabbit animal=new Rabbit();
			plegma.addRandomly(animal);
			kounelia.add(animal);
		}
	}
	
	private void handleFoxes(){
		ArrayList<Fox> neogenita=new ArrayList<Fox>();
		ArrayList<Fox> nekra=new ArrayList<Fox>();
		for(Fox x:alepoudes){
			x.move();
			if(x.starve()==false && x.timeToBreed()==true){
				Fox animal=new Fox();
				animal=(Fox)x.giveBirth();
				neogenita.add(animal);
			}else if(x.starve()==true){
				nekra.add(x);
			}
		}
		for(Fox y:neogenita){
			alepoudes.add(y);
		}
		for(Fox z:nekra){
			alepoudes.remove(z);
		}
	}
	
	private void handleRabbits(){
		ArrayList<Rabbit> neogenita=new ArrayList<Rabbit>();
		ArrayList<Rabbit> nekra=new ArrayList<Rabbit>();
		for(Rabbit x:kounelia){
			if(x.isEaten()==false && x.timeToBreed()==true){
				x.move();
				Rabbit animal=new Rabbit();
				animal=(Rabbit)x.giveBirth();
				neogenita.add(animal);
			}else if(x.isEaten()==true){
				nekra.add(x);
			}
		}
		for(Rabbit y:neogenita){
			kounelia.add(y);
		}
		for(Rabbit z:nekra){
			kounelia.remove(z);
		}
	}
	
	public void simulate(int vimata){ 
		this.populateGrid();
		for(int i=0; i<=vimata; i++){
			System.out.println(plegma);
			System.out.println("enter?");
			Scanner input=new Scanner(System.in);
			String in=input.next();
			if(in.equals("enter")){
				this.handleFoxes();
				this.handleRabbits();
			}
		}
	}
}