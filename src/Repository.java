import java.util.ArrayList;
import java.util.List;

public class Repository<T> {

	T t;

	List<T> savedEntities = new ArrayList();

	private String name;
	private String description;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public class softRepository {

		public void save(T t) {

			savedEntities.add(t);
			System.out.println("Kaydetme işlemi gerçekleştirildi.");
		}
	}

	public void delete() {
		// TODO Auto-generated method stub

		System.out.println("Silme işlemi gerçekleştirildi.");
	}

	public void printElements() {

		for (T t : savedEntities) {

			System.out.println(t.toString());
		}
	}

}
