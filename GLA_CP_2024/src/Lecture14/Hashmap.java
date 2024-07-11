package Lecture14;

import java.util.ArrayList;

public class Hashmap <K,V> {
	public class Node{
		K key;
		V val;
		Node next;
	}
	
	private ArrayList<Node> buckt;
	private int size =0;
	
	public Hashmap() {
		this(4);
	}
	
	public Hashmap(int s) {
		buckt = new ArrayList<>();
		for (int i = 0; i < s; i++) {
			buckt.add(null);
		}
	}
	
	public void put(K key ,V val) {
		int idx = HashFunc(key);
		Node temp = buckt.get(idx);
		
		while(temp!=null) {
			if(temp.key == key) { //key already exists
				temp.val = val;
				return;
			}
			temp = temp.next;
		}
		Node nn = new Node();
		nn.key = key;
		nn.val = val;
		Node temp1 = buckt.get(idx);
		nn.next = temp1;
		buckt.set(idx, nn);
		this.size++;
		double th = 2.0; //threshhold
		double lf = (1.0* size) / buckt.size();
		if(lf>th) {
			Rehashing();
		}
		
		
	}
	
	private void Rehashing() {
		// TODO Auto-generated method stub
		ArrayList<Node> newBuckt = new ArrayList<>();
		for (int i = 0; i < 2*buckt.size(); i++) {
			newBuckt.add(null);
		}
		ArrayList<Node>  list = buckt;
		buckt = newBuckt;
		
		for(Node nn : list) {
			while(nn!=null) {
				put(nn.key, nn.val);
				nn =nn.next;
			}
		}
	}

	@Override
	public String toString() {
		String s = "{";
		for(Node nn : buckt) {
			while(nn!=null) {
				s = s + nn.key + "=" + nn.val + " , ";
				nn = nn.next;
			}
		}
		s =s.substring(0, s.length()-2);
		return s+ "}";
	}
	
	public boolean containsKey(K key) {
		int idx = HashFunc(key);
		Node temp = buckt.get(idx);
		while(temp!=null) {
			if(temp.key.equals(key)) {
				return true;
			}
			temp = temp.next;
		}
		return false;
	}
	
	public V get(K key) {
		int idx = HashFunc(key);
		Node temp = buckt.get(idx);
		while(temp!=null) {
			if(temp.key.equals(key)) {
				return temp.val;
			}
			temp = temp.next;
		}
		return null;
	}
	
	public V remove(K key) {
		int idx = HashFunc(key);
		Node curr = buckt.get(idx);
		Node prev = null;
		
		while(curr!=null) {
			if(curr.key.equals(key)) {
				break;
			}
			prev =curr;
			curr = curr.next;
		}
		
		if(curr == null) {
			return null;
		}
		if(prev ==null) {
			buckt.set(idx, curr.next);
			curr.next =null;
		}
		else {
			prev.next =curr.next;
		}
		this.size--;
		return curr.val;
	}
	
	public int HashFunc(K key) {
		int idx = key.hashCode() % buckt.size();
		if(idx<0) {
			idx+= buckt.size();
		}
		return idx;
	}
}
