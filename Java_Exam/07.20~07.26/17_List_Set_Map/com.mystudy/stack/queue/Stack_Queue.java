package com.mystudy.stack.queue;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/*
 큐(Queue) 인터페이스 : 형태상 파이프 형태 (선입선출 : FIFO - First In First Out) 
    - offer(), poll(), peek()
 스택(Stack) 클래스 : 형태상 바닥이 막힌 통 형태 
    (후입선출 : LIFO : Last In First Out)
    - push(), pop(), peek()
 */



public class Stack_Queue {

	public static void main(String[] args) {
		// 큐(Queue) 인터페이스 - LinkedList 클래스를 큐 형태로 사용
		//List<String> list = new LinkedList<String>();
		Queue<String> queue = new LinkedList<String>();
		queue.offer("1.첫째");
		queue.add("2.둘째"); //collection ()도 사용 가능
		queue.offer("3.셋째");
		queue.offer("4.넷째");
		queue.offer("5.다섯째");
		
		System.out.println("queue : " + queue); //queue : [1.첫째]
		System.out.println("갯수 : " + queue.size()); //collection에 있는 () 사용 가능 -> size()
		
		//peek() : 현재 사용할 수 있는 데이터를 확인만(읽어오기, 참조, 조회)
		System.out.println("---- peek() ----");
		String data = queue.peek(); 
		System.out.println("peek data : " + data);
		System.out.println("갯수 : " + queue.size()); 
		System.out.println("queue : " + queue); //queue 에서의 peek은 첫번째 데이터  
		

		System.out.println("---- poll() ----");
		System.out.println("queue.poll() : " + queue.poll());
		System.out.println("queue.poll() : " + queue.poll());
		//System.out.println("queue.remove() : " + queue.remove());
//		System.out.println("queue.poll() : " + queue.poll());
//		System.out.println("queue.poll() : " + queue.poll());
//		System.out.println("queue.poll() : " + queue.poll());
//		System.out.println("queue.poll() : " + queue.poll()); //없으면 : null 리턴 => queue.poll() : null
		//System.out.println("queue.remove() : " + queue.remove()); //없으면 NoSuchElementException발생
		
		System.out.println("갯수 : " + queue.size()); 
		System.out.println("queue : " + queue); 
		System.out.println("queue.isEmpty() : " + queue.isEmpty()); //extends Collection<E> => isEmpty() 사용 가능 
		
		System.out.println("---- 큐 전체 데이터 추출(사용) -----");
		while (!queue.isEmpty()) { //while문 사용이 조금 더 직관적이다!
			//데이터 사용하기
			System.out.println("queue.poll() : " + queue.poll());			
		}
		System.out.println("갯수 : " + queue.size()); 
		System.out.println("queue.isEmpty() : " + queue.isEmpty()); 
		
		System.out.println("========================");
		System.out.println("=== 스택(Stack) : LIFO - 후입선출 ===");
		Stack<String> stack = new Stack<>();
		stack.push("1.첫째"); // Stack()
		stack.add("2.둘째"); // vector() 
		stack.push("3.셋째");
		stack.push("4.넷째");
				
		System.out.println("stack : " + stack);
		System.out.println("stack.size() : " + stack.size());
		System.out.println("stack.empty() : " + stack.empty());
		 
		System.out.println("---- peek() : 사용할 수 있는 데이터 확인(참조) ----");
		
		System.out.println("stack.peek() : " + stack.peek()); // stack.peek() : 4.넷째
		System.out.println("stack.peek() : " + stack.peek()); // stack에서의 Peek은 마지막 데이터 
		System.out.println("stack.size() : " + stack.size());
		
		System.out.println("--- pop() : 꺼내쓰기 - 없으면 EmptyStackException발생----");
//		System.out.println("stack.pop() : " + stack.pop());
//		System.out.println("stack.pop() : " + stack.pop());
//		System.out.println("stack.pop() : " + stack.pop());
//		System.out.println("stack.pop() : " + stack.pop());
//		//System.out.println("stack.pop() : " + stack.pop()); //데이터가 없으면 EmptyStackException 예외 발생
//		
		System.out.println("stack : " + stack);
		System.out.println("stack.size() : " + stack.size());
		System.out.println("stack.empty() : " + stack.empty());
		
		
		System.out.println("----스택 전체 데이터 사용 -----");
		System.out.println("stack.empty(): " + stack.empty());
		while (!stack.empty()) {
			System.out.println(stack.pop());
		}
		System.out.println("stack.size() : " + stack.size());
		System.out.println("stack.empty() : " + stack.empty());
		
	}

}
