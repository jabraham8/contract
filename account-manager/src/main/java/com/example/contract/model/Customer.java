/**
 * 
 */
package com.example.contract.model;

import java.io.Serializable;

import lombok.Data;

/**
 * @author jarodriguez
 *
 */
@Data
public class Customer implements Serializable {

	private static final long serialVersionUID = -7373922049884775667L;
	
	private String name;
	private String email;
	private int age;
}
