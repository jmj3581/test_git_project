package model;

import java.util.HashMap;
import java.util.Map;

public class EFridge {

	/*  Map<String,Item> 
	 * 1. Ư¡ - �ڷᱸ�� Ŭ������ �Ϻ�
	 * 2. Map�迭 - key, value(���ø����̼� �󿡼� ���� Ȱ��Ǵ� ����Ÿ��)
	 * 				 ������ ����Ÿ ����	 * 
	 * 3. jdk1.5���� �߰��� ����
	 * 		- Map�� �����ϴ� ����Ÿ Ÿ�� ����
	 *  	- ��: Map<String,Item>
	 *  	key���� �ݵ�� String�̾�� �Ѵ�
	 *      value �ݵ�� Item Ÿ�Ծ�� �Ѵ�. 
	 *      
	 * *** ��ü ���� ���� ����- ���뼺, 
	 * 				Item ��ü �ϳ��� ������
	 * 				�� ��ü�� ������ ����Ÿ�� ���?  ���� Ÿ�� ��
	 * 			 	���� ����Ÿ ������ ��ü������ �����ϸ� Ȱ�� �� ����Ÿ ���� 
	 * 				��ü�� ��Ȯ������ ���� */
	
    private static Map<String,Item> FAUX_DATABASE = new HashMap<String,Item>();
    /* �ڹ��� Ưȭ + �ſ� ������ �ڵ�
     * 1. static ���
     * 2. ���� ����(������ �ڵ�󿡼��� ���� ȣ�� �Ұ� ����)
     * 	- JVM(java virtual machine= �ڹٽ���ȯ��) ��ü������ �ڵ� ȣ��
     *  - *** ���� ȣ��?
     *  	���� �ڵ尡 �޸�(JVM)�� �ε��Ǵ� ������ ������ �� �ѹ� ����
     * 3. ���� 
     * 	- ��� client���� �����ϸ鼭 ���ҽ� ���ϰ��� �Ҷ� �ʱ�ȭ �ڵ�� �ַ� Ȱ��   *    * 
     */
    static {//static block �ʱ�ȭ
        FAUX_DATABASE.put( "1", new Item( "Milk", "HCF Milk, gallon", "dairy", "4/23/2010" ) );
        FAUX_DATABASE.put( "2", new Item( "Cole Slaw", "Hill Country Cole Slaw", "prepared", "4/29/2010" ) );
        FAUX_DATABASE.put( "3", new Item( "BBQ Sauce", "Stubb's BBQ Sauce, Spicy", "condiments", "4/23/2010" ) );
        FAUX_DATABASE.put( "4", new Item( "Lunch Meat", "Boar's Head Maple-glazed Turkey", "deli", "4/25/2010" ) );
        FAUX_DATABASE.put( "5", new Item( "Mustard", "Gulden's Spicy Brown Mustard", "condiments", "4/23/2010" ) );
        FAUX_DATABASE.put( "6", new Item( "Hot Sauce", "Sriracha Chile Sauce", "condiments", "12/5/2010" ) );
        FAUX_DATABASE.put( "7", new Item( "Cheese", "Tillamook Sharp Cheddar, 1 lb.", "dairy", "5/12/2010" ) );
        FAUX_DATABASE.put( "8", new Item( "Iced Tea", "Arizona Green tea, 1/2 gallon", "beverages", "4/23/2010" ) );
    }
    
    /* Ư�� key������ �ش� Item��ü ��ȯ �޼ҵ�    */
    public Item getItem( String key ) {
         return FAUX_DATABASE.get( key );
    }
    
}





