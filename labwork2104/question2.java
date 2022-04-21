package labwork;

public class question2 {

	public static void main(String[] args) {
		double population=175000;
		double population_decade=262500;
		double average_population_decade=(population_decade-population)/population*100;
		double average_population_peryear= (average_population_decade)/10;
		System.out.println("Average percent increase of population per year "+ average_population_peryear + "%");
	}

}
