package Task2;

public class CodeRunner {

	public static void main(String[] args) {
		Athlete objNeerajChopra = new NeerajChopra();
		System.out.println("NeerajChopra class");
		objNeerajChopra.accomplishment();
		objNeerajChopra.events();
		objNeerajChopra.eat();
		objNeerajChopra.sleep();
		
		
		Athlete objRaviKumar = new RaviKumar();
		System.out.println("RaviKumar class");
		objRaviKumar.accomplishment();
		objRaviKumar.events();
		
		
		Athlete objPVSindhu = new PVSindhu();
		System.out.println("PVSindhu class");
		objPVSindhu.accomplishment();
		objPVSindhu.events();
		

	}

}
