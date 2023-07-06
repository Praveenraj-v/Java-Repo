class Bike{
	void run(){
		System.out.println("Running");
	}
	class Honda extends Bike{
		void run(){
			System.out.println("Running Safely with 100Kmph");
		}
	}

	public static void main(String args[]){
		Bike bk = new Bike();
		Honda obj = bk.new Honda();
		bk.run();
		obj.run();
	}
}