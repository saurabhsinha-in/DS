package designpattern.creational.builder;
import lombok.Data;
import lombok.Getter;
@Data
public class Customer {
	@Getter
	private final String id, name, age;
	private Customer(CustomerBuilder customerBuilder) {
		this.id = customerBuilder.id;
		this.name = customerBuilder.name;
		this.age = customerBuilder.age;
	}
	public static class CustomerBuilder {
		private String id;
		private String name;
		private String age;
		public CustomerBuilder(String id) {
			this.id = id;
		}
		public CustomerBuilder setName(String name) {
			this.name = name;
			return this;
		}
		public CustomerBuilder setAge(String age) {
			this.age = age;
			return this;
		}
		public Customer build() {
			return new Customer(this);
		}
	}	
}
