
public class ApplicationRepository {

	public static void main(String[] args) {
		
		Repository<String> repository = new Repository();
		
		Repository<String>.SoftRepository softRepository = repository.new SoftRepository();
		
		String firstString = "Hey";
		
		softRepository.save(firstString);
		
		softRepository.softPrint();
		
		softRepository.softDelete(firstString);
		
		softRepository.softPrint();
	}
}
