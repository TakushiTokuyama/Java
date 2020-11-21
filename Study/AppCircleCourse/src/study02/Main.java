package study02;

public class Main {

	public static void main(String[] args) {

		TelephoneNumber telephoneNumber = new TelephoneNumber();
		Place place = new Place();

		System.out.println(telephoneNumber.FindOne());
		System.out.println(telephoneNumber.FindAll());

		System.out.println(place.FindOne());
		System.out.println(place.FindAll());

		System.out.println(telephoneNumber.DeleteOne());
		System.out.println(telephoneNumber.DeleteAll());

		System.out.println(place.DeleteOne());
		System.out.println(place.DeleteAll());

	}
}