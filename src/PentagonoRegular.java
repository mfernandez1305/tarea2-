
public class PentagonoRegular {
	int lado; //declara la variable 
	PentagonoRegular(int lado){// declarar el constructor 
	this.lado=lado;	
	}
	int getLado(){// obtener el valor del lado
	return lado;//devolver el valor del lado
	}
	 void setLado(int lado){//declarar el contructor del lado 
	 this.lado=lado;	
	}
	int getPerimetro(){//obtener el valor del perimetro  
		return 5*lado;// devolver el calculo del perimetro 
	}

}
