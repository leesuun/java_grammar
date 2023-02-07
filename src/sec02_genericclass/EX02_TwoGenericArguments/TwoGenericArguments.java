package sec02_genericclass.EX02_TwoGenericArguments;



class KeyValue<K,V>{
	private K key;
	private V value;
	
	public K getKey() {
		return key;
	}
	
	public V getValue() {
		return value;
	}
	
	public void setKey(K key) {
		this.key = key;
	}
	public void setValue(V value) {
		this.value = value;
	}
	
	
}

public class TwoGenericArguments {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KeyValue<String, Integer> kv1 = new KeyValue<>();
		kv1.setKey("���");
		kv1.setValue(1000);
		System.out.println("key: " + kv1.getKey() + " value: " + kv1.getValue());
		
		KeyValue<String, Void> kv2 = new KeyValue<>();
		kv2.setKey("Ű ���� ���");
		System.out.println("key: " + kv2.getKey());
		
		

	}

}
