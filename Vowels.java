class Vowels {
    public static void main(String[] args) {
        char ch[]={'a','e','i','o','u'};
        String str = "The output is without Vowels";
        char ch2[]=new char[str.length()];
        System.out.println(ch);
        for (int i = 0; i < str.length(); i++) {
            ch2[i] = str.charAt(i);
//            System.out.println(ch2[i]);
		if(ch!=ch2){
			System.out.println("**********");
			System.out.println(ch2);
		}
        }
    } 
}