package geo.model;

import java.util.Objects;

public class Address {

	private String address_id;
	private String address;
	
	public Address(String id, String address) {
		super();
		this.address_id = id;
		this.address = address;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(address, address_id);
	}

	@Override
    public boolean equals(Object obj) {
        return this==obj || obj!=null &&
                obj instanceof Address
                && this.hashCode()==((Address)obj).hashCode();
    }
	
	
	@Override
	public String toString() {
		return String.format("Address id: %s, address: %s ", this.address_id,this.address);
	}

}
