/* 
 *  ## javaBean Component
 *  -- ��Ģ�� �ּ��� �ڹ� Ŭ����
 *  -- ��Ģ : package, private �������, pulic setter/getter, �⺻������
 *  -- <jsp:useBean> action tag ��� 
 *  
 * <jsp:useBean > �±׸� ����ϱ� ���� JavaBeanComponent ���� ��Ģ
 * -- <jsp:setProperty>
 * -- <jsp:getProperty>
 * 1. package ����
 * 2. private ������� ����
 * 3. public setter() / getter() ����
 * 		3-1) setter �޼��� ����
 * 				+ setXxx(xxxŸ��):void 
 * 		3-2) getter �޼��� ����
 * 				+ getXxx():xxxŸ��
 * 		3-3) valid ���� �޼��� ����
 * 				- isXxx(xxxŸ��):false
 * 				- setter() �޼��� ������Ģ�� ȣ����
 * 	4. no argument ������ (�⺻������) ����
 *  5. setter() / getter() ¦�� �̷����� 
 *  	- <jsp:setProperty>
 *  	- <jsp:getProperty>
 *  
 *  6. Domain Ŭ���� & JavaBean Component�� ��밡��
 */
package model;  // 1.

public class Item {

	private String name;  // 2.
	private String description;
	private String category;
	private String expires;	
	
	public Item() {	// 4.
		super();
	}

	public Item(String name, String description, String category, String expires) {
		this.name = name;
		this.description = description;
		this.category = category;
		this.expires = expires;
	}

	public String getName() {	// 3.
		return this.name;
	}

	public String getDescription() {	
		return this.description;
	}

	public String getCategory() {
		return this.category;
	}

	public String getExpires() {
		return this.expires;
	}
}
