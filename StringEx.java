import java.lang.String;

class StringEx{

   public static void main(String args[]){

 	String str = "Batch-15 is Toxic...!!!";
 	String str2 = "BATCH-15 IS TOXIC...!!!";
	String str3 = "kgm@fs@batch15@thursday";

 	//contains() Check whether the value is available in the given variable along with case sensitive.
 	System.out.println(str.contains("Toxic"));

	//concat() is use to add two different String and present it as single String.
	System.out.println(str.concat(" by birth"));

	//equals() check whether the given variable in the given String is equal or not it is case sensitive and also concerned about spaces.
	System.out.println(str.equals("Batch-15 is Toxic...!!!"));

	//equalsIgnoreCase() ignores the case sensitive and checks value with the specified variable, also space concerned.
	System.out.println(str.equalsIgnoreCase("Batch-15 is TOXIC...!!!"));

	//toUpperCase() changes all the alphabets to capital letters
	System.out.println(str.toUpperCase());

	//toLowerCase() changes all the alphabets to small letters
	System.out.println(str.toLowerCase());

	//length() returns the length of specified varriable along with the spaces.
	System.out.println(str.length());

	//charAt() returns the character that has been available in the specified index value
	System.out.println(str.charAt(4));

	//compareToIgnoreCase() returns the lexicographic zero value if the variables are same
	System.out.println(str.compareToIgnoreCase(str2));

	//compareTo() returns the negative value if both the variables are different.
	System.out.println(str.compareTo(str2));	

	//indexOf() returns the indexx value of specified character
	System.out.println(str.indexOf("Toxic"));

	//isEmpty() checks whether the given variable is empty or not.
	System.out.println(str.isEmpty());

	//replace() used to replace the specified word with thee specified value.
	System.out.println(str.replace("Toxic","Vedappu"));

	//substring() is used to get string that has been mentioned from start index to end index.
	System.out.println(str.substring(3,11));

	//trim() which is used to trim spaces 
	System.out.println(str.trim());

	//lastIndexOf() returns the index of last occurance of the given character 
	System.out.println(str.lastIndexOf('i'));

	//hashCode() returns the key from the hash table which holds your variable as value
	System.out.println(str.hashCode());

	//format() changes the given input in the specified format 
	System.out.println(str.format("%x",5));

	//join() is used to set a delimiter and join the parameterised value.
	System.out.println(str.join("*","R15","Mt-15","RE-350"));

	//replaceAll()
	System.out.println(str.replaceAll("i","y"));

	//split()
	String[] arr1 = str3.split("@",4);
		for(String a1: arr1){
			System.out.println("pattern1"+a1);
		}
	}
}