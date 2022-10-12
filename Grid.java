//Dimitra Machairidou 4108

class Grid
{
	private final int SIZE=20;
	private Cell[][] pinaka=new Cell[SIZE][SIZE];
	
	public Grid(){ 
		for(int i=0; i<=19; i++){
			for(int j=0; j<=19; j++){
				pinaka[i][j]=new Cell();
				if(i>0){
					pinaka[i-1][j].addNeighbor(pinaka[i][j]);
					pinaka[i][j].addNeighbor(pinaka[i-1][j]);
				}else if(j>0){
					pinaka[i][j-1].addNeighbor(pinaka[i][j]);
					pinaka[i][j].addNeighbor(pinaka[i][j-1]);
				}
			}
		}
	}
	
	public void addRandomly(Animal animal){ 
		for(int i=0; i<=19; i++){
			for(int j=0; j<=19; j++){
				if(pinaka[i][j]==null){
					pinaka[i][j]=animal.getKeli();
					return;
				}
			}
		}
	}
	
	public String toString(){
		String str="";
		for(int i=0; i<=19; i++){
			for(int j=0; j<=19; j++){
				if(pinaka[i][j]==null){
					str=str + "_";
				}else if(pinaka[i][j].getAnimal().isRabbit()==true){
					str=str + "o";
				}else{
					str=str + "X";
				}
			}
		}
		return str;
	}
}