package global;

import java.util.List;

import member.MemberVO;

public abstract class DAO{ //interface대신에 abstract class 쓰는 이유
	public int insert(Object o){return 0;}
	public int update(Object o){return 0;}
	public List selectAll(){
		return null;
	}
	public List selectBy(String name){
		return null;
	}
	public Object selectOneBy(String key){
		return null;
	}
	public abstract int delete(String id);
	public abstract int count();
}
