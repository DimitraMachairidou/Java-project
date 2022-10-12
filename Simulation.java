//Dimitra Machairidou 4108

import java.util.Scanner;

class Simulation
{
	public static void main(String[] args){
		PopulationSimulator simulator=new PopulationSimulator();
		System.out.println("give me number of vimata");
		Scanner number=new Scanner(System.in);
		int num=number.nextInt();
		simulator.simulate(num);
	}
}