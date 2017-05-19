package medrex.commons.intf;

import java.util.List;

import medrex.commons.exception.MedrexException;

public interface Service<Type> {
	public int insertOrUpdate(Type ref) throws MedrexException;

	public Type get(int serial) throws MedrexException;

	public List<Type> getAll(int residentId) throws MedrexException;

	public void delete(int serial) throws MedrexException;
}
