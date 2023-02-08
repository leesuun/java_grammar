package sec01_list.EX06_ArrayListVsLinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


public class ArrayListVsLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] array = { 1, 2, 3, 4, 5, 6, 7 };
		List<Integer> list = Arrays.asList(array);
		list.remove(7);
		System.out.println(list.toString());
		

//		List<Integer> aList = new ArrayList<>();
//		List<Integer> linkedList = new LinkedList<>();
//		long startTime = 0, endTime = 0;
//
//		// ������ �߰�
//		startTime = System.nanoTime();
//		for (int i = 0; i < 100000; i++) {
//			aList.add(i);
//		}
//		endTime = System.nanoTime();
//		System.out.println("ArrayList ������ �߰� �ð� = " + (endTime - startTime) + "ns");
//
//		startTime = System.nanoTime();
//		for (int i = 0; i < 100000; i++) {
//			linkedList.add(i);
//		}
//		endTime = System.nanoTime();
//		System.out.println("LinkedList ������ �߰� �ð� = " + (endTime - startTime) + "ns");

//		// ������ �˻�
//		startTime = System.nanoTime();
//		for (int i = 0; i < 100000; i++) {
//			aList.get(i);
//		}
//		endTime = System.nanoTime();
//		System.out.println("ArrayList ������ �˻� �ð� = " + (endTime - startTime) + "ns");
//
//		startTime = System.nanoTime();
//		for (int i = 0; i < 100000; i++) {
//			linkedList.get(i);
//		}
//		endTime = System.nanoTime();
//		System.out.println("LinkedList ������ �˻� �ð� = " + (endTime - startTime) + "ns");
//
//		// ������ ����
//		startTime = System.nanoTime();
//		for (int i = 0; i < 100000; i++) {
//			aList.remove(0);
//		}
//		endTime = System.nanoTime();
//		System.out.println("ArrayList ������ ���� �ð� = " + (endTime - startTime) + "ns");
//
//		startTime = System.nanoTime();
//		for (int i = 0; i < 100000; i++) {
//			linkedList.remove(0);
//		}
//		endTime = System.nanoTime();
//		System.out.println("LinkedList ������ ���� �ð� = " + (endTime - startTime) + "ns");

	}

}
