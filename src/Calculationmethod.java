
public class Calculationmethod {
	static double num1;
	static double num2;
	static double sum;
	
	public double addition(double num1, double num2){
		sum = num1 + num2;
		return sum;
	}
	public double substraction(double num1, double num2){
		sum = num1-num2;
		return sum;
		
	}
	
	public double division(double num1, double num2){
		sum = num1/num2;
		return sum;
		
	}
	public double multipilcation(double num1, double num2){
		sum = num1*num2;
		return sum;
		
	}
	public double modulus(double num1, double num2){
		sum = num1%num2;
		return sum;
		
	}
	
	public double Calc (double num1, double num2, double operator){

		if (operator == 1){
			return addition(num1,num2);
		}
		else if(operator == 2){
			return substraction(num1,num2);
		}
		else if (operator == 3){
			return division(num1,num2);
		}
		else if (operator == 4){
			return multipilcation(num1,num2);
		}
		else if (operator == 5){
			return modulus(num1,num2);
		}
		else {
			return 0.0;
		}
	}
}

