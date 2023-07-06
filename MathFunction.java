import java.lang.Math;

class MathFunction{
	public static void main(String args[]){

	//abs() returns the absolute value of parameter/argument value.
	System.out.println("abs(): " + Math.abs(-40));

	//cbrt() returns the cube root value of parameter value.
	System.out.println("cbrt(): " + Math.cbrt(27));

	//sqrt() returns the Square root value of parameter value.
	System.out.println("sqrt(): " + Math.sqrt(9));

	//signum() returns the sign of parameter.
	System.out.println("signum(): " + Math.signum(10));

	//rint() returns the double value that is closest to parameter that is equal to mathematical integer.
	System.out.println("rint(): " + Math.rint(1.4));

	//ceil() returns the value of parameter rounded up to its nearest integer.
	System.out.println("ceil(): " + Math.ceil(-1.87));

	//floor() returns the value of parameter rounded down to its nearest parameter.
	System.out.println("floor(): " + Math.floor(5.8));

	//random() returns the random number between 0 and 1
	System.out.println("random(): " + Math.random());

	//pow() returns the value of parameter one to the power value of parameter two.
	System.out.println("pow(): " + Math.pow(5,5));
	
	//max() returns the number with the highest value 
	System.out.println("max(): " + Math.max(-22,22));

	//min() returns the number with the lowest value
	System.out.println("min(): " + Math.min(-22,22));

	//copySign() returns the first floating parameter with sign of floating paramter
	System.out.println("copySign(): " + Math.copySign(5,-9));

	//exp() returns the value e^x
	System.out.println("exp(): " + Math.exp(5));

	//expm1() returns the value of (e^x)-1
	System.out.println("expm1(): " + Math.expm1(5));
  
	//getExponent() returns the unbiased exponents used in parameter.
	System.out.println("getExponent(): " + Math.getExponent(123.456789));

	//hypot() returns the sqrt(x^2 + y^2) without intermediate overflow or underflow
	System.out.println("hypot(): " + Math.hypot(2,3));

	//IEEEremainder() returns the IEEE 754 standard value.
	System.out.println("IEEEremainder(): " + Math.IEEEremainder(10,3));

	//nextAfter() returns the floating number adjacent to theparameter 1 to the parameter 2.
	System.out.println("nextAfter(): " + Math.nextAfter(2,5));

	//nextUp() returns the floating point vakue adjacent to parameter in the direction of positive infinity.
	System.out.println("nextUp(): " + Math.nextUp(2));

	//round() returns the value of parameter rounded to its nearest integer.
	System.out.println("round(): " + Math.round(2.85));

	//()
	System.out.println("acos() :" + Math.acos(-1));

	//()
	System.out.println("asin() :" + Math.asin(-1));
	
	//()
	System.out.println("atan() :" + Math.atan(-1));

	//()
	System.out.println("atan2() :" + Math.atan2(1,2.5));

	//()

	System.out.println("cos() :" + Math.cos(1));

	//()
	System.out.println("cosh() :" + Math.cosh(1));

	//()
	System.out.println("log() :" + Math.log(10));

	//()
	System.out.println("log10() :" + Math.log10(10));

	//()
	System.out.println("log1p() :" + Math.log1p(10));

	//()
	System.out.println("sin() :" + Math.sin(0.2));

	//()
	System.out.println("sinh() :" + Math.sinh(2.5));

	//()
	System.out.println("tan() :" + Math.tan(2.5));

	//()
	System.out.println("tanh() :" + Math.tanh(2.5));

	//()
	System.out.println("toDegrees() :" + Math.toDegrees(Math.PI/4));

	//()
	System.out.println("toRadians() :" + Math.toRadians(45));

	//()
	System.out.println("ulp() :" + Math.ulp(2.5));
	}
}