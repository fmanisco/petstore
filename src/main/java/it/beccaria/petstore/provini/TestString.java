package it.beccaria.petstore.provini;

import org.apache.commons.lang3.StringUtils;

public class TestString {

	public static void main(String[] args) {

		String uno = null;
		String due = "";
		String tre = "  ";
		String quattro = " ";
		String cinque = "pippo";

		System.out.println(" uno " + StringUtils.isEmpty(uno));
		System.out.println(" due " + StringUtils.isEmpty(due));
		System.out.println(" tre " + StringUtils.isEmpty(tre));
		System.out.println(" quattro " + StringUtils.isEmpty(quattro.trim()));
		System.out.println(" cinque " + StringUtils.isEmpty(cinque));

	}

}
