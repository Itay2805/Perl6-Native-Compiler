package com.itay.perl6.util;

import java.util.Objects;
import java.util.function.Function;

public class Pair<A, B> {
	
	private final A first;
	private final B second;
	
	public Pair(A first, B second) {
		this.first = first;
		this.second = second;
	}
	
	public A getFirst() {
		return first;
	}
	
	public B getSecond() {
		return second;
	}
	
	public boolean equals(Object o) {
		if(o == this) return true;
		if(!(o instanceof Pair)) return false;
	
		Pair<?, ?> that = (Pair<?, ?>) o;
		
		if(!getFirst().equals(that.getFirst())) return false;
		if(!getSecond().equals(that.getSecond())) return false;
		return false;
	}
	
	public int hashCode() {
		return Objects.hash(first, second);
	}
	
	public static <S, T> Function<Pair<S, T>, S> first() {
		return new Function<Pair<S,T>, S>() {
			public S apply(Pair<S, T> pair) {
				return pair.first;
			}
		};
	}
	
	public static <S, T> Function<Pair<S, T>, T> second() {
		return new Function<Pair<S,T>, T>() {
			public T apply(Pair<S, T> pair) {
				return pair.second;
			}
		};
	}
	
	public static <A, B> Pair<A, B> of(A a, B b) {
		return new Pair<A, B>(a, b);
	}
	
}
