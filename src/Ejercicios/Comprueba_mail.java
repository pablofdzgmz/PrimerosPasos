package Ejercicios;
import java.io.EOFException;

import javax.swing.*;

import javax.swing.JOptionPane;

public class Comprueba_mail {

	public static void main(String[] args) {
		String el_mail=JOptionPane.showInputDialog("Introduce mail");
		try {
			examina_mail(el_mail);
		}catch(EOFException e) {
			System.out.println("Email incorrecto");
		}
	}
	static void examina_mail(String mail) throws EOFException  {
		int arroba=0;
		boolean punto=false;
		if(mail.length()<=3) {
			//ArrayIndexOutOfBoundsException mi_excepcion=new ArrayIndexOutOfBoundsException();
			throw new EOFException();
		}else {
			for(int i=0;i<mail.length();i++) {
				if(mail.charAt(i)=='@') {
					arroba++;
				}
				if(mail.charAt(i)=='.') {
					punto=true;
				}
			}
		}
	}

}
