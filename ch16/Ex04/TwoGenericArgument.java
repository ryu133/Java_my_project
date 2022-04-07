package ch16.Ex04;

class KeyValue<K,V>{
	private K key;
	private V value;
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
	
}

public class TwoGenericArgument {
	public static void main(String[] args) {
		KeyValue<String,Integer> kv1=new KeyValue<String,Integer>();
//		KeyValue<String,Integer> kv1=new KeyValue();  //������ �ڷ��� ���� ����
		kv1.setKey("���");
		kv1.setValue(1000);
		
		System.out.println(kv1.getKey());
		System.out.println(kv1.getValue());
		
		
		KeyValue<Integer,String> kv2=new KeyValue();
		kv2.setKey(404);
		kv2.setValue("Not Fount(��û�� �������� ã�� �� �����ϴ�.)");
		
		System.out.println(kv2.getKey());
		System.out.println(kv2.getValue());
		
		KeyValue<String, Double> kv3=new KeyValue();
		kv3.setKey("��հ�");
		kv3.setValue(55.555);
		
		System.out.println(kv3.getKey());
		System.out.println(kv3.getValue());
		
		//Ư�� Ÿ���� ������� ���� ��� void Ű�� ���
		KeyValue<String, Void>kv4=new KeyValue();
		kv4.setKey("Ű���� ���");
//		kv4.setValue(1111); //��� �Ұ�
		
		System.out.println(kv4.getKey());
	}
}
