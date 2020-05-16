package ch.dao;

import org.springframework.stereotype.Repository;

@Repository
public class StudentDao implements IPeople {
	@Override
	public void name() {
		System.out.println("ch");
	}
}
