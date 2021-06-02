package aggregationPrograms;

public class Vpublisher {

		String name;
		int number;
		vengine ad;
		Vehicles ab;
		
		Vpublisher(String n, int num, Vehicles q, vengine f){
			
			this.name = n;
			this.number = num;
			this.ad = f;
			this.ab  = q;
			
		}
		
		public static void main(String[] args) {
			
			Vehicles obj = new Vehicles("TVS",2,"MRF");
			vengine obj1 = new vengine("Honda Engine","Honda FuelEngine","Honda OilEngine");
			Vpublisher obj2 = new Vpublisher("Ravi",100, obj, obj1);
			
			System.out.println("Vpubliehser detais: "+obj2.name);
			System.out.println("Vpubliehser detais: "+obj2.number);
			System.out.println("----------Vengine detais ------------------");
			System.out.println("Vengine details: "+obj1.engine);
			System.out.println("Vengine details: "+obj1.fuelengine);
			System.out.println("Vengine details: "+obj1.oilengine);
			System.out.println("-----------Vehicle details-----------");
			System.out.println("Vehicle details: "+obj.company);
			System.out.println("Vehicle details: "+obj.wheels_no);
			System.out.println("Vehicle details: "+obj.tyre);
			
		}
}
