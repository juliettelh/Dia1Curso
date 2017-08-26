//El archivo se llama persona porque es la clase Persona pero dentro de este archivo esta
//la clase Curso que es la que tiene el metodo main y ejecuta todo lo demas por eso se ejectuta
//la clase Curso
public class Persona { //clase Persona, en java solo puede exister una clase publica
	String name; // asignando atributos a la clase
	String sexo;
	int edad;

	public void caminar(){ // creando metodo caminar
		System.out.println(name + " Esta caminando");

	}

	public void estudiar(){ // creando metodo estudiar
		System.out.println(name + " Esta estudiando");
		
	}

	public void comer(String comida){ //creando metodo con parametros
		System.out.println(name + " Esta comiendo" + comida);
	}

	public void pedirCerveza(){
		if(edad >= 18){
			System.out.println("Dar cerveza");
		}else{
			System.out.println("Nel prro sacase alv xdd");
		}
	}

}

class Curso {
	public static void main(String[] args){ //metodo main
	 Persona juan = new Persona(); //sentencia para crear un objeto de la clase Persona
	 juan.name = "Juan Perez"; //Asignando valores a sus atributos
	 juan.sexo = "M";
	 juan.edad = 15;
	 juan.caminar(); //llamando métodos
	 juan.estudiar();
	 juan.comer("Torta cubana + Guacamole");
	 juan.pedirCerveza();

	 Persona betty = new Persona();
	 betty.name = "Beatriz"; //Asignando valores a sus atributos
	 betty.sexo = "F";
	 betty.edad = 18;
	 betty.caminar(); //llamando métodos
	 betty.estudiar();
	 betty.comer("Tacos al pastor");
	 betty.pedirCerveza();
	}
}