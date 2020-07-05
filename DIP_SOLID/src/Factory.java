
public interface Factory {
	
	public static Cliente getCliente(String string, String string2, String string3) {
		return new Cliente(string, string2, string3);	
	}
	
	public static Email getEmail() {
		return new Email();
	}
	
	public static Sms getSms() {
		return new Sms();
	}
} 
  
