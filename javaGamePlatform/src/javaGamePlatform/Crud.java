package javaGamePlatform;

public interface Crud<T> {
	void add(T entity);
	T get(int id);
	void update(T entity);
	void delete(T entity);
	T[] list();
	
}
