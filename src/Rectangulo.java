
public class Rectangulo {
	int base;//declarar la variable base para hacer el calculo luego
	int altura;//declarar la variable altura para hacer el calculo luego
	Rectangulo(int base, int altura){//creamos el constructor Rectangulo 
		this.base=base;
		this.altura=altura; 
	}
	
	int getBase(){ // obtener el valor de la base 
		return base; //devolver el valor de la base 
}
void setBase(int base){// declarar el condtructor de la base 
	this.base=base;
}
int getAltura(){// obtener el valor de la altura
	return altura;//devolver el valor de la altura 
}

void setAltura(int altura){// declarar el constructor de la altura
	this.altura=altura;
}
int getArea(){//obtener el valor del area
	return base*altura;// devolver el calculo del area 
}
int getPerimetro(){//obtener el valor del perimetro 
	return 2*base+2*altura;// devolver el calculo del perimetro 
}

}
