package com.epic.security;

import java.util.Scanner;


public class MyCrypto {

	public static void main(String[] args) {
		//System.out.println(Character.getNumericValue('a'));
		
//		char c = 'T';
//		int i = (int) c;
//		System.out.println(i);
//		byte[] map2 = new byte[128];
//		map2['B'] = (byte) 1;
//		System.out.println(map2['B']);
//		String nme = "Tharindu";
//		System.out.println(nme.getBytes());
		
		
		while(true){
			try{
				Scanner sc = new Scanner(System.in);
				int inputEncryptMethod;
				int inputEncOrDec;
				String inputString;
				System.out.println("WELCOME TO THE EPIC SECURITY!!");
				
				
				System.out.println("First, choose the encryption/decryption method:");
				System.out.println("	option 01: base64");
				System.out.println("	option 02: TripleDES");
				
				System.out.print("Enter option number: ");
				inputEncryptMethod = sc.nextInt();
				
				System.out.println("Then, choose whether encryption or decryption:");
				System.out.println("	option 01: Encryption");
				System.out.println("	option 02: Decryption");
				
				if(inputEncryptMethod == 1){
					System.out.print("Enter option number: ");
					inputEncOrDec = sc.nextInt();
					if(inputEncOrDec == 1){
						System.out.print("Enter your data: ");
						inputString = sc.next();
						System.out.println("Base64 encrypted data: " + Base64Coder.encode(inputString));
					}else if(inputEncOrDec == 2){
						System.out.print("Enter your data: ");
						inputString = sc.next();
						System.out.println("Base64 decrypted data: " + Base64Coder.decode(inputString));
					}else{
						System.out.println("Invalid user input!!");
					}
					
				}else if(inputEncryptMethod == 2){
					System.out.print("Enter option number: ");
					inputEncOrDec = sc.nextInt();
					if(inputEncOrDec == 1){
						System.out.print("Enter your data: ");
						inputString = sc.next();
						try{
							System.out.println("TripleDES encrypted data: " + TripleDES.encrypt(inputString, "SecretKey"));
						}catch(Exception e){
							System.out.println("cannot encrypt using TripleDES!!");
						}
						
					}else if(inputEncOrDec == 2){
						System.out.print("Enter your data: ");
						inputString = sc.next();
						try{
							System.out.println("TripleDES decrypted data: " + TripleDES.decrypt(inputString, "SecretKey"));
						}catch(Exception e){
							System.out.println("cannot decrypt using TripleDES!!");
						}
						
					}else{
						System.out.println("Invalid user input!!");
					}
				}else{
					System.out.println("Invalid user input!!");
				}
			}catch(Exception e){
				System.out.println("Cannot proceed the request!!");
			}
		}
		
		
		
		//System.out.println(Base64Coder.decode("Sm9obg=="));
	}

}
