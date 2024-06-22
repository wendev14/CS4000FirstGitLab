// == CS400 Spring 2024 File Header Information ==
// Name: Evan Wendt
// Email: ewendt3@wisc.edu
// Lecturer: Jiazhen Zhou
// CS Username: ewendt
public class Color{
	private String color;

	//Constructor
	public Color(String iniColor){
		if(isColorValid(iniColor)){
			this.color = iniColor;
		}
		else{
			System.out.println("Failed to initalize the color");
		}
	}

	//Getter
	public String getColor(){
		return this.color;
	}

	// The method for changing the color
	public boolean  changeColor(String newColor){
		if(!isColorValid(newColor) || this.color.equals(newColor)) {
			return false;
		}
		
		
		this.color = newColor;
		
		return true;
	}

	public boolean isColorValid(String inputColor){
		String [] validColor = {"red","orange","yellow","green", "cyan", "blue","purple"};
		for(int i=0; i<validColor.length; i++){
			if(inputColor.equals(validColor[i])){
				return true;
			}
		}
		
		//Failed to find a match, the color is invalid
		return false;
	}
}
