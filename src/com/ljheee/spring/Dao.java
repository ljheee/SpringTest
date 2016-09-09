package com.ljheee.spring;

/**
 * 数据访问对象
 * @author ljheee
 *
 */
public class Dao {
	

	private MyDataSource dataSource;
	/**
	 * Setter 方法注入
	 * @param dataSource
	 */
	public void setDataSource(MyDataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public void save(){
		
	}
}
