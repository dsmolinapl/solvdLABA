package dsmolina.Dao;

import java.util.List;

public interface IBaseDAO <T> {

		T getEntityById (int index);
		List<T> getEntities();
		void insert(T t);
		void delete (int index);
		void update (int index, T t);

}
